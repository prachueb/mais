package base.objectdatabase.master;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import base.dto.master.SubEntityDTO;
import base.entity.master.subentity8.SubEntity8Code;
import base.entity.master.subentity8.SubEntity8ControlId;
import base.entity.master.subentity8.SubEntity8Description;
import base.entity.master.subentity8.SubEntity8Main;
import base.entity.master.subentity8.SubEntity8Note;
import baseobject.context.Connection;
import baseobject.dto.DTO;
import baseobject.entity.ACode;
import baseobject.entity.AControlId;
import baseobject.entity.ADescription;
import baseobject.entity.AMain;
import baseobject.entity.ANote;
import baseobject.objectdatabase.AODBM;
import baseobject.objectdatabase.AODBMBase;

/**
 * <p>
 * Title: SubEntity8ODBBean
 * </p>
 * <p>
 * Description: SubEntity8 object data.
 * </p>
 * This class implements to persist SubEntity8 information.
 * <P>
 * <p>
 * Converting from internal entity code as long to the string entity code in DTO
 * for easy using.
 * </p>
 * It served as gateway to access all the SubEntity8 tables.
 * <p>
 * Copyright: Copyright (c) 2011
 * </p>
 * 
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
// @NamedQueries({
// @NamedQuery(name="authority_findByCode",
// query="SELECT c FROM entity.base.userCode c" +
// "WHERE c.authorityCode = :userCode"),
// @NamedQuery(name="authority_findByCodeA",
// query="SELECT c FROM userCode c")
// })

// @Stateless
@Stateless(mappedName = "SubEntity8ODBBean/remote")
@Remote({ SubEntityODBRemote.class })
public class SubEntity8ODBBean extends AODBMBase implements SubEntityODBRemote {

	// @PersistenceContext // (unitName="base-ejbPU")
	// private EntityManager em;

	/**
	 * Code entity.
	 */
	private SubEntity8Code code;
	/**
	 * Main entity.
	 */
	private SubEntity8Main main;
	/**
	 * SubEntity8ControlId entity.
	 */
	private SubEntity8ControlId controlID;
	/**
	 * Data transfer object all information.
	 */
	private SubEntityDTO subEntityDTO;

	/**
	 * Creates a new instance of SubEntity8ODDBean.
	 */
	public SubEntity8ODBBean() {
		super();
		// logger = Logger.getLogger("objectdb.base.SubEntity8ODDBean");
		// logger.setLevel(Level.INFO);

		// pInfo.setClassName(UserODBBean.class.getName());

		subEntityDTO = new SubEntityDTO();
		code = new SubEntity8Code();
		main = new SubEntity8Main();
		controlID = new SubEntity8ControlId();
	}

	public long size() {
		logger.fine("SubEntity8Facade:find");

		Query query;
		Object result;
		try {
			query = em.createQuery("SELECT COUNT(c) FROM SubEntity8Code c");
			result = query.getSingleResult();
		} catch (Exception ex) {
			return -1;
		}

		if (result == null)
			return 0;

		if (result instanceof Long)
			return ((Long) result);
		else
			return -1;

	}

	@Override
	protected ACode getCodeEntity() {
		if (code == null)
			code = new SubEntity8Code();
		return code;
	}

	@Override
	protected AControlId getControlId() {
		return controlID;
	}

	@Override
	protected DTO getDTO() {
		if (subEntityDTO == null)
			subEntityDTO = new SubEntityDTO();
		return subEntityDTO;
	}

	@Override
	protected DTO getNewDTO() {
		return new SubEntityDTO();
	}

	@Override
	protected AMain getMainEntity() {
		if (main == null)
			main = new SubEntity8Main();
		return main;
	}

	@Override
	protected ADescription getNewLingualDescription() {
		return (ADescription) (new SubEntity8Description());
	}

	@Override
	protected ANote getNewNote() {
		return new SubEntity8Note();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#hasReference(long)
	 */
	@Override
	protected boolean hasReference(long id) {
		// Implement check other object database against this id.
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#assignData(ACode, AMain, DTO)
	 */
	@Override
	protected DTO assignData(ACode c, AMain m, DTO dto) {
		logger.fine("SiteODBBean:assignData: " + dto.getCode());
		// ((userDTO)dto).setPassword(((userMain)m).getPassword());
		// ((UserDTO)dto).setPassword(General.decrypt1(((UserMain)m).getPassword()));
		// ((UserDTO)dto).setUserGroup(((UserMain)m).getUserGroup());
		//
		// ((UserDTO)dto).setDefaultOrganization(((UserMain)m).getDefaultOrganization());
		//
		// ((UserDTO)dto).setDefaultEntity1(((UserMain)m).getDefaultEntity1());
		// ((UserDTO)dto).setDefaultEntity2(((UserMain)m).getDefaultEntity2());
		// ((UserDTO)dto).setDefaultEntity3(((UserMain)m).getDefaultEntity3());
		// ((UserDTO)dto).setDefaultEntity4(((UserMain)m).getDefaultEntity4());
		// ((UserDTO)dto).setDefaultEntity5(((UserMain)m).getDefaultEntity5());
		// ((UserDTO)dto).setDefaultEntity6(((UserMain)m).getDefaultEntity6());
		// ((UserDTO)dto).setDefaultSubEntity1(((UserMain)m).getDefaultSubEntity1());
		// ((UserDTO)dto).setDefaultSubEntity2(((UserMain)m).getDefaultSubEntity2());
		// ((UserDTO)dto).setDefaultSubEntity3(((UserMain)m).getDefaultSubEntity3());
		// ((UserDTO)dto).setDefaultSubEntity4(((UserMain)m).getDefaultSubEntity4());
		// ((UserDTO)dto).setDefaultSubEntity5(((UserMain)m).getDefaultSubEntity5());
		// ((UserDTO)dto).setDefaultSubEntity6(((UserMain)m).getDefaultSubEntity6());
		//
		// ((UserDTO)dto).setValidOrganization(((UserMain)m).getValidOrganization());
		//
		// ((UserDTO)dto).setValidEntity1(((UserMain)m).getValidEntity1());
		// ((UserDTO)dto).setValidEntity2(((UserMain)m).getValidEntity2());
		// ((UserDTO)dto).setValidEntity3(((UserMain)m).getValidEntity3());
		// ((UserDTO)dto).setValidEntity4(((UserMain)m).getValidEntity4());
		// ((UserDTO)dto).setValidEntity5(((UserMain)m).getValidEntity5());
		// ((UserDTO)dto).setValidEntity6(((UserMain)m).getValidEntity6());
		// ((UserDTO)dto).setValidSubEntity1(((UserMain)m).getValidSubEntity1());
		// ((UserDTO)dto).setValidSubEntity2(((UserMain)m).getValidSubEntity2());
		// ((UserDTO)dto).setValidSubEntity3(((UserMain)m).getValidSubEntity3());
		// ((UserDTO)dto).setValidSubEntity4(((UserMain)m).getValidSubEntity4());
		// ((UserDTO)dto).setValidSubEntity5(((UserMain)m).getValidSubEntity5());
		// ((UserDTO)dto).setValidSubEntity6(((UserMain)m).getValidSubEntity6());

		return (SubEntityDTO) dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#storeData(ACode, AMain, DTO)
	 */
	@Override
	protected void storeData(ACode c, AMain m, DTO dto) {
		// ((userMain)m).setPassword(((userDTO)dto).getPassword());
		// ((UserMain)m).setPassword(General.encrypt1(((UserDTO)dto).getPassword()));
		// ((UserMain)m).setUserGroup(((UserDTO)dto).getUserGroup());
		//
		// ((UserMain)m).setDefaultOrganization(((UserDTO)dto).getDefaultOrganization());
		//
		// ((UserMain)m).setDefaultEntity1(((UserDTO)dto).getDefaultEntity1());
		// ((UserMain)m).setDefaultEntity2(((UserDTO)dto).getDefaultEntity2());
		// ((UserMain)m).setDefaultEntity3(((UserDTO)dto).getDefaultEntity3());
		// ((UserMain)m).setDefaultEntity4(((UserDTO)dto).getDefaultEntity4());
		// ((UserMain)m).setDefaultEntity5(((UserDTO)dto).getDefaultEntity5());
		// ((UserMain)m).setDefaultEntity6(((UserDTO)dto).getDefaultEntity6());
		// ((UserMain)m).setDefaultSubEntity1(((UserDTO)dto).getDefaultSubEntity1());
		// ((UserMain)m).setDefaultSubEntity2(((UserDTO)dto).getDefaultSubEntity2());
		// ((UserMain)m).setDefaultSubEntity3(((UserDTO)dto).getDefaultSubEntity3());
		// ((UserMain)m).setDefaultSubEntity4(((UserDTO)dto).getDefaultSubEntity4());
		// ((UserMain)m).setDefaultSubEntity5(((UserDTO)dto).getDefaultSubEntity5());
		// ((UserMain)m).setDefaultSubEntity6(((UserDTO)dto).getDefaultSubEntity6());
		//
		// ((UserMain)m).setValidOrganization(((UserDTO)dto).getValidOrganization());
		//
		// ((UserMain)m).setValidEntity1(((UserDTO)dto).getValidEntity1());
		// ((UserMain)m).setValidEntity2(((UserDTO)dto).getValidEntity2());
		// ((UserMain)m).setValidEntity3(((UserDTO)dto).getValidEntity3());
		// ((UserMain)m).setValidEntity4(((UserDTO)dto).getValidEntity4());
		// ((UserMain)m).setValidEntity5(((UserDTO)dto).getValidEntity5());
		// ((UserMain)m).setValidEntity6(((UserDTO)dto).getValidEntity6());
		// ((UserMain)m).setValidSubEntity1(((UserDTO)dto).getValidSubEntity1());
		// ((UserMain)m).setValidSubEntity2(((UserDTO)dto).getValidSubEntity2());
		// ((UserMain)m).setValidSubEntity3(((UserDTO)dto).getValidSubEntity3());
		// ((UserMain)m).setValidSubEntity4(((UserDTO)dto).getValidSubEntity4());
		// ((UserMain)m).setValidSubEntity5(((UserDTO)dto).getValidSubEntity5());
		// ((UserMain)m).setValidSubEntity6(((UserDTO)dto).getValidSubEntity6());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#prepareEditData(ACode, AMain, DTO)
	 */
	@Override
	protected void prepareEditData(ACode code, AMain main, DTO dto) {
		// if (((UserDTO)dto).getDefaultOrganization() < 0)
		// ((UserDTO)dto).setDefaultOrganization(((UserMain)main).getDefaultOrganization());
		//
		// if (((UserDTO)dto).getDefaultEntity1() < 0)
		// ((UserDTO)dto).setDefaultEntity1(((UserMain)main).getDefaultEntity1());
		// if (((UserDTO)dto).getDefaultEntity2() < 0)
		// ((UserDTO)dto).setDefaultEntity2(((UserMain)main).getDefaultEntity2());
		// if (((UserDTO)dto).getDefaultEntity3() < 0)
		// ((UserDTO)dto).setDefaultEntity3(((UserMain)main).getDefaultEntity3());
		// if (((UserDTO)dto).getDefaultEntity4() < 0)
		// ((UserDTO)dto).setDefaultEntity4(((UserMain)main).getDefaultEntity4());
		// if (((UserDTO)dto).getDefaultEntity5() < 0)
		// ((UserDTO)dto).setDefaultEntity5(((UserMain)main).getDefaultEntity5());
		// if (((UserDTO)dto).getDefaultEntity6() < 0)
		// ((UserDTO)dto).setDefaultEntity6(((UserMain)main).getDefaultEntity6());
		// if (((UserDTO)dto).getDefaultSubEntity1() < 0)
		// ((UserDTO)dto).setDefaultSubEntity1(((UserMain)main).getDefaultSubEntity1());
		// if (((UserDTO)dto).getDefaultSubEntity2() < 0)
		// ((UserDTO)dto).setDefaultSubEntity2(((UserMain)main).getDefaultSubEntity2());
		// if (((UserDTO)dto).getDefaultSubEntity3() < 0)
		// ((UserDTO)dto).setDefaultSubEntity3(((UserMain)main).getDefaultSubEntity3());
		// if (((UserDTO)dto).getDefaultSubEntity4() < 0)
		// ((UserDTO)dto).setDefaultSubEntity4(((UserMain)main).getDefaultSubEntity4());
		// if (((UserDTO)dto).getDefaultSubEntity5() < 0)
		// ((UserDTO)dto).setDefaultSubEntity5(((UserMain)main).getDefaultSubEntity5());
		// if (((UserDTO)dto).getDefaultSubEntity6() < 0)
		// ((UserDTO)dto).setDefaultSubEntity6(((UserMain)main).getDefaultSubEntity6());
		//
		// if (((UserDTO)dto).getValidOrganization() == null)
		// ((UserDTO)dto).setValidOrganization(((UserMain)main).getValidOrganization());
		//
		// if (((UserDTO)dto).getValidEntity1() == null)
		// ((UserDTO)dto).setValidEntity1(((UserMain)main).getValidEntity1());
		// if (((UserDTO)dto).getValidEntity2() == null)
		// ((UserDTO)dto).setValidEntity2(((UserMain)main).getValidEntity2());
		// if (((UserDTO)dto).getValidEntity3() == null)
		// ((UserDTO)dto).setValidEntity3(((UserMain)main).getValidEntity3());
		// if (((UserDTO)dto).getValidEntity4() == null)
		// ((UserDTO)dto).setValidEntity4(((UserMain)main).getValidEntity4());
		// if (((UserDTO)dto).getValidEntity5() == null)
		// ((UserDTO)dto).setValidEntity5(((UserMain)main).getValidEntity5());
		// if (((UserDTO)dto).getValidEntity6() == null)
		// ((UserDTO)dto).setValidEntity6(((UserMain)main).getValidEntity6());
		// if (((UserDTO)dto).getValidSubEntity1() == null)
		// ((UserDTO)dto).setValidSubEntity1(((UserMain)main).getValidSubEntity1());
		// if (((UserDTO)dto).getValidSubEntity2() == null)
		// ((UserDTO)dto).setValidSubEntity2(((UserMain)main).getValidSubEntity2());
		// if (((UserDTO)dto).getValidSubEntity3() == null)
		// ((UserDTO)dto).setValidSubEntity3(((UserMain)main).getValidSubEntity3());
		// if (((UserDTO)dto).getValidSubEntity4() == null)
		// ((UserDTO)dto).setValidSubEntity4(((UserMain)main).getValidSubEntity4());
		// if (((UserDTO)dto).getValidSubEntity5() == null)
		// ((UserDTO)dto).setValidSubEntity5(((UserMain)main).getValidSubEntity5());
		// if (((UserDTO)dto).getValidSubEntity6() == null)
		// ((UserDTO)dto).setValidSubEntity6(((UserMain)main).getValidSubEntity6());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#publishData()
	 */
	@Override
	protected boolean publishData() {
		// TODO true if wants to publish, false if does not want to publish
		return false;
		// return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postAdd(Connection.java, DTO)
	 */
	@Override
	protected void postAdd(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postChange(Connection.java, DTO)
	 */
	@Override
	protected void postChange(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postChangeCode(Connection.java, String,
	 * String)
	 */
	@Override
	protected void postChangeCode(Connection connectionInfo, String oldPK,
			String newPK) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postDelete(Connection.java, DTO)
	 */
	@Override
	protected void postDelete(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postResetDatabase()
	 */
	@Override
	protected void postResetDatabase() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preAdd(Connection.java, DTO)
	 */
	@Override
	protected boolean preAdd(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preChange(Connection.java, DTO)
	 */
	@Override
	protected boolean preChange(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preChangeCode(Connection.java, String,
	 * String)
	 */
	@Override
	protected boolean preChangeCode(Connection connectionInfo, String oldPK,
			String newPK) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preDelete(Connection.java, DTO)
	 */
	@Override
	protected boolean preDelete(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preResetDatabase()
	 */
	@Override
	protected boolean preResetDatabase() {
		// TODO Auto-generated method stub
		return true;
	}

}
