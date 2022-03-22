package base.entity.master.entity8;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ANote;

/**
 * <p>Title: Entity class Entity8Note</p>
 * <p>Description: note of Entity8.</p>
 * This class implements to persist Entity8 note information.
 *  <P>
 *  It served as Entity8 note entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="ORDERID")})  // Index in @MappedSuperclass not work!
public class Entity8Note extends ANote implements Serializable {
    /** Creates a new instance of Entity8Note */
    public Entity8Note() {
    }

    /**
     * Returns a string representation of the object.  This implementation constructs
     * that representation based on the id fields.
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "entity.master.entity8.entity8Note[id=" + getId() + " order=" + getOrderId()+ "]";
    }

}
