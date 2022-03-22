package com.mais.dbo.baseobject.jms;

import java.io.Serializable;

import com.mais.dbo.baseobject.context.Connection;
import com.mais.dbo.baseobject.dto.DTO;


/**
 * <p>Title: PersistanceMessage</p>
 * <p>Description: Encapsulated persistence message.</p>
 * This class implements to be encapsulated persistence message.
 *  <P>
 *  It served as encapsulated persistence message to be sent via JMS.
 * <p>Copyright: Copyright (c) 2007</p>
 * 
 * @author Dr.Prachueb Sirivongrungson
 * @version 1.0
 */
public class PersistenceMessage implements Serializable {
    private static final long serialVersionUID = 2493279906873547108L;
//    command {crate, edit, changeCode, setActive, destroy, resetDatabase};
    private String command;
    private String objectdb;
    private Connection connectionInfo;
    private DTO data;
    private String replicateTo;
    
    /** Creates a new instance of persistanceMessage */
    public PersistenceMessage() {
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getObjectdb() {
        return objectdb;
    }

    public void setObjectdb(String objectdb) {
        this.objectdb = objectdb;
    }

    public Connection getConnectionInfo() {
        return connectionInfo;
    }

    public void setCurrentInfo(Connection connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public DTO getData() {
        return data;
    }

    public void setData(DTO data) {
        this.data = data;
    }

    public String getReplicateTo() {
        return replicateTo;
    }

    public void setReplicateTo(String replicateTo) {
        this.replicateTo = replicateTo;
    }

    
}
