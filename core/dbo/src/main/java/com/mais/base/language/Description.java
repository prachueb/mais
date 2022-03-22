package com.mais.base.language;

import java.io.Serializable;

/**
 * <p>Title: Description</p>
 * <p>Description: data transfer object short data.</p>
 * This class implements to be transferable short data.
 *  <P>
 *  It served as short data transferable object.
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public class Description implements Serializable {
    private static final long serialVersionUID = 973236752335993223L;
    
    private long languageId;
    private String description;

    public Description() {
    }

    public Description(long languageld, String description) {
        setLanguageId(languageld);
        setDescription(description);
    }

    /**
	 * @return the languageId
	 */
	public long getLanguageId() {
		return languageId;
	}

	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguageId(long languageId) {
		this.languageId = languageId;
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

}
