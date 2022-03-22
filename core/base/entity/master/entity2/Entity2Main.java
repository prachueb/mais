package base.entity.master.entity2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.AMain;

/**
 * <p>Title: Entity class Entity2Main</p>
 * <p>Description: main Entity2 entity.</p>
 * This class implements to persist main Entity2 information.
 *  <P>
 *  It served as main Entity2 entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
//@NamedQueries({
//	@NamedQuery(name="authority_findByPrimayKey", query="SELECT m FROM userMain m WHERE m.siteId = :siteId AND m.id = :id")
////	,@NamedQuery(name="authority_findRange", query="SELECT new dto.base.authorityCodeMain(c,m) FROM userCode c, userMain m WHERE c.siteId = m.siteId AND c.id = m.id")
////    ,@NamedQuery(name="authority_findQueueName", query="SELECT m.queueName FROM userCode c, userMain m WHERE c.code LIKE :codePattern AND m.id = c.id")
////    ,@NamedQuery(name="authority_findConnectionName", query="SELECT m.connectionName FROM autorityCode c, userMain m WHERE c.code LIKE :codePattern AND m.siteId = c.siteId AND m.id = c.id")
////    ,@NamedQuery(name="authority_findConnectionQueueName", query="SELECT new baseobject.objectdatabase.DTOStringString(m.connectionName, m.queueName) FROM userCode c, userMain m WHERE c.code LIKE :codePattern AND m.siteId = c.siteId AND m.id = c.id")
//})
@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="SHORTNAME"),
@Index(columnList="CREATESITE")})  // Index in @MappedSuperclass not work!
public class Entity2Main extends AMain implements Serializable {

    /**
     * Creates a new instance of Entity2Main
     */
    public Entity2Main() {
    }


}
