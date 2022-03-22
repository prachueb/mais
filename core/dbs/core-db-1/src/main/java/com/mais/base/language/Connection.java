package com.mais.base.language;

import java.io.Serializable;

/**
 * <p>Title: Connection</p>
 * <p>Description: Connection data transfer object.</p>
 * This class implements to be Connection transferable data.<BR>
 * Beginning from user id as login which should to retrieve local site
 * from StartUp and then find user id from userBean.
 * Then default entities and subentities should be retrieve to Connection information. <br>
 * <P>
 *  It served as Connection data transferable object.
 *  <P>
 *
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Dr.Prachueb Sirivongrungson
 * @version 1.0
 */

public class Connection implements Serializable {
    private static final long serialVersionUID = 4549275305565323408L;

//TODO Implement current language, currency, Enterprise, Entity, SubEntity    
// the available Currency, Language, Enterprise, Entity, SubEntity should be in MetaData EAR
// Both instance should be in the current model.
    
    private long userId = -1;
    private short siteId = -1;


    /**
     * Creates a new instance of Connection
     */
    public Connection() {
    }

    /**
     * To clear all current information.
     */
    public void clear() {
        setUserId(-1);
        setSiteId(Short.parseShort("-1"));
    }

    /**
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
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

}