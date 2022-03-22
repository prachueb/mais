package base.entity.master.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.AMain;

/**
 * <p>Title: Entity class userMain</p>
 * <p>Description: main authority entity.</p>
 * This class implements to persist main authority information.
 *  <P>
 *  It served as main authority entity.
 * <p>Copyright: Copyright (c) 2008</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
//@NamedQueries({
//	@NamedQuery(name="authority_findByPrimayKey", query="SELECT m FROM userMain m WHERE m.siteId = :siteId AND m.id = :id")
////	,@NamedQuery(name="authority_findRange", query="SELECT new dto.base.authorityCodeMain(c,m) FROM userCode c, userMain m WHERE c.siteId = m.siteId AND c.id = m.id")
////    ,@NamedQuery(name="authority_findQueueName", query="SELECT m.queueName FROM userCode c, userMain m WHERE c.code LIKE :codePattern AND m.id = c.id")
////    ,@NamedQuery(name="authority_findConnectionName", query="SELECT m.connectionName FROM autorityCode c, userMain m WHERE c.code LIKE :codePattern AND m.siteId = c.siteId AND m.id = c.id")
////    ,@NamedQuery(name="authority_findConnectionQueueName", query="SELECT new baseobject.objectdatabase.DTOStringString(m.connectionName, m.queueName) FROM userCode c, userMain m WHERE c.code LIKE :codePattern AND m.siteId = c.siteId AND m.id = c.id")
//})
@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="SHORTNAME"),
@Index(columnList="CREATESITE"),
@Index(columnList="LOGIN")})  // Index in @MappedSuperclass not work!
public class UserMain extends AMain implements Serializable {

	private String login;
	private String password;

	private long userGroup;

	/**
	 * If no defaultXxxxx or the defaultXxxxx is not valid,
	 * then the program should prompt for new defaultXxxxx
	 * or assign none to that Entity?/SubEntity?
	 */
	private String defaultSite;
	private String defaultCurrency;
	
	private String defaultLabelLanguage;
	private String defaultDescriptionLanguage;
	
	private String defaultEnterprise;

	private String defaultEntity0;
	private String defaultEntity1;
	private String defaultEntity2;
	private String defaultEntity3;
	private String defaultEntity4;
	private String defaultEntity5;
	private String defaultEntity6;
	private String defaultEntity7;
	private String defaultEntity8;
	private String defaultEntity9;

	private String defaultSubEntity0;
	private String defaultSubEntity1;
	private String defaultSubEntity2;
	private String defaultSubEntity3;
	private String defaultSubEntity4;
	private String defaultSubEntity5;
	private String defaultSubEntity6;
	private String defaultSubEntity7;
	private String defaultSubEntity8;
	private String defaultSubEntity9;

	private String validSite;
	
	private String validEnterprise;

	private String validEntity0;
	private String validEntity1;
	private String validEntity2;
	private String validEntity3;
	private String validEntity4;
	private String validEntity5;
	private String validEntity6;
	private String validEntity7;
	private String validEntity8;
	private String validEntity9;

	private String validSubEntity0;
	private String validSubEntity1;
	private String validSubEntity2;
	private String validSubEntity3;
	private String validSubEntity4;
	private String validSubEntity5;
	private String validSubEntity6;
	private String validSubEntity7;
	private String validSubEntity8;
	private String validSubEntity9;

	// TODO change password every ? days
	// TODO history of old password not allow duplicate how many times or days

    // URL:port, user, password are set in connectionFactory
//  Property Name   Description
//  ClientId        Specifies a client ID for a connection factory that will be used by a durable subscriber.
//  AddressList     Specifies the name (and, optionally, port number) of a message broker instance with
//                  which applications will communicate. Each address in the list specifies the host name



//                  (and, optionally, host port and connection service) for the connection. For example,
//                  the value might be earth or earth:7677. Specify the port number if the message
//                  broker is running on a port other than the default (7676).
//                  For details, see the Message Queue Developers Guide for Java Clients.
//                  Default: The local host and default port number (7676). The client will attempt a
//                  connection to a broker on port 7676 of the local host.
//  MessageServiceAddressList Same as AddressList. This property name is deprecated. Use AddressList instead.
//  UserName        The user name for the connection factory.
//                  Default: guest
//  Password        The password for the connection factory.
//                  Default: guest
//  ReconnectEnabled If enabled (value = true), specifies that the client runtime attempts to reconnect to a
//                  message server (or the list of addresses in the AddressList) when a connection is lost.
//                  Default: true

