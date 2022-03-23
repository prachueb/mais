package base.objectdatabase.master;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import base.dto.master.EnterpriseDTO;
import base.entity.master.enterprise.EnterpriseCode;
import base.entity.master.enterprise.EnterpriseControlId;
import base.entity.master.enterprise.EnterpriseDescription;
import base.entity.master.enterprise.EnterpriseMain;
import base.entity.master.enterprise.EnterpriseNote;
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
 * Title: EnterpriseODBBean
 * </p>
 * <p>
 * Description: Enterprise object data.
 * </p>
 * This class implements to persist Enterprise information.
 * <P>
 * <p>
 * Converting from internal entity code as long to the string entity code in DTO
 * for easy using.
 * </p>
 * It served as gateway to access all the Enterprise tables.
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
@Stateless(mappedName = "EnterpriseODBBean/remote")
@Remote({ EnterpriseODBRemote.class })
public class EnterpriseODBBean extends AODBMBase implements EnterpriseODBRemote {

	// @PersistenceContext // (unitName="base-ejbPU")
	// private EntityManager em;

	/**
	 * Code entity.
	 */
	private EnterpriseCode code;
	/**
	 * Main entity.
	 */
	private EnterpriseMain main;
	/**
	 * EnterpriseControlId entity.
	 */
	private EnterpriseControlId controlID;
	/**
	 * Data transfer object all information.
	 */
	private EnterpriseDTO enterpriseDTO;

	/**
	 * Creates a new instance of EnterpriseODDBean.
	 */
	public EnterpriseODBBean() {
		super();
		// logger = Logger.getLogger("objectdb.base.EnterpriseODDBean");
		// logger.setLevel(Level.INFO);

		// pInfo.setClassName(UserODBBean.class.getName());

		enterpriseDTO = new EnterpriseDTO();
		code = new EnterpriseCode();
		main = new EnterpriseMain();
		controlID = new EnterpriseControlId();
	}

	public long size() {
		logger.fine("EnterpriseFacade:find");

		Query query;
		Object result;
		try {
			query = em.createQuery("SELECT COUNT(c) FROM EnterpriseCode c");
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
			code = new EnterpriseCode();
		return code;
	}

	@Override
	protected AControlId getControlId() {
		return controlID;
	}

	@Override
	protected DTO getDTO() {
		if (enterpriseDTO == null)
			enterpriseDTO = new EnterpriseDTO();
		return enterpriseDTO;
	}

	@Override
	protected DTO getNewDTO() {
		return new EnterpriseDTO();
	}

	@Override
	protected AMain getMainEntity() {
		if (main == null)
			main = new EnterpriseMain();
		return main;
	}

	@Override
	protected ADescription getNewLingualDescription() {
		return (ADescription) (new EnterpriseDescription());
	}

	@Override
	protected ANote getNewNote() {
		return new EnterpriseNote();
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
		logger.fine("EnterpriseODBBean:assignData: " + dto.getCode());
		
		((EnterpriseDTO)dto).setAccountCurrency(((EnterpriseMain)m).getAccountCurrency());

		return (EnterpriseDTO) dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#storeData(ACode, AMain, DTO)
	 */
	@Override
	protected void storeData(ACode c, AMain m, DTO dto) {
		((EnterpriseMain)m).setAccountCurrency(((EnterpriseDTO)dto).getAccountCurrency());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#prepareEditData(ACode, AMain, DTO)
	 */
	@Override
	protected void prepareEditData(ACode code, AMain main, DTO dto) {
		if (((EnterpriseDTO)dto).getAccountCurrency() == null)
			((EnterpriseDTO)dto).setAccountCurrency(((EnterpriseMain)main).getAccountCurrency());
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
