// This layer define the JSON object for CRUD (Create, Read, Update, Delete)

//package com.mais.base.language;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import com.mais.base.language.models.*;
//
///**
// * <p>
// * Title: AODB
// * </p>
// * <p>
// * Description: abstract object database.
// * </p>
// * <p>
// * This class implements to persist information.
// * It served as gateway to access all the entity's tables.
// * </P>
// * <P>
// * Using abstract of create, edit, changeCode, destroy because it should be declare
// * local or remote interface for EJB calling.
// * <P>
// * All the create, edit, changeCode, destroy mechanism was in _create, _edit, _changeCode, and
// * _destroy methods that should be call from each abstract method respectively.
// * <p>
// * Copyright: Copyright (c) 2010
// * </p>
// *
// * @author Prachueb Sirivongrungson
// * @version 1.0
// */
//public abstract class AODB {
//	protected Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
//
////TODO Using this to inject publish
////	@EJB
////	protected publishPersistenceLocal publishPersistance;
//
////	protected PersistInfo pInfo;
//
//	/** Creates a new instance of AODB */
//	public AODB() {
//		logger.setLevel(Level.FINE);
//
////		pInfo = new PersistInfo();
//
//	}
//
//	/**
//	 * To add new persistence.
//	 * The statement "super._create(connectionInfo, data);"
//	 * should be declare.
//	 * Local and remote interfaces should be done for EJB calling.
//	 * @param connectionInfo
//	 * @param data
//	 * @return DTO
//	 * @throws ODBException
//	 */
////	@TransactionAttribute(TransactionAttributeType.REQUIRED)
//	abstract public DTO add(Connection connectionInfo, DTO data)
//	throws ODBException;
//
//	/**
//	 * To edit the persistence as identified by DTO.setCode().
//	 * The statement "super._edit(connectionInfo, data);"
//	 * should be declare. All the null value in DTO means don't change.
//	 * Local and remote interfaces should be done for EJB calling.
//	 *
//	 * <P>
//	 * Multiple language & notes
//	 * <P>
//	 * Add more content of languageDescription or Note:
//	 * set DTOLongString.firstLong to new languageId or new orderId
//	 * and set DTOLongString.secondString to new description or new note.
//	 * <P>
//	 * Change content of languageDescription or Note:
//	 * set DTOLongString.firstLong to the languageId or orderId to be changed
//	 * and set DTOLongString.secondString to new description or new note.
//	 * <P>
//	 * Delete content of languageDescription or Note:
//	 * set DTOLongString.firstLong to the languageId or orderId to be deleted
//	 * and set DTOLongString.secondString to null.
//	 *
//	 * @param connectionInfo
//	 * @param data
//	 * @throws ODBException
//	 */
//	abstract public void change(Connection connectionInfo, DTO data)
//	throws ODBException;
//
//	/**
//	 * To change code of the persistence from oldPK to newPK.
//	 * The statement "_changeCode(connectionInfo, oldPK, newPK);"
//	 * should be declare.
//	 * Local and remote interfaces should be done for EJB calling.
//	 * @param connectionInfo
//	 * @param oldPK
//	 * @param newPK
//	 * @throws ODBException
//	 */
//	abstract public void changeCode(Connection connectionInfo, String oldPK,String newPK)
//	throws ODBException;
//
//	/**
//	 * To remove the persistence as identified by data.setCode().
//	 * The statement "super._destroy(connectionInfo, data);"
//	 * should be declare.
//	 * Local and remote interfaces should be done for EJB calling.
//	 * @param connectionInfo
//	 * @param data
//	 * @throws ODBException
//	 */
//	abstract public void delete(Connection connectionInfo, DTO data)
//	throws ODBException;
//
////	/**
////	 *
////	 */
////	abstract public DTO findByCode(String code) throws ODBException;
////
////	/**
////	 * To test connect to EJB server
////	 */
////    abstract public String callTesting();
//}
