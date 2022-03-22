package com.mais.dbo.baseobject.combindedkey;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * <p>Title: InternalID</p>
 * Description: Using combination of siteId as integer and running id as integer to be long<BR>
 *  It served as combined primary key of super class of control entity using to control next id.
 *
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public class InternalID implements Serializable {

    private static final long serialVersionUID = -1401734872223178345L;
    protected Logger logger = Logger.getLogger(this.getClass().getName());
    /**
     * Maximum site should be 10,000 sites
     * Running internal id should be 9,223,372,036,854,775,807 / 10,000
     * so assume not more than 1,000,000,000,000
     */
    private long internalId = 0;

    /**
     * Creates a new instance of InternalID
     */
    public InternalID() {
    }

    /**
     * @return the running internal Id
     */
    public long getRunningInternalId() {
        return getInternalId() % 1000000000000L;
    }

    /**
     * Running Internal ID should not more than 1,000,000,000,000
     * @param runningInternalId the running internalId to be set
     * @throws Exception
     */
    public void setRunningInternalId(long runningInternalId) throws Exception {
        if (runningInternalId > 1000000000000000L) {
            throw new Exception("Internal id overflow: > 1,000,000,000,000");
        }
        setInternalId((getSiteId() * 1000000000000L) + (runningInternalId % 1000000000000L));
    }

    /**
     * Running Internal ID should not more than 1,000,000,000,000
     * @param siteId the running internalId to be set in this site id
     * @throws Exception
     */
    public void setNewRunningInternalId(short siteId) {
        setInternalId((siteId * 1000000000000L) + 1L);
        logger.fine("siteId: " + siteId + " internal ID: " + internalId);
    }

    /**
     * @return the internalId
     */
    public long getInternalId() {
        return internalId;
    }

    /**
     * @param internalId the internalId to set
     */
    public void setInternalId(long internalId) {
        this.internalId = internalId;
    }

    /**
     * @return the siteId
     */
    public short getSiteId() {
        return (short) (getInternalId() / 1000000000000L);
    }

    /**
     * @param siteId the siteId to set
     */
    public void setSiteId(short siteId) {
        setInternalId((siteId * 1000000000000L) + (getInternalId() % 1000000000000L));
    }

    public void clear() {
        internalId = 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (internalId ^ (internalId >>> 32));
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
        if (!(obj instanceof InternalID)) {
            return false;
        }
        InternalID other = (InternalID) obj;
        if (internalId != other.internalId) {
            return false;
        }
        return true;
    }
}
