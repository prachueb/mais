package com.mais.baseobject.odb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.sql.Timestamp;

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
public abstract class DTO extends ShortDTO implements Serializable {
    private static final long serialVersionUID = 973236732275993234L;
//  Cannot use logger with Serializable objects.

//    Example JSON-B as Book is DTO
//    Book book = new Book("Java 11", LocalDate.now(), 1, false, "Duke", new BigDecimal(44.444));
//    Jsonb jsonb = JsonbBuilder.create();
//    String resultJson = jsonb.toJson(book);
//    Book serializedBook = jsonb.fromJson(resultJson, Book.class);


//    private String id;

//    private String shortName;
//    private String description;

//    private boolean multilingual = false;
    private List<Description> lingualDescription;

    private String barcodeCode;

//    private boolean hasNotes = false;
    private List<Note> noteList;

//	private boolean deleted = false;
//	private boolean purgable = false;
//    private boolean active = true;
//    private Timestamp startDate;    //     Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//    private Timestamp expireDate;

//    private String allowEnterpriseView;
    private String allowEnterpriseEdit;
    private String allowEnterpriseDelete;
//    private String allowSBU0View;
    private String allowSBU0Edit;
    private String allowSBU0Delete;
//    private String allowSBU1View;
    private String allowSBU1Edit;
    private String allowSBU1Delete;
//    private String allowSBU2View;
    private String allowSBU2Edit;
    private String allowSBU2Delete;
//    private String allowSBU3View;
    private String allowSBU3Edit;
    private String allowSBU3Delete;
//    private String allowSBU4View;
    private String allowSBU4Edit;
    private String allowSBU4Delete;
//    private String allowSBU5View;
    private String allowSBU5Edit;
    private String allowSBU5Delete;
//    private String allowSBU6View;
    private String allowSBU6Edit;
    private String allowSBU6Delete;
//    private String allowSBU7View;
    private String allowSBU7Edit;
    private String allowSBU7Delete;
//    private String allowSBU8View;
    private String allowSBU8Edit;
    private String allowSBU8Delete;
//    private String allowSBU9View;
    private String allowSBU9Edit;
    private String allowSBU9Delete;
//    private String allowSU0View;
    private String allowSU0Edit;
    private String allowSU0Delete;
//    private String allowSU1View;
    private String allowSU1Edit;
    private String allowSU1Delete;
//    private String allowSU2View;
    private String allowSU2Edit;
    private String allowSU2Delete;
//    private String allowSU3View;
    private String allowSU3Edit;
    private String allowSU3Delete;
//    private String allowSU4View;
    private String allowSU4Edit;
    private String allowSU4Delete;
//    private String allowSU5View;
    private String allowSU5Edit;
    private String allowSU5Delete;
//    private String allowSU6View;
    private String allowSU6Edit;
    private String allowSU6Delete;
//    private String allowSU7View;
    private String allowSU7Edit;
    private String allowSU7Delete;
//    private String allowSU8View;
    private String allowSU8Edit;
    private String allowSU8Delete;
//    private String allowSU9View;
    private String allowSU9Edit;
    private String allowSU9Delete;
//    private String allowUserGroupView;
    private String allowUserGroupEdit;
    private String allowUserGroupDelete;
//    private String allowUserView;
    private String allowUserEdit;
    private String allowUserDelete;

    private String createSite;
    private String createUser;
    private Timestamp createDate;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Calendar createDate = Calendar.getInstance();

    private String updateUser;
    private Timestamp updateDate;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Calendar updateDate = Calendar.getInstance();

	private String replicateSite;

    /**
     * Creates a new instance of DTO
     */
    public DTO() {
    	lingualDescription = new ArrayList<Description>();
    	noteList = new ArrayList<Note>();
    }

    public DTO(DTO data) {
    	_copyDTO(data);
    }

