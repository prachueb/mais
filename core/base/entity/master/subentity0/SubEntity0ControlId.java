package base.entity.master.subentity0;


import java.io.Serializable;

import javax.persistence.Entity;

import baseobject.entity.AControlId;

/**
 * <p>
 * Title: SubEntity0ControlId
 * </p>
 * <p>
 * Description: SubEntity0 Control Id entity.
 * </p>
 * <p>
 * This class implements to be SubEntity0 control id entity. It served as Entity1 control
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
public class SubEntity0ControlId extends AControlId implements Serializable {

	/** 
	 * Creates a new instance of SubEntity0ControlId 
	 */
	public SubEntity0ControlId() {
	}

}
