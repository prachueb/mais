package base.entity.master.currency;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <p>Title: Entity class CurrencyRate</p>
 * <p>Description: rate currency entity.</p>
 * This class implements to persist conversion rate of currency information.
 *  <P>
 *  It served as conversion rate of the currency entity.
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
public class CurrencyRate implements Serializable {

    @Id  // Internal ID of this currency
    private long id;
    private float homeRate;
    private float foreignRate;
    private String noteRate;
    
    private boolean deleted;
    private boolean purgable;
    private boolean active;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date expireDate;
	
    private long createUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    private long updateUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
	
	
    /**
     * Creates a new instance of currencyRate
     */
    public CurrencyRate() {
        startDate = new Date();
        expireDate = new Date();

        createDate = new Date();
        updateDate = new Date();
    }


}
