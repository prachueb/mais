package com.mais.baseobject.odb.models;

import java.lang.Object;
import java.util.Arrays;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Column;

import com.mais.baseobject.odb.combindkey.PkIdLanguage;


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

    // The combind primary key will automatic generate index.
    @Id
    @Column(columnDefinition="CHAR(30)")
    private String id;
    @Id
    @Column(columnDefinition="CHAR(30)")
    private String languageId;
    private String description;

    /**
     * <p>Get internal id</p>
     * Using siteId and id as real primary key of all the associated record.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * <p>Set internal id</p>
     * Using siteId and id as real primary key of all the associated record.
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>Get Language Id</p>
     * Using languageId combine to internal id to be real primary key.
     * @return languageId
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * <p>Set Language Id</p>
     * Using languageId combine to internal id to be real primary key.
     * @param languageId
     */
    public void setLanguageId(String languageId) {
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

}
