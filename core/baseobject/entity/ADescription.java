package com.mais.dbo.baseobject.entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

import com.mais.dbo.baseobject.combindedkey.PkIdLanguage;

/**
 * <p>
 * Title: ADescription
 * </p>
 * <p>
 * Description: Abstract super class for all Description entity.
 * </p>
 * <p>
 * This class implements to be super class of all Description entity.<BR>
 * It served as super class of Description entity.<BR>
 * Using in together with ACode, AMain, ANote, and AControlId
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@IdClass(PkIdLanguage.class)
@MappedSuperclass
//@Table(indexes={@Index(columnList="ID"),
//@Index(columnList="LANGUAGEID"),
//@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public abstract class ADescription {

    @Id
    private long id;
    @Id
    private long languageId;
    private String description;

    /**
     * <p>Get internal id</p>
     * Using siteId and id as real primary key of all the associated record.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * <p>Set internal id</p>
     * Using siteId and id as real primary key of all the associated record.
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <p>Get Language Id</p>
     * Using languageId combine to internal id to be real primary key.
     * @return languageId
     */
    public Long getLanguageId() {
        return languageId;
    }

    /**
     * <p>Set Language Id</p>
     * Using languageId combine to internal id to be real primary key.
     * @param languageId
     */
    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    /**
     * <P>Get Description</p>
     * to get the language specific description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>Set Description</p>
     * to set the language specific description.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (int) (languageId ^ (languageId >>> 32));
        return result;
    }

    /** (non-Javadoc)
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
        if (!(obj instanceof ADescription)) {
            return false;
        }
        ADescription other = (ADescription) obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (languageId != other.languageId) {
            return false;
        }
        return true;
    }
}
