package com.mais.dbo.baseobject.jms;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.NamingException;

import com.mais.dbo.baseobject.dto.DTO;

/**
 * <p>
 * Title: publish Persistence
 * </p>
 * <p>
 * Description: to publish persistence to persistenceUpdate topic.
 * </p>
 * This class implements to be publish persistence to persistanceUpdate topic.
 * <P>
 * It served publish persistence to persistenceUpdate topic via JMS.
 * 
 * JBoss in sub-directory deploy/messaging define an xml file contains
 * <p>
 * &lt server &gt <br />
 * &lt !-- Destination without a configured SecurityManager or without a a
 * SecurityConf will default to role guest with read=true, write=true,
 * create=false. -- &gt<br />
 * &lt mbean code="org.jboss.mq.server.jmx.Topic"
 * name="jboss.mq.destination:service=Topic,name=persistenceUpdate" &gt<br />
 * &lt depends optional-attribute-name="DestinationManager" &gt
 * jboss.mq:service=DestinationManager &lt /depends &gt<br />
 * &lt depends optional-attribute-name="SecurityManager" &gt
 * jboss.mq:service=SecurityManager &lt /depends &gt<br />
 * &lt attribute name="SecurityConf" &gt<br />
 * &lt security &gt<br />
 * &lt role name="guest" read="true" write="true" create="true"/ &gt<br />
 * &lt role name="publisher" read="true" write="true" create="false"/ &gt<br />
 * &lt role name="durpublisher" read="true" write="true" create="true"/ &gt<br />
 * &gt /security &lt<br />
 * &lt /attribute &gt &lt /mbean &gt
 * 
 * 
 * 
 * <p>
 * Glass fish CLI
 * <p>
 * create-jmsdest --user admin --passwordfile=/opt/dev/apps/passfile.txt --host
 * localhost --port 4747 --desttype topic --property User=public:Password=public
 * persistenceUpdate
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 * 
 * @author Dr.Prachueb Sirivongrungson
 * @version 1.0
 */

// TODO Implement this class for general purpose persistence update publish ....
// Not for just for replication purpose

@Stateless
public class PublishPersistence implements PublishPersistenceLocal {
	protected Logger logger = Logger.getLogger(this.getClass()
			.getCanonicalName());

	// JBoss Still not work for injection method
//  	@Resource(mappedName = "java:/ConnectionFactory")
	 @Resource(mappedName = "jms/persistenceUpdateFactory")
	// GlassFish
//	 @Resource(mappedName = "TopicConnectionFactory")
	private ConnectionFactory persistenceUpdateFactory;

	// JBoss
//  	@Resource(mappedName = "java:/topic/persistenceUpdate")
	// GlassFish
	 @Resource(mappedName = "persistenceUpdate")
   //	 @Resource(mappedName = "topic/testTopic")
	// @Resource(mappedName = "jms/persistenceUpdateFactory")
	// private ConnectionFactory persistenceUpdateFactory;
	//
	// @Resource(mappedName = "jms/persistenceUpdate")
	private Topic persistenceUpdate;

	private Context jndiContext;
	private Session session;
	private Connection connection;

	private DTO dataDTO;
	private String className;

	private PersistenceMessage msg;
//	private PersistInfo pInfo;

	/** Creates a new instance of PublishPersistence */
	public PublishPersistence() {
		logger.setLevel(Level.FINE);
		className = new String();
//		pInfo = new PersistInfo();
	}

	private Message createJMSMessageForPersistenceUpdate(Session session,
			Serializable messageData) throws JMSException {
		// TODO create and populate message to send
		// logger.fine("compose Message: " +
		// ((persistanceMessage)messageData).getCommand());
		ObjectMessage om = session.createObjectMessage(messageData);
		// om.setBooleanProperty("replicate",pInfo.isReplicate());
		// om.setStringProperty("objectdb", pInfo.getClassName());
		// logger.fine("replicateTo is " + pInfo.getReplicateTo());
		// om.setStringProperty("replicateTo",pInfo.getReplicateTo());

		om.setStringProperty("objectdb", className);
		om.setStringProperty("replicateTo", dataDTO.getReplicateSite());

		// om.setStringProperty("replicateTo","B%");
		return om;
	}

