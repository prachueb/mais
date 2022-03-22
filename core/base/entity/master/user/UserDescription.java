package base.entity.master.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class userDescription</p>
 * <p>Description: description of authority.</p>
 * This class implements to persist authority description information.
 *  <P>
 *  It served as authority description entity.
 * <p>Copyright: Copyright (c) 2008</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class UserDescription extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public UserDescription() {
    }

}
