package com.mais.dbo.baseobject.combindedkey;


import java.io.Serializable;

/**
 * <p>Title: PkControlId</p>
 * <p>Description: Combined primary key of abstract super class for all Control entity Id.</p>
 * This class implements to be combined primary key of super class of all control entity id. <BR>
 *  It served as combined primary key of super class of control entity using to control nextid.
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@SuppressWarnings("serial")
public class PkControlId implements Serializable {
//    private static final long serialVersionUID = 2493273223643432508L;

    protected short siteId;
    protected long orderId;

    /**
     * Creates a new instance of PkId
     */
    public PkControlId() {
    }

    public PkControlId(short SiteId, long orderId) {
        this.siteId = SiteId;
        this.orderId = orderId;
    }

    /**
     * @return the siteId
     */
    public short getSiteId() {
        return siteId;
    }

    /**
     * @param siteId the siteId to set
     */
    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the order id
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the order id to set
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
        result = prime * result + (int) (orderId ^ (orderId >>> 32));
        result = prime * result + siteId;
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
        if (!(obj instanceof PkControlId)) {
            return false;
        }
        PkControlId other = (PkControlId) obj;
        if (orderId != other.orderId) {
            return false;
        }
        if (siteId != other.siteId) {
            return false;
        }
        return true;
    }
}