	private void sendJMSMessageToPersistanceUpdate(Serializable messageData)
			throws NamingException, JMSException {
		logger.info("in send JMS");
		connection = null;
		session = null;

//		// Due to the injection is not worked in Jboss for now, so using
//		// conventional JNDI look up.
//		jndiContext = new InitialContext();
//
//		persistenceUpdateFactory = (ConnectionFactory) jndiContext
//				.lookup("java:/ConnectionFactory");
//
//		// Due to the injection is not worked in Jboss for now, so using
//		// conventional JNDI look up.
//		persistenceUpdate = (Topic) jndiContext
//				.lookup("topic/persistenceUpdate");

		try {
			connection = persistenceUpdateFactory.createConnection();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer messageProducer = session
					.createProducer(persistenceUpdate);
			// logger.warning("before send JMS : " +
			// ((PersistenceMessage)messageData).getCommand());

			messageProducer.send(createJMSMessageForPersistenceUpdate(session,
					messageData));
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

//	private void publish(String command, PersistInfo pInformation,
//			baseobject.context.Connection.java connectionInfo, DTO data) {
//		logger.info("in publish ...");
////		pInfo = pInformation;
////		if (pInfo.getReplicateTo() == null)
////			pInfo.setReplicateTo("notReplicate");
//		msg = new PersistenceMessage();
//		msg.setCommand(command);
//		msg.setData(data);
//
////		msg.setReplicateTo(pInfo.getReplicateTo());
//		msg.setReplicateTo(data.getReplicateSite());
//		try {
//			sendJMSMessageToPersistanceUpdate(msg);
//		} catch (NamingException ex) {
//			ex.printStackTrace();
//		} catch (JMSException ex) {
//			ex.printStackTrace();
//		}
//	}

	private void publish(String command,
			baseobject.context.Connection connectionInfo, DTO data) {
		logger.info("in publish ...");
		msg = new PersistenceMessage();
		msg.setCommand(command);
		msg.setData(data);

//		msg.setReplicateTo(pInfo.getReplicateTo());
		msg.setReplicateTo(data.getReplicateSite());
		try {
			sendJMSMessageToPersistanceUpdate(msg);
		} catch (NamingException ex) {
			ex.printStackTrace();
		} catch (JMSException ex) {
			ex.printStackTrace();
		}
	}

	public void create(String className,
			baseobject.context.Connection connectioninfo, DTO data) {
		logger.info("Create JMS");
		// PersistInfo pInfo = new PersistInfo();
		// pInfo.setClassName(className);
		// pInfo.setReplicate(data.getReplicate());
		// pInfo.setReplicateTo(data.getReplicateSite());
		this.className = className;
		dataDTO = data;

		publish("create", connectioninfo, data);
	}

	public void change(String className,
			baseobject.context.Connection connectioninfo, DTO data) {
		logger.info("Change JMS");
		// PersistInfo pInfo = new PersistInfo();
		// pInfo.setClassName(className);
		this.className = className;
		dataDTO = data;

		publish("change", connectioninfo, data);
	}

	public void delete(String className,
			baseobject.context.Connection connectioninfo, DTO data) {
		logger.info("Change JMS");
		// PersistInfo pInfo = new PersistInfo();
		// pInfo.setClassName(className);
		this.className = className;
		dataDTO = data;

		publish("change", connectioninfo, data);
	}

//	public void create(PersistInfo pInformation,
//			baseobject.context.Connection.java connectionInfo, DTO data) {
//		logger.info("cfreate JMS");
//		publish("create", pInformation, connectionInfo, data);
//		// pInfo = pInformation;
//		// if (pInfo.getReplicateTo() == null)
//		// pInfo.setReplicateTo("notReplicate");
//		// msg = new persistanceMessage();
//		// msg.setCommand("create");
//		// msg.setData(data);
//		//
//		// msg.setReplicateTo(pInfo.getReplicateTo());
//		// try {
//		// sendJMSMessageToPersistanceUpdate(msg);
//		// } catch (NamingException ex) {
//		// ex.printStackTrace();
//		// } catch (JMSException ex) {
//		// ex.printStackTrace();
//		// }
//	}
//
//	public void edit(PersistInfo pInformation,
//			baseobject.context.Connection.java connectionInfo, DTO data) {
//		publish("edit", pInformation, connectionInfo, data);
//	}
//
//	// public void changeCode(PersistInfo pInformation,
//	// baseobject.context.Connection.java connectiontInfo, DTOStringString data) {
//	// // publish("changeCode", pInformation, currentInfo, data);
//	// }
//
//	public void setActive(PersistInfo pInformation,
//			baseobject.context.Connection.java connectionInfo, DTO data) {
//		publish("setActive", pInformation, connectionInfo, data);
//	}
//
//	public void destroy(PersistInfo pInformation,
//			baseobject.context.Connection.java connectionInfo, DTO data) {
//		publish("destroy", pInformation, connectionInfo, data);
//	}

	public void resetDatabase() {

	}

}
