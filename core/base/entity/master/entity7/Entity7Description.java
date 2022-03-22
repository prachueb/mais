package base.entity.master.entity7;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class Entity1Description</p>
 * <p>Description: description of Entity7.</p>
 * This class implements to persist Entity7 description information.
 *  <P>
 *  It served as Entity7 description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class Entity7Description extends ADescription implements Serializable {
    /** Creates a new instance of Entity7Description */
    public Entity7Description() {
    }

}
