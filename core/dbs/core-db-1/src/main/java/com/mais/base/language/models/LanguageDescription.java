package com.mais.base.language.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import com.mais.baseobject.odb.models.ADescription;

/**
 * <p>Title: Entity class LanguageDescription</p>
 * <p>Description: description of language.</p>
 * This class implements to persist language description information.
 *  <P>
 *  It served as language description entity.
 * <p>Copyright: Copyright (c) 2011</p>
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */

@SuppressWarnings("serial")
@Entity
@Table(indexes={@Index(columnList="ID"),
@Index(columnList="LANGUAGEID"),
@Index(columnList="DESCRIPTION")})  // Index in @MappedSuperclass not work!
public class LanguageDescription extends ADescription implements Serializable {
    /** Creates a new instance of userDescription */
    public LanguageDescription() {
    }

}
