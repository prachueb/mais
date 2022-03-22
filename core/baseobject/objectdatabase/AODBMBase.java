package com.mais.base.language;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * <p>
 * Title: AODBM1
 * </p>
 * <p>
 * Description: abstract object database master with one child.
 * </p>
 * <p>
 * This class implements the persistence unit to specify databases.
 * </P>
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * 
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public abstract class AODBMBase extends AODBM {
	/**
	 * Using this injection to specify the Container-Managed Transactions.
	 * The EntityManagerFactory emf.createEntityManager() method is for Bean-Managed Transactions.
	 */
	@PersistenceContext(unitName="base-ejbPU")
	protected EntityManager em;

    protected EntityManager getEntityManager() {
    	return em;
    }

}
