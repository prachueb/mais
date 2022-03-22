package base.entity.master.user;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ANote;

/**
 * <p>Title: Entity class userNote</p>
 * <p>Description: note of authority.</p>
 * This class implements to persist authority note information.
 *  <P>
 *  It served as authority note entity.
 * <p>Copyright: Copyright (c) 2007</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="ORDERID")})  // Index in @MappedSuperclass not work!
public class UserNote extends ANote implements Serializable {
    /** Creates a new instance of userNote */
    public UserNote() {
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
