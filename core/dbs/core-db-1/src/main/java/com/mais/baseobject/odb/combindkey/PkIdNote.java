package com.mais.baseobject.odb.combindkey;

import java.io.Serializable;

/**
 * <p>Title: PkIdNote</p>
 * <p>Description: Combined primary key of abstract super class for all note entity.</p>
 * This class implements to be combined primary key of super class of all note entity.
 *  <P>
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

public class PkIdNote implements Serializable { // extends DTO{
    private static final long serialVersionUID = 6453222267875993223L;

    protected String id;
    protected long orderId;

    /**
     * Creates a new instance of PkIdNote
     */
    public PkIdNote() {
    }

    public PkIdNote(String Id, long OrderId) {
        this.id = Id;
        this.orderId = OrderId;
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

}
