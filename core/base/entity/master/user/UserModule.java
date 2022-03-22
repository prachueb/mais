package base.entity.master.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;

import base.combindedkey.PkIdModule;
import library.enum_module;
import baseobject.entity.ATable;

/**
 * <p>Title: Entity class userModule</p>
 * <p>Description: module of authority.</p>
 * This class implements to persist module authority information.
 *  <P>
 *  It served as authority module entity.
 * <p>Copyright: Copyright (c) 2013</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

//@TableGenerator(name="authorityID",
//        table="AuthorityIDGen",
//        pkColumnName="objectName",
//        valueColumnName="nextID",
//        pkColumnValue="authority",
//        initialValue=1,
//        allocationSize=1)

//@NamedQueries({
//	@NamedQuery(name="authorityID_findByPrimayKey", query="SELECT c FROM userCode c WHERE c.siteId = :siteId AND c.id = :id")
//    ,@NamedQuery(name="authorityID_findByCode_All", query=" SELECT c FROM userCode c WHERE c.code = :code")
//    ,@NamedQuery(name="authorityID_findByCode", query=" SELECT c FROM userCode c WHERE c.code = :code")
//})
@SuppressWarnings("serial")
@IdClass(PkIdModule.class)
@Entity
public class UserModule extends ATable implements Serializable {
	
    /**
     * The enum_module meaning is in PkIdModule.java
     */
    @Id
    @Enumerated(EnumType.STRING)
    private enum_module module;
    @Id
    private long id;
    @Id
    private long enterpriseId;
    
    /**
     * Using access code to match the pattern allowed by each modules
     * eg. Acc001 then the function in that module allowUser=.* <br>
     * It may be implemented using each position represent each importance functions
     * such as, position 2 for access costing while position 5 for pricing.
     * If user allow to do these functions, the accessCode could be -c--p---------.
     * While the implementation of allowance in the function costing should allow only c
     * in the 2nd column and the function pricing should allow only p in the 5th column.
     */
	@Column(length=1024)
    private String accessCode;

    /** Creates a new instance of userCode */
    public UserModule() {
    }

	/**
	 * @return the id
	 */
	public long id() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the module
	 */
	public enum_module getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(enum_module module) {
		this.module = module;
	}

	/**
	 * @return the enterpriseId
	 */
	public long getEnterpriseId() {
		return enterpriseId;
	}

	/**
	 * @param enterpriseId the enterpriseId to set
	 */
	public void setEnterpriseId(long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	/**
	 * @return the accessCode
	 */
	public String getAccessCode() {
		return accessCode;
	}

	/**
	 * @param accessCode the accessCode to set
	 */
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accessCode == null) ? 0 : accessCode.hashCode());
		result = prime * result + (int) (enterpriseId ^ (enterpriseId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((module == null) ? 0 : module.hashCode());
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
		if (!(obj instanceof UserModule)) {
			return false;
		}
		UserModule other = (UserModule) obj;
		if (accessCode == null) {
			if (other.accessCode != null) {
				return false;
			}
		} else if (!accessCode.equals(other.accessCode)) {
			return false;
		}
		if (enterpriseId != other.enterpriseId) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (module != other.module) {
			return false;
		}
		return true;
	}

}