    @Override
    public void clear() {
        super.clear();
//    	id = null;
//    	shortName = null;
//    	description = null;
//    	multilingual = false;
    	lingualDescription = new ArrayList<Description>();
    	barcodeCode = null;
//    	hasNotes = false;
    	noteList = new ArrayList<Note>();
//    	deleted = false;
//    	purgable = false;
//    	active = true;
//    	startDate = null;
//    	expireDate = null;
    	createSite = null;
    	createUser = null;
    	createDate = null;
    	updateUser = null;
    	updateDate = null;
    	replicateSite = null;

//        allowEnterpriseView = null;
        allowEnterpriseEdit = null;
        allowEnterpriseDelete = null;
//        allowSBU0View = null;
        allowSBU0Edit = null;
        allowSBU0Delete = null;
//        allowSBU1View = null;
        allowSBU1Edit = null;
        allowSBU1Delete = null;
//        allowSBU2View = null;
        allowSBU2Edit = null;
        allowSBU2Delete = null;
//        allowSBU3View = null;
        allowSBU3Edit = null;
        allowSBU3Delete = null;
//        allowSBU4View = null;
        allowSBU4Edit = null;
        allowSBU4Delete = null;
//        allowSBU5View = null;
        allowSBU5Edit = null;
        allowSBU5Delete = null;
//        allowSBU6View = null;
        allowSBU6Edit = null;
        allowSBU6Delete = null;
//        allowSBU7View = null;
        allowSBU7Edit = null;
        allowSBU7Delete = null;
//        allowSBU8View = null;
        allowSBU8Edit = null;
        allowSBU8Delete = null;
//        allowSBU9View = null;
        allowSBU9Edit = null;
        allowSBU9Delete = null;
//        allowSU0View = null;
        allowSU0Edit = null;
        allowSU0Delete = null;
//        allowSU1View = null;
        allowSU1Edit = null;
        allowSU1Delete = null;
//        allowSU2View = null;
        allowSU2Edit = null;
        allowSU2Delete = null;
//        allowSU3View = null;
        allowSU3Edit = null;
        allowSU3Delete = null;
//        allowSU4View = null;
        allowSU4Edit = null;
        allowSU4Delete = null;
//        allowSU5View = null;
        allowSU5Edit = null;
        allowSU5Delete = null;
//        allowSU6View = null;
        allowSU6Edit = null;
        allowSU6Delete = null;
//        allowSU7View = null;
        allowSU7Edit = null;
        allowSU7Delete = null;
//        allowSU8View = null;
        allowSU8Edit = null;
        allowSU8Delete = null;
//        allowSU9View = null;
        allowSU9Edit = null;
        allowSU9Delete = null;
//        allowUserGroupView = null;
        allowUserGroupEdit = null;
        allowUserGroupDelete = null;
//        allowUserView = null;
        allowUserEdit = null;
        allowUserDelete = null;
    }

