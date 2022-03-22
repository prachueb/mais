package com.mais.base.language.models;

import java.io.Serializable;

import javax.persistence.Entity;

import com.mais.baseobject.odb.models.AControlId;


/**
 * <p>
 * Title: LanguageControlId
 * </p>
 * <p>
 * Description: language Control Id entity.
 * </p>
 * <p>
 * This class implements to be language control id entity. It served as language control
 * id entity using to control next id.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2011
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
// @NamedQuery(name="siteControlID_ResetDatabase_All", query= " DELETE FROM
// siteCodeId c")
@SuppressWarnings("serial")
@Entity
//@NamedQueries ({
//@NamedQuery(name = "authorityControlID_findNextID", query = " SELECT c FROM userControlId c WHERE c.siteId = :SiteID ORDER BY c.orderId DESC"),
//@NamedQuery(name = "authorityControlID_findMaxID", query = " SELECT c FROM userControlId c WHERE c.siteId = :SiteID ORDER BY c.orderId ASC")
//})
public class LanguageControlId extends AControlId implements Serializable {

	/** Creates a new instance of userControlId */
	public LanguageControlId() {
	}

}
