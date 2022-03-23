package com.mais.baseobject.odb.dto;

import java.io.Serializable;

/**
 * <p>Title: Note</p>
 * <p>Description: data transfer object short data.</p>
 * This class implements to be transferable short data.
 *  <P>
 *  It served as short data transferable object.
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public class Note implements Serializable  {
    private static final long serialVersionUID = 973236732275873234L;
    private short internalId;
    private String note;

    public Note() {
    }

    public Note(short internald, String note) {
        setInternalId(internald);
        setNote(note);
    }

    /**
     * @return the internalId
     */
    public long getInternalId() {
        return internalId;
    }

    /**
     * @param internalID the internalID to set
     */
    public void setInternalId(short internalId) {
        this.internalId = internalId;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the description to set
     */
    public void setNote(String note) {
        this.note = note;
    }

}
