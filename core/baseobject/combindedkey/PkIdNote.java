package com.mais.dbo.baseobject.combindedkey;



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

    protected long id;
    protected long orderId;

    /**
     * Creates a new instance of PkIdNote
     */
    public PkIdNote() {
    }

    public PkIdNote(long Id, long OrderId) {
        this.id = Id;
        this.orderId = OrderId;
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

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (int) (orderId ^ (orderId >>> 32));
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
        if (!(obj instanceof PkIdNote)) {
            return false;
        }
        PkIdNote other = (PkIdNote) obj;
        if (id != other.id) {
            return false;
        }
        if (orderId != other.orderId) {
            return false;
        }
        return true;
    }
}
