package base.entity.master.enterprise;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class EnterpriseDescription</p>
 * <p>Description: description of Enterprise.</p>
 * This class implements to persist Enterprise description information.
 *  <P>
 *  It served as Enterprise description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class EnterpriseDescription extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public EnterpriseDescription() {
    }

}
