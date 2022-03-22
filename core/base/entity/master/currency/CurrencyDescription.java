package base.entity.master.currency;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.ADescription;

/**
 * <p>Title: Entity class CurrencyDescription</p>
 * <p>Description: description of currency.</p>
 * This class implements to persist currency description information.
 *  <P>
 *  It served as currency description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class CurrencyDescription extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public CurrencyDescription() {
    }

}