    protected boolean _copyDTO(DTO data) {
    	if (data == null)
    		return false;
    	clear();
        super._copyDTO((ShortDTO) data);
//    	setId(data.getId());
//        setShortName(data.getShortName());
//        setDescription(data.getDescription());
//        setMultilingual(data.isMultilingual());
        setLingualDescription(data.getLingualDescription());
//        setHasNotes(data.isHasNotes());
        setNoteList(data.getNoteList());

//        setDeleted(data.isDeleted());
//        setPurgable(data.isPurgable());
//        setActive(data.isActive());
//        setStartDate(data.getStartDate());
//        setExpireDate(data.getExpireDate());
        
//        setAllowEnterpriseView(data.getAllowEnterpriseView());
        setAllowEnterpriseEdit(data.getAllowEnterpriseEdit());
        setAllowEnterpriseDelete(data.getAllowEnterpriseDelete());
//        setAllowSBU0View(data.getAllowSBU0View());
        setAllowSBU0Edit(data.getAllowSBU0Edit());
        setAllowSBU0Delete(data.getAllowSBU0Delete());        
//        setAllowSBU1View(data.getAllowSBU1View());
        setAllowSBU1Edit(data.getAllowSBU1Edit());
        setAllowSBU1Delete(data.getAllowSBU1Delete());        
//        setAllowSBU2View(data.getAllowSBU2View());
        setAllowSBU2Edit(data.getAllowSBU2Edit());
        setAllowSBU2Delete(data.getAllowSBU2Delete());        
//        setAllowSBU3View(data.getAllowSBU3View());
        setAllowSBU3Edit(data.getAllowSBU3Edit());
        setAllowSBU3Delete(data.getAllowSBU3Delete());        
//        setAllowSBU4View(data.getAllowSBU4View());
        setAllowSBU4Edit(data.getAllowSBU4Edit());
        setAllowSBU4Delete(data.getAllowSBU4Delete());        
//        setAllowSBU5View(data.getAllowSBU5View());
        setAllowSBU5Edit(data.getAllowSBU5Edit());
        setAllowSBU5Delete(data.getAllowSBU5Delete());        
//        setAllowSBU6View(data.getAllowSBU6View());
        setAllowSBU6Edit(data.getAllowSBU6Edit());
        setAllowSBU6Delete(data.getAllowSBU6Delete());        
//        setAllowSBU7View(data.getAllowSBU7View());
        setAllowSBU7Edit(data.getAllowSBU7Edit());
        setAllowSBU7Delete(data.getAllowSBU7Delete());        
//        setAllowSBU8View(data.getAllowSBU8View());
        setAllowSBU8Edit(data.getAllowSBU8Edit());
        setAllowSBU8Delete(data.getAllowSBU8Delete());        
//        setAllowSBU9View(data.getAllowSBU9View());
        setAllowSBU9Edit(data.getAllowSBU9Edit());
        setAllowSBU9Delete(data.getAllowSBU9Delete());        
//        setAllowSU0View(data.getAllowSU0View());
        setAllowSU0Edit(data.getAllowSU0Edit());
        setAllowSU0Delete(data.getAllowSU0Delete());        
//        setAllowSU1View(data.getAllowSU1View());
        setAllowSU1Edit(data.getAllowSU1Edit());
        setAllowSU1Delete(data.getAllowSU1Delete());        
//        setAllowSU2View(data.getAllowSU2View());
        setAllowSU2Edit(data.getAllowSU2Edit());
        setAllowSU2Delete(data.getAllowSU2Delete());        
//        setAllowSU3View(data.getAllowSU3View());
        setAllowSU3Edit(data.getAllowSU3Edit());
        setAllowSU3Delete(data.getAllowSU3Delete());        
//        setAllowSU4View(data.getAllowSU4View());
        setAllowSU4Edit(data.getAllowSU4Edit());
        setAllowSU4Delete(data.getAllowSU4Delete());        
//        setAllowSU5View(data.getAllowSU5View());
        setAllowSU5Edit(data.getAllowSU5Edit());
        setAllowSU5Delete(data.getAllowSU5Delete());        
//        setAllowSU6View(data.getAllowSU6View());
        setAllowSU6Edit(data.getAllowSU6Edit());
        setAllowSU6Delete(data.getAllowSU6Delete());        
//        setAllowSU7View(data.getAllowSU7View());
        setAllowSU7Edit(data.getAllowSU7Edit());
        setAllowSU7Delete(data.getAllowSU7Delete());        
//        setAllowSU8View(data.getAllowSU8View());
        setAllowSU8Edit(data.getAllowSU8Edit());
        setAllowSU8Delete(data.getAllowSU8Delete());        
//        setAllowSU9View(data.getAllowSU9View());
        setAllowSU9Edit(data.getAllowSU9Edit());
        setAllowSU9Delete(data.getAllowSU9Delete());        
//        setAllowUserGroupView(data.getAllowUserGroupView());
        setAllowUserGroupEdit(data.getAllowUserGroupEdit());
        setAllowUserGroupDelete(data.getAllowUserGroupDelete());        
//        setAllowUserView(data.getAllowUserView());
        setAllowUserEdit(data.getAllowUserEdit());
        setAllowUserDelete(data.getAllowUserDelete());        

        // From AMain
        setCreateSite(data.getCreateSite());
        setCreateUser(data.getCreateUser());
        setCreateDate(data.getCreateDate());
        setUpdateUser(data.getUpdateUser());
        setUpdateDate(data.getUpdateDate());
        setReplicateSite(data.getReplicateSite());

        return true;
    }

//    /**
//     * All the subclass should to call super._copy(DTO data) too!!
//     * @param data
//     * @return false if data is null
//     */
//	abstract public boolean copy(DTO data);

