package base.objectdatabase.master;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import library.General;
import library.enum_module;
import base.dto.master.UserDTO;
import base.entity.master.user.UserCode;
import base.entity.master.user.UserControlId;
import base.entity.master.user.UserDescription;
import base.entity.master.user.UserMain;
import base.entity.master.user.UserModule;
import base.entity.master.user.UserNote;
import baseobject.context.Connection;
import baseobject.dto.DTO;
import baseobject.entity.ACode;
import baseobject.entity.AControlId;
import baseobject.entity.ADescription;
import baseobject.entity.AMain;
import baseobject.entity.ANote;
import baseobject.entity.ATable;
import baseobject.error.ODBException;
import baseobject.objectdatabase.AODBM1;
import baseobject.objectdatabase.AODBM1Base;

/**
 * <p>
 * Title: userODBBean
 * </p>
 * <p>
 * Description: user object data.
 * </p>
 * This class implements to persist user information.
 * <P>
 * <p>
 * Converting from internal entity code as long to the string entity code in DTO
 * for easy using.
 * </p>
 * It served as gateway to access all the user tables.
 * <p>
 * Copyright: Copyright (c) 2008
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
@Stateless(mappedName = "UserODBBean/remote")
@Remote({ UserODBRemote.class })
public class UserODBBean extends AODBM1Base implements UserODBRemote {
	// @PersistenceContext // (unitName="base-ejbPU")
	// private EntityManager em;

	/**
	 * Code entity.
	 */
	private UserCode code;
	/**
	 * Main entity.
	 */
	private UserMain main;
	/**
	 * ControlId entity.
	 */
	private UserControlId userControlID;
	/**
	 * Module entity.
	 */
	private UserModule userModule;
	/**
	 * Data transfer object all information.
	 */
	private UserDTO userDTO;

	/**
	 * Creates a new instance of userODDBean.
	 */
	public UserODBBean() {
		super();
		// logger = Logger.getLogger("objectdb.base.userODDBean");
		// logger.setLevel(Level.INFO);

		// pInfo.setClassName(UserODBBean.class.getName());

		userDTO = new UserDTO();
		code = new UserCode();
		main = new UserMain();
		userControlID = new UserControlId();
		userModule = new UserModule();

	}

	public long size() {
		logger.fine("userFacade:find");

		Query query;
		Object result;
		try {
			query = em.createQuery("SELECT COUNT(c) FROM UserCode c");
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
	
	public DTO findByLogin(String login) {
		List<DTO> dtos = new ArrayList<DTO>();
		try {
			dtos = findMain("m.login = '" + login.trim() + "'");
		} catch (ODBException e) {
	        /**
	         * No exception stack trace required
	         * because some may call for expected null out come.
	         */
	        logger.fine("Exception findMain: " + e);
			return null;
		}
		if (dtos == null)
			return null;
		else {
			if (dtos.size() == 0)
				return null;
			else
				return dtos.get(0);
		}
	}

	@Override
	protected ACode getCodeEntity() {
		if (code == null)
			code = new UserCode();
		return code;
	}

	@Override
	protected AControlId getControlId() {
		return userControlID;
	}

	@Override
	protected DTO getDTO() {
		if (userDTO == null)
			userDTO = new UserDTO();
		return userDTO;
	}

	@Override
	protected DTO getNewDTO() {
		return new UserDTO();
	}

	@Override
	protected AMain getMainEntity() {
		if (main == null)
			main = new UserMain();
		return main;
	}

	@Override
	protected ADescription getNewLingualDescription() {
		return (ADescription) (new UserDescription());
	}

	@Override
	protected ANote getNewNote() {
		return new UserNote();
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
		logger.fine("UserODBBean:assignData: " + dto.getCode() + " m: "
				+ ((UserMain) m).getPassword());
		((UserDTO) dto).setLogin(((UserMain) m).getLogin());
		// ((userDTO)dto).setPassword(((userMain)m).getPassword());
		((UserDTO) dto).setPassword(General.decrypt1(((UserMain) m)
				.getPassword()));
		((UserDTO) dto).setUserGroup(((UserMain) m).getUserGroup());

		((UserDTO) dto).setDefaultSite(((UserMain) m).getDefaultSite());
		((UserDTO) dto).setDefaultCurrency(((UserMain) m).getDefaultCurrency());
		
		((UserDTO) dto).setDefaultLabelLanguage(((UserMain) m).getDefaultLabelLanguage());
		((UserDTO) dto).setDefaultDescriptionLanguage(((UserMain) m).getDefaultDescriptionLanguage());
		
		((UserDTO) dto).setDefaultEnterprise(((UserMain) m)
				.getDefaultEnterprise());

		((UserDTO) dto).setDefaultEntity0(((UserMain) m).getDefaultEntity0());
		((UserDTO) dto).setDefaultEntity1(((UserMain) m).getDefaultEntity1());
		((UserDTO) dto).setDefaultEntity2(((UserMain) m).getDefaultEntity2());
		((UserDTO) dto).setDefaultEntity3(((UserMain) m).getDefaultEntity3());
		((UserDTO) dto).setDefaultEntity4(((UserMain) m).getDefaultEntity4());
		((UserDTO) dto).setDefaultEntity5(((UserMain) m).getDefaultEntity5());
		((UserDTO) dto).setDefaultEntity6(((UserMain) m).getDefaultEntity6());
		((UserDTO) dto).setDefaultEntity7(((UserMain) m).getDefaultEntity7());
		((UserDTO) dto).setDefaultEntity8(((UserMain) m).getDefaultEntity8());
		((UserDTO) dto).setDefaultEntity9(((UserMain) m).getDefaultEntity9());
		((UserDTO) dto).setDefaultSubEntity0(((UserMain) m)
				.getDefaultSubEntity0());
		((UserDTO) dto).setDefaultSubEntity1(((UserMain) m)
				.getDefaultSubEntity1());
		((UserDTO) dto).setDefaultSubEntity2(((UserMain) m)
				.getDefaultSubEntity2());
		((UserDTO) dto).setDefaultSubEntity3(((UserMain) m)
				.getDefaultSubEntity3());
		((UserDTO) dto).setDefaultSubEntity4(((UserMain) m)
				.getDefaultSubEntity4());
		((UserDTO) dto).setDefaultSubEntity5(((UserMain) m)
				.getDefaultSubEntity5());
		((UserDTO) dto).setDefaultSubEntity6(((UserMain) m)
				.getDefaultSubEntity6());
		((UserDTO) dto).setDefaultSubEntity7(((UserMain) m)
				.getDefaultSubEntity7());
		((UserDTO) dto).setDefaultSubEntity8(((UserMain) m)
				.getDefaultSubEntity8());
		((UserDTO) dto).setDefaultSubEntity9(((UserMain) m)
				.getDefaultSubEntity9());

		((UserDTO) dto).setValidSite(((UserMain) m).getValidSite());
		((UserDTO) dto).setValidEnterprise(((UserMain) m).getValidEnterprise());

		((UserDTO) dto).setValidEntity0(((UserMain) m).getValidEntity0());
		((UserDTO) dto).setValidEntity1(((UserMain) m).getValidEntity1());
		((UserDTO) dto).setValidEntity2(((UserMain) m).getValidEntity2());
		((UserDTO) dto).setValidEntity3(((UserMain) m).getValidEntity3());
		((UserDTO) dto).setValidEntity4(((UserMain) m).getValidEntity4());
		((UserDTO) dto).setValidEntity5(((UserMain) m).getValidEntity5());
		((UserDTO) dto).setValidEntity6(((UserMain) m).getValidEntity6());
		((UserDTO) dto).setValidEntity7(((UserMain) m).getValidEntity7());
		((UserDTO) dto).setValidEntity8(((UserMain) m).getValidEntity8());
		((UserDTO) dto).setValidEntity9(((UserMain) m).getValidEntity9());
		((UserDTO) dto).setValidSubEntity0(((UserMain) m).getValidSubEntity0());
		((UserDTO) dto).setValidSubEntity1(((UserMain) m).getValidSubEntity1());
		((UserDTO) dto).setValidSubEntity2(((UserMain) m).getValidSubEntity2());
		((UserDTO) dto).setValidSubEntity3(((UserMain) m).getValidSubEntity3());
		((UserDTO) dto).setValidSubEntity4(((UserMain) m).getValidSubEntity4());
		((UserDTO) dto).setValidSubEntity5(((UserMain) m).getValidSubEntity5());
		((UserDTO) dto).setValidSubEntity6(((UserMain) m).getValidSubEntity6());
		((UserDTO) dto).setValidSubEntity7(((UserMain) m).getValidSubEntity7());
		((UserDTO) dto).setValidSubEntity8(((UserMain) m).getValidSubEntity8());
		((UserDTO) dto).setValidSubEntity9(((UserMain) m).getValidSubEntity9());

		return (UserDTO) dto;
	}

	/**
	 * This function should be defined in subclass to assign data from
	 * entities/tables instances to DTO. 
	 * <P> Do not assign new DTO. Using the DTO data or some data may lose.</P> 
	 * @param data
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected DTO assignMoreData(DTO data) {
		logger.fine("assignMoreData: " + data.getCode() + " id: " + data.getId());
	
		List<UserModule> userInstances = new ArrayList<UserModule>();
		userInstances.addAll((Collection<? extends UserModule>) getMoreDataTableInstances(userModule));
		
		((UserDTO)data).clearAccessCode();
		for (UserModule instance: userInstances) {
			((UserDTO)data).addAccessCode(instance.getModule(),instance.getEnterpriseId(),instance.getAccessCode());
		}
	
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#storeData(ACode, AMain, DTO)
	 */
	@Override
	protected void storeData(ACode c, AMain m, DTO dto) {
		((UserMain) m).setLogin(((UserDTO) dto).getLogin());
		// ((userMain)m).setPassword(((userDTO)dto).getPassword());
		((UserMain) m).setPassword(General.encrypt1(((UserDTO) dto)
				.getPassword()));
		((UserMain) m).setUserGroup(((UserDTO) dto).getUserGroup());

		((UserMain) m).setDefaultSite(((UserDTO) dto)
				.getDefaultSite());
		((UserMain) m).setDefaultCurrency(((UserDTO) dto)
				.getDefaultCurrency());
		
		((UserMain) m).setDefaultLabelLanguage(((UserDTO) dto)
				.getDefaultLabelLanguage());
		((UserMain) m).setDefaultDescriptionLanguage(((UserDTO) dto)
				.getDefaultDescriptionLanguage());
		
		
		((UserMain) m).setDefaultEnterprise(((UserDTO) dto)
				.getDefaultEnterprise());

		((UserMain) m).setDefaultEntity0(((UserDTO) dto).getDefaultEntity0());
		((UserMain) m).setDefaultEntity1(((UserDTO) dto).getDefaultEntity1());
		((UserMain) m).setDefaultEntity2(((UserDTO) dto).getDefaultEntity2());
		((UserMain) m).setDefaultEntity3(((UserDTO) dto).getDefaultEntity3());
		((UserMain) m).setDefaultEntity4(((UserDTO) dto).getDefaultEntity4());
		((UserMain) m).setDefaultEntity5(((UserDTO) dto).getDefaultEntity5());
		((UserMain) m).setDefaultEntity6(((UserDTO) dto).getDefaultEntity6());
		((UserMain) m).setDefaultEntity7(((UserDTO) dto).getDefaultEntity7());
		((UserMain) m).setDefaultEntity8(((UserDTO) dto).getDefaultEntity8());
		((UserMain) m).setDefaultEntity9(((UserDTO) dto).getDefaultEntity9());
		((UserMain) m).setDefaultSubEntity0(((UserDTO) dto)
				.getDefaultSubEntity0());
		((UserMain) m).setDefaultSubEntity1(((UserDTO) dto)
				.getDefaultSubEntity1());
		((UserMain) m).setDefaultSubEntity2(((UserDTO) dto)
				.getDefaultSubEntity2());
		((UserMain) m).setDefaultSubEntity3(((UserDTO) dto)
				.getDefaultSubEntity3());
		((UserMain) m).setDefaultSubEntity4(((UserDTO) dto)
				.getDefaultSubEntity4());
		((UserMain) m).setDefaultSubEntity5(((UserDTO) dto)
				.getDefaultSubEntity5());
		((UserMain) m).setDefaultSubEntity6(((UserDTO) dto)
				.getDefaultSubEntity6());
		((UserMain) m).setDefaultSubEntity7(((UserDTO) dto)
				.getDefaultSubEntity7());
		((UserMain) m).setDefaultSubEntity8(((UserDTO) dto)
				.getDefaultSubEntity8());
		((UserMain) m).setDefaultSubEntity9(((UserDTO) dto)
				.getDefaultSubEntity9());

		((UserMain) m).setValidSite(((UserDTO) dto).getValidSite());
		
		((UserMain) m).setValidEnterprise(((UserDTO) dto).getValidEnterprise());

		((UserMain) m).setValidEntity0(((UserDTO) dto).getValidEntity0());
		((UserMain) m).setValidEntity1(((UserDTO) dto).getValidEntity1());
		((UserMain) m).setValidEntity2(((UserDTO) dto).getValidEntity2());
		((UserMain) m).setValidEntity3(((UserDTO) dto).getValidEntity3());
		((UserMain) m).setValidEntity4(((UserDTO) dto).getValidEntity4());
		((UserMain) m).setValidEntity5(((UserDTO) dto).getValidEntity5());
		((UserMain) m).setValidEntity6(((UserDTO) dto).getValidEntity6());
		((UserMain) m).setValidEntity7(((UserDTO) dto).getValidEntity7());
		((UserMain) m).setValidEntity8(((UserDTO) dto).getValidEntity8());
		((UserMain) m).setValidEntity9(((UserDTO) dto).getValidEntity9());
		((UserMain) m).setValidSubEntity0(((UserDTO) dto).getValidSubEntity0());
		((UserMain) m).setValidSubEntity1(((UserDTO) dto).getValidSubEntity1());
		((UserMain) m).setValidSubEntity2(((UserDTO) dto).getValidSubEntity2());
		((UserMain) m).setValidSubEntity3(((UserDTO) dto).getValidSubEntity3());
		((UserMain) m).setValidSubEntity4(((UserDTO) dto).getValidSubEntity4());
		((UserMain) m).setValidSubEntity5(((UserDTO) dto).getValidSubEntity5());
		((UserMain) m).setValidSubEntity6(((UserDTO) dto).getValidSubEntity6());
		((UserMain) m).setValidSubEntity7(((UserDTO) dto).getValidSubEntity7());
		((UserMain) m).setValidSubEntity8(((UserDTO) dto).getValidSubEntity8());
		((UserMain) m).setValidSubEntity9(((UserDTO) dto).getValidSubEntity9());

	}

	@Override
	protected void storeMoreData(DTO data) {
		logger.fine("in addMoreData data: " + data);

		if (data == null) 
			return;
	
		if (((UserDTO) data).getAccessCode() != null) {
			Map<enum_module, Map<Long,String>> accessCode = new HashMap<enum_module, Map<Long,String>>();
			accessCode.putAll(((UserDTO) data).getAccessCode());
			for (enum_module module : accessCode.keySet()) {
				for (Long enterpriseId : accessCode.get(module).keySet()) {
					userModule = new UserModule();
					
					userModule.setModule(module);
					userModule.setId(((UserDTO)data).getId());
					userModule.setEnterpriseId(enterpriseId);
					userModule.setAccessCode(accessCode.get(module).get(enterpriseId));
					
					addMoreDataTableInstances(userModule, userModule);
				}
			}
		}
		logger.fine("finish addMoreData");
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#prepareEditData(ACode, AMain, DTO)
	 */
	@Override
	protected void prepareEditData(ACode code, AMain main, DTO dto) {
		if (((UserDTO) dto).getDefaultSite() == null)
			((UserDTO) dto).setDefaultSite(((UserMain) main)
					.getDefaultSite());
		if (((UserDTO) dto).getDefaultCurrency() == null)
			((UserDTO) dto).setDefaultCurrency(((UserMain) main)
					.getDefaultCurrency());
		
		if (((UserDTO) dto).getDefaultLabelLanguage() == null)
			((UserDTO) dto).setDefaultLabelLanguage(((UserMain) main)
					.getDefaultLabelLanguage());
		if (((UserDTO) dto).getDefaultDescriptionLanguage() == null)
			((UserDTO) dto).setDefaultDescriptionLanguage(((UserMain) main)
					.getDefaultDescriptionLanguage());

		if (((UserDTO) dto).getDefaultEnterprise() == null)
			((UserDTO) dto).setDefaultEnterprise(((UserMain) main)
					.getDefaultEnterprise());

		if (((UserDTO) dto).getDefaultEntity0() == null)
			((UserDTO) dto).setDefaultEntity0(((UserMain) main)
					.getDefaultEntity0());
		if (((UserDTO) dto).getDefaultEntity1() == null)
			((UserDTO) dto).setDefaultEntity1(((UserMain) main)
					.getDefaultEntity1());
		if (((UserDTO) dto).getDefaultEntity2() == null)
			((UserDTO) dto).setDefaultEntity2(((UserMain) main)
					.getDefaultEntity2());
		if (((UserDTO) dto).getDefaultEntity3() == null)
			((UserDTO) dto).setDefaultEntity3(((UserMain) main)
					.getDefaultEntity3());
		if (((UserDTO) dto).getDefaultEntity4() == null)
			((UserDTO) dto).setDefaultEntity4(((UserMain) main)
					.getDefaultEntity4());
		if (((UserDTO) dto).getDefaultEntity5() == null)
			((UserDTO) dto).setDefaultEntity5(((UserMain) main)
					.getDefaultEntity5());
		if (((UserDTO) dto).getDefaultEntity6() == null)
			((UserDTO) dto).setDefaultEntity6(((UserMain) main)
					.getDefaultEntity6());
		if (((UserDTO) dto).getDefaultEntity7() == null)
			((UserDTO) dto).setDefaultEntity7(((UserMain) main)
					.getDefaultEntity7());
		if (((UserDTO) dto).getDefaultEntity8() == null)
			((UserDTO) dto).setDefaultEntity8(((UserMain) main)
					.getDefaultEntity8());
		if (((UserDTO) dto).getDefaultEntity9() == null)
			((UserDTO) dto).setDefaultEntity9(((UserMain) main)
					.getDefaultEntity9());
		if (((UserDTO) dto).getDefaultSubEntity0() == null)
			((UserDTO) dto).setDefaultSubEntity0(((UserMain) main)
					.getDefaultSubEntity0());
		if (((UserDTO) dto).getDefaultSubEntity1() == null)
			((UserDTO) dto).setDefaultSubEntity1(((UserMain) main)
					.getDefaultSubEntity1());
		if (((UserDTO) dto).getDefaultSubEntity2() == null)
			((UserDTO) dto).setDefaultSubEntity2(((UserMain) main)
					.getDefaultSubEntity2());
		if (((UserDTO) dto).getDefaultSubEntity3() == null)
			((UserDTO) dto).setDefaultSubEntity3(((UserMain) main)
					.getDefaultSubEntity3());
		if (((UserDTO) dto).getDefaultSubEntity4() == null)
			((UserDTO) dto).setDefaultSubEntity4(((UserMain) main)
					.getDefaultSubEntity4());
		if (((UserDTO) dto).getDefaultSubEntity5() == null)
			((UserDTO) dto).setDefaultSubEntity5(((UserMain) main)
					.getDefaultSubEntity5());
		if (((UserDTO) dto).getDefaultSubEntity6() == null)
			((UserDTO) dto).setDefaultSubEntity6(((UserMain) main)
					.getDefaultSubEntity6());
		if (((UserDTO) dto).getDefaultSubEntity7() == null)
			((UserDTO) dto).setDefaultSubEntity7(((UserMain) main)
					.getDefaultSubEntity7());
		if (((UserDTO) dto).getDefaultSubEntity8() == null)
			((UserDTO) dto).setDefaultSubEntity8(((UserMain) main)
					.getDefaultSubEntity8());
		if (((UserDTO) dto).getDefaultSubEntity9() == null)
			((UserDTO) dto).setDefaultSubEntity9(((UserMain) main)
					.getDefaultSubEntity9());

		if (((UserDTO) dto).getValidSite() == null)
			((UserDTO) dto).setValidSite(((UserMain) main)
					.getValidSite());

		if (((UserDTO) dto).getValidEnterprise() == null)
			((UserDTO) dto).setValidEnterprise(((UserMain) main)
					.getValidEnterprise());

		if (((UserDTO) dto).getValidEntity0() == null)
			((UserDTO) dto)
					.setValidEntity0(((UserMain) main).getValidEntity0());
		if (((UserDTO) dto).getValidEntity1() == null)
			((UserDTO) dto)
					.setValidEntity1(((UserMain) main).getValidEntity1());
		if (((UserDTO) dto).getValidEntity2() == null)
			((UserDTO) dto)
					.setValidEntity2(((UserMain) main).getValidEntity2());
		if (((UserDTO) dto).getValidEntity3() == null)
			((UserDTO) dto)
					.setValidEntity3(((UserMain) main).getValidEntity3());
		if (((UserDTO) dto).getValidEntity4() == null)
			((UserDTO) dto)
					.setValidEntity4(((UserMain) main).getValidEntity4());
		if (((UserDTO) dto).getValidEntity5() == null)
			((UserDTO) dto)
					.setValidEntity5(((UserMain) main).getValidEntity5());
		if (((UserDTO) dto).getValidEntity6() == null)
			((UserDTO) dto)
					.setValidEntity6(((UserMain) main).getValidEntity6());
		if (((UserDTO) dto).getValidEntity7() == null)
			((UserDTO) dto)
					.setValidEntity7(((UserMain) main).getValidEntity7());
		if (((UserDTO) dto).getValidEntity8() == null)
			((UserDTO) dto)
					.setValidEntity8(((UserMain) main).getValidEntity8());
		if (((UserDTO) dto).getValidEntity9() == null)
			((UserDTO) dto)
					.setValidEntity9(((UserMain) main).getValidEntity9());
		if (((UserDTO) dto).getValidSubEntity0() == null)
			((UserDTO) dto).setValidSubEntity0(((UserMain) main)
					.getValidSubEntity0());
		if (((UserDTO) dto).getValidSubEntity1() == null)
			((UserDTO) dto).setValidSubEntity1(((UserMain) main)
					.getValidSubEntity1());
		if (((UserDTO) dto).getValidSubEntity2() == null)
			((UserDTO) dto).setValidSubEntity2(((UserMain) main)
					.getValidSubEntity2());
		if (((UserDTO) dto).getValidSubEntity3() == null)
			((UserDTO) dto).setValidSubEntity3(((UserMain) main)
					.getValidSubEntity3());
		if (((UserDTO) dto).getValidSubEntity4() == null)
			((UserDTO) dto).setValidSubEntity4(((UserMain) main)
					.getValidSubEntity4());
		if (((UserDTO) dto).getValidSubEntity5() == null)
			((UserDTO) dto).setValidSubEntity5(((UserMain) main)
					.getValidSubEntity5());
		if (((UserDTO) dto).getValidSubEntity6() == null)
			((UserDTO) dto).setValidSubEntity6(((UserMain) main)
					.getValidSubEntity6());
		if (((UserDTO) dto).getValidSubEntity7() == null)
			((UserDTO) dto).setValidSubEntity7(((UserMain) main)
					.getValidSubEntity7());
		if (((UserDTO) dto).getValidSubEntity8() == null)
			((UserDTO) dto).setValidSubEntity8(((UserMain) main)
					.getValidSubEntity8());
		if (((UserDTO) dto).getValidSubEntity9() == null)
			((UserDTO) dto).setValidSubEntity9(((UserMain) main)
					.getValidSubEntity9());
	}

	@Override
	protected List<ATable> getMoreDataTables() {
		List<ATable> moreDataTables = new ArrayList<ATable>();
		moreDataTables.add(userModule);
		return moreDataTables;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#publishData()
	 */
	@Override
	protected boolean publishData() {
		// TODO True to publish, False not to publish
		return false;
		// return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postAdd(Connection, DTO)
	 */
	@Override
	protected void postAdd(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postChange(Connection, DTO)
	 */
	@Override
	protected void postChange(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#postChangeCode(Connection, String,
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
	 * @see baseobject.objectdatabase.AODBM#postDelete(Connection, DTO)
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
	 * @see baseobject.objectdatabase.AODBM#preAdd(Connection, DTO)
	 */
	@Override
	protected boolean preAdd(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preChange(Connection, DTO)
	 */
	@Override
	protected boolean preChange(Connection connectionInfo, DTO data) {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see baseobject.objectdatabase.AODBM#preChangeCode(Connection, String,
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
	 * @see baseobject.objectdatabase.AODBM#preDelete(Connection, DTO)
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
