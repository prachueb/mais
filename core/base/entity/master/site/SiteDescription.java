package base.entity.master.site;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class SiteDescription</p>
 * <p>Description: description of site.</p>
 * This class implements to persist site description information.
 *  <P>
 *  It served as site description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class SiteDescription extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public SiteDescription() {
    }

}
