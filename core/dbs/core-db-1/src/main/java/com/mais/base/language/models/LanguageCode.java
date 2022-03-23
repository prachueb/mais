package com.mais.base.language.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import com.mais.baseobject.odb.models.ACode;


/**
 * <p>Title: Entity class LanguageCode</p>
 * <p>Description: code of language.</p>
 * This class implements to persist language code information.
 *  <P>
 *  It served as language code entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

//@TableGenerator(name="authorityID",
//        table="AuthorityIDGen",
//        pkColumnName="objectName",
//        valueColumnName="nextID",
//        pkColumnValue="authority",
//        initialValue=1,
//        allocationSize=1)

//@NamedQueries({
//	@NamedQuery(name="authorityID_findByPrimayKey", query="SELECT c FROM userCode c WHERE c.siteId = :siteId AND c.id = :id")
//    ,@NamedQuery(name="authorityID_findByCode_All", query=" SELECT c FROM userCode c WHERE c.code = :code")
//    ,@NamedQuery(name="authorityID_findByCode", query=" SELECT c FROM userCode c WHERE c.code = :code")
//})
@SuppressWarnings("serial")
@Entity
// The index useful in WHERE not in ORDER BY
@Table(  indexes = {
        @Index( name = "index_id",
                columnList="id, active",
                unique = false),
        @Index( name = "index_shortName",
                columnList="shortName, active",
                unique = false)
                })
public class LanguageCode extends ACode implements Serializable {
//    private static final long serialVersionUID = 2453234206406932008L;

    /** Creates a new instance of LanguageCode */
    public LanguageCode() {
    }

}
