package com.mais.dbo.baseobject.combindedkey;


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

    protected long id;
    protected long languageId;

    /**
     * Creates a new instance of PkIdLanguage
     */
    public PkIdLanguage() {
    }

    public PkIdLanguage(long Id, long LanguageId) {
        this.id = Id;
        this.languageId = LanguageId;
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
     * @return the languageId
     */
    public long getLanguageId() {
        return languageId;
    }

    /**
     * @param languageId the languageId to set
     */
    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (int) (languageId ^ (languageId >>> 32));
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
        if (!(obj instanceof PkIdLanguage)) {
            return false;
        }
        PkIdLanguage other = (PkIdLanguage) obj;
        if (id != other.id) {
            return false;
        }
        if (languageId != other.languageId) {
            return false;
        }
        return true;
    }
}
