package base.entity.master.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ACode;

/**
 * <p>Title: Entity class userCode</p>
 * <p>Description: code of authority.</p>
 * This class implements to persist authority code information.
 *  <P>
 *  It served as authority code entity.
 * <p>Copyright: Copyright (c) 2008</p>
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
public class UserCode extends ACode implements Serializable {
//    private static final long serialVersionUID = 2453234206406932008L;

    /** Creates a new instance of userCode */
    public UserCode() {
    }

}
