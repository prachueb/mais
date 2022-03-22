package base.entity.master.subentity8;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ANote;

/**
 * <p>Title: Entity class SubEntity8Note</p>
 * <p>Description: note of SubEntity8.</p>
 * This class implements to persist SubEntity8 note information.
 *  <P>
 *  It served as SubEntity8 note entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="ORDERID")})  // Index in @MappedSuperclass not work!
public class SubEntity8Note extends ANote implements Serializable {
    /** Creates a new instance of SubEntity8Note */
    public SubEntity8Note() {
    }

    /**
     * Returns a string representation of the object.  This implementation constructs
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "entity.master.subentity8.subentity8Note[id=" + getId() + " order=" + getOrderId()+ "]";
    }

}
