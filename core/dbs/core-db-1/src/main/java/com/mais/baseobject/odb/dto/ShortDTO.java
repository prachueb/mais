package com.mais.baseobject.odb.dto;

import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public abstract class ShortDTO implements Serializable {
    private static final long serialVersionUID = 973236732275993234L;
//  Cannot use logger with Serializable objects.

//    Example JSON-B as Book is DTO
//    Book book = new Book("Java 11", LocalDate.now(), 1, false, "Duke", new BigDecimal(44.444));
//    Jsonb jsonb = JsonbBuilder.create();
//    String resultJson = jsonb.toJson(book);
//    Book serializedBook = jsonb.fromJson(resultJson, Book.class);


    private String id;

    private String shortName;
    private String description;

    private boolean multilingual = false;
//    private List<Description> lingualDescription;

//    private String barcodeCode;

    private boolean hasNotes = false;
//    private List<Note> noteList;

	private boolean deleted = false;
	private boolean purgable = false;
    private boolean active = true;
    private Timestamp startDate;    //     Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private Timestamp expireDate;

    private String allowEnterpriseView;
    private String allowSBU0View;
    private String allowSBU1View;
    private String allowSBU2View;
    private String allowSBU3View;
    private String allowSBU4View;
    private String allowSBU5View;
    private String allowSBU6View;
    private String allowSBU7View;
    private String allowSBU8View;
    private String allowSBU9View;
    private String allowSU0View;
    private String allowSU1View;
    private String allowSU2View;
    private String allowSU3View;
    private String allowSU4View;
    private String allowSU5View;
    private String allowSU6View;
    private String allowSU7View;
    private String allowSU8View;
    private String allowSU9View;
    private String allowUserGroupView;
    private String allowUserView;

    /**
     * Creates a new instance of DTO
     */
    public ShortDTO() {
    }

    public ShortDTO(ShortDTO data) {
    	_copyDTO(data);
    }

    public void clear() {
    	id = null;
    	shortName = null;
    	description = null;
    	multilingual = false;
    	hasNotes = false;
    	deleted = false;
    	purgable = false;
    	active = true;
    	startDate = null;
    	expireDate = null;

        allowEnterpriseView = null;
        allowSBU0View = null;
        allowSBU1View = null;
        allowSBU2View = null;
        allowSBU3View = null;
        allowSBU4View = null;
        allowSBU5View = null;
        allowSBU6View = null;
        allowSBU7View = null;
        allowSBU8View = null;
        allowSBU9View = null;
        allowSU0View = null;
        allowSU1View = null;
        allowSU2View = null;
        allowSU3View = null;
        allowSU4View = null;
        allowSU5View = null;
        allowSU6View = null;
        allowSU7View = null;
        allowSU8View = null;
        allowSU9View = null;
        allowUserGroupView = null;
        allowUserView = null;
    }

    protected boolean _copyDTO(ShortDTO data) {
    	if (data == null)
    		return false;
    	clear();
    	setId(data.getId());
        setShortName(data.getShortName());
        setDescription(data.getDescription());
        setMultilingual(data.isMultilingual());
        setHasNotes(data.isHasNotes());

        setDeleted(data.isDeleted());
        setPurgable(data.isPurgable());
        setActive(data.isActive());
        setStartDate(data.getStartDate());
        setExpireDate(data.getExpireDate());
        
        setAllowEnterpriseView(data.getAllowEnterpriseView());
        setAllowSBU0View(data.getAllowSBU0View());
        setAllowSBU1View(data.getAllowSBU1View());
        setAllowSBU2View(data.getAllowSBU2View());
        setAllowSBU3View(data.getAllowSBU3View());
        setAllowSBU4View(data.getAllowSBU4View());
        setAllowSBU5View(data.getAllowSBU5View());
        setAllowSBU6View(data.getAllowSBU6View());
        setAllowSBU7View(data.getAllowSBU7View());
        setAllowSBU8View(data.getAllowSBU8View());
        setAllowSBU9View(data.getAllowSBU9View());
        setAllowSU0View(data.getAllowSU0View());
        setAllowSU1View(data.getAllowSU1View());
        setAllowSU2View(data.getAllowSU2View());
        setAllowSU3View(data.getAllowSU3View());
        setAllowSU4View(data.getAllowSU4View());
        setAllowSU5View(data.getAllowSU5View());
        setAllowSU6View(data.getAllowSU6View());
        setAllowSU7View(data.getAllowSU7View());
        setAllowSU8View(data.getAllowSU8View());
        setAllowSU9View(data.getAllowSU9View());
        setAllowUserGroupView(data.getAllowUserGroupView());
        setAllowUserView(data.getAllowUserView());

        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMultilingual() {
        return multilingual;
    }

    public void setMultilingual(boolean multilingual) {
        this.multilingual = multilingual;
    }

    public boolean isHasNotes() {
        return hasNotes;
    }

    public void setHasNotes(boolean hasNotes) {
        this.hasNotes = hasNotes;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isPurgable() {
        return purgable;
    }

    public void setPurgable(boolean purgable) {
        this.purgable = purgable;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    public String getAllowEnterpriseView() {
        return allowEnterpriseView;
    }

    public void setAllowEnterpriseView(String allowEnterpriseView) {
        this.allowEnterpriseView = allowEnterpriseView;
    }

    public String getAllowSBU0View() {
        return allowSBU0View;
    }

    public void setAllowSBU0View(String allowSBU0View) {
        this.allowSBU0View = allowSBU0View;
    }

    public String getAllowSBU1View() {
        return allowSBU1View;
    }

    public void setAllowSBU1View(String allowSBU1View) {
        this.allowSBU1View = allowSBU1View;
    }

    public String getAllowSBU2View() {
        return allowSBU2View;
    }

    public void setAllowSBU2View(String allowSBU2View) {
        this.allowSBU2View = allowSBU2View;
    }

    public String getAllowSBU3View() {
        return allowSBU3View;
    }

    public void setAllowSBU3View(String allowSBU3View) {
        this.allowSBU3View = allowSBU3View;
    }

    public String getAllowSBU4View() {
        return allowSBU4View;
    }

    public void setAllowSBU4View(String allowSBU4View) {
        this.allowSBU4View = allowSBU4View;
    }

    public String getAllowSBU5View() {
        return allowSBU5View;
    }

    public void setAllowSBU5View(String allowSBU5View) {
        this.allowSBU5View = allowSBU5View;
    }

    public String getAllowSBU6View() {
        return allowSBU6View;
    }

    public void setAllowSBU6View(String allowSBU6View) {
        this.allowSBU6View = allowSBU6View;
    }

    public String getAllowSBU7View() {
        return allowSBU7View;
    }

    public void setAllowSBU7View(String allowSBU7View) {
        this.allowSBU7View = allowSBU7View;
    }

    public String getAllowSBU8View() {
        return allowSBU8View;
    }

    public void setAllowSBU8View(String allowSBU8View) {
        this.allowSBU8View = allowSBU8View;
    }

    public String getAllowSBU9View() {
        return allowSBU9View;
    }

    public void setAllowSBU9View(String allowSBU9View) {
        this.allowSBU9View = allowSBU9View;
    }

    public String getAllowSU0View() {
        return allowSU0View;
    }

    public void setAllowSU0View(String allowSU0View) {
        this.allowSU0View = allowSU0View;
    }

    public String getAllowSU1View() {
        return allowSU1View;
    }

    public void setAllowSU1View(String allowSU1View) {
        this.allowSU1View = allowSU1View;
    }

    public String getAllowSU2View() {
        return allowSU2View;
    }

    public void setAllowSU2View(String allowSU2View) {
        this.allowSU2View = allowSU2View;
    }

    public String getAllowSU3View() {
        return allowSU3View;
    }

    public void setAllowSU3View(String allowSU3View) {
        this.allowSU3View = allowSU3View;
    }

    public String getAllowSU4View() {
        return allowSU4View;
    }

    public void setAllowSU4View(String allowSU4View) {
        this.allowSU4View = allowSU4View;
    }

    public String getAllowSU5View() {
        return allowSU5View;
    }

    public void setAllowSU5View(String allowSU5View) {
        this.allowSU5View = allowSU5View;
    }

    public String getAllowSU6View() {
        return allowSU6View;
    }

    public void setAllowSU6View(String allowSU6View) {
        this.allowSU6View = allowSU6View;
    }

    public String getAllowSU7View() {
        return allowSU7View;
    }

    public void setAllowSU7View(String allowSU7View) {
        this.allowSU7View = allowSU7View;
    }

    public String getAllowSU8View() {
        return allowSU8View;
    }

    public void setAllowSU8View(String allowSU8View) {
        this.allowSU8View = allowSU8View;
    }

    public String getAllowSU9View() {
        return allowSU9View;
    }

    public void setAllowSU9View(String allowSU9View) {
        this.allowSU9View = allowSU9View;
    }

    public String getAllowUserGroupView() {
        return allowUserGroupView;
    }

    public void setAllowUserGroupView(String allowUserGroupView) {
        this.allowUserGroupView = allowUserGroupView;
    }

    public String getAllowUserView() {
        return allowUserView;
    }

    public void setAllowUserView(String allowUserView) {
        this.allowUserView = allowUserView;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ShortDTO shortDTO = (ShortDTO) object;
        return multilingual == shortDTO.multilingual && hasNotes == shortDTO.hasNotes && deleted == shortDTO.deleted && purgable == shortDTO.purgable && active == shortDTO.active && java.util.Objects.equals(id, shortDTO.id) && java.util.Objects.equals(shortName, shortDTO.shortName) && java.util.Objects.equals(description, shortDTO.description) && java.util.Objects.equals(startDate, shortDTO.startDate) && java.util.Objects.equals(expireDate, shortDTO.expireDate) && java.util.Objects.equals(allowEnterpriseView, shortDTO.allowEnterpriseView) && java.util.Objects.equals(allowSBU0View, shortDTO.allowSBU0View) && java.util.Objects.equals(allowSBU1View, shortDTO.allowSBU1View) && java.util.Objects.equals(allowSBU2View, shortDTO.allowSBU2View) && java.util.Objects.equals(allowSBU3View, shortDTO.allowSBU3View) && java.util.Objects.equals(allowSBU4View, shortDTO.allowSBU4View) && java.util.Objects.equals(allowSBU5View, shortDTO.allowSBU5View) && java.util.Objects.equals(allowSBU6View, shortDTO.allowSBU6View) && java.util.Objects.equals(allowSBU7View, shortDTO.allowSBU7View) && java.util.Objects.equals(allowSBU8View, shortDTO.allowSBU8View) && java.util.Objects.equals(allowSBU9View, shortDTO.allowSBU9View) && java.util.Objects.equals(allowSU0View, shortDTO.allowSU0View) && java.util.Objects.equals(allowSU1View, shortDTO.allowSU1View) && java.util.Objects.equals(allowSU2View, shortDTO.allowSU2View) && java.util.Objects.equals(allowSU3View, shortDTO.allowSU3View) && java.util.Objects.equals(allowSU4View, shortDTO.allowSU4View) && java.util.Objects.equals(allowSU5View, shortDTO.allowSU5View) && java.util.Objects.equals(allowSU6View, shortDTO.allowSU6View) && java.util.Objects.equals(allowSU7View, shortDTO.allowSU7View) && java.util.Objects.equals(allowSU8View, shortDTO.allowSU8View) && java.util.Objects.equals(allowSU9View, shortDTO.allowSU9View) && java.util.Objects.equals(allowUserGroupView, shortDTO.allowUserGroupView) && java.util.Objects.equals(allowUserView, shortDTO.allowUserView);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, shortName, description, multilingual, hasNotes, deleted, purgable, active, startDate, expireDate, allowEnterpriseView, allowSBU0View, allowSBU1View, allowSBU2View, allowSBU3View, allowSBU4View, allowSBU5View, allowSBU6View, allowSBU7View, allowSBU8View, allowSBU9View, allowSU0View, allowSU1View, allowSU2View, allowSU3View, allowSU4View, allowSU5View, allowSU6View, allowSU7View, allowSU8View, allowSU9View, allowUserGroupView, allowUserView);
    }
}
