package base.entity.master.entity9;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class Entity9Description</p>
 * <p>Description: description of Entity9.</p>
 * This class implements to persist Entity9 description information.
 *  <P>
 *  It served as Entity9 description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class Entity9Description extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public Entity9Description() {
    }

}
