package com.mais.base.language.models;

import java.io.Serializable;

/**
 * <p>Title: PkIdLanguage</p>
 * <p>Description: Combined primary key of abstract super class for all Control entity.</p>
 * This class implements to be combined primary key of super class of all control entity.
 *  <P>
 *  It served as combined primary key of super class of control entity using to control nextId.
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

public class PkIdLanguage implements Serializable { // extends DTO{
    private static final long serialVersionUID = 6453211267875993223L;

    protected String id;
    protected String languageId;

    /**
     * Creates a new instance of PkIdLanguage
     */
    public PkIdLanguage() {
    }

    public PkIdLanguage(String Id, String LanguageId) {
        this.id = Id;
        this.languageId = LanguageId;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the languageId
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * @param languageId the languageId to set
     */
    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

}
