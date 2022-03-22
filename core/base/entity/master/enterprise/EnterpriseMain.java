package base.entity.master.enterprise;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import baseobject.entity.AMain;

/**
 * <p>Title: Entity class EnterpriseMain</p>
 * <p>Description: main Enterprise entity.</p>
 * This class implements to persist main Enterprise information.
 *  <P>
 *  It served as main Enterprise entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
//@NamedQueries({
//	@NamedQuery(name="authority_findByPrimayKey", query="SELECT m FROM userMain m WHERE m.siteId = :siteId AND m.id = :id")
////	,@NamedQuery(name="authority_findRange", query="SELECT new dto.base.authorityCodeMain(c,m) FROM userCode c, userMain m WHERE c.siteId = m.siteId AND c.id = m.id")
////    ,@NamedQuery(name="authority_findQueueName", query="SELECT m.queueName FROM userCode c, userMain m WHERE c.code LIKE :codePattern AND m.id = c.id")
////    ,@NamedQuery(name="authority_findConnectionName", query="SELECT m.connectionName FROM autorityCode c, userMain m WHERE c.code LIKE :codePattern AND m.siteId = c.siteId AND m.id = c.id")
////    ,@NamedQuery(name="authority_findConnectionQueueName", query="SELECT new baseobject.objectdatabase.DTOStringString(m.connectionName, m.queueName) FROM userCode c, userMain m WHERE c.code LIKE :codePattern AND m.siteId = c.siteId AND m.id = c.id")
//})
@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="SHORTNAME"),
@Index(columnList="CREATESITE")})  // Index in @MappedSuperclass not work!
public class EnterpriseMain extends AMain implements Serializable {
	
	private String accountCurrency;

    /**
     * Creates a new instance of EnterpriseMain
     */
    public EnterpriseMain() {
    }

	/**
	 * @return the accountCurrency
	 */
	public String getAccountCurrency() {
		return accountCurrency;
	}

	/**
	 * @param accountCurrency the accountCurrency to set
	 */
	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((accountCurrency == null) ? 0 : accountCurrency.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof EnterpriseMain)) {
			return false;
		}
		EnterpriseMain other = (EnterpriseMain) obj;
		if (accountCurrency == null) {
			if (other.accountCurrency != null) {
				return false;
			}
		} else if (!accountCurrency.equals(other.accountCurrency)) {
			return false;
		}
		return true;
	}


}
