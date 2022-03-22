package com.mais.base.language;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <H1>The data transfer object</H1> <BR/>
 * Using this object to transfer data between EJB. It could be able to transfer
 * multiple objects in the same time. <BR/>
 * <BR/>
 * <b>For currentValues</b> <br/>
 * <b>GeneralDTO currentValues</b> as<br/>
 * <i>"UserDTO"</i> contains UserDTO<br/>
 * <i>"SiteList"</i> contains List of String of site or null<br/>
 * <i>"LabelLanguageList"</i> contains List of String of language of label to be
 * used or null<br/>
 * <i>"DescriptionLanguageList"</i> contains List of String of language of
 * description to be used or null<br/>
 * <i>"CurrencyList"</i> contains List of String of currency or null<br/>
 * <i>"EnterpriseList"</i> contains List of Enterprise or null<br/>
 * <i>"Entity0-9List"</i> contains List of Entity 0 - 9 or null<br/>
 * <i>"SubEntity0-9List"</i> contains List of SubEntity 0 - 9 or null<br/>
 * 
 * @author Dr.Prachueb Sirivongrungson
 */
public class GeneralDTO implements Serializable {
	private static final long serialVersionUID = -9203618324364243827L;

	/**
	 * Use to transfer multiple dtos.
	 */
	protected Map<String, Object> dto;

	/**
	 * Default constructor.
	 */
	public GeneralDTO() {
		dto = new HashMap<String, Object>();
	}

	/**
	 * To duplicate the modelDTO.
	 * 
	 * @param modelDTO
	 * @return
	 */
	public boolean copy(GeneralDTO generalDTO) {
		if (generalDTO == null)
			return false;

		dto.clear();
		dto.putAll(generalDTO.getDto());
		return true;
	}

	/**
	 * To clear all dtos in modelDTO
	 */
	public void clear() {
		dto.clear();
	}

	/**
	 * To get all keys list.
	 * 
	 * @return the dtos
	 */
	public Set<String> getKeySet() {
		return dto.keySet();
	}

	/**
	 * To get all keys list.
	 * 
	 * @return the dtos
	 */
	public String getKey() {
		String result = new String();
		Set <String> keys = this.dto.keySet();
		for (String key: keys)
			result = result + " | " + key;
		
		return result;
	}
	
	/**
	 * To get multiple dtos at a single function call.
	 * 
	 * @return the dtos
	 */
	public Map<String, Object> getDto() {
		return dto;
	}

	/**
	 * To get the specific object that was naming in the dtoName parameter.
	 * 
	 * @return the dto
	 */
	public Object getDto(String dtoName) {
		return dto.get(dtoName);
	}

	/**
	 * To set multiple dtos at a single function call. The existing dtos would
	 * be cleared.
	 * 
	 * @param data
	 */
	public void setDto(Map<String, Object> data) {
		this.dto.putAll(data);
	}

	/**
	 * To set the specific dto or GeneralDTO as naming.
	 * 
	 * @param dtoName
	 *            the dto to set
	 * @param dto
	 *            the dto to set
	 */
	public void setDto(String dtoName, Object data) {
		if (this.dto.containsKey(dtoName))
			this.dto.remove(dtoName);
		
		if (data instanceof GeneralDTO) {
			GeneralDTO mData = new GeneralDTO();
			mData.copy((GeneralDTO) data);
			this.dto.put(dtoName, mData);
		} else {
			this.dto.put(dtoName, data);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dto == null) ? 0 : dto.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		if (!(obj instanceof GeneralDTO)) {
			return false;
		}
		GeneralDTO other = (GeneralDTO) obj;
		if (dto == null) {
			if (other.dto != null) {
				return false;
			}
		} else if (!dto.equals(other.dto)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeneralDTO [dto=" + dto + "]";
	}

}
