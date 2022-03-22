package com.mais.base.language.models;

/*
 * AMain.java
 *
 * Created on November 26, 2006, 10:58 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import java.util.Date;

/**
 * <p>
 * Title: AMain
 * </p>
 * <p>
 * Description: Abstract super class for all Main entity.
 * </p>
 * This class implements to be super class of all main entity. <BR>
 * It served as super class of main entity.
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@MappedSuperclass
//@Table(indexes={@Index(columnList="SHORTNAME"),
//@Index(columnList="CREATESITE")})  // Index in @MappedSuperclass not work!
public abstract class AMain {

    @Id
    private long id;
    private String shortName;
    private String description;
    private short createSite;
    private long createUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    private long updateUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    private boolean replicate;
    private String replicateSite;

    /** Creates a new instance of AMain */
    public AMain() {
        createDate = new Date();
        updateDate = new Date();
    }

    /**
     * Using site id and running id as real primary key of all the associated record.
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Using site id and running id as real primary key of all the associated record.
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the createSite
     */
    public short getCreateSite() {
        return createSite;
    }

    /**
     * @param createSite the createSite to set
     */
    public void setCreateSite(short createSite) {
        this.createSite = createSite;
    }

    /**
     * @return the createUser
     */
    public long getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser the createUser to set
     */
    public void setCreateUser(long createUser) {
        this.createUser = createUser;
    }

    /**
     * @return the createDate <BR> Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
     */
    public long getCreateDate() {
        return createDate.getTime();
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate.setTime(createDate.getTime());
    }

    /**
     * @param createDate the createDate to set TimeInMillis
     */
    public void setCreateDate(long createDate) {
        this.createDate.setTime(createDate);
    }

    /**
     * @return the updateUser
     */
    public long getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return the update date <BR> Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
     */
    public long getUpdateDate() {
        return updateDate.getTime();
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate.setTime(updateDate.getTime());
    }

    /**
     * @param updateDate the updateDate to set TimeInMillis
     */
    public void setUpdateDate(long updateDate) {
        this.updateDate.setTime(updateDate);
    }

    /**
     * @return the replicate
     */
    public boolean getReplicate() {
        return replicate;
    }

    /**
     * @param replicate the replicate to set
     */
    public void setReplicate(boolean replicate) {
        this.replicate = replicate;
    }

    /**
     * @return the replicateSite
     */
    public String getReplicateSite() {
        return replicateSite;
    }

    /**
     * @param replicateSite the replicateSite to set
     */
    public void setReplicateSite(String replicateSite) {
        this.replicateSite = replicateSite;
    }

    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((createDate == null) ? 0 : createDate.hashCode());
        result = prime * result + (int) (createSite ^ (createSite >>> 32));
        result = prime * result + (int) (createUser ^ (createUser >>> 32));
        result = prime * result
                + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (replicate ? 1231 : 1237);
        result = prime * result
                + ((replicateSite == null) ? 0 : replicateSite.hashCode());
        result = prime * result
                + ((shortName == null) ? 0 : shortName.hashCode());
        result = prime * result
                + ((updateDate == null) ? 0 : updateDate.hashCode());
        result = prime * result + (int) (updateUser ^ (updateUser >>> 32));
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
        if (!(obj instanceof AMain)) {
            return false;
        }
        AMain other = (AMain) obj;
        if (createDate == null) {
            if (other.createDate != null) {
                return false;
            }
        } else if (!createDate.equals(other.createDate)) {
            return false;
        }
        if (createSite != other.createSite) {
            return false;
        }
        if (createUser != other.createUser) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (replicate != other.replicate) {
            return false;
        }
        if (replicateSite == null) {
            if (other.replicateSite != null) {
                return false;
            }
        } else if (!replicateSite.equals(other.replicateSite)) {
            return false;
        }
        if (shortName == null) {
            if (other.shortName != null) {
                return false;
            }
        } else if (!shortName.equals(other.shortName)) {
            return false;
        }
        if (updateDate == null) {
            if (other.updateDate != null) {
                return false;
            }
        } else if (!updateDate.equals(other.updateDate)) {
            return false;
        }
        if (updateUser != other.updateUser) {
            return false;
        }
        return true;
    }
}
