package com.mais.base.language;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: DTO</p>
 * <p>Description: data transfer object short data.</p>
 * This class implements to be transferable short data.
 *  <P>
 *  It served as short data transferable object.
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public abstract class DTO implements Serializable {
    private static final long serialVersionUID = 973236732275993234L;
//  Cannot use logger with Serializable objects.

    private long id = -1;

    private String code;
    private String shortName;
    private String description;

    private boolean multilingual = false;
    private List<Description> lingualDescription;

    private String barcodeCode;

    private boolean hasNotes = false;
    private List<Note> noteList;

	private boolean deleted = false;
	private boolean purgable = false;
    private boolean active = true;
    private long startDate = -1;
    private long expireDate = -1;
//    @Temporal(TemporalType.DATE)
//    private Calendar startDate = Calendar.getInstance();
//    @Temporal(TemporalType.DATE)
//    private Calendar expireDate = Calendar.getInstance();
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

    // From AMain
    private short createSite = -1;
    private long createUser = -1;
    private long createDate = -1;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Calendar createDate = Calendar.getInstance();

    private long updateUser = -1;
    private long updateDate = -1;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Calendar updateDate = Calendar.getInstance();

	private Boolean replicate = false;
	private String replicateSite;

    private boolean selected = false;

    /**
     * Creates a new instance of DTO
     */
    public DTO() {
    	lingualDescription = new ArrayList<Description>();
    	noteList = new ArrayList<Note>();
    }

    public DTO(DTO data) {
    	copy(data);
    }

    public void clear() {
    	id = -1;
    	code = null;
    	shortName = null;
    	description = null;
    	multilingual = false;
    	lingualDescription = new ArrayList<Description>();
    	barcodeCode = null;
    	hasNotes = false;
    	noteList = new ArrayList<Note>();
    	deleted = false;
    	purgable = false;
    	active = true;
    	startDate = -1;
    	expireDate = -1;
    	createSite = -1;
    	createUser = -1;
    	createDate = -1;
    	updateUser = -1;
    	updateDate = -1;
    	replicate = false;
    	replicateSite = null;
    	selected = false;

        allowEnterpriseView = null;
        allowEnterpriseEdit = null;
        allowEnterpriseDelete = null;
        allowEntity0View = null;
        allowEntity0Edit = null;
        allowEntity0Delete = null;
        allowEntity1View = null;
        allowEntity1Edit = null;
        allowEntity1Delete = null;
        allowEntity2View = null;
        allowEntity2Edit = null;
        allowEntity2Delete = null;
        allowEntity3View = null;
        allowEntity3Edit = null;
        allowEntity3Delete = null;
        allowEntity4View = null;
        allowEntity4Edit = null;
        allowEntity4Delete = null;
        allowEntity5View = null;
        allowEntity5Edit = null;
        allowEntity5Delete = null;
        allowEntity6View = null;
        allowEntity6Edit = null;
        allowEntity6Delete = null;
        allowEntity7View = null;
        allowEntity7Edit = null;
        allowEntity7Delete = null;
        allowEntity8View = null;
        allowEntity8Edit = null;
        allowEntity8Delete = null;
        allowEntity9View = null;
        allowEntity9Edit = null;
        allowEntity9Delete = null;
        allowSubEntity0View = null;
        allowSubEntity0Edit = null;
        allowSubEntity0Delete = null;
        allowSubEntity1View = null;
        allowSubEntity1Edit = null;
        allowSubEntity1Delete = null;
        allowSubEntity2View = null;
        allowSubEntity2Edit = null;
        allowSubEntity2Delete = null;
        allowSubEntity3View = null;
        allowSubEntity3Edit = null;
        allowSubEntity3Delete = null;
        allowSubEntity4View = null;
        allowSubEntity4Edit = null;
        allowSubEntity4Delete = null;
        allowSubEntity5View = null;
        allowSubEntity5Edit = null;
        allowSubEntity5Delete = null;
        allowSubEntity6View = null;
        allowSubEntity6Edit = null;
        allowSubEntity6Delete = null;
        allowSubEntity7View = null;
        allowSubEntity7Edit = null;
        allowSubEntity7Delete = null;
        allowSubEntity8View = null;
        allowSubEntity8Edit = null;
        allowSubEntity8Delete = null;
        allowSubEntity9View = null;
        allowSubEntity9Edit = null;
        allowSubEntity9Delete = null;
        allowUserGroupView = null;
        allowUserGroupEdit = null;
        allowUserGroupDelete = null;
        allowUserView = null;
        allowUserEdit = null;
        allowUserDelete = null;
    }

    protected boolean _copyDTO(DTO data) {
    	if (data == null)
    		return false;
    	clear();
    	setId(data.getId());
        setCode(data.getCode());
        setShortName(data.getShortName());
        setDescription(data.getDescription());
        setMultilingual(data.isMultilingual());
        setLingualDescription(data.getLingualDescription());
        setHasNotes(data.isHasNotes());
        setNoteList(data.getNoteList());

        setDeleted(data.isDeleted());
        setPurgable(data.isPurgable());
        setActive(data.isActive());
        setStartDate(data.getStartDate());
        setExpireDate(data.getExpireDate());
        
        setAllowEnterpriseView(data.getAllowEnterpriseView());
        setAllowEnterpriseEdit(data.getAllowEnterpriseEdit());
        setAllowEnterpriseDelete(data.getAllowEnterpriseDelete());
        setAllowEntity0View(data.getAllowEntity0View());
        setAllowEntity0Edit(data.getAllowEntity0Edit());
        setAllowEntity0Delete(data.getAllowEntity0Delete());        
        setAllowEntity1View(data.getAllowEntity1View());
        setAllowEntity1Edit(data.getAllowEntity1Edit());
        setAllowEntity1Delete(data.getAllowEntity1Delete());        
        setAllowEntity2View(data.getAllowEntity2View());
        setAllowEntity2Edit(data.getAllowEntity2Edit());
        setAllowEntity2Delete(data.getAllowEntity2Delete());        
        setAllowEntity3View(data.getAllowEntity3View());
        setAllowEntity3Edit(data.getAllowEntity3Edit());
        setAllowEntity3Delete(data.getAllowEntity3Delete());        
        setAllowEntity4View(data.getAllowEntity4View());
        setAllowEntity4Edit(data.getAllowEntity4Edit());
        setAllowEntity4Delete(data.getAllowEntity4Delete());        
        setAllowEntity5View(data.getAllowEntity5View());
        setAllowEntity5Edit(data.getAllowEntity5Edit());
        setAllowEntity5Delete(data.getAllowEntity5Delete());        
        setAllowEntity6View(data.getAllowEntity6View());
        setAllowEntity6Edit(data.getAllowEntity6Edit());
        setAllowEntity6Delete(data.getAllowEntity6Delete());        
        setAllowEntity7View(data.getAllowEntity7View());
        setAllowEntity7Edit(data.getAllowEntity7Edit());
        setAllowEntity7Delete(data.getAllowEntity7Delete());        
        setAllowEntity8View(data.getAllowEntity8View());
        setAllowEntity8Edit(data.getAllowEntity8Edit());
        setAllowEntity8Delete(data.getAllowEntity8Delete());        
        setAllowEntity9View(data.getAllowEntity9View());
        setAllowEntity9Edit(data.getAllowEntity9Edit());
        setAllowEntity9Delete(data.getAllowEntity9Delete());        
        setAllowSubEntity0View(data.getAllowSubEntity0View());
        setAllowSubEntity0Edit(data.getAllowSubEntity0Edit());
        setAllowSubEntity0Delete(data.getAllowSubEntity0Delete());        
        setAllowSubEntity1View(data.getAllowSubEntity1View());
        setAllowSubEntity1Edit(data.getAllowSubEntity1Edit());
        setAllowSubEntity1Delete(data.getAllowSubEntity1Delete());        
        setAllowSubEntity2View(data.getAllowSubEntity2View());
        setAllowSubEntity2Edit(data.getAllowSubEntity2Edit());
        setAllowSubEntity2Delete(data.getAllowSubEntity2Delete());        
        setAllowSubEntity3View(data.getAllowSubEntity3View());
        setAllowSubEntity3Edit(data.getAllowSubEntity3Edit());
        setAllowSubEntity3Delete(data.getAllowSubEntity3Delete());        
        setAllowSubEntity4View(data.getAllowSubEntity4View());
        setAllowSubEntity4Edit(data.getAllowSubEntity4Edit());
        setAllowSubEntity4Delete(data.getAllowSubEntity4Delete());        
        setAllowSubEntity5View(data.getAllowSubEntity5View());
        setAllowSubEntity5Edit(data.getAllowSubEntity5Edit());
        setAllowSubEntity5Delete(data.getAllowSubEntity5Delete());        
        setAllowSubEntity6View(data.getAllowSubEntity6View());
        setAllowSubEntity6Edit(data.getAllowSubEntity6Edit());
        setAllowSubEntity6Delete(data.getAllowSubEntity6Delete());        
        setAllowSubEntity7View(data.getAllowSubEntity7View());
        setAllowSubEntity7Edit(data.getAllowSubEntity7Edit());
        setAllowSubEntity7Delete(data.getAllowSubEntity7Delete());        
        setAllowSubEntity8View(data.getAllowSubEntity8View());
        setAllowSubEntity8Edit(data.getAllowSubEntity8Edit());
        setAllowSubEntity8Delete(data.getAllowSubEntity8Delete());        
        setAllowSubEntity9View(data.getAllowSubEntity9View());
        setAllowSubEntity9Edit(data.getAllowSubEntity9Edit());
        setAllowSubEntity9Delete(data.getAllowSubEntity9Delete());        
        setAllowUserGroupView(data.getAllowUserGroupView());
        setAllowUserGroupEdit(data.getAllowUserGroupEdit());
        setAllowUserGroupDelete(data.getAllowUserGroupDelete());        
        setAllowUserView(data.getAllowUserView());
        setAllowUserEdit(data.getAllowUserEdit());
        setAllowUserDelete(data.getAllowUserDelete());        

        // From AMain
        setCreateSite(data.getCreateSite());
        setCreateUser(data.getCreateUser());
        setCreateDate(data.getCreateDate());
        setUpdateUser(data.getUpdateUser());
        setUpdateDate(data.getUpdateDate());
        setReplicate(data.getReplicate());
        setReplicateSite(data.getReplicateSite());

        return true;
    }

    /**
     * All the subclass should to call super._copy(DTO data) too!!
     * @param data
     * @return false if data is null
     */
	abstract public boolean copy(DTO data);

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
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the multilingual
	 */
	public boolean isMultilingual() {
		return multilingual;
	}

	/**
	 * @param multilingual the multilingual to set
	 */
	public void setMultilingual(boolean multilingual) {
		this.multilingual = multilingual;
	}

	/**
	 * @return the lingualDescription
	 */
	public List<Description> getLingualDescription() {
		return lingualDescription;
	}

	/**
	 * @param lingualDescription the lingualDescription to set
	 */
	public void setLingualDescription(List<Description> lingualDescription) {
		if (this.lingualDescription == null)
			this.lingualDescription = new ArrayList<Description>();
		this.lingualDescription.clear();
		if (lingualDescription == null)
			return;
		this.lingualDescription.addAll(lingualDescription);
	}

	/**
	 * @return the barcodeCode
	 */
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
	 * @return the hasNotes
	 */
	public boolean isHasNotes() {
		return hasNotes;
	}

	/**
	 * @param hasNotes the hasNotes to set
	 */
	public void setHasNotes(boolean hasNotes) {
		this.hasNotes = hasNotes;
	}

	/**
	 * @return the noteList
	 */
	public List<Note> getNoteList() {
		return noteList;
	}

	/**
	 * @param noteList the noteList to set
	 */
	public void setNoteList(List<Note> noteList) {
		if (this.noteList == null)
			this.noteList = new ArrayList<Note>();
		this.noteList.clear();
		if (noteList == null)
			return;
		this.noteList.addAll(noteList);
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
	 * @return the startDate
	 */
	public long getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the expireDate
	 */
	public long getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(long expireDate) {
		this.expireDate = expireDate;
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

	/**
	 * @return the createSite
	 */
	public short getCreateSite() {
		return createSite;
	}

	/**
	 * @param createSite the createSite to set
	 */
	public void setCreateSite(short createSite) {
		this.createSite = createSite;
	}

	/**
	 * @return the createUser
	 */
	public long getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(long createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return the createDate
	 */
	public long getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the updateUser
	 */
	public long getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(long updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @return the updateDate
	 */
	public long getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(long updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the replicate
	 */
	public Boolean getReplicate() {
		return replicate;
	}

	/**
	 * @param replicate the replicate to set
	 */
	public void setReplicate(Boolean replicate) {
		this.replicate = replicate;
	}

	/**
	 * @return the replicateSite
	 */
	public String getReplicateSite() {
		return replicateSite;
	}

	/**
	 * @param replicateSite the replicateSite to set
	 */
	public void setReplicateSite(String replicateSite) {
		this.replicateSite = replicateSite;
	}

	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
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
		result = prime * result
				+ ((barcodeCode == null) ? 0 : barcodeCode.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + (int) (createDate ^ (createDate >>> 32));
		result = prime * result + createSite;
		result = prime * result + (int) (createUser ^ (createUser >>> 32));
		result = prime * result + (deleted ? 1231 : 1237);
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (expireDate ^ (expireDate >>> 32));
		result = prime * result + (hasNotes ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime
				* result
				+ ((lingualDescription == null) ? 0 : lingualDescription
						.hashCode());
		result = prime * result + (multilingual ? 1231 : 1237);
		result = prime * result
				+ ((noteList == null) ? 0 : noteList.hashCode());
		result = prime * result + (purgable ? 1231 : 1237);
		result = prime * result
				+ ((replicate == null) ? 0 : replicate.hashCode());
		result = prime * result
				+ ((replicateSite == null) ? 0 : replicateSite.hashCode());
		result = prime * result + (selected ? 1231 : 1237);
		result = prime * result
				+ ((shortName == null) ? 0 : shortName.hashCode());
		result = prime * result + (int) (startDate ^ (startDate >>> 32));
		result = prime * result + (int) (updateDate ^ (updateDate >>> 32));
		result = prime * result + (int) (updateUser ^ (updateUser >>> 32));
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
		if (!(obj instanceof DTO)) {
			return false;
		}
		DTO other = (DTO) obj;
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
		if (createDate != other.createDate) {
			return false;
		}
		if (createSite != other.createSite) {
			return false;
		}
		if (createUser != other.createUser) {
			return false;
		}
		if (deleted != other.deleted) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (expireDate != other.expireDate) {
			return false;
		}
		if (hasNotes != other.hasNotes) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (lingualDescription == null) {
			if (other.lingualDescription != null) {
				return false;
			}
		} else if (!lingualDescription.equals(other.lingualDescription)) {
			return false;
		}
		if (multilingual != other.multilingual) {
			return false;
		}
		if (noteList == null) {
			if (other.noteList != null) {
				return false;
			}
		} else if (!noteList.equals(other.noteList)) {
			return false;
		}
		if (purgable != other.purgable) {
			return false;
		}
		if (replicate == null) {
			if (other.replicate != null) {
				return false;
			}
		} else if (!replicate.equals(other.replicate)) {
			return false;
		}
		if (replicateSite == null) {
			if (other.replicateSite != null) {
				return false;
			}
		} else if (!replicateSite.equals(other.replicateSite)) {
			return false;
		}
		if (selected != other.selected) {
			return false;
		}
		if (shortName == null) {
			if (other.shortName != null) {
				return false;
			}
		} else if (!shortName.equals(other.shortName)) {
			return false;
		}
		if (startDate != other.startDate) {
			return false;
		}
		if (updateDate != other.updateDate) {
			return false;
		}
		if (updateUser != other.updateUser) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DTO [id=" + id + ", code=" + code + ", shortName=" + shortName
				+ ", description=" + description + ", multilingual="
				+ multilingual + ", lingualDescription=" + lingualDescription
				+ ", barcodeCode=" + barcodeCode + ", hasNotes=" + hasNotes
				+ ", noteList=" + noteList + ", deleted=" + deleted
				+ ", purgable=" + purgable + ", active=" + active
				+ ", startDate=" + startDate + ", expireDate=" + expireDate
				+ ", allowEnterpriseView=" + allowEnterpriseView
				+ ", allowEnterpriseEdit=" + allowEnterpriseEdit
				+ ", allowEnterpriseDelete=" + allowEnterpriseDelete
				+ ", allowEntity0View=" + allowEntity0View
				+ ", allowEntity0Edit=" + allowEntity0Edit
				+ ", allowEntity0Delete=" + allowEntity0Delete
				+ ", allowEntity1View=" + allowEntity1View
				+ ", allowEntity1Edit=" + allowEntity1Edit
				+ ", allowEntity1Delete=" + allowEntity1Delete
				+ ", allowEntity2View=" + allowEntity2View
				+ ", allowEntity2Edit=" + allowEntity2Edit
				+ ", allowEntity2Delete=" + allowEntity2Delete
				+ ", allowEntity3View=" + allowEntity3View
				+ ", allowEntity3Edit=" + allowEntity3Edit
				+ ", allowEntity3Delete=" + allowEntity3Delete
				+ ", allowEntity4View=" + allowEntity4View
				+ ", allowEntity4Edit=" + allowEntity4Edit
				+ ", allowEntity4Delete=" + allowEntity4Delete
				+ ", allowEntity5View=" + allowEntity5View
				+ ", allowEntity5Edit=" + allowEntity5Edit
				+ ", allowEntity5Delete=" + allowEntity5Delete
				+ ", allowEntity6View=" + allowEntity6View
				+ ", allowEntity6Edit=" + allowEntity6Edit
				+ ", allowEntity6Delete=" + allowEntity6Delete
				+ ", allowEntity7View=" + allowEntity7View
				+ ", allowEntity7Edit=" + allowEntity7Edit
				+ ", allowEntity7Delete=" + allowEntity7Delete
				+ ", allowEntity8View=" + allowEntity8View
				+ ", allowEntity8Edit=" + allowEntity8Edit
				+ ", allowEntity8Delete=" + allowEntity8Delete
				+ ", allowEntity9View=" + allowEntity9View
				+ ", allowEntity9Edit=" + allowEntity9Edit
				+ ", allowEntity9Delete=" + allowEntity9Delete
				+ ", allowSubEntity0View=" + allowSubEntity0View
				+ ", allowSubEntity0Edit=" + allowSubEntity0Edit
				+ ", allowSubEntity0Delete=" + allowSubEntity0Delete
				+ ", allowSubEntity1View=" + allowSubEntity1View
				+ ", allowSubEntity1Edit=" + allowSubEntity1Edit
				+ ", allowSubEntity1Delete=" + allowSubEntity1Delete
				+ ", allowSubEntity2View=" + allowSubEntity2View
				+ ", allowSubEntity2Edit=" + allowSubEntity2Edit
				+ ", allowSubEntity2Delete=" + allowSubEntity2Delete
				+ ", allowSubEntity3View=" + allowSubEntity3View
				+ ", allowSubEntity3Edit=" + allowSubEntity3Edit
				+ ", allowSubEntity3Delete=" + allowSubEntity3Delete
				+ ", allowSubEntity4View=" + allowSubEntity4View
				+ ", allowSubEntity4Edit=" + allowSubEntity4Edit
				+ ", allowSubEntity4Delete=" + allowSubEntity4Delete
				+ ", allowSubEntity5View=" + allowSubEntity5View
				+ ", allowSubEntity5Edit=" + allowSubEntity5Edit
				+ ", allowSubEntity5Delete=" + allowSubEntity5Delete
				+ ", allowSubEntity6View=" + allowSubEntity6View
				+ ", allowSubEntity6Edit=" + allowSubEntity6Edit
				+ ", allowSubEntity6Delete=" + allowSubEntity6Delete
				+ ", allowSubEntity7View=" + allowSubEntity7View
				+ ", allowSubEntity7Edit=" + allowSubEntity7Edit
				+ ", allowSubEntity7Delete=" + allowSubEntity7Delete
				+ ", allowSubEntity8View=" + allowSubEntity8View
				+ ", allowSubEntity8Edit=" + allowSubEntity8Edit
				+ ", allowSubEntity8Delete=" + allowSubEntity8Delete
				+ ", allowSubEntity9View=" + allowSubEntity9View
				+ ", allowSubEntity9Edit=" + allowSubEntity9Edit
				+ ", allowSubEntity9Delete=" + allowSubEntity9Delete
				+ ", allowUserGroupView=" + allowUserGroupView
				+ ", allowUserGroupEdit=" + allowUserGroupEdit
				+ ", allowUserGroupDelete=" + allowUserGroupDelete
				+ ", allowUserView=" + allowUserView + ", allowUserEdit="
				+ allowUserEdit + ", allowUserDelete=" + allowUserDelete
				+ ", createSite=" + createSite + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", replicate=" + replicate
				+ ", replicateSite=" + replicateSite + ", selected=" + selected
				+ "]";
	}

}
