package com.mais.baseobject.odb.Exception;

/**
 * <p>Title: ODBException</p>
 * <p>Description: Abstract super class for object database exception.</p>
 * This class implements to be super class of all object database exception.
 *  <P>
 *  It served as super class of object database exception.
 * <p>Copyright: Copyright (c) 2010</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

public class ODBException extends Exception {
    private static final long serialVersionUID = 2493263464323595948L;

    /** Creates a new instance of ODBException */
    public ODBException() {
    }

    /** Creates a new instance of ODBException */
    public ODBException(String message) {
        super(message);
    }

}