//	private String connectionName;
//    private String queueName;

    /**
     * Creates a new instance of siteMain
     */
    public UserMain() {
    }

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userGroup
	 */
	public long getUserGroup() {
		return userGroup;
	}

	/**
	 * @param userGroup the userGroup to set
	 */
	public void setUserGroup(long userGroup) {
		this.userGroup = userGroup;
	}

	/**
	 * @return the defaultSite
	 */
	public String getDefaultSite() {
		return defaultSite;
	}

	/**
	 * @param defaultSite the defaultSite to set
	 */
	public void setDefaultSite(String defaultSite) {
		this.defaultSite = defaultSite;
	}

	/**
	 * @return the defaultLabelLanguage
	 */
	public String getDefaultLabelLanguage() {
		return defaultLabelLanguage;
	}

	/**
	 * @param defaultLabelLanguage the defaultLabelLanguage to set
	 */
	public void setDefaultLabelLanguage(String defaultLabelLanguage) {
		this.defaultLabelLanguage = defaultLabelLanguage;
	}

	/**
	 * @return the defaultDescriptionLanguage
	 */
	public String getDefaultDescriptionLanguage() {
		return defaultDescriptionLanguage;
	}

	/**
	 * @param defaultDescriptionLanguage the defaultDescriptionLanguage to set
	 */
	public void setDefaultDescriptionLanguage(String defaultDescriptionLanguage) {
		this.defaultDescriptionLanguage = defaultDescriptionLanguage;
	}

	/**
	 * @return the defaultCurrency
	 */
	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	/**
	 * @param defaultCurrency the defaultCurrency to set
	 */
	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	/**
	 * @return the defaultEnterprise
	 */
	public String getDefaultEnterprise() {
		return defaultEnterprise;
	}

	/**
	 * @param defaultEnterprise the defaultEnterprise to set
	 */
	public void setDefaultEnterprise(String defaultEnterprise) {
		this.defaultEnterprise = defaultEnterprise;
	}

	/**
	 * @return the defaultEntity0
	 */
	public String getDefaultEntity0() {
		return defaultEntity0;
	}

	/**
	 * @param defaultEntity0 the defaultEntity0 to set
	 */
	public void setDefaultEntity0(String defaultEntity0) {
		this.defaultEntity0 = defaultEntity0;
	}

	/**
	 * @return the defaultEntity1
	 */
	public String getDefaultEntity1() {
		return defaultEntity1;
	}

	/**
	 * @param defaultEntity1 the defaultEntity1 to set
	 */
	public void setDefaultEntity1(String defaultEntity1) {
		this.defaultEntity1 = defaultEntity1;
	}

	/**
	 * @return the defaultEntity2
	 */
	public String getDefaultEntity2() {
		return defaultEntity2;
	}

	/**
	 * @param defaultEntity2 the defaultEntity2 to set
	 */
	public void setDefaultEntity2(String defaultEntity2) {
		this.defaultEntity2 = defaultEntity2;
	}

	/**
	 * @return the defaultEntity3
	 */
	public String getDefaultEntity3() {
		return defaultEntity3;
	}

	/**
	 * @param defaultEntity3 the defaultEntity3 to set
	 */
	public void setDefaultEntity3(String defaultEntity3) {
		this.defaultEntity3 = defaultEntity3;
	}

	/**
	 * @return the defaultEntity4
	 */
	public String getDefaultEntity4() {
		return defaultEntity4;
	}

	/**
	 * @param defaultEntity4 the defaultEntity4 to set
	 */
	public void setDefaultEntity4(String defaultEntity4) {
		this.defaultEntity4 = defaultEntity4;
	}

	/**
	 * @return the defaultEntity5
	 */
	public String getDefaultEntity5() {
		return defaultEntity5;
	}

	/**
	 * @param defaultEntity5 the defaultEntity5 to set
	 */
	public void setDefaultEntity5(String defaultEntity5) {
		this.defaultEntity5 = defaultEntity5;
	}

	/**
	 * @return the defaultEntity6
	 */
	public String getDefaultEntity6() {
		return defaultEntity6;
	}

	/**
	 * @param defaultEntity6 the defaultEntity6 to set
	 */
	public void setDefaultEntity6(String defaultEntity6) {
		this.defaultEntity6 = defaultEntity6;
	}

	/**
	 * @return the defaultEntity7
	 */
	public String getDefaultEntity7() {
		return defaultEntity7;
	}

	/**
	 * @param defaultEntity7 the defaultEntity7 to set
	 */
	public void setDefaultEntity7(String defaultEntity7) {
		this.defaultEntity7 = defaultEntity7;
	}

	/**
	 * @return the defaultEntity8
	 */
	public String getDefaultEntity8() {
		return defaultEntity8;
	}

	/**
	 * @param defaultEntity8 the defaultEntity8 to set
	 */
	public void setDefaultEntity8(String defaultEntity8) {
		this.defaultEntity8 = defaultEntity8;
	}

	/**
	 * @return the defaultEntity9
	 */
	public String getDefaultEntity9() {
		return defaultEntity9;
	}

	/**
	 * @param defaultEntity9 the defaultEntity9 to set
	 */
	public void setDefaultEntity9(String defaultEntity9) {
		this.defaultEntity9 = defaultEntity9;
	}

	/**
	 * @return the defaultSubEntity0
	 */
	public String getDefaultSubEntity0() {
		return defaultSubEntity0;
	}

	/**
	 * @param defaultSubEntity0 the defaultSubEntity0 to set
	 */
	public void setDefaultSubEntity0(String defaultSubEntity0) {
		this.defaultSubEntity0 = defaultSubEntity0;
	}

	/**
	 * @return the defaultSubEntity1
	 */
	public String getDefaultSubEntity1() {
		return defaultSubEntity1;
	}

	/**
	 * @param defaultSubEntity1 the defaultSubEntity1 to set
	 */
	public void setDefaultSubEntity1(String defaultSubEntity1) {
		this.defaultSubEntity1 = defaultSubEntity1;
	}

	/**
	 * @return the defaultSubEntity2
	 */
	public String getDefaultSubEntity2() {
		return defaultSubEntity2;
	}

	/**
	 * @param defaultSubEntity2 the defaultSubEntity2 to set
	 */
	public void setDefaultSubEntity2(String defaultSubEntity2) {
		this.defaultSubEntity2 = defaultSubEntity2;
	}

	/**
	 * @return the defaultSubEntity3
	 */
	public String getDefaultSubEntity3() {
		return defaultSubEntity3;
	}

	/**
	 * @param defaultSubEntity3 the defaultSubEntity3 to set
	 */
	public void setDefaultSubEntity3(String defaultSubEntity3) {
		this.defaultSubEntity3 = defaultSubEntity3;
	}

	/**
	 * @return the defaultSubEntity4
	 */
	public String getDefaultSubEntity4() {
		return defaultSubEntity4;
	}

	/**
	 * @param defaultSubEntity4 the defaultSubEntity4 to set
	 */
	public void setDefaultSubEntity4(String defaultSubEntity4) {
		this.defaultSubEntity4 = defaultSubEntity4;
	}

	/**
	 * @return the defaultSubEntity5
	 */
	public String getDefaultSubEntity5() {
		return defaultSubEntity5;
	}

	/**
	 * @param defaultSubEntity5 the defaultSubEntity5 to set
	 */
	public void setDefaultSubEntity5(String defaultSubEntity5) {
		this.defaultSubEntity5 = defaultSubEntity5;
	}

	/**
	 * @return the defaultSubEntity6
	 */
	public String getDefaultSubEntity6() {
		return defaultSubEntity6;
	}

	/**
	 * @param defaultSubEntity6 the defaultSubEntity6 to set
	 */
	public void setDefaultSubEntity6(String defaultSubEntity6) {
		this.defaultSubEntity6 = defaultSubEntity6;
	}

	/**
	 * @return the defaultSubEntity7
	 */
	public String getDefaultSubEntity7() {
		return defaultSubEntity7;
	}

	/**
	 * @param defaultSubEntity7 the defaultSubEntity7 to set
	 */
	public void setDefaultSubEntity7(String defaultSubEntity7) {
		this.defaultSubEntity7 = defaultSubEntity7;
	}

	/**
	 * @return the defaultSubEntity8
	 */
	public String getDefaultSubEntity8() {
		return defaultSubEntity8;
	}

	/**
	 * @param defaultSubEntity8 the defaultSubEntity8 to set
	 */
	public void setDefaultSubEntity8(String defaultSubEntity8) {
		this.defaultSubEntity8 = defaultSubEntity8;
	}

	/**
	 * @return the defaultSubEntity9
	 */
	public String getDefaultSubEntity9() {
		return defaultSubEntity9;
	}

	/**
	 * @param defaultSubEntity9 the defaultSubEntity9 to set
	 */
	public void setDefaultSubEntity9(String defaultSubEntity9) {
		this.defaultSubEntity9 = defaultSubEntity9;
	}

	/**
	 * @return the validSite
	 */
	public String getValidSite() {
		return validSite;
	}

	/**
	 * @param validSite the validSite to set
	 */
	public void setValidSite(String validSite) {
		this.validSite = validSite;
	}

	/**
	 * @return the validEnterprise
	 */
	public String getValidEnterprise() {
		return validEnterprise;
	}

	/**
	 * @param validEnterprise the validEnterprise to set
	 */
	public void setValidEnterprise(String validEnterprise) {
		this.validEnterprise = validEnterprise;
	}

	/**
	 * @return the validEntity0
	 */
	public String getValidEntity0() {
		return validEntity0;
	}

	/**
	 * @param validEntity0 the validEntity0 to set
	 */
	public void setValidEntity0(String validEntity0) {
		this.validEntity0 = validEntity0;
	}

	/**
	 * @return the validEntity1
	 */
	public String getValidEntity1() {
		return validEntity1;
	}

	/**
	 * @param validEntity1 the validEntity1 to set
	 */
	public void setValidEntity1(String validEntity1) {
		this.validEntity1 = validEntity1;
	}

	/**
	 * @return the validEntity2
	 */
	public String getValidEntity2() {
		return validEntity2;
	}

	/**
	 * @param validEntity2 the validEntity2 to set
	 */
	public void setValidEntity2(String validEntity2) {
		this.validEntity2 = validEntity2;
	}

	/**
	 * @return the validEntity3
	 */
	public String getValidEntity3() {
		return validEntity3;
	}

	/**
	 * @param validEntity3 the validEntity3 to set
	 */
	public void setValidEntity3(String validEntity3) {
		this.validEntity3 = validEntity3;
	}

	/**
	 * @return the validEntity4
	 */
	public String getValidEntity4() {
		return validEntity4;
	}

	/**
	 * @param validEntity4 the validEntity4 to set
	 */
	public void setValidEntity4(String validEntity4) {
		this.validEntity4 = validEntity4;
	}

	/**
	 * @return the validEntity5
	 */
	public String getValidEntity5() {
		return validEntity5;
	}

	/**
	 * @param validEntity5 the validEntity5 to set
	 */
	public void setValidEntity5(String validEntity5) {
		this.validEntity5 = validEntity5;
	}

	/**
	 * @return the validEntity6
	 */
	public String getValidEntity6() {
		return validEntity6;
	}

	/**
	 * @param validEntity6 the validEntity6 to set
	 */
	public void setValidEntity6(String validEntity6) {
		this.validEntity6 = validEntity6;
	}

	/**
	 * @return the validEntity7
	 */
	public String getValidEntity7() {
		return validEntity7;
	}

	/**
	 * @param validEntity7 the validEntity7 to set
	 */
	public void setValidEntity7(String validEntity7) {
		this.validEntity7 = validEntity7;
	}

	/**
	 * @return the validEntity8
	 */
	public String getValidEntity8() {
		return validEntity8;
	}

	/**
	 * @param validEntity8 the validEntity8 to set
	 */
	public void setValidEntity8(String validEntity8) {
		this.validEntity8 = validEntity8;
	}

	/**
	 * @return the validEntity9
	 */
	public String getValidEntity9() {
		return validEntity9;
	}

	/**
	 * @param validEntity9 the validEntity9 to set
	 */
	public void setValidEntity9(String validEntity9) {
		this.validEntity9 = validEntity9;
	}

	/**
	 * @return the validSubEntity0
	 */
	public String getValidSubEntity0() {
		return validSubEntity0;
	}

	/**
	 * @param validSubEntity0 the validSubEntity0 to set
	 */
	public void setValidSubEntity0(String validSubEntity0) {
		this.validSubEntity0 = validSubEntity0;
	}

	/**
	 * @return the validSubEntity1
	 */
	public String getValidSubEntity1() {
		return validSubEntity1;
	}

	/**
	 * @param validSubEntity1 the validSubEntity1 to set
	 */
	public void setValidSubEntity1(String validSubEntity1) {
		this.validSubEntity1 = validSubEntity1;
	}

	/**
	 * @return the validSubEntity2
	 */
	public String getValidSubEntity2() {
		return validSubEntity2;
	}

	/**
	 * @param validSubEntity2 the validSubEntity2 to set
	 */
	public void setValidSubEntity2(String validSubEntity2) {
		this.validSubEntity2 = validSubEntity2;
	}

	/**
	 * @return the validSubEntity3
	 */
	public String getValidSubEntity3() {
		return validSubEntity3;
	}

	/**
	 * @param validSubEntity3 the validSubEntity3 to set
	 */
	public void setValidSubEntity3(String validSubEntity3) {
		this.validSubEntity3 = validSubEntity3;
	}

	/**
	 * @return the validSubEntity4
	 */
	public String getValidSubEntity4() {
		return validSubEntity4;
	}

	/**
	 * @param validSubEntity4 the validSubEntity4 to set
	 */
	public void setValidSubEntity4(String validSubEntity4) {
		this.validSubEntity4 = validSubEntity4;
	}

	/**
	 * @return the validSubEntity5
	 */
	public String getValidSubEntity5() {
		return validSubEntity5;
	}

	/**
	 * @param validSubEntity5 the validSubEntity5 to set
	 */
	public void setValidSubEntity5(String validSubEntity5) {
		this.validSubEntity5 = validSubEntity5;
	}

	/**
	 * @return the validSubEntity6
	 */
	public String getValidSubEntity6() {
		return validSubEntity6;
	}

	/**
	 * @param validSubEntity6 the validSubEntity6 to set
	 */
	public void setValidSubEntity6(String validSubEntity6) {
		this.validSubEntity6 = validSubEntity6;
	}

	/**
	 * @return the validSubEntity7
	 */
	public String getValidSubEntity7() {
		return validSubEntity7;
	}

	/**
	 * @param validSubEntity7 the validSubEntity7 to set
	 */
	public void setValidSubEntity7(String validSubEntity7) {
		this.validSubEntity7 = validSubEntity7;
	}

	/**
	 * @return the validSubEntity8
	 */
	public String getValidSubEntity8() {
		return validSubEntity8;
	}

	/**
	 * @param validSubEntity8 the validSubEntity8 to set
	 */
	public void setValidSubEntity8(String validSubEntity8) {
		this.validSubEntity8 = validSubEntity8;
	}

	/**
	 * @return the validSubEntity9
	 */
	public String getValidSubEntity9() {
		return validSubEntity9;
	}

	/**
	 * @param validSubEntity9 the validSubEntity9 to set
	 */
	public void setValidSubEntity9(String validSubEntity9) {
		this.validSubEntity9 = validSubEntity9;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((defaultCurrency == null) ? 0 : defaultCurrency.hashCode());
		result = prime
				* result
				+ ((defaultDescriptionLanguage == null) ? 0
						: defaultDescriptionLanguage.hashCode());
		result = prime
				* result
				+ ((defaultEnterprise == null) ? 0 : defaultEnterprise
						.hashCode());
		result = prime * result
				+ ((defaultEntity0 == null) ? 0 : defaultEntity0.hashCode());
		result = prime * result
				+ ((defaultEntity1 == null) ? 0 : defaultEntity1.hashCode());
		result = prime * result
				+ ((defaultEntity2 == null) ? 0 : defaultEntity2.hashCode());
		result = prime * result
				+ ((defaultEntity3 == null) ? 0 : defaultEntity3.hashCode());
		result = prime * result
				+ ((defaultEntity4 == null) ? 0 : defaultEntity4.hashCode());
		result = prime * result
				+ ((defaultEntity5 == null) ? 0 : defaultEntity5.hashCode());
		result = prime * result
				+ ((defaultEntity6 == null) ? 0 : defaultEntity6.hashCode());
		result = prime * result
				+ ((defaultEntity7 == null) ? 0 : defaultEntity7.hashCode());
		result = prime * result
				+ ((defaultEntity8 == null) ? 0 : defaultEntity8.hashCode());
		result = prime * result
				+ ((defaultEntity9 == null) ? 0 : defaultEntity9.hashCode());
		result = prime
				* result
				+ ((defaultLabelLanguage == null) ? 0 : defaultLabelLanguage
						.hashCode());
		result = prime * result
				+ ((defaultSite == null) ? 0 : defaultSite.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity0 == null) ? 0 : defaultSubEntity0
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity1 == null) ? 0 : defaultSubEntity1
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity2 == null) ? 0 : defaultSubEntity2
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity3 == null) ? 0 : defaultSubEntity3
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity4 == null) ? 0 : defaultSubEntity4
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity5 == null) ? 0 : defaultSubEntity5
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity6 == null) ? 0 : defaultSubEntity6
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity7 == null) ? 0 : defaultSubEntity7
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity8 == null) ? 0 : defaultSubEntity8
						.hashCode());
		result = prime
				* result
				+ ((defaultSubEntity9 == null) ? 0 : defaultSubEntity9
						.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (userGroup ^ (userGroup >>> 32));
		result = prime * result
				+ ((validEnterprise == null) ? 0 : validEnterprise.hashCode());
		result = prime * result
				+ ((validEntity0 == null) ? 0 : validEntity0.hashCode());
		result = prime * result
				+ ((validEntity1 == null) ? 0 : validEntity1.hashCode());
		result = prime * result
				+ ((validEntity2 == null) ? 0 : validEntity2.hashCode());
		result = prime * result
				+ ((validEntity3 == null) ? 0 : validEntity3.hashCode());
		result = prime * result
				+ ((validEntity4 == null) ? 0 : validEntity4.hashCode());
		result = prime * result
				+ ((validEntity5 == null) ? 0 : validEntity5.hashCode());
		result = prime * result
				+ ((validEntity6 == null) ? 0 : validEntity6.hashCode());
		result = prime * result
				+ ((validEntity7 == null) ? 0 : validEntity7.hashCode());
		result = prime * result
				+ ((validEntity8 == null) ? 0 : validEntity8.hashCode());
		result = prime * result
				+ ((validEntity9 == null) ? 0 : validEntity9.hashCode());
		result = prime * result
				+ ((validSite == null) ? 0 : validSite.hashCode());
		result = prime * result
				+ ((validSubEntity0 == null) ? 0 : validSubEntity0.hashCode());
		result = prime * result
				+ ((validSubEntity1 == null) ? 0 : validSubEntity1.hashCode());
		result = prime * result
				+ ((validSubEntity2 == null) ? 0 : validSubEntity2.hashCode());
		result = prime * result
				+ ((validSubEntity3 == null) ? 0 : validSubEntity3.hashCode());
		result = prime * result
				+ ((validSubEntity4 == null) ? 0 : validSubEntity4.hashCode());
		result = prime * result
				+ ((validSubEntity5 == null) ? 0 : validSubEntity5.hashCode());
		result = prime * result
				+ ((validSubEntity6 == null) ? 0 : validSubEntity6.hashCode());
		result = prime * result
				+ ((validSubEntity7 == null) ? 0 : validSubEntity7.hashCode());
		result = prime * result
				+ ((validSubEntity8 == null) ? 0 : validSubEntity8.hashCode());
		result = prime * result
				+ ((validSubEntity9 == null) ? 0 : validSubEntity9.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof UserMain)) {
			return false;
		}
		UserMain other = (UserMain) obj;
		if (defaultCurrency == null) {
			if (other.defaultCurrency != null) {
				return false;
			}
		} else if (!defaultCurrency.equals(other.defaultCurrency)) {
			return false;
		}
		if (defaultDescriptionLanguage == null) {
			if (other.defaultDescriptionLanguage != null) {
				return false;
			}
		} else if (!defaultDescriptionLanguage
				.equals(other.defaultDescriptionLanguage)) {
			return false;
		}
		if (defaultEnterprise == null) {
			if (other.defaultEnterprise != null) {
				return false;
			}
		} else if (!defaultEnterprise.equals(other.defaultEnterprise)) {
			return false;
		}
		if (defaultEntity0 == null) {
			if (other.defaultEntity0 != null) {
				return false;
			}
		} else if (!defaultEntity0.equals(other.defaultEntity0)) {
			return false;
		}
		if (defaultEntity1 == null) {
			if (other.defaultEntity1 != null) {
				return false;
			}
		} else if (!defaultEntity1.equals(other.defaultEntity1)) {
			return false;
		}
		if (defaultEntity2 == null) {
			if (other.defaultEntity2 != null) {
				return false;
			}
		} else if (!defaultEntity2.equals(other.defaultEntity2)) {
			return false;
		}
		if (defaultEntity3 == null) {
			if (other.defaultEntity3 != null) {
				return false;
			}
		} else if (!defaultEntity3.equals(other.defaultEntity3)) {
			return false;
		}
		if (defaultEntity4 == null) {
			if (other.defaultEntity4 != null) {
				return false;
			}
		} else if (!defaultEntity4.equals(other.defaultEntity4)) {
			return false;
		}
		if (defaultEntity5 == null) {
			if (other.defaultEntity5 != null) {
				return false;
			}
		} else if (!defaultEntity5.equals(other.defaultEntity5)) {
			return false;
		}
		if (defaultEntity6 == null) {
			if (other.defaultEntity6 != null) {
				return false;
			}
		} else if (!defaultEntity6.equals(other.defaultEntity6)) {
			return false;
		}
		if (defaultEntity7 == null) {
			if (other.defaultEntity7 != null) {
				return false;
			}
		} else if (!defaultEntity7.equals(other.defaultEntity7)) {
			return false;
		}
		if (defaultEntity8 == null) {
			if (other.defaultEntity8 != null) {
				return false;
			}
		} else if (!defaultEntity8.equals(other.defaultEntity8)) {
			return false;
		}
		if (defaultEntity9 == null) {
			if (other.defaultEntity9 != null) {
				return false;
			}
		} else if (!defaultEntity9.equals(other.defaultEntity9)) {
			return false;
		}
		if (defaultLabelLanguage == null) {
			if (other.defaultLabelLanguage != null) {
				return false;
			}
		} else if (!defaultLabelLanguage.equals(other.defaultLabelLanguage)) {
			return false;
		}
		if (defaultSite == null) {
			if (other.defaultSite != null) {
				return false;
			}
		} else if (!defaultSite.equals(other.defaultSite)) {
			return false;
		}
		if (defaultSubEntity0 == null) {
			if (other.defaultSubEntity0 != null) {
				return false;
			}
		} else if (!defaultSubEntity0.equals(other.defaultSubEntity0)) {
			return false;
		}
		if (defaultSubEntity1 == null) {
			if (other.defaultSubEntity1 != null) {
				return false;
			}
		} else if (!defaultSubEntity1.equals(other.defaultSubEntity1)) {
			return false;
		}
		if (defaultSubEntity2 == null) {
			if (other.defaultSubEntity2 != null) {
				return false;
			}
		} else if (!defaultSubEntity2.equals(other.defaultSubEntity2)) {
			return false;
		}
		if (defaultSubEntity3 == null) {
			if (other.defaultSubEntity3 != null) {
				return false;
			}
		} else if (!defaultSubEntity3.equals(other.defaultSubEntity3)) {
			return false;
		}
		if (defaultSubEntity4 == null) {
			if (other.defaultSubEntity4 != null) {
				return false;
			}
		} else if (!defaultSubEntity4.equals(other.defaultSubEntity4)) {
			return false;
		}
		if (defaultSubEntity5 == null) {
			if (other.defaultSubEntity5 != null) {
				return false;
			}
		} else if (!defaultSubEntity5.equals(other.defaultSubEntity5)) {
			return false;
		}
		if (defaultSubEntity6 == null) {
			if (other.defaultSubEntity6 != null) {
				return false;
			}
		} else if (!defaultSubEntity6.equals(other.defaultSubEntity6)) {
			return false;
		}
		if (defaultSubEntity7 == null) {
			if (other.defaultSubEntity7 != null) {
				return false;
			}
		} else if (!defaultSubEntity7.equals(other.defaultSubEntity7)) {
			return false;
		}
		if (defaultSubEntity8 == null) {
			if (other.defaultSubEntity8 != null) {
				return false;
			}
		} else if (!defaultSubEntity8.equals(other.defaultSubEntity8)) {
			return false;
		}
		if (defaultSubEntity9 == null) {
			if (other.defaultSubEntity9 != null) {
				return false;
			}
		} else if (!defaultSubEntity9.equals(other.defaultSubEntity9)) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (userGroup != other.userGroup) {
			return false;
		}
		if (validEnterprise == null) {
			if (other.validEnterprise != null) {
				return false;
			}
		} else if (!validEnterprise.equals(other.validEnterprise)) {
			return false;
		}
		if (validEntity0 == null) {
			if (other.validEntity0 != null) {
				return false;
			}
		} else if (!validEntity0.equals(other.validEntity0)) {
			return false;
		}
		if (validEntity1 == null) {
			if (other.validEntity1 != null) {
				return false;
			}
		} else if (!validEntity1.equals(other.validEntity1)) {
			return false;
		}
		if (validEntity2 == null) {
			if (other.validEntity2 != null) {
				return false;
			}
		} else if (!validEntity2.equals(other.validEntity2)) {
			return false;
		}
		if (validEntity3 == null) {
			if (other.validEntity3 != null) {
				return false;
			}
		} else if (!validEntity3.equals(other.validEntity3)) {
			return false;
		}
		if (validEntity4 == null) {
			if (other.validEntity4 != null) {
				return false;
			}
		} else if (!validEntity4.equals(other.validEntity4)) {
			return false;
		}
		if (validEntity5 == null) {
			if (other.validEntity5 != null) {
				return false;
			}
		} else if (!validEntity5.equals(other.validEntity5)) {
			return false;
		}
		if (validEntity6 == null) {
			if (other.validEntity6 != null) {
				return false;
			}
		} else if (!validEntity6.equals(other.validEntity6)) {
			return false;
		}
		if (validEntity7 == null) {
			if (other.validEntity7 != null) {
				return false;
			}
		} else if (!validEntity7.equals(other.validEntity7)) {
			return false;
		}
		if (validEntity8 == null) {
			if (other.validEntity8 != null) {
				return false;
			}
		} else if (!validEntity8.equals(other.validEntity8)) {
			return false;
		}
		if (validEntity9 == null) {
			if (other.validEntity9 != null) {
				return false;
			}
		} else if (!validEntity9.equals(other.validEntity9)) {
			return false;
		}
		if (validSite == null) {
			if (other.validSite != null) {
				return false;
			}
		} else if (!validSite.equals(other.validSite)) {
			return false;
		}
		if (validSubEntity0 == null) {
			if (other.validSubEntity0 != null) {
				return false;
			}
		} else if (!validSubEntity0.equals(other.validSubEntity0)) {
			return false;
		}
		if (validSubEntity1 == null) {
			if (other.validSubEntity1 != null) {
				return false;
			}
		} else if (!validSubEntity1.equals(other.validSubEntity1)) {
			return false;
		}
		if (validSubEntity2 == null) {
			if (other.validSubEntity2 != null) {
				return false;
			}
		} else if (!validSubEntity2.equals(other.validSubEntity2)) {
			return false;
		}
		if (validSubEntity3 == null) {
			if (other.validSubEntity3 != null) {
				return false;
			}
		} else if (!validSubEntity3.equals(other.validSubEntity3)) {
			return false;
		}
		if (validSubEntity4 == null) {
			if (other.validSubEntity4 != null) {
				return false;
			}
		} else if (!validSubEntity4.equals(other.validSubEntity4)) {
			return false;
		}
		if (validSubEntity5 == null) {
			if (other.validSubEntity5 != null) {
				return false;
			}
		} else if (!validSubEntity5.equals(other.validSubEntity5)) {
			return false;
		}
		if (validSubEntity6 == null) {
			if (other.validSubEntity6 != null) {
				return false;
			}
		} else if (!validSubEntity6.equals(other.validSubEntity6)) {
			return false;
		}
		if (validSubEntity7 == null) {
			if (other.validSubEntity7 != null) {
				return false;
			}
		} else if (!validSubEntity7.equals(other.validSubEntity7)) {
			return false;
		}
		if (validSubEntity8 == null) {
			if (other.validSubEntity8 != null) {
				return false;
			}
		} else if (!validSubEntity8.equals(other.validSubEntity8)) {
			return false;
		}
		if (validSubEntity9 == null) {
			if (other.validSubEntity9 != null) {
				return false;
			}
		} else if (!validSubEntity9.equals(other.validSubEntity9)) {
			return false;
		}
		return true;
	}

}
