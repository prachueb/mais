package com.mais.base.language.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;


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
@Table(indexes={@Index(columnList="CODE"),
@Index(columnList="BARCODECODE")})
public class LanguageCode extends ACode implements Serializable {
//    private static final long serialVersionUID = 2453234206406932008L;

    /** Creates a new instance of LanguageCode */
    public LanguageCode() {
    }

}
