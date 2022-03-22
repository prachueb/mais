package com.mais.baseobject.odb.models;

import java.lang.Object;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

import com.mais.baseobject.odb.combindkey.PkIdNote;

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
    private String id;
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
    public String getId() {
        return id;
    }

    /**
     * <p>Get internal id</p>
     * Using siteId and running id as real primary key of all the associated record.
     * @param id the id to set
     */
    public void setId(String id) {
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


//TODO Define XML text file (or in database) to be Note label in state of using Order 1, 2, ...5
}
