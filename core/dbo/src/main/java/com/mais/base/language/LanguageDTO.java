package com.mais.base.language;


/**
 * <p>
 * Title: SiteDTO
 * </p>
 * <p>
 * Description: site data transfer object.
 * </p>
 * This class implements to be site transferable data.<BR>
 * It served as site data transferable object.
 * <p>
 * Copyright: Copyright (c) 2011
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
public class LanguageDTO extends DTO {
	private static final long serialVersionUID = 5037367393070214185L;

	/**
	 * Basic copy should to have the coding of
	 * super._copyDTO(data);
	 */
	@Override
	public boolean copy(DTO data) {
		if (data == null)
			return false;
		super._copyDTO(data);
		
		return true;
	}

}
