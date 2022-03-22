package com.mais.dbo.baseobject.entity;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * <p>
 * Title: ACode
 * </p>
 * <p>
 * Description: Abstract super class for all Code entity.
 * </p>
 * <p>
 * This class implements to be super class of all code entity. <BR>
 * It served as super class of code entity. This is the initial
 * search for the entity. Validated data for edit delete or view
 * should be implemented here.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@MappedSuperclass
//@Table(indexes={@Index(columnList="CODE"),
//@Index(columnList="BARCODECODE")}) // Index in @MappedSuperclass not work!
public abstract class ACode {

    @Id
    private long id;
    private String code;
    private boolean multilingual;
    private boolean hasNotes;
    
    /**
     * Bar code to identify the specific code
     */
    protected byte[] barcode;
    private String barcodeCode;
    private boolean deleted;
    private boolean purgable;
    private boolean active;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date expireDate;
    
    /**
     * Validation of edit delete or view in each record/instance
     * defined as pattern match but null means no validation rule.
     */
    private String allowEnterpriseView;
    private String allowEnterpriseEdit;
    private String allowEnterpriseDelete;
    private String allowEntity0View;
    private String allowEntity0Edit;
    private String allowEntity0Delete;
    private String allowEntity1View;
    private String allowEntity1Edit;
    private String allowEntity1Delete;
    private String allowEntity2View;
    private String allowEntity2Edit;
    private String allowEntity2Delete;
    private String allowEntity3View;
    private String allowEntity3Edit;
    private String allowEntity3Delete;
    private String allowEntity4View;
    private String allowEntity4Edit;
    private String allowEntity4Delete;
    private String allowEntity5View;
    private String allowEntity5Edit;
    private String allowEntity5Delete;
    private String allowEntity6View;
    private String allowEntity6Edit;
    private String allowEntity6Delete;
    private String allowEntity7View;
    private String allowEntity7Edit;
    private String allowEntity7Delete;
    private String allowEntity8View;
    private String allowEntity8Edit;
    private String allowEntity8Delete;
    private String allowEntity9View;
    private String allowEntity9Edit;
    private String allowEntity9Delete;
    private String allowSubEntity0View;
    private String allowSubEntity0Edit;
    private String allowSubEntity0Delete;
    private String allowSubEntity1View;
    private String allowSubEntity1Edit;
    private String allowSubEntity1Delete;
    private String allowSubEntity2View;
    private String allowSubEntity2Edit;
    private String allowSubEntity2Delete;
    private String allowSubEntity3View;
    private String allowSubEntity3Edit;
    private String allowSubEntity3Delete;
    private String allowSubEntity4View;
    private String allowSubEntity4Edit;
    private String allowSubEntity4Delete;
    private String allowSubEntity5View;
    private String allowSubEntity5Edit;
    private String allowSubEntity5Delete;
    private String allowSubEntity6View;
    private String allowSubEntity6Edit;
    private String allowSubEntity6Delete;
    private String allowSubEntity7View;
    private String allowSubEntity7Edit;
    private String allowSubEntity7Delete;
    private String allowSubEntity8View;
    private String allowSubEntity8Edit;
    private String allowSubEntity8Delete;
    private String allowSubEntity9View;
    private String allowSubEntity9Edit;
    private String allowSubEntity9Delete;
    private String allowUserGroupView;
    private String allowUserGroupEdit;
    private String allowUserGroupDelete;
    private String allowUserView;
    private String allowUserEdit;
    private String allowUserDelete;

