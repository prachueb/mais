package base.entity.master.entity7;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ANote;

/**
 * <p>Title: Entity class Entity7Note</p>
 * <p>Description: note of Entity7.</p>
 * This class implements to persist Entity7 note information.
 *  <P>
 *  It served as Entity7 note entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="ORDERID")})  // Index in @MappedSuperclass not work!
public class Entity7Note extends ANote implements Serializable {
    /** Creates a new instance of Entity7Note */
    public Entity7Note() {
    }

    /**
     * Returns a string representation of the object.  This implementation constructs
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "entity.master.entity7.entity7Note[id=" + getId() + " order=" + getOrderId()+ "]";
    }

}
