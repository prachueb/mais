package com.mais.baseobject.odb.models;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

import com.mais.baseobject.odb.combindkey.PkControlId;

/**
 * <p>
 * Title: AControlId
 * </p>
 * <p>
 * Description: Abstract super class for all Control entity.
 * </p>
 * <p>
 * This class implements to be super class of all control entity. <BR>
 * It served as super class of control entity using to control next id.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@IdClass(PkControlId.class)
@MappedSuperclass
public abstract class AControlId {

    /**
     * Using as InternalID class
     */
    @Id
    private short siteId;
    @Id
    private long orderId;
    private long nextId;

    /**
     * Creates a new instance of AControlId
     */
    public AControlId() {
    }

    /**
     * Get site id
     * Only site that could created next record.
     * @return siteId
     */
    public short getSiteId() {
        return siteId;
    }

    /**
     * Set site id
     * Only site that could created next record.
     * @param siteId
     */
    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    /**
     * Get next order of id
     * Delete record will generate next order<BR>
     * order 0 means no more deleted recycle id pool<BR>
     * orderId > 0 means deleted recycle nextId record should be removed after use nextId<BR>
     * orderId = 0 means nextId should be add more 1 after use nextId
     * @return orderId
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Set next order of deleted id<BR>
     * Delete record will generate next order<BR>
     * order 0 means no more deleted recycle id pool<BR>
     * orderId > 0 means deleted recycle nextId record should be removed after use nextId<BR>
     * orderId = 0 means nextId should be add more 1 after use nextId
     * @param orderId
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     * Get next internal id
     * Internal id = siteId (<10,000) + runningId (<1,000,000,000,000)
     * @return nextId
     */
    public long getNextId() {
        return nextId;
    }

    /**
     * Set next internal id
     * Internal id = siteId (<10,000) + runningId (<1,000,000,000,000)
     * @param nextId
     */
    public void setNextId(long nextId) {
        this.nextId = nextId;
    }

    /**
     * Get next running id
     * Internal id = siteId (<10,000) + runningId (<1,000,000,000,000)
     * @return nextId
     */
    public long getNextRunningId() {
        return nextId % 1000000000000L;
    }

    /**
     * Set next running id
     * Internal id = siteId (<10,000) + runningId (<1,000,000,000,000)
     * @param nextRunningId
     */
    public void setNextRunningId(long nextRunningId) {
        nextId = (getSiteId() * 1000000000000L) + (nextRunningId % 1000000000000L);
    }
}