    /**
     * Construction
     */
    public ACode() {
        startDate = new Date();
        expireDate = new Date();
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return if multiple language or not
     */
    public boolean getMultilingual() {
        return multilingual;
    }

    /**
     * @param multilingual the multiple language to set
     */
    public void setMultilingual(boolean multilingual) {
        this.multilingual = multilingual;
    }

    /**
     * @return the hasNotes
     */
    public boolean getHasNotes() {
        return hasNotes;
    }

    /**
     * @param hasNotes the hasNotes to set
     */
    public void setHasNotes(boolean hasNotes) {
        this.hasNotes = hasNotes;
    }

    /**
     * @return the barcode
     */
    public byte[] getBarcode() {
        return barcode;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(byte[] barcode) {
        this.barcode = barcode;
    }

    /**
     * @return the barcodeCode
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    public String getBarcodeCode() {
        return barcodeCode;
    }

    /**
     * @param barcodeCode the barcodeCode to set
     */
    public void setBarcodeCode(String barcodeCode) {
        this.barcodeCode = barcodeCode;
    }

    /**
     * @return the deleted
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return the purgable
     */
    public boolean isPurgable() {
        return purgable;
    }

    /**
     * @param purgable the purgable to set
     */
    public void setPurgable(boolean purgable) {
        this.purgable = purgable;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the startDate <BR> Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
     */
    public long getStartDate() {
        return startDate.getTime();
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate.setTime(startDate.getTime());
    }

    /**
     * @param startDate the startDate to set TimeInMillis
     */
    public void setStartDate(long startDate) {
        this.startDate.setTime(startDate);
    }

    /**
     * @return the expireDate <BR> Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
     */
    public long getExpireDate() {
        return expireDate.getTime();
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate.setTime(expireDate.getTime());
    }

    /**
     * @param expireDate the expireDate to set TimeInMillis
     */
    public void setExpireDate(long expireDate) {
        this.expireDate.setTime(expireDate);
    }

	/**
	 * @return the allowEnterpriseView
	 */
	public String getAllowEnterpriseView() {
		return allowEnterpriseView;
	}

	/**
	 * @param allowEnterpriseView the allowEnterpriseView to set
	 */
	public void setAllowEnterpriseView(String allowEnterpriseView) {
		this.allowEnterpriseView = allowEnterpriseView;
	}

	/**
	 * @return the allowEnterpriseEdit
	 */
	public String getAllowEnterpriseEdit() {
		return allowEnterpriseEdit;
	}

	/**
	 * @param allowEnterpriseEdit the allowEnterpriseEdit to set
	 */
	public void setAllowEnterpriseEdit(String allowEnterpriseEdit) {
		this.allowEnterpriseEdit = allowEnterpriseEdit;
	}

	/**
	 * @return the allowEnterpriseDelete
	 */
	public String getAllowEnterpriseDelete() {
		return allowEnterpriseDelete;
	}

	/**
	 * @param allowEnterpriseDelete the allowEnterpriseDelete to set
	 */
	public void setAllowEnterpriseDelete(String allowEnterpriseDelete) {
		this.allowEnterpriseDelete = allowEnterpriseDelete;
	}

	/**
	 * @return the allowEntity0View
	 */
	public String getAllowEntity0View() {
		return allowEntity0View;
	}

	/**
	 * @param allowEntity0View the allowEntity0View to set
	 */
	public void setAllowEntity0View(String allowEntity0View) {
		this.allowEntity0View = allowEntity0View;
	}

	/**
	 * @return the allowEntity0Edit
	 */
	public String getAllowEntity0Edit() {
		return allowEntity0Edit;
	}

	/**
	 * @param allowEntity0Edit the allowEntity0Edit to set
	 */
	public void setAllowEntity0Edit(String allowEntity0Edit) {
		this.allowEntity0Edit = allowEntity0Edit;
	}

	/**
	 * @return the allowEntity0Delete
	 */
	public String getAllowEntity0Delete() {
		return allowEntity0Delete;
	}

	/**
	 * @param allowEntity0Delete the allowEntity0Delete to set
	 */
	public void setAllowEntity0Delete(String allowEntity0Delete) {
		this.allowEntity0Delete = allowEntity0Delete;
	}

	/**
	 * @return the allowEntity1View
	 */
	public String getAllowEntity1View() {
		return allowEntity1View;
	}

	/**
	 * @param allowEntity1View the allowEntity1View to set
	 */
	public void setAllowEntity1View(String allowEntity1View) {
		this.allowEntity1View = allowEntity1View;
	}

	/**
	 * @return the allowEntity1Edit
	 */
	public String getAllowEntity1Edit() {
		return allowEntity1Edit;
	}

	/**
	 * @param allowEntity1Edit the allowEntity1Edit to set
	 */
	public void setAllowEntity1Edit(String allowEntity1Edit) {
		this.allowEntity1Edit = allowEntity1Edit;
	}

	/**
	 * @return the allowEntity1Delete
	 */
	public String getAllowEntity1Delete() {
		return allowEntity1Delete;
	}

	/**
	 * @param allowEntity1Delete the allowEntity1Delete to set
	 */
	public void setAllowEntity1Delete(String allowEntity1Delete) {
		this.allowEntity1Delete = allowEntity1Delete;
	}

	/**
	 * @return the allowEntity2View
	 */
	public String getAllowEntity2View() {
		return allowEntity2View;
	}

	/**
	 * @param allowEntity2View the allowEntity2View to set
	 */
	public void setAllowEntity2View(String allowEntity2View) {
		this.allowEntity2View = allowEntity2View;
	}

	/**
	 * @return the allowEntity2Edit
	 */
	public String getAllowEntity2Edit() {
		return allowEntity2Edit;
	}

	/**
	 * @param allowEntity2Edit the allowEntity2Edit to set
	 */
	public void setAllowEntity2Edit(String allowEntity2Edit) {
		this.allowEntity2Edit = allowEntity2Edit;
	}

	/**
	 * @return the allowEntity2Delete
	 */
	public String getAllowEntity2Delete() {
		return allowEntity2Delete;
	}

	/**
	 * @param allowEntity2Delete the allowEntity2Delete to set
	 */
	public void setAllowEntity2Delete(String allowEntity2Delete) {
		this.allowEntity2Delete = allowEntity2Delete;
	}

	/**
	 * @return the allowEntity3View
	 */
	public String getAllowEntity3View() {
		return allowEntity3View;
	}

	/**
	 * @param allowEntity3View the allowEntity3View to set
	 */
	public void setAllowEntity3View(String allowEntity3View) {
		this.allowEntity3View = allowEntity3View;
	}

	/**
	 * @return the allowEntity3Edit
	 */
	public String getAllowEntity3Edit() {
		return allowEntity3Edit;
	}

	/**
	 * @param allowEntity3Edit the allowEntity3Edit to set
	 */
	public void setAllowEntity3Edit(String allowEntity3Edit) {
		this.allowEntity3Edit = allowEntity3Edit;
	}

	/**
	 * @return the allowEntity3Delete
	 */
	public String getAllowEntity3Delete() {
		return allowEntity3Delete;
	}

	/**
	 * @param allowEntity3Delete the allowEntity3Delete to set
	 */
	public void setAllowEntity3Delete(String allowEntity3Delete) {
		this.allowEntity3Delete = allowEntity3Delete;
	}

	/**
	 * @return the allowEntity4View
	 */
	public String getAllowEntity4View() {
		return allowEntity4View;
	}

	/**
	 * @param allowEntity4View the allowEntity4View to set
	 */
	public void setAllowEntity4View(String allowEntity4View) {
		this.allowEntity4View = allowEntity4View;
	}

	/**
	 * @return the allowEntity4Edit
	 */
	public String getAllowEntity4Edit() {
		return allowEntity4Edit;
	}

	/**
	 * @param allowEntity4Edit the allowEntity4Edit to set
	 */
	public void setAllowEntity4Edit(String allowEntity4Edit) {
		this.allowEntity4Edit = allowEntity4Edit;
	}

	/**
	 * @return the allowEntity4Delete
	 */
	public String getAllowEntity4Delete() {
		return allowEntity4Delete;
	}

	/**
	 * @param allowEntity4Delete the allowEntity4Delete to set
	 */
	public void setAllowEntity4Delete(String allowEntity4Delete) {
		this.allowEntity4Delete = allowEntity4Delete;
	}

	/**
	 * @return the allowEntity5View
	 */
	public String getAllowEntity5View() {
		return allowEntity5View;
	}

	/**
	 * @param allowEntity5View the allowEntity5View to set
	 */
	public void setAllowEntity5View(String allowEntity5View) {
		this.allowEntity5View = allowEntity5View;
	}

	/**
	 * @return the allowEntity5Edit
	 */
	public String getAllowEntity5Edit() {
		return allowEntity5Edit;
	}

	/**
	 * @param allowEntity5Edit the allowEntity5Edit to set
	 */
	public void setAllowEntity5Edit(String allowEntity5Edit) {
		this.allowEntity5Edit = allowEntity5Edit;
	}

	/**
	 * @return the allowEntity5Delete
	 */
	public String getAllowEntity5Delete() {
		return allowEntity5Delete;
	}

	/**
	 * @param allowEntity5Delete the allowEntity5Delete to set
	 */
	public void setAllowEntity5Delete(String allowEntity5Delete) {
		this.allowEntity5Delete = allowEntity5Delete;
	}

	/**
	 * @return the allowEntity6View
	 */
	public String getAllowEntity6View() {
		return allowEntity6View;
	}

	/**
	 * @param allowEntity6View the allowEntity6View to set
	 */
	public void setAllowEntity6View(String allowEntity6View) {
		this.allowEntity6View = allowEntity6View;
	}

	/**
	 * @return the allowEntity6Edit
	 */
	public String getAllowEntity6Edit() {
		return allowEntity6Edit;
	}

	/**
	 * @param allowEntity6Edit the allowEntity6Edit to set
	 */
	public void setAllowEntity6Edit(String allowEntity6Edit) {
		this.allowEntity6Edit = allowEntity6Edit;
	}

	/**
	 * @return the allowEntity6Delete
	 */
	public String getAllowEntity6Delete() {
		return allowEntity6Delete;
	}

	/**
	 * @param allowEntity6Delete the allowEntity6Delete to set
	 */
	public void setAllowEntity6Delete(String allowEntity6Delete) {
		this.allowEntity6Delete = allowEntity6Delete;
	}

	/**
	 * @return the allowEntity7View
	 */
	public String getAllowEntity7View() {
		return allowEntity7View;
	}

	/**
	 * @param allowEntity7View the allowEntity7View to set
	 */
	public void setAllowEntity7View(String allowEntity7View) {
		this.allowEntity7View = allowEntity7View;
	}

	/**
	 * @return the allowEntity7Edit
	 */
	public String getAllowEntity7Edit() {
		return allowEntity7Edit;
	}

	/**
	 * @param allowEntity7Edit the allowEntity7Edit to set
	 */
	public void setAllowEntity7Edit(String allowEntity7Edit) {
		this.allowEntity7Edit = allowEntity7Edit;
	}

	/**
	 * @return the allowEntity7Delete
	 */
	public String getAllowEntity7Delete() {
		return allowEntity7Delete;
	}

	/**
	 * @param allowEntity7Delete the allowEntity7Delete to set
	 */
	public void setAllowEntity7Delete(String allowEntity7Delete) {
		this.allowEntity7Delete = allowEntity7Delete;
	}

	/**
	 * @return the allowEntity8View
	 */
	public String getAllowEntity8View() {
		return allowEntity8View;
	}

	/**
	 * @param allowEntity8View the allowEntity8View to set
	 */
	public void setAllowEntity8View(String allowEntity8View) {
		this.allowEntity8View = allowEntity8View;
	}

	/**
	 * @return the allowEntity8Edit
	 */
	public String getAllowEntity8Edit() {
		return allowEntity8Edit;
	}

	/**
	 * @param allowEntity8Edit the allowEntity8Edit to set
	 */
	public void setAllowEntity8Edit(String allowEntity8Edit) {
		this.allowEntity8Edit = allowEntity8Edit;
	}

	/**
	 * @return the allowEntity8Delete
	 */
	public String getAllowEntity8Delete() {
		return allowEntity8Delete;
	}

	/**
	 * @param allowEntity8Delete the allowEntity8Delete to set
	 */
	public void setAllowEntity8Delete(String allowEntity8Delete) {
		this.allowEntity8Delete = allowEntity8Delete;
	}

	/**
	 * @return the allowEntity9View
	 */
	public String getAllowEntity9View() {
		return allowEntity9View;
	}

	/**
	 * @param allowEntity9View the allowEntity9View to set
	 */
	public void setAllowEntity9View(String allowEntity9View) {
		this.allowEntity9View = allowEntity9View;
	}

	/**
	 * @return the allowEntity9Edit
	 */
	public String getAllowEntity9Edit() {
		return allowEntity9Edit;
	}

	/**
	 * @param allowEntity9Edit the allowEntity9Edit to set
	 */
	public void setAllowEntity9Edit(String allowEntity9Edit) {
		this.allowEntity9Edit = allowEntity9Edit;
	}

	/**
	 * @return the allowEntity9Delete
	 */
	public String getAllowEntity9Delete() {
		return allowEntity9Delete;
	}

	/**
	 * @param allowEntity9Delete the allowEntity9Delete to set
	 */
	public void setAllowEntity9Delete(String allowEntity9Delete) {
		this.allowEntity9Delete = allowEntity9Delete;
	}

	/**
	 * @return the allowSubEntity0View
	 */
	public String getAllowSubEntity0View() {
		return allowSubEntity0View;
	}

	/**
	 * @param allowSubEntity0View the allowSubEntity0View to set
	 */
	public void setAllowSubEntity0View(String allowSubEntity0View) {
		this.allowSubEntity0View = allowSubEntity0View;
	}

	/**
	 * @return the allowSubEntity0Edit
	 */
	public String getAllowSubEntity0Edit() {
		return allowSubEntity0Edit;
	}

	/**
	 * @param allowSubEntity0Edit the allowSubEntity0Edit to set
	 */
	public void setAllowSubEntity0Edit(String allowSubEntity0Edit) {
		this.allowSubEntity0Edit = allowSubEntity0Edit;
	}

	/**
	 * @return the allowSubEntity0Delete
	 */
	public String getAllowSubEntity0Delete() {
		return allowSubEntity0Delete;
	}

	/**
	 * @param allowSubEntity0Delete the allowSubEntity0Delete to set
	 */
	public void setAllowSubEntity0Delete(String allowSubEntity0Delete) {
		this.allowSubEntity0Delete = allowSubEntity0Delete;
	}

	/**
	 * @return the allowSubEntity1View
	 */
	public String getAllowSubEntity1View() {
		return allowSubEntity1View;
	}

	/**
	 * @param allowSubEntity1View the allowSubEntity1View to set
	 */
	public void setAllowSubEntity1View(String allowSubEntity1View) {
		this.allowSubEntity1View = allowSubEntity1View;
	}

	/**
	 * @return the allowSubEntity1Edit
	 */
	public String getAllowSubEntity1Edit() {
		return allowSubEntity1Edit;
	}

	/**
	 * @param allowSubEntity1Edit the allowSubEntity1Edit to set
	 */
	public void setAllowSubEntity1Edit(String allowSubEntity1Edit) {
		this.allowSubEntity1Edit = allowSubEntity1Edit;
	}

	/**
	 * @return the allowSubEntity1Delete
	 */
	public String getAllowSubEntity1Delete() {
		return allowSubEntity1Delete;
	}

	/**
	 * @param allowSubEntity1Delete the allowSubEntity1Delete to set
	 */
	public void setAllowSubEntity1Delete(String allowSubEntity1Delete) {
		this.allowSubEntity1Delete = allowSubEntity1Delete;
	}

	/**
	 * @return the allowSubEntity2View
	 */
	public String getAllowSubEntity2View() {
		return allowSubEntity2View;
	}

	/**
	 * @param allowSubEntity2View the allowSubEntity2View to set
	 */
	public void setAllowSubEntity2View(String allowSubEntity2View) {
		this.allowSubEntity2View = allowSubEntity2View;
	}

	/**
	 * @return the allowSubEntity2Edit
	 */
	public String getAllowSubEntity2Edit() {
		return allowSubEntity2Edit;
	}

	/**
	 * @param allowSubEntity2Edit the allowSubEntity2Edit to set
	 */
	public void setAllowSubEntity2Edit(String allowSubEntity2Edit) {
		this.allowSubEntity2Edit = allowSubEntity2Edit;
	}

	/**
	 * @return the allowSubEntity2Delete
	 */
	public String getAllowSubEntity2Delete() {
		return allowSubEntity2Delete;
	}

	/**
	 * @param allowSubEntity2Delete the allowSubEntity2Delete to set
	 */
	public void setAllowSubEntity2Delete(String allowSubEntity2Delete) {
		this.allowSubEntity2Delete = allowSubEntity2Delete;
	}

	/**
	 * @return the allowSubEntity3View
	 */
	public String getAllowSubEntity3View() {
		return allowSubEntity3View;
	}

	/**
	 * @param allowSubEntity3View the allowSubEntity3View to set
	 */
	public void setAllowSubEntity3View(String allowSubEntity3View) {
		this.allowSubEntity3View = allowSubEntity3View;
	}

	/**
	 * @return the allowSubEntity3Edit
	 */
	public String getAllowSubEntity3Edit() {
		return allowSubEntity3Edit;
	}

	/**
	 * @param allowSubEntity3Edit the allowSubEntity3Edit to set
	 */
	public void setAllowSubEntity3Edit(String allowSubEntity3Edit) {
		this.allowSubEntity3Edit = allowSubEntity3Edit;
	}

	/**
	 * @return the allowSubEntity3Delete
	 */
	public String getAllowSubEntity3Delete() {
		return allowSubEntity3Delete;
	}

	/**
	 * @param allowSubEntity3Delete the allowSubEntity3Delete to set
	 */
	public void setAllowSubEntity3Delete(String allowSubEntity3Delete) {
		this.allowSubEntity3Delete = allowSubEntity3Delete;
	}

	/**
	 * @return the allowSubEntity4View
	 */
	public String getAllowSubEntity4View() {
		return allowSubEntity4View;
	}

	/**
	 * @param allowSubEntity4View the allowSubEntity4View to set
	 */
	public void setAllowSubEntity4View(String allowSubEntity4View) {
		this.allowSubEntity4View = allowSubEntity4View;
	}

	/**
	 * @return the allowSubEntity4Edit
	 */
	public String getAllowSubEntity4Edit() {
		return allowSubEntity4Edit;
	}

	/**
	 * @param allowSubEntity4Edit the allowSubEntity4Edit to set
	 */
	public void setAllowSubEntity4Edit(String allowSubEntity4Edit) {
		this.allowSubEntity4Edit = allowSubEntity4Edit;
	}

	/**
	 * @return the allowSubEntity4Delete
	 */
	public String getAllowSubEntity4Delete() {
		return allowSubEntity4Delete;
	}

	/**
	 * @param allowSubEntity4Delete the allowSubEntity4Delete to set
	 */
	public void setAllowSubEntity4Delete(String allowSubEntity4Delete) {
		this.allowSubEntity4Delete = allowSubEntity4Delete;
	}

	/**
	 * @return the allowSubEntity5View
	 */
	public String getAllowSubEntity5View() {
		return allowSubEntity5View;
	}

	/**
	 * @param allowSubEntity5View the allowSubEntity5View to set
	 */
	public void setAllowSubEntity5View(String allowSubEntity5View) {
		this.allowSubEntity5View = allowSubEntity5View;
	}

	/**
	 * @return the allowSubEntity5Edit
	 */
	public String getAllowSubEntity5Edit() {
		return allowSubEntity5Edit;
	}

	/**
	 * @param allowSubEntity5Edit the allowSubEntity5Edit to set
	 */
	public void setAllowSubEntity5Edit(String allowSubEntity5Edit) {
		this.allowSubEntity5Edit = allowSubEntity5Edit;
	}

	/**
	 * @return the allowSubEntity5Delete
	 */
	public String getAllowSubEntity5Delete() {
		return allowSubEntity5Delete;
	}

	/**
	 * @param allowSubEntity5Delete the allowSubEntity5Delete to set
	 */
	public void setAllowSubEntity5Delete(String allowSubEntity5Delete) {
		this.allowSubEntity5Delete = allowSubEntity5Delete;
	}

	/**
	 * @return the allowSubEntity6View
	 */
	public String getAllowSubEntity6View() {
		return allowSubEntity6View;
	}

	/**
	 * @param allowSubEntity6View the allowSubEntity6View to set
	 */
	public void setAllowSubEntity6View(String allowSubEntity6View) {
		this.allowSubEntity6View = allowSubEntity6View;
	}

	/**
	 * @return the allowSubEntity6Edit
	 */
	public String getAllowSubEntity6Edit() {
		return allowSubEntity6Edit;
	}

	/**
	 * @param allowSubEntity6Edit the allowSubEntity6Edit to set
	 */
	public void setAllowSubEntity6Edit(String allowSubEntity6Edit) {
		this.allowSubEntity6Edit = allowSubEntity6Edit;
	}

	/**
	 * @return the allowSubEntity6Delete
	 */
	public String getAllowSubEntity6Delete() {
		return allowSubEntity6Delete;
	}

	/**
	 * @param allowSubEntity6Delete the allowSubEntity6Delete to set
	 */
	public void setAllowSubEntity6Delete(String allowSubEntity6Delete) {
		this.allowSubEntity6Delete = allowSubEntity6Delete;
	}

	/**
	 * @return the allowSubEntity7View
	 */
	public String getAllowSubEntity7View() {
		return allowSubEntity7View;
	}

	/**
	 * @param allowSubEntity7View the allowSubEntity7View to set
	 */
	public void setAllowSubEntity7View(String allowSubEntity7View) {
		this.allowSubEntity7View = allowSubEntity7View;
	}

	/**
	 * @return the allowSubEntity7Edit
	 */
	public String getAllowSubEntity7Edit() {
		return allowSubEntity7Edit;
	}

	/**
	 * @param allowSubEntity7Edit the allowSubEntity7Edit to set
	 */
	public void setAllowSubEntity7Edit(String allowSubEntity7Edit) {
		this.allowSubEntity7Edit = allowSubEntity7Edit;
	}

	/**
	 * @return the allowSubEntity7Delete
	 */
	public String getAllowSubEntity7Delete() {
		return allowSubEntity7Delete;
	}

	/**
	 * @param allowSubEntity7Delete the allowSubEntity7Delete to set
	 */
	public void setAllowSubEntity7Delete(String allowSubEntity7Delete) {
		this.allowSubEntity7Delete = allowSubEntity7Delete;
	}

	/**
	 * @return the allowSubEntity8View
	 */
	public String getAllowSubEntity8View() {
		return allowSubEntity8View;
	}

	/**
	 * @param allowSubEntity8View the allowSubEntity8View to set
	 */
	public void setAllowSubEntity8View(String allowSubEntity8View) {
		this.allowSubEntity8View = allowSubEntity8View;
	}

	/**
	 * @return the allowSubEntity8Edit
	 */
	public String getAllowSubEntity8Edit() {
		return allowSubEntity8Edit;
	}

	/**
	 * @param allowSubEntity8Edit the allowSubEntity8Edit to set
	 */
	public void setAllowSubEntity8Edit(String allowSubEntity8Edit) {
		this.allowSubEntity8Edit = allowSubEntity8Edit;
	}

	/**
	 * @return the allowSubEntity8Delete
	 */
	public String getAllowSubEntity8Delete() {
		return allowSubEntity8Delete;
	}

	/**
	 * @param allowSubEntity8Delete the allowSubEntity8Delete to set
	 */
	public void setAllowSubEntity8Delete(String allowSubEntity8Delete) {
		this.allowSubEntity8Delete = allowSubEntity8Delete;
	}

	/**
	 * @return the allowSubEntity9View
	 */
	public String getAllowSubEntity9View() {
		return allowSubEntity9View;
	}

	/**
	 * @param allowSubEntity9View the allowSubEntity9View to set
	 */
	public void setAllowSubEntity9View(String allowSubEntity9View) {
		this.allowSubEntity9View = allowSubEntity9View;
	}

	/**
	 * @return the allowSubEntity9Edit
	 */
	public String getAllowSubEntity9Edit() {
		return allowSubEntity9Edit;
	}

	/**
	 * @param allowSubEntity9Edit the allowSubEntity9Edit to set
	 */
	public void setAllowSubEntity9Edit(String allowSubEntity9Edit) {
		this.allowSubEntity9Edit = allowSubEntity9Edit;
	}

	/**
	 * @return the allowSubEntity9Delete
	 */
	public String getAllowSubEntity9Delete() {
		return allowSubEntity9Delete;
	}

	/**
	 * @param allowSubEntity9Delete the allowSubEntity9Delete to set
	 */
	public void setAllowSubEntity9Delete(String allowSubEntity9Delete) {
		this.allowSubEntity9Delete = allowSubEntity9Delete;
	}

	/**
	 * @return the allowUserGroupView
	 */
	public String getAllowUserGroupView() {
		return allowUserGroupView;
	}

	/**
	 * @param allowUserGroupView the allowUserGroupView to set
	 */
	public void setAllowUserGroupView(String allowUserGroupView) {
		this.allowUserGroupView = allowUserGroupView;
	}

	/**
	 * @return the allowUserGroupEdit
	 */
	public String getAllowUserGroupEdit() {
		return allowUserGroupEdit;
	}

	/**
	 * @param allowUserGroupEdit the allowUserGroupEdit to set
	 */
	public void setAllowUserGroupEdit(String allowUserGroupEdit) {
		this.allowUserGroupEdit = allowUserGroupEdit;
	}

	/**
	 * @return the allowUserGroupDelete
	 */
	public String getAllowUserGroupDelete() {
		return allowUserGroupDelete;
	}

	/**
	 * @param allowUserGroupDelete the allowUserGroupDelete to set
	 */
	public void setAllowUserGroupDelete(String allowUserGroupDelete) {
		this.allowUserGroupDelete = allowUserGroupDelete;
	}

	/**
	 * @return the allowUserView
	 */
	public String getAllowUserView() {
		return allowUserView;
	}

	/**
	 * @param allowUserView the allowUserView to set
	 */
	public void setAllowUserView(String allowUserView) {
		this.allowUserView = allowUserView;
	}

	/**
	 * @return the allowUserEdit
	 */
	public String getAllowUserEdit() {
		return allowUserEdit;
	}

	/**
	 * @param allowUserEdit the allowUserEdit to set
	 */
	public void setAllowUserEdit(String allowUserEdit) {
		this.allowUserEdit = allowUserEdit;
	}

	/**
	 * @return the allowUserDelete
	 */
	public String getAllowUserDelete() {
		return allowUserDelete;
	}

	/**
	 * @param allowUserDelete the allowUserDelete to set
	 */
	public void setAllowUserDelete(String allowUserDelete) {
		this.allowUserDelete = allowUserDelete;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime
				* result
				+ ((allowEnterpriseDelete == null) ? 0 : allowEnterpriseDelete
						.hashCode());
		result = prime
				* result
				+ ((allowEnterpriseEdit == null) ? 0 : allowEnterpriseEdit
						.hashCode());
		result = prime
				* result
				+ ((allowEnterpriseView == null) ? 0 : allowEnterpriseView
						.hashCode());
		result = prime
				* result
				+ ((allowEntity0Delete == null) ? 0 : allowEntity0Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity0Edit == null) ? 0 : allowEntity0Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity0View == null) ? 0 : allowEntity0View.hashCode());
		result = prime
				* result
				+ ((allowEntity1Delete == null) ? 0 : allowEntity1Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity1Edit == null) ? 0 : allowEntity1Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity1View == null) ? 0 : allowEntity1View.hashCode());
		result = prime
				* result
				+ ((allowEntity2Delete == null) ? 0 : allowEntity2Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity2Edit == null) ? 0 : allowEntity2Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity2View == null) ? 0 : allowEntity2View.hashCode());
		result = prime
				* result
				+ ((allowEntity3Delete == null) ? 0 : allowEntity3Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity3Edit == null) ? 0 : allowEntity3Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity3View == null) ? 0 : allowEntity3View.hashCode());
		result = prime
				* result
				+ ((allowEntity4Delete == null) ? 0 : allowEntity4Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity4Edit == null) ? 0 : allowEntity4Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity4View == null) ? 0 : allowEntity4View.hashCode());
		result = prime
				* result
				+ ((allowEntity5Delete == null) ? 0 : allowEntity5Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity5Edit == null) ? 0 : allowEntity5Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity5View == null) ? 0 : allowEntity5View.hashCode());
		result = prime
				* result
				+ ((allowEntity6Delete == null) ? 0 : allowEntity6Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity6Edit == null) ? 0 : allowEntity6Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity6View == null) ? 0 : allowEntity6View.hashCode());
		result = prime
				* result
				+ ((allowEntity7Delete == null) ? 0 : allowEntity7Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity7Edit == null) ? 0 : allowEntity7Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity7View == null) ? 0 : allowEntity7View.hashCode());
		result = prime
				* result
				+ ((allowEntity8Delete == null) ? 0 : allowEntity8Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity8Edit == null) ? 0 : allowEntity8Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity8View == null) ? 0 : allowEntity8View.hashCode());
		result = prime
				* result
				+ ((allowEntity9Delete == null) ? 0 : allowEntity9Delete
						.hashCode());
		result = prime
				* result
				+ ((allowEntity9Edit == null) ? 0 : allowEntity9Edit.hashCode());
		result = prime
				* result
				+ ((allowEntity9View == null) ? 0 : allowEntity9View.hashCode());
		result = prime
				* result
				+ ((allowSubEntity0Delete == null) ? 0 : allowSubEntity0Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity0Edit == null) ? 0 : allowSubEntity0Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity0View == null) ? 0 : allowSubEntity0View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity1Delete == null) ? 0 : allowSubEntity1Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity1Edit == null) ? 0 : allowSubEntity1Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity1View == null) ? 0 : allowSubEntity1View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity2Delete == null) ? 0 : allowSubEntity2Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity2Edit == null) ? 0 : allowSubEntity2Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity2View == null) ? 0 : allowSubEntity2View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity3Delete == null) ? 0 : allowSubEntity3Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity3Edit == null) ? 0 : allowSubEntity3Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity3View == null) ? 0 : allowSubEntity3View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity4Delete == null) ? 0 : allowSubEntity4Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity4Edit == null) ? 0 : allowSubEntity4Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity4View == null) ? 0 : allowSubEntity4View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity5Delete == null) ? 0 : allowSubEntity5Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity5Edit == null) ? 0 : allowSubEntity5Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity5View == null) ? 0 : allowSubEntity5View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity6Delete == null) ? 0 : allowSubEntity6Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity6Edit == null) ? 0 : allowSubEntity6Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity6View == null) ? 0 : allowSubEntity6View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity7Delete == null) ? 0 : allowSubEntity7Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity7Edit == null) ? 0 : allowSubEntity7Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity7View == null) ? 0 : allowSubEntity7View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity8Delete == null) ? 0 : allowSubEntity8Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity8Edit == null) ? 0 : allowSubEntity8Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity8View == null) ? 0 : allowSubEntity8View
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity9Delete == null) ? 0 : allowSubEntity9Delete
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity9Edit == null) ? 0 : allowSubEntity9Edit
						.hashCode());
		result = prime
				* result
				+ ((allowSubEntity9View == null) ? 0 : allowSubEntity9View
						.hashCode());
		result = prime * result
				+ ((allowUserDelete == null) ? 0 : allowUserDelete.hashCode());
		result = prime * result
				+ ((allowUserEdit == null) ? 0 : allowUserEdit.hashCode());
		result = prime
				* result
				+ ((allowUserGroupDelete == null) ? 0 : allowUserGroupDelete
						.hashCode());
		result = prime
				* result
				+ ((allowUserGroupEdit == null) ? 0 : allowUserGroupEdit
						.hashCode());
		result = prime
				* result
				+ ((allowUserGroupView == null) ? 0 : allowUserGroupView
						.hashCode());
		result = prime * result
				+ ((allowUserView == null) ? 0 : allowUserView.hashCode());
		result = prime * result + Arrays.hashCode(barcode);
		result = prime * result
				+ ((barcodeCode == null) ? 0 : barcodeCode.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + (deleted ? 1231 : 1237);
		result = prime * result
				+ ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + (hasNotes ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (multilingual ? 1231 : 1237);
		result = prime * result + (purgable ? 1231 : 1237);
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ACode)) {
			return false;
		}
		ACode other = (ACode) obj;
		if (active != other.active) {
			return false;
		}
		if (allowEnterpriseDelete == null) {
			if (other.allowEnterpriseDelete != null) {
				return false;
			}
		} else if (!allowEnterpriseDelete.equals(other.allowEnterpriseDelete)) {
			return false;
		}
		if (allowEnterpriseEdit == null) {
			if (other.allowEnterpriseEdit != null) {
				return false;
			}
		} else if (!allowEnterpriseEdit.equals(other.allowEnterpriseEdit)) {
			return false;
		}
		if (allowEnterpriseView == null) {
			if (other.allowEnterpriseView != null) {
				return false;
			}
		} else if (!allowEnterpriseView.equals(other.allowEnterpriseView)) {
			return false;
		}
		if (allowEntity0Delete == null) {
			if (other.allowEntity0Delete != null) {
				return false;
			}
		} else if (!allowEntity0Delete.equals(other.allowEntity0Delete)) {
			return false;
		}
		if (allowEntity0Edit == null) {
			if (other.allowEntity0Edit != null) {
				return false;
			}
		} else if (!allowEntity0Edit.equals(other.allowEntity0Edit)) {
			return false;
		}
		if (allowEntity0View == null) {
			if (other.allowEntity0View != null) {
				return false;
			}
		} else if (!allowEntity0View.equals(other.allowEntity0View)) {
			return false;
		}
		if (allowEntity1Delete == null) {
			if (other.allowEntity1Delete != null) {
				return false;
			}
		} else if (!allowEntity1Delete.equals(other.allowEntity1Delete)) {
			return false;
		}
		if (allowEntity1Edit == null) {
			if (other.allowEntity1Edit != null) {
				return false;
			}
		} else if (!allowEntity1Edit.equals(other.allowEntity1Edit)) {
			return false;
		}
		if (allowEntity1View == null) {
			if (other.allowEntity1View != null) {
				return false;
			}
		} else if (!allowEntity1View.equals(other.allowEntity1View)) {
			return false;
		}
		if (allowEntity2Delete == null) {
			if (other.allowEntity2Delete != null) {
				return false;
			}
		} else if (!allowEntity2Delete.equals(other.allowEntity2Delete)) {
			return false;
		}
		if (allowEntity2Edit == null) {
			if (other.allowEntity2Edit != null) {
				return false;
			}
		} else if (!allowEntity2Edit.equals(other.allowEntity2Edit)) {
			return false;
		}
		if (allowEntity2View == null) {
			if (other.allowEntity2View != null) {
				return false;
			}
		} else if (!allowEntity2View.equals(other.allowEntity2View)) {
			return false;
		}
		if (allowEntity3Delete == null) {
			if (other.allowEntity3Delete != null) {
				return false;
			}
		} else if (!allowEntity3Delete.equals(other.allowEntity3Delete)) {
			return false;
		}
		if (allowEntity3Edit == null) {
			if (other.allowEntity3Edit != null) {
				return false;
			}
		} else if (!allowEntity3Edit.equals(other.allowEntity3Edit)) {
			return false;
		}
		if (allowEntity3View == null) {
			if (other.allowEntity3View != null) {
				return false;
			}
		} else if (!allowEntity3View.equals(other.allowEntity3View)) {
			return false;
		}
		if (allowEntity4Delete == null) {
			if (other.allowEntity4Delete != null) {
				return false;
			}
		} else if (!allowEntity4Delete.equals(other.allowEntity4Delete)) {
			return false;
		}
		if (allowEntity4Edit == null) {
			if (other.allowEntity4Edit != null) {
				return false;
			}
		} else if (!allowEntity4Edit.equals(other.allowEntity4Edit)) {
			return false;
		}
		if (allowEntity4View == null) {
			if (other.allowEntity4View != null) {
				return false;
			}
		} else if (!allowEntity4View.equals(other.allowEntity4View)) {
			return false;
		}
		if (allowEntity5Delete == null) {
			if (other.allowEntity5Delete != null) {
				return false;
			}
		} else if (!allowEntity5Delete.equals(other.allowEntity5Delete)) {
			return false;
		}
		if (allowEntity5Edit == null) {
			if (other.allowEntity5Edit != null) {
				return false;
			}
		} else if (!allowEntity5Edit.equals(other.allowEntity5Edit)) {
			return false;
		}
		if (allowEntity5View == null) {
			if (other.allowEntity5View != null) {
				return false;
			}
		} else if (!allowEntity5View.equals(other.allowEntity5View)) {
			return false;
		}
		if (allowEntity6Delete == null) {
			if (other.allowEntity6Delete != null) {
				return false;
			}
		} else if (!allowEntity6Delete.equals(other.allowEntity6Delete)) {
			return false;
		}
		if (allowEntity6Edit == null) {
			if (other.allowEntity6Edit != null) {
				return false;
			}
		} else if (!allowEntity6Edit.equals(other.allowEntity6Edit)) {
			return false;
		}
		if (allowEntity6View == null) {
			if (other.allowEntity6View != null) {
				return false;
			}
		} else if (!allowEntity6View.equals(other.allowEntity6View)) {
			return false;
		}
		if (allowEntity7Delete == null) {
			if (other.allowEntity7Delete != null) {
				return false;
			}
		} else if (!allowEntity7Delete.equals(other.allowEntity7Delete)) {
			return false;
		}
		if (allowEntity7Edit == null) {
			if (other.allowEntity7Edit != null) {
				return false;
			}
		} else if (!allowEntity7Edit.equals(other.allowEntity7Edit)) {
			return false;
		}
		if (allowEntity7View == null) {
			if (other.allowEntity7View != null) {
				return false;
			}
		} else if (!allowEntity7View.equals(other.allowEntity7View)) {
			return false;
		}
		if (allowEntity8Delete == null) {
			if (other.allowEntity8Delete != null) {
				return false;
			}
		} else if (!allowEntity8Delete.equals(other.allowEntity8Delete)) {
			return false;
		}
		if (allowEntity8Edit == null) {
			if (other.allowEntity8Edit != null) {
				return false;
			}
		} else if (!allowEntity8Edit.equals(other.allowEntity8Edit)) {
			return false;
		}
		if (allowEntity8View == null) {
			if (other.allowEntity8View != null) {
				return false;
			}
		} else if (!allowEntity8View.equals(other.allowEntity8View)) {
			return false;
		}
		if (allowEntity9Delete == null) {
			if (other.allowEntity9Delete != null) {
				return false;
			}
		} else if (!allowEntity9Delete.equals(other.allowEntity9Delete)) {
			return false;
		}
		if (allowEntity9Edit == null) {
			if (other.allowEntity9Edit != null) {
				return false;
			}
		} else if (!allowEntity9Edit.equals(other.allowEntity9Edit)) {
			return false;
		}
		if (allowEntity9View == null) {
			if (other.allowEntity9View != null) {
				return false;
			}
		} else if (!allowEntity9View.equals(other.allowEntity9View)) {
			return false;
		}
		if (allowSubEntity0Delete == null) {
			if (other.allowSubEntity0Delete != null) {
				return false;
			}
		} else if (!allowSubEntity0Delete.equals(other.allowSubEntity0Delete)) {
			return false;
		}
		if (allowSubEntity0Edit == null) {
			if (other.allowSubEntity0Edit != null) {
				return false;
			}
		} else if (!allowSubEntity0Edit.equals(other.allowSubEntity0Edit)) {
			return false;
		}
		if (allowSubEntity0View == null) {
			if (other.allowSubEntity0View != null) {
				return false;
			}
		} else if (!allowSubEntity0View.equals(other.allowSubEntity0View)) {
			return false;
		}
		if (allowSubEntity1Delete == null) {
			if (other.allowSubEntity1Delete != null) {
				return false;
			}
		} else if (!allowSubEntity1Delete.equals(other.allowSubEntity1Delete)) {
			return false;
		}
		if (allowSubEntity1Edit == null) {
			if (other.allowSubEntity1Edit != null) {
				return false;
			}
		} else if (!allowSubEntity1Edit.equals(other.allowSubEntity1Edit)) {
			return false;
		}
		if (allowSubEntity1View == null) {
			if (other.allowSubEntity1View != null) {
				return false;
			}
		} else if (!allowSubEntity1View.equals(other.allowSubEntity1View)) {
			return false;
		}
		if (allowSubEntity2Delete == null) {
			if (other.allowSubEntity2Delete != null) {
				return false;
			}
		} else if (!allowSubEntity2Delete.equals(other.allowSubEntity2Delete)) {
			return false;
		}
		if (allowSubEntity2Edit == null) {
			if (other.allowSubEntity2Edit != null) {
				return false;
			}
		} else if (!allowSubEntity2Edit.equals(other.allowSubEntity2Edit)) {
			return false;
		}
		if (allowSubEntity2View == null) {
			if (other.allowSubEntity2View != null) {
				return false;
			}
		} else if (!allowSubEntity2View.equals(other.allowSubEntity2View)) {
			return false;
		}
		if (allowSubEntity3Delete == null) {
			if (other.allowSubEntity3Delete != null) {
				return false;
			}
		} else if (!allowSubEntity3Delete.equals(other.allowSubEntity3Delete)) {
			return false;
		}
		if (allowSubEntity3Edit == null) {
			if (other.allowSubEntity3Edit != null) {
				return false;
			}
		} else if (!allowSubEntity3Edit.equals(other.allowSubEntity3Edit)) {
			return false;
		}
		if (allowSubEntity3View == null) {
			if (other.allowSubEntity3View != null) {
				return false;
			}
		} else if (!allowSubEntity3View.equals(other.allowSubEntity3View)) {
			return false;
		}
		if (allowSubEntity4Delete == null) {
			if (other.allowSubEntity4Delete != null) {
				return false;
			}
		} else if (!allowSubEntity4Delete.equals(other.allowSubEntity4Delete)) {
			return false;
		}
		if (allowSubEntity4Edit == null) {
			if (other.allowSubEntity4Edit != null) {
				return false;
			}
		} else if (!allowSubEntity4Edit.equals(other.allowSubEntity4Edit)) {
			return false;
		}
		if (allowSubEntity4View == null) {
			if (other.allowSubEntity4View != null) {
				return false;
			}
		} else if (!allowSubEntity4View.equals(other.allowSubEntity4View)) {
			return false;
		}
		if (allowSubEntity5Delete == null) {
			if (other.allowSubEntity5Delete != null) {
				return false;
			}
		} else if (!allowSubEntity5Delete.equals(other.allowSubEntity5Delete)) {
			return false;
		}
		if (allowSubEntity5Edit == null) {
			if (other.allowSubEntity5Edit != null) {
				return false;
			}
		} else if (!allowSubEntity5Edit.equals(other.allowSubEntity5Edit)) {
			return false;
		}
		if (allowSubEntity5View == null) {
			if (other.allowSubEntity5View != null) {
				return false;
			}
		} else if (!allowSubEntity5View.equals(other.allowSubEntity5View)) {
			return false;
		}
		if (allowSubEntity6Delete == null) {
			if (other.allowSubEntity6Delete != null) {
				return false;
			}
		} else if (!allowSubEntity6Delete.equals(other.allowSubEntity6Delete)) {
			return false;
		}
		if (allowSubEntity6Edit == null) {
			if (other.allowSubEntity6Edit != null) {
				return false;
			}
		} else if (!allowSubEntity6Edit.equals(other.allowSubEntity6Edit)) {
			return false;
		}
		if (allowSubEntity6View == null) {
			if (other.allowSubEntity6View != null) {
				return false;
			}
		} else if (!allowSubEntity6View.equals(other.allowSubEntity6View)) {
			return false;
		}
		if (allowSubEntity7Delete == null) {
			if (other.allowSubEntity7Delete != null) {
				return false;
			}
		} else if (!allowSubEntity7Delete.equals(other.allowSubEntity7Delete)) {
			return false;
		}
		if (allowSubEntity7Edit == null) {
			if (other.allowSubEntity7Edit != null) {
				return false;
			}
		} else if (!allowSubEntity7Edit.equals(other.allowSubEntity7Edit)) {
			return false;
		}
		if (allowSubEntity7View == null) {
			if (other.allowSubEntity7View != null) {
				return false;
			}
		} else if (!allowSubEntity7View.equals(other.allowSubEntity7View)) {
			return false;
		}
		if (allowSubEntity8Delete == null) {
			if (other.allowSubEntity8Delete != null) {
				return false;
			}
		} else if (!allowSubEntity8Delete.equals(other.allowSubEntity8Delete)) {
			return false;
		}
		if (allowSubEntity8Edit == null) {
			if (other.allowSubEntity8Edit != null) {
				return false;
			}
		} else if (!allowSubEntity8Edit.equals(other.allowSubEntity8Edit)) {
			return false;
		}
		if (allowSubEntity8View == null) {
			if (other.allowSubEntity8View != null) {
				return false;
			}
		} else if (!allowSubEntity8View.equals(other.allowSubEntity8View)) {
			return false;
		}
		if (allowSubEntity9Delete == null) {
			if (other.allowSubEntity9Delete != null) {
				return false;
			}
		} else if (!allowSubEntity9Delete.equals(other.allowSubEntity9Delete)) {
			return false;
		}
		if (allowSubEntity9Edit == null) {
			if (other.allowSubEntity9Edit != null) {
				return false;
			}
		} else if (!allowSubEntity9Edit.equals(other.allowSubEntity9Edit)) {
			return false;
		}
		if (allowSubEntity9View == null) {
			if (other.allowSubEntity9View != null) {
				return false;
			}
		} else if (!allowSubEntity9View.equals(other.allowSubEntity9View)) {
			return false;
		}
		if (allowUserDelete == null) {
			if (other.allowUserDelete != null) {
				return false;
			}
		} else if (!allowUserDelete.equals(other.allowUserDelete)) {
			return false;
		}
		if (allowUserEdit == null) {
			if (other.allowUserEdit != null) {
				return false;
			}
		} else if (!allowUserEdit.equals(other.allowUserEdit)) {
			return false;
		}
		if (allowUserGroupDelete == null) {
			if (other.allowUserGroupDelete != null) {
				return false;
			}
		} else if (!allowUserGroupDelete.equals(other.allowUserGroupDelete)) {
			return false;
		}
		if (allowUserGroupEdit == null) {
			if (other.allowUserGroupEdit != null) {
				return false;
			}
		} else if (!allowUserGroupEdit.equals(other.allowUserGroupEdit)) {
			return false;
		}
		if (allowUserGroupView == null) {
			if (other.allowUserGroupView != null) {
				return false;
			}
		} else if (!allowUserGroupView.equals(other.allowUserGroupView)) {
			return false;
		}
		if (allowUserView == null) {
			if (other.allowUserView != null) {
				return false;
			}
		} else if (!allowUserView.equals(other.allowUserView)) {
			return false;
		}
		if (!Arrays.equals(barcode, other.barcode)) {
			return false;
		}
		if (barcodeCode == null) {
			if (other.barcodeCode != null) {
				return false;
			}
		} else if (!barcodeCode.equals(other.barcodeCode)) {
			return false;
		}
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		if (deleted != other.deleted) {
			return false;
		}
		if (expireDate == null) {
			if (other.expireDate != null) {
				return false;
			}
		} else if (!expireDate.equals(other.expireDate)) {
			return false;
		}
		if (hasNotes != other.hasNotes) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (multilingual != other.multilingual) {
			return false;
		}
		if (purgable != other.purgable) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		return true;
	}

    
}
