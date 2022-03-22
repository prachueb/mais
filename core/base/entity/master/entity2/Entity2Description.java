package base.entity.master.entity2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class Entity2Description</p>
 * <p>Description: description of Entity2.</p>
 * This class implements to persist Entity2 description information.
 *  <P>
 *  It served as Entity2 description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class Entity2Description extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public Entity2Description() {
    }

}