    public List<Description> getLingualDescription() {
        return lingualDescription;
    }

    public void setLingualDescription(List<Description> lingualDescription) {
        this.lingualDescription = lingualDescription;
    }

    public String getBarcodeCode() {
        return barcodeCode;
    }

    public void setBarcodeCode(String barcodeCode) {
        this.barcodeCode = barcodeCode;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public String getAllowEnterpriseEdit() {
        return allowEnterpriseEdit;
    }

    public void setAllowEnterpriseEdit(String allowEnterpriseEdit) {
        this.allowEnterpriseEdit = allowEnterpriseEdit;
    }

    public String getAllowEnterpriseDelete() {
        return allowEnterpriseDelete;
    }

    public void setAllowEnterpriseDelete(String allowEnterpriseDelete) {
        this.allowEnterpriseDelete = allowEnterpriseDelete;
    }

    public String getAllowSBU0Edit() {
        return allowSBU0Edit;
    }

    public void setAllowSBU0Edit(String allowSBU0Edit) {
        this.allowSBU0Edit = allowSBU0Edit;
    }

    public String getAllowSBU0Delete() {
        return allowSBU0Delete;
    }

    public void setAllowSBU0Delete(String allowSBU0Delete) {
        this.allowSBU0Delete = allowSBU0Delete;
    }

    public String getAllowSBU1Edit() {
        return allowSBU1Edit;
    }

    public void setAllowSBU1Edit(String allowSBU1Edit) {
        this.allowSBU1Edit = allowSBU1Edit;
    }

    public String getAllowSBU1Delete() {
        return allowSBU1Delete;
    }

    public void setAllowSBU1Delete(String allowSBU1Delete) {
        this.allowSBU1Delete = allowSBU1Delete;
    }

    public String getAllowSBU2Edit() {
        return allowSBU2Edit;
    }

    public void setAllowSBU2Edit(String allowSBU2Edit) {
        this.allowSBU2Edit = allowSBU2Edit;
    }

    public String getAllowSBU2Delete() {
        return allowSBU2Delete;
    }

    public void setAllowSBU2Delete(String allowSBU2Delete) {
        this.allowSBU2Delete = allowSBU2Delete;
    }

    public String getAllowSBU3Edit() {
        return allowSBU3Edit;
    }

    public void setAllowSBU3Edit(String allowSBU3Edit) {
        this.allowSBU3Edit = allowSBU3Edit;
    }

    public String getAllowSBU3Delete() {
        return allowSBU3Delete;
    }

    public void setAllowSBU3Delete(String allowSBU3Delete) {
        this.allowSBU3Delete = allowSBU3Delete;
    }

    public String getAllowSBU4Edit() {
        return allowSBU4Edit;
    }

    public void setAllowSBU4Edit(String allowSBU4Edit) {
        this.allowSBU4Edit = allowSBU4Edit;
    }

    public String getAllowSBU4Delete() {
        return allowSBU4Delete;
    }

    public void setAllowSBU4Delete(String allowSBU4Delete) {
        this.allowSBU4Delete = allowSBU4Delete;
    }

    public String getAllowSBU5Edit() {
        return allowSBU5Edit;
    }

    public void setAllowSBU5Edit(String allowSBU5Edit) {
        this.allowSBU5Edit = allowSBU5Edit;
    }

    public String getAllowSBU5Delete() {
        return allowSBU5Delete;
    }

    public void setAllowSBU5Delete(String allowSBU5Delete) {
        this.allowSBU5Delete = allowSBU5Delete;
    }

    public String getAllowSBU6Edit() {
        return allowSBU6Edit;
    }

    public void setAllowSBU6Edit(String allowSBU6Edit) {
        this.allowSBU6Edit = allowSBU6Edit;
    }

    public String getAllowSBU6Delete() {
        return allowSBU6Delete;
    }

    public void setAllowSBU6Delete(String allowSBU6Delete) {
        this.allowSBU6Delete = allowSBU6Delete;
    }

    public String getAllowSBU7Edit() {
        return allowSBU7Edit;
    }

    public void setAllowSBU7Edit(String allowSBU7Edit) {
        this.allowSBU7Edit = allowSBU7Edit;
    }

    public String getAllowSBU7Delete() {
        return allowSBU7Delete;
    }

    public void setAllowSBU7Delete(String allowSBU7Delete) {
        this.allowSBU7Delete = allowSBU7Delete;
    }

    public String getAllowSBU8Edit() {
        return allowSBU8Edit;
    }

    public void setAllowSBU8Edit(String allowSBU8Edit) {
        this.allowSBU8Edit = allowSBU8Edit;
    }

    public String getAllowSBU8Delete() {
        return allowSBU8Delete;
    }

    public void setAllowSBU8Delete(String allowSBU8Delete) {
        this.allowSBU8Delete = allowSBU8Delete;
    }

    public String getAllowSBU9Edit() {
        return allowSBU9Edit;
    }

    public void setAllowSBU9Edit(String allowSBU9Edit) {
        this.allowSBU9Edit = allowSBU9Edit;
    }

    public String getAllowSBU9Delete() {
        return allowSBU9Delete;
    }

    public void setAllowSBU9Delete(String allowSBU9Delete) {
        this.allowSBU9Delete = allowSBU9Delete;
    }

    public String getAllowSU0Edit() {
        return allowSU0Edit;
    }

    public void setAllowSU0Edit(String allowSU0Edit) {
        this.allowSU0Edit = allowSU0Edit;
    }

    public String getAllowSU0Delete() {
        return allowSU0Delete;
    }

    public void setAllowSU0Delete(String allowSU0Delete) {
        this.allowSU0Delete = allowSU0Delete;
    }

    public String getAllowSU1Edit() {
        return allowSU1Edit;
    }

    public void setAllowSU1Edit(String allowSU1Edit) {
        this.allowSU1Edit = allowSU1Edit;
    }

    public String getAllowSU1Delete() {
        return allowSU1Delete;
    }

    public void setAllowSU1Delete(String allowSU1Delete) {
        this.allowSU1Delete = allowSU1Delete;
    }

    public String getAllowSU2Edit() {
        return allowSU2Edit;
    }

    public void setAllowSU2Edit(String allowSU2Edit) {
        this.allowSU2Edit = allowSU2Edit;
    }

    public String getAllowSU2Delete() {
        return allowSU2Delete;
    }

    public void setAllowSU2Delete(String allowSU2Delete) {
        this.allowSU2Delete = allowSU2Delete;
    }

    public String getAllowSU3Edit() {
        return allowSU3Edit;
    }

    public void setAllowSU3Edit(String allowSU3Edit) {
        this.allowSU3Edit = allowSU3Edit;
    }

    public String getAllowSU3Delete() {
        return allowSU3Delete;
    }

    public void setAllowSU3Delete(String allowSU3Delete) {
        this.allowSU3Delete = allowSU3Delete;
    }

    public String getAllowSU4Edit() {
        return allowSU4Edit;
    }

    public void setAllowSU4Edit(String allowSU4Edit) {
        this.allowSU4Edit = allowSU4Edit;
    }

    public String getAllowSU4Delete() {
        return allowSU4Delete;
    }

    public void setAllowSU4Delete(String allowSU4Delete) {
        this.allowSU4Delete = allowSU4Delete;
    }

    public String getAllowSU5Edit() {
        return allowSU5Edit;
    }

    public void setAllowSU5Edit(String allowSU5Edit) {
        this.allowSU5Edit = allowSU5Edit;
    }

    public String getAllowSU5Delete() {
        return allowSU5Delete;
    }

    public void setAllowSU5Delete(String allowSU5Delete) {
        this.allowSU5Delete = allowSU5Delete;
    }

    public String getAllowSU6Edit() {
        return allowSU6Edit;
    }

    public void setAllowSU6Edit(String allowSU6Edit) {
        this.allowSU6Edit = allowSU6Edit;
    }

    public String getAllowSU6Delete() {
        return allowSU6Delete;
    }

    public void setAllowSU6Delete(String allowSU6Delete) {
        this.allowSU6Delete = allowSU6Delete;
    }

    public String getAllowSU7Edit() {
        return allowSU7Edit;
    }

    public void setAllowSU7Edit(String allowSU7Edit) {
        this.allowSU7Edit = allowSU7Edit;
    }

    public String getAllowSU7Delete() {
        return allowSU7Delete;
    }

    public void setAllowSU7Delete(String allowSU7Delete) {
        this.allowSU7Delete = allowSU7Delete;
    }

    public String getAllowSU8Edit() {
        return allowSU8Edit;
    }

    public void setAllowSU8Edit(String allowSU8Edit) {
        this.allowSU8Edit = allowSU8Edit;
    }

    public String getAllowSU8Delete() {
        return allowSU8Delete;
    }

    public void setAllowSU8Delete(String allowSU8Delete) {
        this.allowSU8Delete = allowSU8Delete;
    }

    public String getAllowSU9Edit() {
        return allowSU9Edit;
    }

    public void setAllowSU9Edit(String allowSU9Edit) {
        this.allowSU9Edit = allowSU9Edit;
    }

    public String getAllowSU9Delete() {
        return allowSU9Delete;
    }

    public void setAllowSU9Delete(String allowSU9Delete) {
        this.allowSU9Delete = allowSU9Delete;
    }

    public String getAllowUserGroupEdit() {
        return allowUserGroupEdit;
    }

    public void setAllowUserGroupEdit(String allowUserGroupEdit) {
        this.allowUserGroupEdit = allowUserGroupEdit;
    }

    public String getAllowUserGroupDelete() {
        return allowUserGroupDelete;
    }

    public void setAllowUserGroupDelete(String allowUserGroupDelete) {
        this.allowUserGroupDelete = allowUserGroupDelete;
    }

    public String getAllowUserEdit() {
        return allowUserEdit;
    }

    public void setAllowUserEdit(String allowUserEdit) {
        this.allowUserEdit = allowUserEdit;
    }

    public String getAllowUserDelete() {
        return allowUserDelete;
    }

    public void setAllowUserDelete(String allowUserDelete) {
        this.allowUserDelete = allowUserDelete;
    }

    public String getCreateSite() {
        return createSite;
    }

    public void setCreateSite(String createSite) {
        this.createSite = createSite;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getReplicateSite() {
        return replicateSite;
    }

    public void setReplicateSite(String replicateSite) {
        this.replicateSite = replicateSite;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        DTO dto = (DTO) object;
        return java.util.Objects.equals(lingualDescription, dto.lingualDescription) && java.util.Objects.equals(barcodeCode, dto.barcodeCode) && java.util.Objects.equals(noteList, dto.noteList) && java.util.Objects.equals(allowEnterpriseEdit, dto.allowEnterpriseEdit) && java.util.Objects.equals(allowEnterpriseDelete, dto.allowEnterpriseDelete) && java.util.Objects.equals(allowSBU0Edit, dto.allowSBU0Edit) && java.util.Objects.equals(allowSBU0Delete, dto.allowSBU0Delete) && java.util.Objects.equals(allowSBU1Edit, dto.allowSBU1Edit) && java.util.Objects.equals(allowSBU1Delete, dto.allowSBU1Delete) && java.util.Objects.equals(allowSBU2Edit, dto.allowSBU2Edit) && java.util.Objects.equals(allowSBU2Delete, dto.allowSBU2Delete) && java.util.Objects.equals(allowSBU3Edit, dto.allowSBU3Edit) && java.util.Objects.equals(allowSBU3Delete, dto.allowSBU3Delete) && java.util.Objects.equals(allowSBU4Edit, dto.allowSBU4Edit) && java.util.Objects.equals(allowSBU4Delete, dto.allowSBU4Delete) && java.util.Objects.equals(allowSBU5Edit, dto.allowSBU5Edit) && java.util.Objects.equals(allowSBU5Delete, dto.allowSBU5Delete) && java.util.Objects.equals(allowSBU6Edit, dto.allowSBU6Edit) && java.util.Objects.equals(allowSBU6Delete, dto.allowSBU6Delete) && java.util.Objects.equals(allowSBU7Edit, dto.allowSBU7Edit) && java.util.Objects.equals(allowSBU7Delete, dto.allowSBU7Delete) && java.util.Objects.equals(allowSBU8Edit, dto.allowSBU8Edit) && java.util.Objects.equals(allowSBU8Delete, dto.allowSBU8Delete) && java.util.Objects.equals(allowSBU9Edit, dto.allowSBU9Edit) && java.util.Objects.equals(allowSBU9Delete, dto.allowSBU9Delete) && java.util.Objects.equals(allowSU0Edit, dto.allowSU0Edit) && java.util.Objects.equals(allowSU0Delete, dto.allowSU0Delete) && java.util.Objects.equals(allowSU1Edit, dto.allowSU1Edit) && java.util.Objects.equals(allowSU1Delete, dto.allowSU1Delete) && java.util.Objects.equals(allowSU2Edit, dto.allowSU2Edit) && java.util.Objects.equals(allowSU2Delete, dto.allowSU2Delete) && java.util.Objects.equals(allowSU3Edit, dto.allowSU3Edit) && java.util.Objects.equals(allowSU3Delete, dto.allowSU3Delete) && java.util.Objects.equals(allowSU4Edit, dto.allowSU4Edit) && java.util.Objects.equals(allowSU4Delete, dto.allowSU4Delete) && java.util.Objects.equals(allowSU5Edit, dto.allowSU5Edit) && java.util.Objects.equals(allowSU5Delete, dto.allowSU5Delete) && java.util.Objects.equals(allowSU6Edit, dto.allowSU6Edit) && java.util.Objects.equals(allowSU6Delete, dto.allowSU6Delete) && java.util.Objects.equals(allowSU7Edit, dto.allowSU7Edit) && java.util.Objects.equals(allowSU7Delete, dto.allowSU7Delete) && java.util.Objects.equals(allowSU8Edit, dto.allowSU8Edit) && java.util.Objects.equals(allowSU8Delete, dto.allowSU8Delete) && java.util.Objects.equals(allowSU9Edit, dto.allowSU9Edit) && java.util.Objects.equals(allowSU9Delete, dto.allowSU9Delete) && java.util.Objects.equals(allowUserGroupEdit, dto.allowUserGroupEdit) && java.util.Objects.equals(allowUserGroupDelete, dto.allowUserGroupDelete) && java.util.Objects.equals(allowUserEdit, dto.allowUserEdit) && java.util.Objects.equals(allowUserDelete, dto.allowUserDelete) && java.util.Objects.equals(createSite, dto.createSite) && java.util.Objects.equals(createUser, dto.createUser) && java.util.Objects.equals(createDate, dto.createDate) && java.util.Objects.equals(updateUser, dto.updateUser) && java.util.Objects.equals(updateDate, dto.updateDate) && java.util.Objects.equals(replicateSite, dto.replicateSite);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), lingualDescription, barcodeCode, noteList, allowEnterpriseEdit, allowEnterpriseDelete, allowSBU0Edit, allowSBU0Delete, allowSBU1Edit, allowSBU1Delete, allowSBU2Edit, allowSBU2Delete, allowSBU3Edit, allowSBU3Delete, allowSBU4Edit, allowSBU4Delete, allowSBU5Edit, allowSBU5Delete, allowSBU6Edit, allowSBU6Delete, allowSBU7Edit, allowSBU7Delete, allowSBU8Edit, allowSBU8Delete, allowSBU9Edit, allowSBU9Delete, allowSU0Edit, allowSU0Delete, allowSU1Edit, allowSU1Delete, allowSU2Edit, allowSU2Delete, allowSU3Edit, allowSU3Delete, allowSU4Edit, allowSU4Delete, allowSU5Edit, allowSU5Delete, allowSU6Edit, allowSU6Delete, allowSU7Edit, allowSU7Delete, allowSU8Edit, allowSU8Delete, allowSU9Edit, allowSU9Delete, allowUserGroupEdit, allowUserGroupDelete, allowUserEdit, allowUserDelete, createSite, createUser, createDate, updateUser, updateDate, replicateSite);
    }
}
