// This layer define publishing and subscriping from massage bus.
//package com.mais.base.language;
//
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.ejb.EJBContext;
//import javax.ejb.TransactionAttribute;
//import javax.ejb.TransactionAttributeType;
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import com.mais.base.language.models.*;
//
///**
// * <p>
// * Title: AODBM
// * </p>
// * <p>
// * Description: abstract object database master.
// * </p>
// * <p>
// * This class implements the default mechanism to create,
// * edit, change primary code, destroy or delete, reset database,
// * and find by code.
// * </P>
// * <p>
// * Copyright: Copyright (c) 2010
// * </p>
// *
// * @author Prachueb Sirivongrungson
// * @version 1.0
// */
////@TransactionManagement(value=TransactionManagementType.BEAN)
////@Transaction(REQUIRES_NEW)
////@Transactional
////@TransactionAttribute(TransactionAttributeType.NEVER)
//public abstract class AODBM extends AODB { // implements AODBRemote {
//
//	@Resource
//	private EJBContext context;
//
//	//TODO add logic to validate of view, edit in each record/instance
//	// may just function to check if it validate to view edit delete
//	// The inquiry function may get only valid result to view
//
//    /**
//     * Next internal Id.
//     */
//    private long nextID;
//    /**
//     * Internal Id.
//     */
//    private InternalID iid = new InternalID();
//    /**
//     * Control Id entity.
//     */
//    private AControlId ctlid;
//    private ACode code;
//    private AMain main;
//    private ADescription lingualDescription;
//    private ANote Note;
//    /**
//     * DTO
//     */
//    private DTO dto;
//
////    PublishPersistence publishPersistence;
//
//    /**
//     * Define the instance of subclass ACode entity, could instance from the constructor.
//     * @return ACode entity subclass instance
//     */
//    abstract protected ACode getCodeEntity();
//
//    /**
//     * Define the instance of subclass AMain entity, could instance from the constructor.
//     * @return AMain entity subclass instance
//     */
//    abstract protected AMain getMainEntity();
//
//    /**
//     * Define new instance of subclass ADescription entity in the function call.
//     * @return ADescription entity subclass instance
//     */
//    abstract protected ADescription getNewLingualDescription();
//
//    /**
//     * Define new instance of subclass ANote entity in the function call.
//     * @return ANote entity subclass instance
//     */
//    abstract protected ANote getNewNote();
//
//    /**
//     * Define the instance of subclass AControlId entity, could instance from the constructor.
//     * @return AControlId subclass entity instance
//     */
//    abstract protected AControlId getControlId();
//
//    /**
//     * Define the instance of subclass DTO, could instance from the constructor.
//     * @return DTO subclass instance
//     */
//    abstract protected DTO getDTO();
//
//    /**
//     * Define the instance of subclass DTO, could instance from the constructor.
//     * @return DTO subclass instance
//     */
//    abstract protected DTO getNewDTO();
//
//    /**
//     * Function to set more extend subclass data from DTO to entity.
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     */
//    abstract protected void storeData(ACode code, AMain main, DTO data);
//
//    /**
//     * Function to assign more extend subclass data from entity to DTO.
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     */
//    abstract protected DTO assignData(ACode code, AMain main, DTO data);
//
//    /**
//     * Function to check if DTO is null, set extend subclass data from Entity to DTO.
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     */
//    abstract protected void prepareEditData(ACode code, AMain main, DTO data);
//
//    /**
//     * Define if there are some reference DBO. Cannot delete the referencing record.
//     * @param id internal Id to check referential integrity
//     * @return if this instance had been referenced from the other object instances
//     */
//    abstract protected boolean hasReference(long id);
//
//    /**
//     * Define to publish data for replicate and etc.
//     * @return true to publish
//     */
//    abstract protected boolean publishData();
//
//    /**
//     * Calling before add data to database
//     * @param connectionInfo connection information
//     * @param data DTO subclass
//     * @return false if don't want to add data
//     */
//    abstract protected boolean preAdd(Connection.java connectionInfo, DTO data);
//
//    /**
//     * Calling after add data was done
//     * @param connectionInfo connection information
//     * @param data DTO subclass
//     */
//    abstract protected void postAdd(Connection.java connectionInfo, DTO data);
//
//    /**
//     * Calling before change data to database
//     * @param connectionInfo connection information
//     * @param data DTO subclass
//     * @return false if don't want to change data
//     */
//    abstract protected boolean preChange(Connection.java connectionInfo, DTO data);
//
//    /**
//     * Calling after change data was done
//     * @param connectionInfo connection information
//     * @param data DTO subclass
//     */
//    abstract protected void postChange(Connection.java connectionInfo, DTO data);
//
//    /**
//     * Calling before change code data to database
//     * @param connectionInfo connection information
//     * @param oldPK old primary key code
//     * @param newPK new primary key code
//     * @return false if don't want to change data
//     */
//    abstract protected boolean preChangeCode(Connection.java connectionInfo, String oldPK, String newPK);
//
//    /**
//     * Calling after change code data was done
//     * @param oldPK old primary key code
//     * @param newPK new primary key code
//     */
//    abstract protected void postChangeCode(Connection.java connectionInfo, String oldPK, String newPK);
//
//    /**
//     * Calling before remove data from database
//     * @param connectionInfo connection information
//     * @param data DTO subclass
//     * @return false if don't want to remove data
//     */
//    abstract protected boolean preDelete(Connection.java connectionInfo, DTO data);
//
//    /**
//     * Calling after remove data was done
//     * @param connectionInfo connection information
//     * @param data DTO subclass
//     */
//    abstract protected void postDelete(Connection.java connectionInfo, DTO data);
//
//    /**
//     * Calling before reset data to database
//     * @return false if don't want to reset data
//     */
//    abstract protected boolean preResetDatabase();
//
//    /**
//     * Calling after reset data was done
//     */
//    abstract protected void postResetDatabase();
//
//    /**
//     * Return the EntityManager that related to persistence unit of each modules
//     * @return
//     */
//    abstract protected EntityManager getEntityManager();
//
//    /**
//	 * Define list of more entities/tables objects (not the name)
//	 * @return
//	 */
//	protected List<ATable> getMoreDataTables() {return null;}
//
//	/**
//	 * This function is defined for subclass function to extended more entities/tables.
//	 */
//	protected void _addMoreData(DTO data) {}
//
//	/**
//	 * Using to get data from more table in the sub abstract class.
//	 * Override this class.
//	 * @return
//	 */
//	protected DTO _getMoreData(long id, DTO data) {return null;}
//
//    /**
//     * Using to store more table in the sub abstract class.
//     * Override this class.
//     */
//    protected void _editMoreData(long id, DTO data) {}
//
//    /**
//	 * Using to store more table in the sub abstract class.
//	 * Override this class.
//	 */
//	protected void _removeMoreData(long id) {}
//
//	/**
//	 * Using to store more table in the sub abstract class.
//	 * Override this class.
//	 */
//	protected void _resetMoreData() {}
//
//	/**
//     * Constructor
//     */
//    public AODBM() {
////		ctlid = getControlId();
//        lingualDescription = getNewLingualDescription();
//        Note = getNewNote();
////        publishPersistence = new PublishPersistence();
//    }
//
////  ====================================================================
//    /**
//     * To add new persistence.<BR><BR>
//     *
//     * @param currentInfo
//     * @param data
//     * @return DTO with internal Id.
//     * @throws ODBException
//     */
//	@TransactionAttribute(TransactionAttributeType.REQUIRED)
////	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
////    @Transactional(Transactional.TxType.REQUIRES_NEW)
//    @Override
//    public DTO add(Connection.java connectionInfo, DTO data) throws ODBException {
//        logger.fine("add code" + data.getCode());
//
//        getEntityManager().flush();
//        getEntityManager().clear();
//
//        if (!preAdd(connectionInfo, data)) {
//        	context.setRollbackOnly();
//            return null;
//        }
//
//        if (data.getCode() == null) {
//        	context.setRollbackOnly();
//            return null;
//        }
//
//        try {
//            code = _findCodeInstance(data.getCode());
//        } catch (Exception e) {
//            logger.fine("Code: " + code + "Return error: ");
//        	context.setRollbackOnly();
//            e.printStackTrace();
//        }
//        if (code != null) {
//            logger.fine("Duplicate Code: " + data.getCode());
//        	context.setRollbackOnly();
//            throw new ODBException("Duplicate Code: " + data.getCode());
//        }
//
//        logger.fine("not Duplicate Code: " + data.getCode());
//
//        /**
//         * Check if data already have internal number, means that the data was
//         * replicated and no need to modify any information and no next number
//         * of internal ID generated required. <BR>
//         * The unassigned id for DTO is -1
//         */
//        if (data.getId() < 0) {
//            if (data.getCreateSite() < 0) {
//                data.setCreateSite(connectionInfo.getSiteId());
//            }
//            if (data.getCreateUser() < 0) {
//                data.setCreateUser(connectionInfo.getUserId());
//            }
//            if (data.getCreateDate() < 0) {
//                data.setCreateDate(Calendar.getInstance().getTimeInMillis());
//            }
//            if (data.getUpdateUser() < 0) {
//                data.setUpdateUser(connectionInfo.getUserId());
//            }
//            if (data.getUpdateDate() < 0) {
//                data.setUpdateDate(Calendar.getInstance().getTimeInMillis());
//            }
//            if (data.getReplicate() == null) {
//                data.setReplicate(false);
//            }
//
//            data.setActive(true);
//
//            if (data.getStartDate() < 0) {
//                data.setStartDate(Calendar.getInstance().getTimeInMillis());
//            } else {
//                data.setStartDate(data.getStartDate());
//            }
//            if (data.getExpireDate() < 0) {
//                Calendar expDate = Calendar.getInstance();
//                expDate.set(9999, 1, 1);
//                data.setExpireDate(expDate.getTimeInMillis());
//            } else {
//                data.setExpireDate(data.getExpireDate());
//            }
//
//            nextID = getNextId(data.getCreateSite());
//
//            /**
//             * Set internal id into DTO to be used in
//             * multiple descriptions and notes.
//             */
//            data.setId(nextID);
//
//            logger.fine("Code: " + data.getCode() + " nextID: " + nextID);
//        } else {
//// TODO implement replicate add data here.
//        	// May cannot use this because the data.code check will error from duplicated code already.
//            logger.warning("Already had internal ID: plan to use with replicated site" + data.getId());
//        	context.setRollbackOnly();
//            return null;
//        }
//
//        /**
//         * Get code instance subclass
//         */
//        if (code == null) {
//            code = getCodeEntity();
//        }
//
//        /**
//         * Get main instance subclass
//         */
//        if (main == null) {
//            main = getMainEntity();
//        }
//
//        logger.fine("Before add lingual & note as id: " + data.getId());
//        try {
//
//            if (data.isMultilingual()) {
//                _addLingual(code, main, data, connectionInfo);
//            }
//
//
//            if (data.isHasNotes()) {
//                _addNote(code, main, data, connectionInfo);
//            }
//
//            /**
//             * Call more additional table store in the subclass implementation
//             */
//            if (getMoreDataTables() != null)
//            	_addMoreData(data);
//
//            _storePrimaryKey(code, main, data, connectionInfo);
//            _storeData(code, main, data, connectionInfo);
//
//            /**
//             * em.clear: make EntityManager to detach all entities
//             * the database to be able to allow new entities to add
//             * by persist();
//             * If persist() while some entity still be there, means
//             * change/edit that existing entity and cannot change
//             * the primary key.
//             */
//            getEntityManager().clear();
//            getEntityManager().persist(code);
//            getEntityManager().persist(main);
//            /**
//             * em.flush to re-synchronize cache into database.
//             */
//            getEntityManager().flush();
//            getEntityManager().clear();
//            getEntityManager().detach(code);
//            getEntityManager().detach(main);
//        } catch (Exception ex) {
//            logger.warning("Could not create: " + data.getCode());
//        	context.setRollbackOnly();
//            ex.printStackTrace();
//            throw new ODBException("Could not create: " + data.getCode() + "/n" + ex);
//        }
//
////logger.warning("before publishData " + publishData());
//        if (publishData()) {
////logger.warning("before replicate");
////            pInfo.setReplicate(data.getReplicate());
////            pInfo.setReplicateTo(data.getReplicateSite());
////TODO implement publish add record.
//        	  if (data.getReplicate()) {
////            PublishPersistence publishPersistence = new PublishPersistence();
////			publishPersistence.create(pInfo, connectionInfo, data);
////			publishPersistence.create(this.getClass().getName(), connectionInfo, data);
//        	  }
//        }
//
//        postAdd(connectionInfo, data);
//
//
//        return _AssignData();
//
//    }
//
//    /**
//     * To change the persistence as identified by DTO.setCode().
//     * The statement "super._edit(currentInfo, data);"
//     * should be declare. All the null value in DTO means don't change.
//     * Local and remote interfaces should be done for EJB calling.
//     *
//     * <P>
//     * Multiple linguals & notes
//     * <P>
//     * Add more content of languageDescription or Note:
//     * set DTOLongString.firstLong to new languageId or new orderId
//     * and set DTOLongString.secondString to new description or new note.
//     * <P>
//     * Change content of languageDescription or Note:
//     * set DTOLongString.firstLong to the languageId or orderId to be changed
//     * and set DTOLongString.secondString to new description or new note.
//     * <P>
//     * Delete content of languageDescription or Note:
//     * set DTOLongString.firstLong to the languageId or orderId to be deleted
//     * and set DTOLongString.secondString to null.
//     *
//     * @param connectionInfo
//     * @param data
//     * @throws ODBException
//     */
//	@TransactionAttribute(TransactionAttributeType.REQUIRED)
////	@TransactionAttribute(TransactionAttributeType.Mandatory)
////    @Transactional(Transactional.TxType.REQUIRES_NEW)
//    @Override
//    public void change(Connection.java connectionInfo, DTO data) throws ODBException {
//        logger.fine("change: code: " + data.getCode());
//
//        if (!preChange(connectionInfo, data)) {
//        	context.setRollbackOnly();
//            return;
//        }
//
//        code = _findCodeInstance(data.getCode());
//        if (code == null) {
//            logger.warning("Cannot find code: " + data.getCode());
//        	context.setRollbackOnly();
//            throw new ODBException("Cannot find code: " + data.getCode());
//        }
//
//        data.setId(code.getId());
//        main = _findMainInstance(data.getId());
//
//        if (data.getUpdateUser() < 0) {
//            data.setUpdateUser(connectionInfo.getUserId());
//        }
//        if (data.getUpdateDate() < 0) {
//            data.setUpdateDate(Calendar.getInstance().getTimeInMillis());
//        }
//
//        _prepareEditData(code, main, data, connectionInfo);
//
//        _editLingual(data);
//        _editNote(data);
//
//        /**
//         * Call more additional table store in the subclass implementation
//         */
//        if (getMoreDataTables() != null)
//        	_editMoreData(code.getId(), data);
//
//        _storeData(code, main, data, connectionInfo);
//
//
//        try {
//        	getEntityManager().clear();
//        	getEntityManager().merge(code);
//        	getEntityManager().merge(main);
//        	getEntityManager().flush();
//        	getEntityManager().clear();
//        } catch (Exception ex) {
//            logger.warning("Could not change: " + data.getCode() + "/n" + ex);
//        	context.setRollbackOnly();
//            throw new ODBException("Could not update: " + data.getCode() + "/n" + ex);
//        }
//
//        if (publishData()) {
////            pInfo.setReplicate(data.getReplicate());
////            pInfo.setReplicateTo(data.getReplicateSite());
////			publishPersistance.create(pInfo, currentInfo, data);
//      	  if (data.getReplicate()) {
////	            PublishPersistence publishPersistence = new PublishPersistence();
////TODO Implement publish change record
////				publishPersistence.create(pInfo, connectionInfo, data);
////				publishPersistence.change(this.getClass().getName(), connectionInfo, data);
//	        	  }
//        }
//
//        postChange(connectionInfo, data);
//    }
//
//    /**
//     * To remove the persistence as identified by data.setCode().
//     * The statement "super._changeCode(currentInfo, data);"
//     * should be declare.
//     * Local and remote interfaces should be done for EJB calling.
//     * @param connectionInfo
//     * @param data
//     * @throws ODBException
//     */
//	@TransactionAttribute(TransactionAttributeType.REQUIRED)
////	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
////    @Transactional(Transactional.TxType.REQUIRES_NEW)
//    @Override
//    public void changeCode(Connection.java connectionInfo, String oldPK, String newPK) throws ODBException {
//        logger.fine("userODB.changePK: " + oldPK + " to: " + newPK);
//
//        if (!preChangeCode(connectionInfo, oldPK, newPK)) {
//        	context.setRollbackOnly();
//            return;
//        }
//
////        ACode code = _findCodeInstance(newPK);
//        code = _findCodeInstance(newPK);
//        if (code != null) {
//            logger.warning("Could not edit duplicate new code: " + newPK);
//        	context.setRollbackOnly();
//            throw new ODBException("New code already exist:" + newPK);
//        }
//
//        code = _findCodeInstance(oldPK);
//        if (code == null) {
//            logger.warning("Could not edit not found old code: " + oldPK);
//        	context.setRollbackOnly();
//            throw new ODBException("Cannot find code:" + oldPK);
//        }
//
//        code.setCode(newPK);
//
//        getEntityManager().merge(code);
//
////        AMain main = _findMainInstance(code.getId());
//        main = _findMainInstance(code.getId());
//        if (main != null) {
//            main.setUpdateUser(connectionInfo.getUserId());
//            main.setUpdateDate(Calendar.getInstance().getTime());
//
//            getEntityManager().merge(main);
//        } else
//        	context.setRollbackOnly();
//
////		pInfo.setReplicate(data.getReplicate());
////		pInfo.setReplicateTo(data.getReplicateSite());
////		publishPersistance.changeCode(pInfo, currentInfo, new DTOStringString(oldPK,newPK));
//
//        if (publishData()) {
////			pInfo.setReplicate(data.getReplicate());
////			pInfo.setReplicateTo(data.getReplicateSite());
////			publishPersistance.create(pInfo, currentInfo, data);
//        }
//
//        postChangeCode(connectionInfo, oldPK, newPK);
//    }
//
//    /**
//     * Delete this instance from persistence.
//     * @param connectionInfo
//     * @param data instance to be removed.
//     * @throws baseobject.objectdatabase.ODBException Throw as not found code or cannot remove from any other reason.
//     */
//	@TransactionAttribute(TransactionAttributeType.REQUIRED)
////	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
////    @Transactional(Transactional.TxType.REQUIRES_NEW)
//    @Override
//    public void delete(Connection.java connectionInfo, DTO data) throws ODBException {
//        logger.fine("delete: " + data.getCode());
//
//        if (!preDelete(connectionInfo, data)) {
//        	context.setRollbackOnly();
//            return;
//        }
//
//        ACode c = _findCodeInstance(data.getCode());
//        long id = c.getId();
//
//        if (id < 0) {
//            logger.warning("Could not purge: " + data.getCode());
//        	context.setRollbackOnly();
//            throw new ODBException("Cannot find code:" + data.getCode());
//        }
//
//        if (hasReference(id)) {
//            logger.warning("Has reference: " + data.getCode());
//// TODO: Consider to automatic remove all inactive referent object instance if no more active
//        	context.setRollbackOnly();
//            throw new ODBException("Has referenced." + data.getCode());
//        }
//
//        AMain m = _findMainInstance(c.getId());
//
//        data.setReplicate(m.getReplicate());
//        data.setReplicateSite(m.getReplicateSite());
//
//        if (m != null) {
//            try {
//            	getEntityManager().merge(c);
//            	getEntityManager().merge(m);
//                if (c.getMultilingual()) {
//                    _removeLingual(c);
//                }
//                if (c.getHasNotes()) {
//                    _removeNotes(c);
//                }
//                /**
//                 * Call more additional table store in the subclass implementation
//                 */
//                if (getMoreDataTables() != null)
//                	_removeMoreData(c.getId());
//                getEntityManager().remove(m);
//                getEntityManager().remove(c);
//            } catch (Exception e) {
//                logger.warning("Cannot remove: " + data.getCode());
//            	context.setRollbackOnly();
//                throw new ODBException("Cannot remove: " + data.getCode() + "/n" + e);
//            }
//        }
//
//        /**
//         *  Set internal id to reusable deleted internal id
//         */
//        String nextControlID = " SELECT c FROM ";
//        nextControlID = nextControlID + getControlId().getClass().getSimpleName();
//        nextControlID = nextControlID + " c WHERE c.siteId = :SiteID ORDER BY c.orderId DESC";
//
//        List<?> resultList;
//        resultList = getEntityManager().createQuery(nextControlID).setParameter("SiteID",
//                connectionInfo.getSiteId()).getResultList();
//
//        if (resultList.size() == 0) {
//
//            ctlid = getControlId();
//            ctlid.setSiteId((short) 1);
//            ctlid.setOrderId(1);
//            ctlid.setNextId(1);
//            getEntityManager().persist(ctlid);
//            return;
//        }
//
//        ctlid = (AControlId) resultList.get(0);
//
//        Long OrderId = ctlid.getOrderId() + 1;
//        ctlid = getControlId();
//        ctlid.setSiteId(connectionInfo.getSiteId());
//        ctlid.setOrderId(OrderId);
//        ctlid.setNextId(id);
//        getEntityManager().persist(ctlid);
//
//        if (publishData()) {
////            pInfo.setReplicate(data.getReplicate());
////            pInfo.setReplicateTo(data.getReplicateSite());
////TODO Implement publish delete record.
////			publishPersistance.create(pInfo, currentInfo, data);
//        	  if (data.getReplicate()) {
////  	            PublishPersistence publishPersistence = new PublishPersistence();
//  //TODO Implement publish delete record
////  				publishPersistence.create(pInfo, connectionInfo, data);
////  				publishPersistence.delete(this.getClass().getName(), connectionInfo, data);
//  	        	  }
//        }
//
//        postDelete(connectionInfo, data);
//    }
//
//	@TransactionAttribute(TransactionAttributeType.REQUIRED)
////	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
////    @Transactional(Transactional.TxType.REQUIRES_NEW)
//    public void resetDatabase() throws ODBException {
////      logger.setLevel(Level.FINE);
//        logger.fine("ODB.resetDatabase. ");
//
//        if (!preResetDatabase()) {
//            return;
//        }
//
//        _resetMoreData();
//
//        try {
////         	em.createQuery("DELETE FROM " + getCodeEntity().getClass().getSimpleName()).executeUpdate();
////            em.createQuery("DELETE FROM " + getMainEntity().getClass().getSimpleName()).executeUpdate();
////            em.createQuery("DELETE FROM " + getNewLingualDescription().getClass().getSimpleName()).executeUpdate();
////            em.createQuery("DELETE FROM " + getNewNote().getClass().getSimpleName()).executeUpdate();
////            em.createQuery("DELETE FROM " + getControlId().getClass().getSimpleName()).executeUpdate();
//
//        	getEntityManager().createQuery("DELETE FROM " + getCodeEntity().getClass().getSimpleName()).executeUpdate();
//        	getEntityManager().createQuery("DELETE FROM " + getMainEntity().getClass().getSimpleName()).executeUpdate();
//        	getEntityManager().createQuery("DELETE FROM " + getNewLingualDescription().getClass().getSimpleName()).executeUpdate();
//        	getEntityManager().createQuery("DELETE FROM " + getNewNote().getClass().getSimpleName()).executeUpdate();
//        	getEntityManager().createQuery("DELETE FROM " + getControlId().getClass().getSimpleName()).executeUpdate();
//
//            getEntityManager().flush();
//        } catch (Exception ex) {
//            logger.warning("Cannot reset database.");
//        	context.setRollbackOnly();
//            throw new ODBException("Cannot reset database:" + ex);
//        }
//
//        postResetDatabase();
//        logger.fine("ODB..Finish resetDatabase...");
//    }
//
//    /**
//     * Find by code.
//     * @param Code Code to find.
//     * @throws baseobject.objectdatabase.ODBException Could not found.
//     * @return Data transfer object.
//     */
//    public DTO findByCode(String Code) throws ODBException {
//        logger.fine("findByCode: " + Code);
//
//        if (code == null) {
//            code = getCodeEntity();
//        }
//
//        return (DTO) _findByCode(Code);
//    }
//
//    /**
//     * Find by code.
//     * @param Code Code to find.
//     * @throws baseobject.objectdatabase.ODBException Could not found.
//     * @return Data transfer object.
//     */
//    @SuppressWarnings("unchecked")
//	public List<DTO> findMain(String condition) throws ODBException {
//        logger.fine("findMain: " + condition);
//
//        List<Long> iids =  new ArrayList<Long>();
//
//        String QLquery = "SELECT m.id FROM ";
//        QLquery = QLquery + getMainEntity().getClass().getSimpleName();
//        QLquery = QLquery + " m WHERE " + condition;
//        logger.fine("Statement: " + QLquery);
//        try {
////        	Query q = em.createQuery(QLquery);
//        	Query q = getEntityManager().createQuery(QLquery);
//        	iids = (List<Long>) q.getResultList();
//        } catch (Exception e) {
////        	em.clear();
//        	getEntityManager().clear();
//        /**
//         * No exception stack trace required
//         * because some may call for expected null out come.
//         */
//        	logger.fine("Exception findMain: " + e);
//        	return null;
//        }
//
//        if (iids == null)
//        	return null;
//
//        if (code == null)
//        	code = getCodeEntity();
//
//        List<DTO> DTOs = new ArrayList<DTO>();
//
//        for (Long iid: iids) {
//        	dto = getNewDTO();
//        	code = _findCodeInstance(iid);
//        	_findMainInstance(iid);
//        	_AssignData();
//        	DTOs.add(dto);
//        }
//
//        return DTOs;
//    }
//
//    /**
//     * Find all code.
//     * @param Code Code to find.
//     * @throws baseobject.objectdatabase.ODBException Could not found.
//     * @return Data transfer object.
//     */
//    public List<?> findAllCode() throws ODBException {
//        logger.fine("findAllCode: ");
//
//        if (code == null) {
//            code = getCodeEntity();
//        }
//
//        String QLquery = "SELECT c FROM ";
//        QLquery = QLquery + getCodeEntity().getClass().getSimpleName();
//        logger.fine("Statement: " + QLquery);
//        try {
////            Query q = em.createQuery(QLquery);
//            Query q = getEntityManager().createQuery(QLquery);
//            return q.getResultList();
//        } catch (Exception e) {
////            em.clear();
//        	getEntityManager().clear();
//            /**
//             * No exception stack trace required
//             * because some may call for expected null out come.
//             */
//            logger.fine("Exception find code: " + e);
//            return null;
//        }
//    }
//
//    /**
//     * Find all code.
//     * @param Code Code to find.
//     * @throws baseobject.objectdatabase.ODBException Could not found.
//     * @return Data transfer object.
//     */
//    @SuppressWarnings("unchecked")
//	public List<String[]> findAllActiveCode() {
//        logger.fine("findAllActiveCode: ");
//
//        if (code == null) {
//            code = getCodeEntity();
//        }
//
//        String QLquery = "SELECT c.id, c.code, m.shortName, m.description FROM ";
//        QLquery = QLquery + getCodeEntity().getClass().getSimpleName() + " c, ";
//        QLquery = QLquery + getMainEntity().getClass().getSimpleName() + " m";
//        QLquery = QLquery + " WHERE c.active = TRUE AND c.deleted = FALSE AND m.id = c.id";
//        logger.fine("Statement: " + QLquery);
//        try {
////            Query q = em.createQuery(QLquery);
//            Query q = getEntityManager().createQuery(QLquery);
//            List<String[]> result = new ArrayList<String[]>();
//            result.addAll(q.getResultList());
//            return result;
//        } catch (Exception e) {
////            em.clear();
//        	getEntityManager().clear();
//            /**
//             * No exception stack trace required
//             * because some may call for expected null out come.
//             */
//            logger.fine("Exception find code: " + e);
//            return null;
//        }
//    }
//
//
////TODO implements to add Description to the existing record.
//    public void addDescriptions(DTO data) throws ODBException {
//        logger.fine("addDescriptions: " + data.getId());
//
//    }
//
////TODO implements to add Note to the existing record.
//    public void addNotes(DTO data) throws ODBException {
//        logger.fine("addNotes: " + data.getId());
//
////logger.info("_addNotes: size = " + data.getNoteList().size());
////		if (data.getNoteList() != null) {
////			for (DTOLongString note: data.getNoteList()) {
////				ANote Note = getNewNote();
////				Note.setId(data.getId());
////				Note.setOrderId(note.getFirstLong());
////				Note.setNote(note.getSecondString());
////
////				try {
////					em.merge(Note);
////					em.persist(Note);
//////					em.flush();
////				} catch (Exception e) {
////					e.printStackTrace();
////				}
////
////logger.info("_addNotes: id = " + Note.getId() + " Order id = " + Note.getOrderId() + " : " + Note.getNote());
////			}
////			data.setHasNotes(true);
////		} else {
////			data.setHasNotes(false);
////		}
////
//////		ACode c;
//////		c = _findCodeInstance(data.getCode());
//////		c.setHasNotes(data.isHasNotes());
//////		try {
//////			em.merge(c);
//////			em.persist(c);
//////		} catch (Exception e) {
//////			// TODO Auto-generated catch block
//////			e.printStackTrace();
//////		}
//    }
//
//    /**
//     * Using to search the ACode entity subclass persistence from specific Code
//     * <P>
//     * Call from: _create, _edit, _changeCode, _destroy
//     * @param Code Code as string to be search
//     * @return ACode entity subclass instance
//     */
////    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
//    protected ACode _findCodeInstance(String Code) {
//        logger.fine("_findCodeInstance: code = " + Code);
//
//        if (code == null)
//        		code = getCodeEntity();
//
//        String QLquery = "SELECT c FROM ";
//        QLquery = QLquery + getCodeEntity().getClass().getSimpleName();
//        QLquery = QLquery + " c WHERE c.code = :code";
//        logger.fine("Statement: " + QLquery);
//        try {
////            Query q = em.createQuery(QLquery);
//            Query q = getEntityManager().createQuery(QLquery);
//            code = (ACode) q.setParameter("code", Code).getSingleResult();
//        } catch (Exception e) {
////            em.clear();
//        	getEntityManager().clear();
//            /**
//             * No exception stack trace required
//             * because some may call for expected null out come.
//             */
//            logger.fine("Exception find code: " + e);
//            return null;
//        }
//        return code;
//    }
//
//    /**
//     * Using to search the ACode entity subclass persistence from specific internal Id
//     * <P>
//     * Call from: _edit, _changeCode, _destroy
//     * @param Id Internal Id
//     * @return ACode entity subclass instance
//     */
////    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
//    protected ACode _findCodeInstance(long Id) {
//        logger.fine("_findCodeInstance: internal Id = " + Id);
//
//        if (code==null)
//        		code = getCodeEntity();
//
//        try {
////            code = em.find(code.getClass(), Id);
//            code = getEntityManager().find(code.getClass(), Id);
//        } catch (Exception e) {
//            logger.info("Exception find code: " + e);
//            return null;
//        }
//        return code;
//    }
//
//    /**
//     * Using to search the AMain entity subclass persistence from specific internal Id
//     * <P>
//     * Call from: _edit, _changeCode, _destroy
//     * @param Id Internal Id
//     * @return AMain entity subclass instance
//     */
////    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
//    protected AMain _findMainInstance(long Id) {
//        logger.fine("_findMainInstance: internal Id = " + Id);
//
//        if (main==null)
//        		main = getMainEntity();
//
//        try {
////            main = em.find(main.getClass(), Id);
//            main = getEntityManager().find(main.getClass(), Id);
//        } catch (Exception e) {
//            logger.info("Exception find main: " + e);
//            return null;
//        }
//        return main;
//    }
//
//    /**
//     * Using to prepare DTO data that let the unchanged data to be null,
//     * by assign common old data to common null DTO data and
//     * call function prepareEditData(ACode code, AMain main, DTO data)
//     * that may defined in subclass for more data from the main entity subclass.
//     * <P>
//     * Called from: _edit()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param connectionInfo Current information of userId, siteId.
//     */
//    private void _prepareEditData(ACode code, AMain main, DTO data, Connection.java connectionInfo) {
//        if (data.getCode() == null) {
//            data.setCode(code.getCode());
//        }
//
//        if (data.getStartDate() < 0) {
//            data.setStartDate(code.getStartDate());
//        }
//        if (data.getExpireDate() < 0) {
//            data.setExpireDate(code.getExpireDate());
//        }
//
//        if (data.getShortName() == null) {
//            data.setShortName(main.getShortName());
//        }
//        if (data.getDescription() == null) {
//            data.setDescription(main.getDescription());
//        }
//        if (data.getCreateSite() < 0) {
//            data.setCreateSite(main.getCreateSite());
//        }
//        if (data.getCreateUser() < 0) {
//            data.setCreateUser(main.getCreateUser());
//        }
//        if (data.getCreateDate() < 0) {
//            data.setCreateDate(main.getCreateDate());
//        }
//
//        if (data.getReplicate() == null) {
//            data.setReplicate(main.getReplicate());
//        }
//        if (data.getReplicateSite() == null) {
//            data.setReplicateSite(main.getReplicateSite());
//        }
//        if (data.getUpdateUser() < 0) {
//            data.setUpdateUser(connectionInfo.getUserId());
//        }
//        if (data.getUpdateDate() < 0) {
//            data.setUpdateDate(Calendar.getInstance().getTimeInMillis());
//        }
//
//        prepareEditData(code, main, data);
//    }
//
//    /**
//     * Using to store internal ID from nextID private variable to code & main entities
//     * <P>
//     * Called from: _create()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param connectionInfo Current information of userId, siteId.
//     */
//    private void _storePrimaryKey(ACode code, AMain main, DTO data, Connection.java connectionInfo) {
//        logger.fine("_storePrimaryKey code: " + code + " main: " + main);
//        code.setId(nextID);
//        main.setId(nextID);
//    }
//
//    /**
//     * Using to store common data from DTO data and
//     * call function storeData(ACode code, AMain main, DTO data)
//     * that may defined in subclass for more data to be stored in to main entity subclass.
//     * <P>
//     * Called from: _create(), _edit()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param connectionInfo Current information of userId, siteId.
//     */
//    private void _storeData(ACode code, AMain main, DTO data, Connection.java connectionInfo) {
//        logger.fine("_StoreData code: " + code + " main: " + main);
//
//        code.setCode(data.getCode());
//
//        code.setMultilingual(data.isMultilingual());
//        code.setHasNotes(data.isHasNotes());
//
//        code.setBarcodeCode(data.getBarcodeCode());
//
//        code.setDeleted(data.isDeleted());
//        code.setPurgable(data.isPurgable());
//        code.setActive(data.isActive());
//        code.setStartDate(data.getStartDate());
//        code.setExpireDate(data.getExpireDate());
//
//        code.setAllowEnterpriseView(data.getAllowEnterpriseView());
//        code.setAllowEnterpriseEdit(data.getAllowEnterpriseEdit());
//        code.setAllowEnterpriseDelete(data.getAllowEnterpriseDelete());
//        code.setAllowEntity1View(data.getAllowEntity0View());
//        code.setAllowEntity1Edit(data.getAllowEntity0Edit());
//        code.setAllowEntity1Delete(data.getAllowEntity0Delete());
//        code.setAllowEntity1View(data.getAllowEntity1View());
//        code.setAllowEntity1Edit(data.getAllowEntity1Edit());
//        code.setAllowEntity1Delete(data.getAllowEntity1Delete());
//        code.setAllowEntity2View(data.getAllowEntity2View());
//        code.setAllowEntity2Edit(data.getAllowEntity2Edit());
//        code.setAllowEntity2Delete(data.getAllowEntity2Delete());
//        code.setAllowEntity3View(data.getAllowEntity3View());
//        code.setAllowEntity3Edit(data.getAllowEntity3Edit());
//        code.setAllowEntity3Delete(data.getAllowEntity3Delete());
//        code.setAllowEntity4View(data.getAllowEntity4View());
//        code.setAllowEntity4Edit(data.getAllowEntity4Edit());
//        code.setAllowEntity4Delete(data.getAllowEntity4Delete());
//        code.setAllowEntity5View(data.getAllowEntity5View());
//        code.setAllowEntity5Edit(data.getAllowEntity5Edit());
//        code.setAllowEntity5Delete(data.getAllowEntity5Delete());
//        code.setAllowEntity6View(data.getAllowEntity6View());
//        code.setAllowEntity6Edit(data.getAllowEntity6Edit());
//        code.setAllowEntity6Delete(data.getAllowEntity6Delete());
//        code.setAllowEntity7View(data.getAllowEntity7View());
//        code.setAllowEntity7Edit(data.getAllowEntity7Edit());
//        code.setAllowEntity7Delete(data.getAllowEntity7Delete());
//        code.setAllowEntity8View(data.getAllowEntity8View());
//        code.setAllowEntity8Edit(data.getAllowEntity8Edit());
//        code.setAllowEntity8Delete(data.getAllowEntity8Delete());
//        code.setAllowEntity1View(data.getAllowEntity9View());
//        code.setAllowEntity1Edit(data.getAllowEntity9Edit());
//        code.setAllowEntity1Delete(data.getAllowEntity9Delete());
//        code.setAllowSubEntity1View(data.getAllowSubEntity0View());
//        code.setAllowSubEntity1Edit(data.getAllowSubEntity0Edit());
//        code.setAllowSubEntity1Delete(data.getAllowSubEntity0Delete());
//        code.setAllowSubEntity1View(data.getAllowSubEntity1View());
//        code.setAllowSubEntity1Edit(data.getAllowSubEntity1Edit());
//        code.setAllowSubEntity1Delete(data.getAllowSubEntity1Delete());
//        code.setAllowSubEntity2View(data.getAllowSubEntity2View());
//        code.setAllowSubEntity2Edit(data.getAllowSubEntity2Edit());
//        code.setAllowSubEntity2Delete(data.getAllowSubEntity2Delete());
//        code.setAllowSubEntity3View(data.getAllowSubEntity3View());
//        code.setAllowSubEntity3Edit(data.getAllowSubEntity3Edit());
//        code.setAllowSubEntity3Delete(data.getAllowSubEntity3Delete());
//        code.setAllowSubEntity4View(data.getAllowSubEntity4View());
//        code.setAllowSubEntity4Edit(data.getAllowSubEntity4Edit());
//        code.setAllowSubEntity4Delete(data.getAllowSubEntity4Delete());
//        code.setAllowSubEntity5View(data.getAllowSubEntity5View());
//        code.setAllowSubEntity5Edit(data.getAllowSubEntity5Edit());
//        code.setAllowSubEntity5Delete(data.getAllowSubEntity5Delete());
//        code.setAllowSubEntity6View(data.getAllowSubEntity6View());
//        code.setAllowSubEntity6Edit(data.getAllowSubEntity6Edit());
//        code.setAllowSubEntity6Delete(data.getAllowSubEntity6Delete());
//        code.setAllowSubEntity7View(data.getAllowSubEntity7View());
//        code.setAllowSubEntity7Edit(data.getAllowSubEntity7Edit());
//        code.setAllowSubEntity7Delete(data.getAllowSubEntity7Delete());
//        code.setAllowSubEntity8View(data.getAllowSubEntity8View());
//        code.setAllowSubEntity8Edit(data.getAllowSubEntity8Edit());
//        code.setAllowSubEntity8Delete(data.getAllowSubEntity8Delete());
//        code.setAllowSubEntity1View(data.getAllowSubEntity9View());
//        code.setAllowSubEntity1Edit(data.getAllowSubEntity9Edit());
//        code.setAllowSubEntity1Delete(data.getAllowSubEntity9Delete());
//        code.setAllowUserGroupView(data.getAllowUserGroupView());
//        code.setAllowUserGroupEdit(data.getAllowUserGroupEdit());
//        code.setAllowUserGroupDelete(data.getAllowUserGroupDelete());
//        code.setAllowUserView(data.getAllowUserView());
//        code.setAllowUserEdit(data.getAllowUserEdit());
//        code.setAllowUserDelete(data.getAllowUserDelete());
//
//        main.setShortName(data.getShortName());
//        main.setDescription(data.getDescription());
//        main.setCreateSite(data.getCreateSite());
//        main.setCreateUser(data.getCreateUser());
//        main.setCreateDate(data.getCreateDate());
//
//        main.setUpdateUser(data.getUpdateUser());
//        main.setUpdateDate(data.getUpdateDate());
//
//        main.setReplicate(data.getReplicate());
//        main.setReplicateSite(data.getReplicateSite());
//
//        storeData(code, main, data);
//
//    }
//
//    /**
//     * Using to add more Language
//     * <P>
//     * Called from: _create()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param connectionInfo Current information of userId, siteId.
//     */
//	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    private void _addLingual(ACode code, AMain main, DTO data, Connection.java connectionInfo) {
//        logger.fine("_addLingual: size = " + data.getLingualDescription().size());
//
//        if (data.isMultilingual()) {
//            for (Description description : data.getLingualDescription()) {
//                logger.fine("_addLingual: languageID = " + description.getLanguageId() + " description: " + description.getDescription());
//                lingualDescription = getNewLingualDescription();
//            	lingualDescription.setId(data.getId());
//                lingualDescription.setLanguageId(description.getLanguageId());
//                lingualDescription.setDescription(description.getDescription());
//
//                try {
//                    /**
//                     * Check to see, if EntityManager has already existing bounded
//                     * ADescription entity. It should be detach by em.clear() before
//                     * em.persist() to add new record of ADescription entity.
//                     * If em.clear() was not called, it will change/edit to existing
//                     * record, not add the new one.
//                     */
//                    if (getEntityManager().contains(lingualDescription)) {
//                    	getEntityManager().clear();
//                    }
//
//                    getEntityManager().persist(lingualDescription);
//                    getEntityManager().flush();
//                } catch (Exception e) {
//                    // TODO Auto-generated catch block
//                	context.setRollbackOnly();
//                    e.printStackTrace();
//                }
//
//                logger.fine("_addLingual: id = " + lingualDescription.getId() + " Lang id = " + lingualDescription.getLanguageId() + " : " + lingualDescription.getDescription());
//            }
//        }
//    }
//
//    /**
//     * Using to add more note
//     * <P>
//     * Called from: _create()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param connectionInfo Connection.java information of userId, siteId.
//     */
//	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    private void _addNote(ACode code, AMain main, DTO data, Connection.java connectionInfo) {
//        logger.fine("_addNote: size = " + data.getNoteList().size());
//
//        if (data.isHasNotes()) {
//            for (Note note : data.getNoteList()) {
//                Note.setId(data.getId());
//                Note.setOrderId(note.getInternalId());
//                Note.setNote(note.getNote());
//                try {
//                    /**
//                     * Check to see, if EntityManager has already existing bounded
//                     * ADescription entity. It should be detach by em.clear() before
//                     * em.persist() to add new record of ANote entity.
//                     * If em.clear() was not called, it will change/edit to existing
//                     * record, not add the new one.
//                     */
//                    if (getEntityManager().contains(Note)) {
//                    	getEntityManager().clear();
//                    }
//                    getEntityManager().persist(Note);
//                    getEntityManager().flush();
//                } catch (Exception e) {
//                    // TODO Auto-generated catch block
//                	context.setRollbackOnly();
//                    e.printStackTrace();
//                }
//                logger.fine("_addNote: id = " + Note.getId() + " note id = " + Note.getOrderId() + " : " + Note.getNote());
//            }
//        }
//    }
//
////protected Map<String, List<Object>> moreDataTableInstances;
////private List<Object> instances = null;
////
////protected void addMoreDataTableInstances(ATable aTable, Object instance) {
////logger.info("ATable: " + aTable.getClass().getSimpleName() + " addMoreDataTableInstances: " + moreDataTableInstances.keySet());
//////	if (moreDataTableInstances == null)
//////		moreDataTableInstances = new HashMap<String, List<Object>>();
////
//////	List<Object> instances;
////	if (moreDataTableInstances.containsKey(aTable.getClass().getSimpleName().trim())) {
//////		instances.clear();
//////		instances.addAll(moreDataTableInstances.get(aTable.getClass().getSimpleName().trim()));
////		moreDataTableInstances.get(aTable.getClass().getSimpleName().trim()).add(instance);
////	} else {
////		instances = new ArrayList<Object>();
////		instances.add(instance);
////		moreDataTableInstances.put(aTable.getClass().getSimpleName().trim(), instances);
////	}
//////logger.info("instances size: " + instances.size() + " instance " + instance);
//////
//////	instances.add(instance);
//////
//////logger.info("added instances: " + instances.size() + " instance " + instance);
//////
//////	if (moreDataTableInstances.containsKey(aTable.getClass().getSimpleName().trim()))
//////		moreDataTableInstances.remove(aTable.getClass().getSimpleName().trim());
//////
//////logger.info("removed: " + moreDataTableInstances.get((aTable).getClass().getSimpleName().trim()));
//////logger.info("instances :" + instances.size());
//////
//////	moreDataTableInstances.put(aTable.getClass().getSimpleName().trim(), instances);
//////	instances.clear();
//////
//////logger.info("addMoreDataTableInstances size: " + moreDataTableInstances.size());
//////logger.info("addMoreDataTableInstances size: " + moreDataTableInstances.get((aTable).getClass().getSimpleName().trim()).size());
////
////}
////
////    /**
////     * Using to store more table in the sub abstract class.
////     * Override this class.
////     */
////    protected void _addMoreData(DTO data) {
//////		logger.setLevel(Level.INFO);
////        logger.fine("_addMoreData ");
////
////    	if (moreDataTableInstances == null)
////    		moreDataTableInstances = new HashMap<String, List<Object>>();
////    	else
////    		moreDataTableInstances.clear();
////
////		addMoreData(data);
////logger.info("++++++++++++++++++++++++++++++");
////logger.info("moreDataTableInstances size is: " + moreDataTableInstances.get("UserModule").size());
////		if (moreDataTableInstances == null)
////			return;
////logger.info("***********");
////
////		List<ATable> moreDataTables = getMoreDataTables();
////		for (ATable dataTable: moreDataTables) {
////logger.info("dataTable: " + dataTable.getClass().getSimpleName());
////logger.info("moreDataTableInstances size is: " + moreDataTableInstances.get(dataTable.getClass().getSimpleName().trim()).size());
////int i = 0;
////			for (Object instance: moreDataTableInstances.get(dataTable.getClass().getSimpleName().trim())) {
////
////logger.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
////logger.info( i +  " : " + instance);
////i = i + 1;
////            try {
////                /**
////                 * Check to see, if EntityManager has already existing bounded
////                 * ADescription entity. It should be detach by em.clear() before
////                 * em.persist() to add new record of ADescription entity.
////                 * If em.clear() was not called, it will change/edit to existing
////                 * record, not add the new one.
////                 */
////                if (em.contains(instance)) {
////                    em.clear();
////                }
//////TODO Revise the code due to may roll back from transaction reason
////                // the SQL reported as saved data already but there were not
////                // in the database from DataSourceExpoler
////                // may require to migrate this code to AODBM.java
////                em.persist(instance);
////                em.flush();
////            } catch (Exception e) {
////                logger.info("Error at _addMoreData:  ");
////                // TODO Auto-generated catch block
////                e.printStackTrace();
////            }
////			}
////		}
////    }
//
//    /**
//     * Using to change the data in stored Language
//     * <P>
//     * If DTO.getLingualDescription() is null then do nothing
//     * <P>
//     * If DTO.getLingualDescription().getFirstLong() as id is < 0 then do nothing
//     * <P>
//     * If ADescription subclass could not find DTO.getLingualDescription().getFirstLong() as id
//     * then new value was added.
//     * <P>
//     * If ADescription subclass could find DTO.getLingualDescription().getFirstLong() as id
//     * and DTO.getLingualDescription().getSecondString() as description is not null
//     * then new value was replaced, if null then that persistence was removed.
//     * <P>
//     * Called from: change()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param connectionInfo connection information of userId, siteId, and etc.
//     */
//	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    private void _editLingual(DTO data) {
//        logger.fine("_editLingual id: " + data.getId() + " code:" + data.getCode());
//
//        if (data.getLingualDescription() == null) {
//            return;
//        }
//
//        logger.fine("size: " + data.getLingualDescription().size());
//
//        nextLingual:
//        for (Description description : data.getLingualDescription()) {
//            if (description.getLanguageId() < 0) {
//                continue nextLingual;
//            }
//            try {
//                lingualDescription = getEntityManager().find(lingualDescription.getClass(), new PkIdLanguage(
//                        data.getId(), description.getLanguageId()));
//            } catch (Exception e) {
//            	/**
//            	 * Not an error!
//            	 */
//                logger.fine("Not found exiting: " + data.getId() + ":" + lingualDescription.getLanguageId());
//                lingualDescription = null;
//                logger.fine("Exception: " + e);
//            }
//            if (lingualDescription == null) {
//                // Add
//                if (description.getDescription() != null) {
//                    logger.fine("Add id:" + data.getId() + " Lang id: " + description.getLanguageId() + " Description: " + description.getDescription());
//                    lingualDescription = getNewLingualDescription();
//                    data.setMultilingual(true);
//                    lingualDescription.setId(data.getId());
//                    lingualDescription.setLanguageId(description.getLanguageId());
//                    lingualDescription.setDescription(description.getDescription());
//                    getEntityManager().clear();
//                    getEntityManager().persist(lingualDescription);
//                }
//            } else {
//                logger.fine("change id:" + data.getId() + " Lang id: " + description.getLanguageId());
//                logger.fine("from: " + lingualDescription.getDescription());
//                logger.fine("to: " + description.getDescription());
//                if (description.getDescription() == null) {
//                    // Delete
//                    logger.fine("Delete id:" + data.getId() + " Lang id: " + description.getLanguageId() + " Description: " + description.getDescription());
//                    getEntityManager().merge(lingualDescription);
//                    getEntityManager().remove(lingualDescription);
//                } else {
//                    // Edit
//                    logger.fine("Change id:" + data.getId() + " Lang id: " + description.getLanguageId() + " Description: " + description.getDescription());
//                    lingualDescription.setDescription(description.getDescription());
//                    getEntityManager().merge(lingualDescription);
//                }
//            }
//            getEntityManager().flush();
//        }
//    }
//
//    /**
//     * Using to change data in note
//     * <P>
//     * If DTO.getNoteList() is null then do nothing
//     * <P>
//     * If DTO.getNoteList().getFirstLong() as id < 0 then do nothing
//     * <P>
//     * If ANote subclass could not find DTO.getNoteList().getFirstLong() as id
//     * then new value was added.
//     * <P>
//     * If ANote subclass could find DTO.getNoteList().getFirstLong() as id
//     * and DTO.getNoteList().getSecondString() as note is not null
//     * then new value was replaced, if null then that persistence was removed.
//     * <P>
//     * Called from: change()
//     * @param code ACode entity subclass instance
//     * @param main AMain entity subclass instance
//     * @param data DTO subclass instance
//     * @param currentInfo Current information of userId, siteId, and etc.
//     */
//	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    private void _editNote(DTO data) {
//        logger.fine("_editNote id:" + data.getId() + " code: " + data.getCode());
//
//        if (data.getNoteList() == null) {
//            return;
//        }
//
//        nextNote:
//        for (Note note : data.getNoteList()) {
//            if (note.getInternalId() < 0) {
//                continue nextNote;
//            }
//            try {
//                Note = getEntityManager().find(Note.getClass(), new PkIdNote(
//                        data.getId(), note.getInternalId()));
//            } catch (Exception e) {
//            	/**
//            	 * Not an error!
//            	 */
//                Note = null;
//                logger.fine("Exceptin: " + e);
//            }
//            if (Note == null) {
//                // Add
//                logger.fine("Add id:" + data.getId() + " Order id: " + note.getInternalId() + " Note: " + note.getNote());
//                Note = getNewNote();
//                data.setHasNotes(true);
//                Note.setId(data.getId());
//                Note.setOrderId(note.getInternalId());
//                Note.setNote(note.getNote());
//                getEntityManager().persist(Note);
//            } else {
//                if (note.getNote() == null) {
//                    // Delete
//                    logger.fine("Delete id:" + data.getId() + " Order id: " + note.getInternalId() + " Note: " + note.getNote());
//                    getEntityManager().remove(Note);
//                    continue nextNote;
//                } else {
//                    // Edit
//                    logger.fine("Change id:" + data.getId() + " Order id: " + note.getInternalId() + " Note: " + note.getNote());
//                    Note.setNote(note.getNote());
//                    getEntityManager().merge(Note);
//                }
//            }
//            getEntityManager().flush();
//        }
//    }
//
//    /**
//     * using to remove multiple languages associated to particular ACode subclass entity
//     * <P>
//     * Called from: _destroy
//     * @param code ACode entity subclass instance
//     */
//	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    private void _removeLingual(ACode code) {
//        ADescription description = getNewLingualDescription();
//
//        String QLquery = "DELETE FROM ";
//        QLquery = QLquery + description.getClass().getSimpleName();
//        QLquery = QLquery + " c WHERE c.id = :id";
//        try {
//            Query q = getEntityManager().createQuery(QLquery);
//            q.setParameter("id", code.getId()).executeUpdate();
//        } catch (Exception e) {
//            logger.warning("Exception delete languages: " + e);
//        	context.setRollbackOnly();
//            return;
//        }
//    }
//
//    /**
//     * using to remove multiple notes associated to particular ACode subclass entity
//     * <P>
//     * Called from: _destroy
//     * @param code ACode entity subclass instance
//     */
//	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    private void _removeNotes(ACode code) {
//        ANote note = getNewNote();
//
//        String QLquery = "DELETE FROM ";
//        QLquery = QLquery + note.getClass().getSimpleName();
//        QLquery = QLquery + " c WHERE c.id = :id";
//        try {
//            Query q = getEntityManager().createQuery(QLquery);
//            q.setParameter("id", code.getId()).executeUpdate();
//        } catch (Exception e) {
//            logger.warning("Exception delete note list: " + e);
//        	context.setRollbackOnly();
//            return;
//        }
//    }
//
//    /**
//     * Using to get the language description(s)
//     * <P>
//     * Called from: _editLingual
//     * @param code ACode entity subclass instance
//     * @param data DTO subclass instance
//     * @return List of ADescription entity subclass instance
//     */
//    @SuppressWarnings({"unchecked", "rawtypes"})
//    private List<Description> _getLingualDescription(ACode code, DTO data) {
//        ADescription description = getNewLingualDescription();
//
//        List<ADescription> descriptions = null;
//        String QLquery = "SELECT c FROM ";
//        QLquery = QLquery + description.getClass().getSimpleName();
//        QLquery = QLquery + " c WHERE c.id = :id";
//        try {
//            Query q = getEntityManager().createQuery(QLquery);
//            descriptions = (List) q.setParameter("id", code.getId()).getResultList();
//        } catch (Exception e) {
//        	/**
//        	 * Just could not found but don't roll back
//        	 */
//            logger.warning("Exception find languages: " + e);
//            return null;
//        }
//
//        List<Description> langDescrip = new ArrayList<Description>();
//
//        for (ADescription d : descriptions) {
//            Description lang = new Description();
//            lang.setLanguageId(d.getLanguageId());
//            lang.setDescription(d.getDescription());
//            langDescrip.add(lang);
//        }
//
//        return langDescrip;
//    }
//
//    /**
//     * Using to get Note(s)
//     * <P>
//     * Called from: _editNote
//     * @param code ACode entity subclass instance
//     * @param data DTO subclass instance
//     * @return List of ANote entity subclass instance
//     */
//    @SuppressWarnings({"unchecked", "rawtypes"})
//    private List<Note> _getNoteList(ACode code, DTO data) {
//        ANote note = getNewNote();
//
//        List<ANote> Notes = null;
//        String QLquery = "SELECT c FROM ";
//        QLquery = QLquery + note.getClass().getSimpleName();
//        QLquery = QLquery + " c WHERE c.id = :id";
//        try {
//            Query q = getEntityManager().createQuery(QLquery);
//            Notes = (List) q.setParameter("id", code.getId()).getResultList();
//        } catch (Exception e) {
//        	/**
//        	 * Just could not found but don't roll back
//        	 */
//            logger.warning("Exception find note list: " + e);
//            return null;
//        }
//
//        List<Note> NoteList = new ArrayList<Note>();
//
//        for (ANote n : Notes) {
//            Note tempNote = new Note();
//            tempNote.setInternalId(n.getOrderId());
//            tempNote.setNote(n.getNote());
//            NoteList.add(tempNote);
//        }
//        return NoteList;
//    }
//
//    /**
//     * Set next internal Id
//     * @param nextId
//     */
//    public void setNextId(Long nextId) {
//        logger.info("setMaxId entry.");
//// TODO: Consider implement to set next internal Id to controlId entity or not?
//    }
//
//    /**
//     * Get next internal Id. Using deleted id if any.
//     * <P>
//     * Called from: _create
//     * @param SiteId Defined siteId to get next internal Id of particular site
//     * @return next available internal Id
//     */
////	@TransactionAttribute(TransactionAttributeType.MANDATORY)
//    @SuppressWarnings("unchecked")
//    public long getNextId(short SiteId) {
//        logger.fine("getNextId entry.");
//
//        /**
//         * Consider to remove SiteID from internal id control file because each sites just control their own internal id <br />
//         * Answer: cannot doing this because the site id was implemented into internal id as one long number. (see AControlId)
//        */
//
//        String nextControlID = " SELECT c FROM ";
//        nextControlID = nextControlID + getControlId().getClass().getSimpleName();
//        nextControlID = nextControlID + " c WHERE c.siteId = :SiteID ORDER BY c.orderId DESC";
//
//        logger.fine("Statement: " + nextControlID);
//
//        try {
//            List<AControlId> resultList;
//            nextID = -1;
//
////            resultList = em.createQuery(nextControlID).setParameter("SiteID",
////                    SiteId).getResultList();
//            resultList = getEntityManager().createQuery(nextControlID).setParameter("SiteID",
//                    SiteId).getResultList();
//
//            if (resultList.isEmpty()) {
//                logger.fine("resultList isEmpty");
//                iid.clear();
//                iid.setNewRunningInternalId(SiteId);
//                if (ctlid == null) {
//                    ctlid = getControlId();
//                }
//                ctlid.setSiteId(SiteId);
//                ctlid.setOrderId(1L);
//                ctlid.setNextId(iid.getInternalId());
//                resultList.add(ctlid);
//            }
//
//// TODO Revised to query the specific record to be changed or removed
//            // Geronimo read only on the resultList
//            // may no need, because may be Geronimo Error from still
//            // cannot set jta-data-source name yet.
//            // So it assume application managed transaction. Not container.
//
//            if (resultList.size() > 1) {
//                logger.fine("resultList size: " + resultList.size());
//                nextID = ((AControlId) resultList.get(0)).getNextId();
////                em.remove(resultList.get(0));
//                getEntityManager().remove(resultList.get(0));
//            } else {
//                nextID = ((AControlId) resultList.get(0)).getNextId();
//                logger.fine("resultList nextID: " + nextID);
//                ((AControlId) resultList.get(0)).setNextId(nextID + 1L);
////                em.persist(resultList.get(0));
//                getEntityManager().persist(resultList.get(0));
//            }
////            em.flush();
//            getEntityManager().flush();
//            return nextID;
//
//        } catch (Exception e1) {
//        	logger.fine("Exception: " + e1);
//            /**
//             *  No need to print Stack Trace because we want to process
//             *  even if it could not found.
//             */
//            if (ctlid != null) {
//                logger.fine("Exception: assignID:" + ctlid.getNextId());
////                em.clear();
////                em.merge(ctlid);
////                em.flush();
//                getEntityManager().clear();
//                getEntityManager().merge(ctlid);
//                getEntityManager().flush();
//                return ctlid.getNextId();
//            }
//            logger.warning("Could not assign next id for site id: " + SiteId);
////			e1.printStackTrace();
//            logger.info("Error and out: " + e1);
//        }
//        return -1;
//    }
//
//    /**
//     * Test JNDI calling
//     * @return Text to re-confirmed calling
//     */
//    public String callTesting() {
//        logger.fine("AODBMBean: Call successed...");
//        return "Call ODB success..";
//    }
//
//    protected DTO _findByCode(String Code) {
//        logger.fine("AODBM:_findByCode: " + Code);
//
//        code = _findCodeInstance(Code);
//        if (code == null) {
//        		logger.fine("_findByCode could not found code!");
//            return null;
//        }
//        main = _findMainInstance(code.getId());
//        if (main == null) {
//        		logger.fine("_findByCode could not found main!");
//        		return null;
//        }
//
//        return _AssignData();
//    }
//
//    protected DTO _AssignData() {
//        logger.fine("AODBM:_AssignData: " + code.getCode() + " id: " + code.getId());
////        logger.fine("AODBM:_AssignData main: " + main.getId());
//
////        DTO dto = getDTO();
//        if (dto == null)
//        	dto = getDTO();
//
//        dto.setId(code.getId());
//
//        dto.setCode(code.getCode());
//
//        dto.setMultilingual(code.getMultilingual());
//        if (dto.isMultilingual()) {
//            dto.setLingualDescription(_getLingualDescription(code, dto));
//        } else {
//            dto.setLingualDescription(null);
//        }
//
//        dto.setHasNotes(code.getHasNotes());
//        if (dto.isHasNotes()) {
//            dto.setNoteList(_getNoteList(code, dto));
//        } else {
//            dto.setNoteList(null);
//        }
//
//        if (getMoreDataTables() != null)
//        	_getMoreData(code.getId(),dto);
//
//        dto.setBarcodeCode(code.getBarcodeCode());
//
//        dto.setShortName(main.getShortName());
//        dto.setDescription(main.getDescription());
//
//        dto.setDeleted(code.isDeleted());
//        dto.setPurgable(code.isPurgable());
//        dto.setActive(code.isActive());
//        dto.setStartDate(code.getStartDate());
//        dto.setExpireDate(code.getExpireDate());
//
//        dto.setAllowEnterpriseView(code.getAllowEnterpriseView());
//        dto.setAllowEnterpriseEdit(code.getAllowEnterpriseEdit());
//        dto.setAllowEnterpriseDelete(code.getAllowEnterpriseDelete());
//        dto.setAllowEntity0View(code.getAllowEntity0View());
//        dto.setAllowEntity0Edit(code.getAllowEntity0Edit());
//        dto.setAllowEntity0Delete(code.getAllowEntity0Delete());
//        dto.setAllowEntity1View(code.getAllowEntity1View());
//        dto.setAllowEntity1Edit(code.getAllowEntity1Edit());
//        dto.setAllowEntity1Delete(code.getAllowEntity1Delete());
//        dto.setAllowEntity2View(code.getAllowEntity2View());
//        dto.setAllowEntity2Edit(code.getAllowEntity2Edit());
//        dto.setAllowEntity2Delete(code.getAllowEntity2Delete());
//        dto.setAllowEntity3View(code.getAllowEntity3View());
//        dto.setAllowEntity3Edit(code.getAllowEntity3Edit());
//        dto.setAllowEntity3Delete(code.getAllowEntity3Delete());
//        dto.setAllowEntity4View(code.getAllowEntity4View());
//        dto.setAllowEntity4Edit(code.getAllowEntity4Edit());
//        dto.setAllowEntity4Delete(code.getAllowEntity4Delete());
//        dto.setAllowEntity5View(code.getAllowEntity5View());
//        dto.setAllowEntity5Edit(code.getAllowEntity5Edit());
//        dto.setAllowEntity5Delete(code.getAllowEntity5Delete());
//        dto.setAllowEntity6View(code.getAllowEntity6View());
//        dto.setAllowEntity6Edit(code.getAllowEntity6Edit());
//        dto.setAllowEntity6Delete(code.getAllowEntity6Delete());
//        dto.setAllowEntity7View(code.getAllowEntity7View());
//        dto.setAllowEntity7Edit(code.getAllowEntity7Edit());
//        dto.setAllowEntity7Delete(code.getAllowEntity7Delete());
//        dto.setAllowEntity8View(code.getAllowEntity8View());
//        dto.setAllowEntity8Edit(code.getAllowEntity8Edit());
//        dto.setAllowEntity8Delete(code.getAllowEntity8Delete());
//        dto.setAllowEntity9View(code.getAllowEntity9View());
//        dto.setAllowEntity9Edit(code.getAllowEntity9Edit());
//        dto.setAllowEntity9Delete(code.getAllowEntity9Delete());
//        dto.setAllowSubEntity0View(code.getAllowSubEntity0View());
//        dto.setAllowSubEntity0Edit(code.getAllowSubEntity0Edit());
//        dto.setAllowSubEntity0Delete(code.getAllowSubEntity0Delete());
//        dto.setAllowSubEntity1View(code.getAllowSubEntity1View());
//        dto.setAllowSubEntity1Edit(code.getAllowSubEntity1Edit());
//        dto.setAllowSubEntity1Delete(code.getAllowSubEntity1Delete());
//        dto.setAllowSubEntity2View(code.getAllowSubEntity2View());
//        dto.setAllowSubEntity2Edit(code.getAllowSubEntity2Edit());
//        dto.setAllowSubEntity2Delete(code.getAllowSubEntity2Delete());
//        dto.setAllowSubEntity3View(code.getAllowSubEntity3View());
//        dto.setAllowSubEntity3Edit(code.getAllowSubEntity3Edit());
//        dto.setAllowSubEntity3Delete(code.getAllowSubEntity3Delete());
//        dto.setAllowSubEntity4View(code.getAllowSubEntity4View());
//        dto.setAllowSubEntity4Edit(code.getAllowSubEntity4Edit());
//        dto.setAllowSubEntity4Delete(code.getAllowSubEntity4Delete());
//        dto.setAllowSubEntity5View(code.getAllowSubEntity5View());
//        dto.setAllowSubEntity5Edit(code.getAllowSubEntity5Edit());
//        dto.setAllowSubEntity5Delete(code.getAllowSubEntity5Delete());
//        dto.setAllowSubEntity6View(code.getAllowSubEntity6View());
//        dto.setAllowSubEntity6Edit(code.getAllowSubEntity6Edit());
//        dto.setAllowSubEntity6Delete(code.getAllowSubEntity6Delete());
//        dto.setAllowSubEntity7View(code.getAllowSubEntity7View());
//        dto.setAllowSubEntity7Edit(code.getAllowSubEntity7Edit());
//        dto.setAllowSubEntity7Delete(code.getAllowSubEntity7Delete());
//        dto.setAllowSubEntity8View(code.getAllowSubEntity8View());
//        dto.setAllowSubEntity8Edit(code.getAllowSubEntity8Edit());
//        dto.setAllowSubEntity8Delete(code.getAllowSubEntity8Delete());
//        dto.setAllowSubEntity9View(code.getAllowSubEntity9View());
//        dto.setAllowSubEntity9Edit(code.getAllowSubEntity9Edit());
//        dto.setAllowSubEntity9Delete(code.getAllowSubEntity9Delete());
//        dto.setAllowUserGroupView(code.getAllowUserGroupView());
//        dto.setAllowUserGroupEdit(code.getAllowUserGroupEdit());
//        dto.setAllowUserGroupDelete(code.getAllowUserGroupDelete());
//        dto.setAllowUserView(code.getAllowUserView());
//        dto.setAllowUserEdit(code.getAllowUserEdit());
//        dto.setAllowUserDelete(code.getAllowUserDelete());
//
//        dto.setCreateSite(main.getCreateSite());
//        dto.setCreateUser(main.getCreateUser());
//        dto.setCreateDate(main.getCreateDate());
//        dto.setUpdateUser(main.getUpdateUser());
//        dto.setUpdateDate(main.getUpdateDate());
//
//        dto.setReplicate(main.getReplicate());
//        dto.setReplicateSite(main.getReplicateSite());
//
//		return assignData(code, main, dto);
//    }
//
////	protected List<ADescription> _findLingualInstance(Long SiteId, Long Id) {
////
//////		AMain main = getMainEntity();
////
//////		main = em.find(main.getClass(),new PkId(SiteId,Id));
////		return null;
////	}
////
////	protected List<ANote> _findNoteInstance(Long SiteId, Long Id) {
//////		AMain main = getMainEntity();
////
//////		main = em.find(main.getClass(),new PkId(SiteId,Id));
////		return null;
////	}
//}
