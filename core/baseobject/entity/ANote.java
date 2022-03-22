package com.mais.dbo.baseobject.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

import com.mais.dbo.baseobject.combindedkey.PkIdNote;

/**
 * <p>
 * Title: ANote
 * </p>
 * <p>
 * Description: Abstract super class for all note entity.
 * </p>
 * <p>
 * This class implements to be super class of all note entity.<BR>
 * It served as super class of note entity.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@MappedSuperclass
@IdClass(PkIdNote.class)
//@Table(indexes={@Index(columnList="ID"),
//@Index(columnList="ORDERID")})  // Index in @MappedSuperclass not work!
public abstract class ANote {

    @Id
    private long id;
    @Id
    private long orderId;
	@Column(length=1024)
    private String note;

    /** Creates a new instance of ANote */
    public ANote() {
    }

    /**
     * <p>Get internal id</p>
     * Using siteId and running id as real primary key of all the associated record.
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * <p>Get internal id</p>
     * Using siteId and running id as real primary key of all the associated record.
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the orderId
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + (int) (orderId ^ (orderId >>> 32));
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
        if (!(obj instanceof ANote)) {
            return false;
        }
        ANote other = (ANote) obj;
        if (id != other.id) {
            return false;
        }
        if (note == null) {
            if (other.note != null) {
                return false;
            }
        } else if (!note.equals(other.note)) {
            return false;
        }
        if (orderId != other.orderId) {
            return false;
        }
        return true;
    }
    //TODO Define XML text file (or in database) to be Note label in state of using Order 1, 2, ...5
}
