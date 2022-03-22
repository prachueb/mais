package com.mais.dbo.baseobject.objectdatabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.mais.dbo.baseobject.dto.DTO;
import com.mais.dbo.baseobject.entity.ATable;

/**
 * <p>
 * Title: AODBM1
 * </p>
 * <p>
 * Description: abstract object database master with one child.
 * </p>
 * <p>
 * This class implements the default mechanism to create, edit, change primary
 * code, destroy or delete, reset database, and find by code.
 * </P>
 * <p>
 * Copyright: Copyright (c) 2013
 * </p>
 * 
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public abstract class AODBM1 extends AODBM {
	/**
	 * The collection of instances of entities to be persisted to the database.
	 */
	protected Map<String, List<Object>> moreDataTableInstances;
	private List<Object> instances = null;

	/**
	 * Define list of more entities/tables objects (not the name)
	 * 
	 * @return
	 */
	@Override
	abstract protected List<ATable> getMoreDataTables();

	/**
	 * This function should be defined in subclass to assign data from DTO to
	 * entities/tables instances.
	 * 
	 * @param data
	 */
	abstract protected void storeMoreData(DTO data);
	
	/**
	 * This function should be defined in subclass to assign data from
	 * entities/tables instances to DTO.
	 * 
	 * @param data
	 * @return DTO
	 */
	abstract protected DTO assignMoreData(DTO data);

	/**
	 * Using to store more table in the sub abstract class. Override this class.
	 */
	@Override
	protected void _addMoreData(DTO data) {
		logger.fine("_addMoreData ");

		if (moreDataTableInstances == null)
			moreDataTableInstances = new HashMap<String, List<Object>>();
		else
			moreDataTableInstances.clear();

		/**
		 * Call to subclass function to assign data from DTO to persistence instance
		 */
		storeMoreData(data);
		
		if (moreDataTableInstances.isEmpty())
			return;

		List<ATable> moreDataTables = getMoreDataTables();
		for (ATable dataTable : moreDataTables) {
			for (Object instance : moreDataTableInstances.get(dataTable
					.getClass().getSimpleName().trim())) {
				try {
					/**
					 * Check to see, if EntityManager has already existing
					 * bounded ADescription entity. It should be detach by
					 * em.clear() before em.persist() to add new record of
					 * ADescription entity. If em.clear() was not called, it
					 * will change/edit to existing record, not add the new one.
					 */
					if (getEntityManager().contains(instance)) {
						getEntityManager().clear();
					}
					getEntityManager().persist(instance);
					getEntityManager().flush();
				} catch (Exception e) {
					logger.info("Error at _addMoreData:  ");
					e.printStackTrace();
				}
			}
		}
	}

    /**
     * Using to change data in More extended table(s)
     * <P>
     * Simple delete all modules store under this id then replace with the new
     * data that stored in the DTO.
     * </P>
     * @param id internal id 
     * @param data DTO subclass instance that should to completely store all the
     * data that want to be store. Change by delete all then add this new data.
     */
	@Override
	protected void _editMoreData(long id, DTO data) {
		logger.fine("_editMoreData: id = " + id);
		
		_removeMoreData(id);
		_addMoreData(data);
	}

	@Override
	protected void _removeMoreData(long id) {
		logger.fine("_removeMoreData: size = " + getMoreDataTables().size());

		List<ATable> moreDataTables = getMoreDataTables();
		for (ATable dataTable : moreDataTables) {
	        String QLquery = "DELETE FROM ";
	        QLquery = QLquery + dataTable.getClass().getSimpleName();
	        QLquery = QLquery + " c WHERE c.id = :id";
	        try {
	            Query q = getEntityManager().createQuery(QLquery);
	            q.setParameter("id", id).executeUpdate();
	        } catch (Exception e) {
	            logger.warning("Exception delete " + dataTable.getClass().getSimpleName() + ": " + e);
	            return;
	        }
		}
	}

	@Override
	protected void _resetMoreData() {
		logger.fine("_resetMoreData: size = " + getMoreDataTables().size());

		List<ATable> moreDataTables = getMoreDataTables();
		for (ATable dataTable : moreDataTables)
			getEntityManager().createQuery(
					"DELETE FROM " + dataTable.getClass().getSimpleName())
					.executeUpdate();
	}

	/**
	 * Using to get data from more table in the sub abstract class. Override
	 * this class.
	 */
	@SuppressWarnings("unchecked")
	protected DTO _getMoreData(long id, DTO data) {
		logger.fine("_getMoreData id: " + id);
		
		if (moreDataTableInstances == null)
			moreDataTableInstances = new HashMap<String, List<Object>>();
		else
			moreDataTableInstances.clear();

		List<ATable> moreDataTables = getMoreDataTables();
		for (ATable dataTable : moreDataTables) {
		    String QLquery = "SELECT c FROM ";
		    QLquery = QLquery + dataTable.getClass().getSimpleName().trim();
		    QLquery = QLquery + " c WHERE c.id = :id";
		    try {
		        Query q = getEntityManager().createQuery(QLquery);
		        instances = new ArrayList<Object>();
		        instances.addAll(q.setParameter("id", id).getResultList());
		    } catch (Exception e) {
		        logger.warning("Exception find _getMoreData: " + e);
		        return null;
		    }
		    if (instances.size() > 0)
		    	moreDataTableInstances.put(dataTable.getClass().getSimpleName().trim(), instances);
		}
		if (moreDataTableInstances.isEmpty())
			return data;
		else
			return assignMoreData(data);
	}

	/**
	 * Use to keep the entity(s)' instance to persist to the database.
	 * 
	 * @param aTable
	 * @param instance
	 */
	protected void addMoreDataTableInstances(ATable aTable, Object instance) {
		logger.fine("ATable: " + aTable.getClass().getSimpleName()
				+ " addMoreDataTableInstances: "
				+ moreDataTableInstances.keySet());
		if (moreDataTableInstances.containsKey(aTable.getClass()
				.getSimpleName().trim())) {
			moreDataTableInstances
					.get(aTable.getClass().getSimpleName().trim())
					.add(instance);
		} else {
			instances = new ArrayList<Object>();
			instances.add(instance);
			moreDataTableInstances.put(
					aTable.getClass().getSimpleName().trim(), instances);
		}
	}
	
	protected Collection<?> getMoreDataTableInstances(ATable aTable) {
		logger.fine("ATable: " + aTable.getClass().getSimpleName());
		return moreDataTableInstances.get(aTable.getClass().getSimpleName().trim());
	}

}
