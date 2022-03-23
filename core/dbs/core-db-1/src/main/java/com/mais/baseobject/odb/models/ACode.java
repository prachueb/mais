package com.mais.baseobject.odb.models;

import java.lang.Object;
import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;

/**
 * <p>
 * Title: ACode
 * </p>
 * <p>
 * Description: Abstract super class for all Code Entity.
 * </p>
 * <p>
 * This class implements to be super class of all code Entity. <BR>
 * It served as super class of code Entity. This is the initial
 * search for the SBU. Validated data for edit delete or view
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

    // The primary key will automatic generate index.
    // The index useful in WHERE not in ORDER BY
    @Id
    @Column(columnDefinition="CHAR(30)")
    private String id;
	private String shortName;
	private String description;
    private boolean multilingual;
    private boolean hasNotes;

    /**
     * Bar code to identify the specific code
     */
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
	 * The view validation is on ACode for quick search.
	 */
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
     * Construction
     */
    public ACode() {
        startDate = new Date();
        expireDate = new Date();
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
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
}
