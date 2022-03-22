package base.entity.master.entity2;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ANote;

/**
 * <p>Title: Entity class Entity2Note</p>
 * <p>Description: note of Entity2.</p>
 * This class implements to persist Entity2 note information.
 *  <P>
 *  It served as Entity2 note entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="ORDERID")})  // Index in @MappedSuperclass not work!
public class Entity2Note extends ANote implements Serializable {
    /** Creates a new instance of LanguageNote */
    public Entity2Note() {
    }

    /**
     * Returns a string representation of the object.  This implementation constructs
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "entity.base.userNote[id=" + getId() + " order=" + getOrderId()+ "]";
    }

}
