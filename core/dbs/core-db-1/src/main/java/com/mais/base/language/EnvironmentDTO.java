package com.mais.base.language;

import java.io.Serializable;
import java.util.Set;

/**
 * <H1>The environmental data transfer object</H1> <BR/>
 * Using this object to transfer data between EJB. It could be able to transfer
 * multiple objects in the same time. <BR/>
 * <BR/>
 * <b>EnvironmentDTO</b> contains<br/>
 * <i>"User"</i> contains Object[]<br/>
 * <i>"Site"</i> contains Object[]<br/>
 * <i>"LabelLanguage"</i> contains Object[]<br/>
 * <i>"DescriptionLanguage"</i> contains Object[]<br/>
 * <i>"Currency"</i> contains Object[]<br/>
 * <i>"Enterprise"</i> contains Object[]<br/>
 * <i>"Entity0-9"</i> contains Object[]<br/>
 * <i>"SubEntity0-9"</i> contains Object[]<br/>
 * <br/>
 * Object[]:<br/>
 * Object[0] return Long as id<br/>
 * Object[1] return String as Code<br/>
 * Object[2] return String as Short name<br/>
 * Object[3] return String as Description<br/>
 * 
 * @author Dr.Prachueb Sirivongrungson
 */
public class EnvironmentDTO extends GeneralDTO implements Serializable {
	private static final long serialVersionUID = -9203618324342633827L;

	/**
	 * Object[]:<br/>
	 * Object[0] return Long as id<br/>
	 * Object[1] return String as Code<br/>
	 * Object[2] return String as Short name<br/>
	 * Object[3] return String as Description<br/>
	 */
	private Object[] values;
	
	/**
	 * To duplicate the modelDTO.
	 * 
	 * @param environmentDTO as EnvironmentDTO
	 * @return boolean: true = success, false = do nothing
	 */
	public boolean copy(EnvironmentDTO environmentDTO) {
		if (environmentDTO == null)
			return false;

		dto.clear();
		dto.putAll(environmentDTO.getDto());
		return true;
	}

	/**
	 * To get Id
	 * 
	 * @param key as String
	 *  <br/><i>"User", "Site", "LabelLanguage", "DescriptionLanguage",
	 *  "Currency", "Enterprise", "Entity0-9", "SubEntity0-9"</i>
	 * @return Long as Id, -1 if key is null, -2 if the value is not Object[].
	 */
	public Long getId(String key) {
		if (key == null)
			return -1L;
		if (this.getDto(key) instanceof Object[]) {
			return ((Long)((Object[]) this.getDto(key))[0]);
		} else {
			return -2L;
		}
	}
	
	/**
	 * To get Code
	 * 
	 * @param key as String
	 *  <br/><i>"User", "Site", "LabelLanguage", "DescriptionLanguage",
	 *  "Currency", "Enterprise", "Entity0-9", "SubEntity0-9"</i><br/>
	 * @return String as Code
	 */
	public String getCode(String key) {
		if (key == null)
			return null;
		if (this.getDto(key) instanceof Object[]) {
			return ((String)((Object[]) this.getDto(key))[1]);
		} else {
			return null;
		}
	}
	
	/**
	 * To get Short name
	 * 
	 * @param key as String
	 *  <br/><i>"User", "Site", "LabelLanguage", "DescriptionLanguage",
	 *  "Currency", "Enterprise", "Entity0-9", "SubEntity0-9"</i><br/>
	 * @return String as Short name.
	 */
	public String getShortname(String key) {
		if (key == null)
			return null;
		if (this.getDto(key) instanceof Object[]) {
			return ((String)((Object[]) this.getDto(key))[2]);
		} else {
			return null;
		}
	}
	
	/**
	 * To get Description
	 * 
	 * @param key as String
	 *  <br/><i>"User", "Site", "LabelLanguage", "DescriptionLanguage",
	 *  "Currency", "Enterprise", "Entity0-9", "SubEntity0-9"</i><br/>
	 * @return String as Description.
	 */
	public String getDescription(String key) {
		if (key == null)
			return null;
		if (this.getDto(key) instanceof Object[]) {
			return ((String)((Object[]) this.getDto(key))[3]);
		} else {
			return null;
		}
	}
	
	/**
	 * To get all key and values as Object[].
	 * 
	 * @return String as list of result.
	 */
	public String getValues() {
		String result = new String();
		Set <String> keys = this.dto.keySet();
		if (keys == null)
			return ""; 
		for (String key: keys) {
			if (this.getDto(key) instanceof Object[]) {
				values = (Object[]) this.getDto(key);
				if (values == null) {
					result = result + " | " + key + " = null";
				} else {
					result = result + " | " + key + " = " + ((Long) values[0])
						+ ", " + (String) values[1]
						+ ", " + (String) values[2]
						+ ", " + (String) values[3];
				
				}
			} else
					result = result + " | " + key + " = " + this.getDto(key);
		}
		
		return result;
	}
}
