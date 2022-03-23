package com.mais.baseobject.odb.models;

/*
 * AMain.java
 *
 * Created on November 26, 2006, 10:58 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.lang.Object;
import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
//import jakarta.persistence.Lob;
import jakarta.persistence.Basic;
import jakarta.persistence.FetchType;
import jakarta.persistence.Column;

/**
 * <p>
 * Title: AMain
 * </p>
 * <p>
 * Description: Abstract super class for all Main Entity.
 * </p>
 * This class implements to be super class of all main Entity. <BR>
 * It served as super class of main Entity.
 * <p>
 * Copyright: Copyright (c) 2010
 * </p>
 *
 * @author Prachueb Sirivongrungson
 * @version 1.0
 */
@MappedSuperclass
//@Table(indexes={@Index(columnList="SHORTNAME"),
//@Index(columnList="CREATESITE")})  // Index in @MappedSuperclass not work!
public abstract class AMain {

    // The primary key will automatic generate index.
    // The index useful in WHERE not in ORDER BY
    @Id
    @Column(columnDefinition="CHAR(30)")
    private String id;

    protected byte[] barcode;
    private String barcodeCode;

    private String createSite;
    private String createUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    private String updateUser;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

//    private boolean replicate;  // No need to flag. Should to publish to massage bus anyway for other purpose.
    @Column(length=30)
    private String replicateSite;

    /**
     * Validation of edit delete or view in each record/instance
     * defined as pattern match but null means no validation rule.
     * The view validation is on ACode for quick search.
     */
    private String allowEnterpriseEdit;
    private String allowEnterpriseDelete;
    private String allowSBU0Edit;
    private String allowSBU0Delete;
    private String allowSBU1Edit;
    private String allowSBU1Delete;
    private String allowSBU2Edit;
    private String allowSBU2Delete;
    private String allowSBU3Edit;
    private String allowSBU3Delete;
    private String allowSBU4Edit;
    private String allowSBU4Delete;
    private String allowSBU5Edit;
    private String allowSBU5Delete;
    private String allowSBU6Edit;
    private String allowSBU6Delete;
    private String allowSBU7Edit;
    private String allowSBU7Delete;
    private String allowSBU8Edit;
    private String allowSBU8Delete;
    private String allowSBU9Edit;
    private String allowSBU9Delete;
    private String allowSU0Edit;
    private String allowSU0Delete;
    private String allowSU1Edit;
    private String allowSU1Delete;
    private String allowSU2Edit;
    private String allowSU2Delete;
    private String allowSU3Edit;
    private String allowSU3Delete;
    private String allowSU4Edit;
    private String allowSU4Delete;
    private String allowSU5Edit;
    private String allowSU5Delete;
    private String allowSU6Edit;
    private String allowSU6Delete;
    private String allowSU7Edit;
    private String allowSU7Delete;
    private String allowSU8Edit;
    private String allowSU8Delete;
    private String allowSU9Edit;
    private String allowSU9Delete;
    private String allowUserGroupEdit;
    private String allowUserGroupDelete;
    private String allowUserEdit;
    private String allowUserDelete;

    /** Creates a new instance of AMain */
    public AMain() {
        createDate = new Date();
        updateDate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getBarcode() {
        return barcode;
    }

    public void setBarcode(byte[] barcode) {
        this.barcode = barcode;
    }

    public String getBarcodeCode() {
        return barcodeCode;
    }

    public void setBarcodeCode(String barcodeCode) {
        this.barcodeCode = barcodeCode;
    }

    public String getCreateSite() {
        return createSite;
    }

    public void setCreateSite(String createSite) {
        this.createSite = createSite;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getReplicateSite() {
        return replicateSite;
    }

    public void setReplicateSite(String replicateSite) {
        this.replicateSite = replicateSite;
    }

    public String getAllowEnterpriseEdit() {
        return allowEnterpriseEdit;
    }

    public void setAllowEnterpriseEdit(String allowEnterpriseEdit) {
        this.allowEnterpriseEdit = allowEnterpriseEdit;
    }

    public String getAllowEnterpriseDelete() {
        return allowEnterpriseDelete;
    }

    public void setAllowEnterpriseDelete(String allowEnterpriseDelete) {
        this.allowEnterpriseDelete = allowEnterpriseDelete;
    }

    public String getAllowSBU0Edit() {
        return allowSBU0Edit;
    }

    public void setAllowSBU0Edit(String allowSBU0Edit) {
        this.allowSBU0Edit = allowSBU0Edit;
    }

    public String getAllowSBU0Delete() {
        return allowSBU0Delete;
    }

    public void setAllowSBU0Delete(String allowSBU0Delete) {
        this.allowSBU0Delete = allowSBU0Delete;
    }

    public String getAllowSBU1Edit() {
        return allowSBU1Edit;
    }

    public void setAllowSBU1Edit(String allowSBU1Edit) {
        this.allowSBU1Edit = allowSBU1Edit;
    }

    public String getAllowSBU1Delete() {
        return allowSBU1Delete;
    }

    public void setAllowSBU1Delete(String allowSBU1Delete) {
        this.allowSBU1Delete = allowSBU1Delete;
    }

    public String getAllowSBU2Edit() {
        return allowSBU2Edit;
    }

    public void setAllowSBU2Edit(String allowSBU2Edit) {
        this.allowSBU2Edit = allowSBU2Edit;
    }

    public String getAllowSBU2Delete() {
        return allowSBU2Delete;
    }

    public void setAllowSBU2Delete(String allowSBU2Delete) {
        this.allowSBU2Delete = allowSBU2Delete;
    }

    public String getAllowSBU3Edit() {
        return allowSBU3Edit;
    }

    public void setAllowSBU3Edit(String allowSBU3Edit) {
        this.allowSBU3Edit = allowSBU3Edit;
    }

    public String getAllowSBU3Delete() {
        return allowSBU3Delete;
    }

    public void setAllowSBU3Delete(String allowSBU3Delete) {
        this.allowSBU3Delete = allowSBU3Delete;
    }

    public String getAllowSBU4Edit() {
        return allowSBU4Edit;
    }

    public void setAllowSBU4Edit(String allowSBU4Edit) {
        this.allowSBU4Edit = allowSBU4Edit;
    }

    public String getAllowSBU4Delete() {
        return allowSBU4Delete;
    }

    public void setAllowSBU4Delete(String allowSBU4Delete) {
        this.allowSBU4Delete = allowSBU4Delete;
    }

    public String getAllowSBU5Edit() {
        return allowSBU5Edit;
    }

    public void setAllowSBU5Edit(String allowSBU5Edit) {
        this.allowSBU5Edit = allowSBU5Edit;
    }

    public String getAllowSBU5Delete() {
        return allowSBU5Delete;
    }

    public void setAllowSBU5Delete(String allowSBU5Delete) {
        this.allowSBU5Delete = allowSBU5Delete;
    }

    public String getAllowSBU6Edit() {
        return allowSBU6Edit;
    }

    public void setAllowSBU6Edit(String allowSBU6Edit) {
        this.allowSBU6Edit = allowSBU6Edit;
    }

    public String getAllowSBU6Delete() {
        return allowSBU6Delete;
    }

    public void setAllowSBU6Delete(String allowSBU6Delete) {
        this.allowSBU6Delete = allowSBU6Delete;
    }

    public String getAllowSBU7Edit() {
        return allowSBU7Edit;
    }

    public void setAllowSBU7Edit(String allowSBU7Edit) {
        this.allowSBU7Edit = allowSBU7Edit;
    }

    public String getAllowSBU7Delete() {
        return allowSBU7Delete;
    }

    public void setAllowSBU7Delete(String allowSBU7Delete) {
        this.allowSBU7Delete = allowSBU7Delete;
    }

    public String getAllowSBU8Edit() {
        return allowSBU8Edit;
    }

    public void setAllowSBU8Edit(String allowSBU8Edit) {
        this.allowSBU8Edit = allowSBU8Edit;
    }

    public String getAllowSBU8Delete() {
        return allowSBU8Delete;
    }

    public void setAllowSBU8Delete(String allowSBU8Delete) {
        this.allowSBU8Delete = allowSBU8Delete;
    }

    public String getAllowSBU9Edit() {
        return allowSBU9Edit;
    }

    public void setAllowSBU9Edit(String allowSBU9Edit) {
        this.allowSBU9Edit = allowSBU9Edit;
    }

    public String getAllowSBU9Delete() {
        return allowSBU9Delete;
    }

    public void setAllowSBU9Delete(String allowSBU9Delete) {
        this.allowSBU9Delete = allowSBU9Delete;
    }

    public String getAllowSU0Edit() {
        return allowSU0Edit;
    }

    public void setAllowSU0Edit(String allowSU0Edit) {
        this.allowSU0Edit = allowSU0Edit;
    }

    public String getAllowSU0Delete() {
        return allowSU0Delete;
    }

    public void setAllowSU0Delete(String allowSU0Delete) {
        this.allowSU0Delete = allowSU0Delete;
    }

    public String getAllowSU1Edit() {
        return allowSU1Edit;
    }

    public void setAllowSU1Edit(String allowSU1Edit) {
        this.allowSU1Edit = allowSU1Edit;
    }

    public String getAllowSU1Delete() {
        return allowSU1Delete;
    }

    public void setAllowSU1Delete(String allowSU1Delete) {
        this.allowSU1Delete = allowSU1Delete;
    }

    public String getAllowSU2Edit() {
        return allowSU2Edit;
    }

    public void setAllowSU2Edit(String allowSU2Edit) {
        this.allowSU2Edit = allowSU2Edit;
    }

    public String getAllowSU2Delete() {
        return allowSU2Delete;
    }

    public void setAllowSU2Delete(String allowSU2Delete) {
        this.allowSU2Delete = allowSU2Delete;
    }

    public String getAllowSU3Edit() {
        return allowSU3Edit;
    }

    public void setAllowSU3Edit(String allowSU3Edit) {
        this.allowSU3Edit = allowSU3Edit;
    }

    public String getAllowSU3Delete() {
        return allowSU3Delete;
    }

    public void setAllowSU3Delete(String allowSU3Delete) {
        this.allowSU3Delete = allowSU3Delete;
    }

    public String getAllowSU4Edit() {
        return allowSU4Edit;
    }

    public void setAllowSU4Edit(String allowSU4Edit) {
        this.allowSU4Edit = allowSU4Edit;
    }

    public String getAllowSU4Delete() {
        return allowSU4Delete;
    }

    public void setAllowSU4Delete(String allowSU4Delete) {
        this.allowSU4Delete = allowSU4Delete;
    }

    public String getAllowSU5Edit() {
        return allowSU5Edit;
    }

    public void setAllowSU5Edit(String allowSU5Edit) {
        this.allowSU5Edit = allowSU5Edit;
    }

    public String getAllowSU5Delete() {
        return allowSU5Delete;
    }

    public void setAllowSU5Delete(String allowSU5Delete) {
        this.allowSU5Delete = allowSU5Delete;
    }

    public String getAllowSU6Edit() {
        return allowSU6Edit;
    }

    public void setAllowSU6Edit(String allowSU6Edit) {
        this.allowSU6Edit = allowSU6Edit;
    }

    public String getAllowSU6Delete() {
        return allowSU6Delete;
    }

    public void setAllowSU6Delete(String allowSU6Delete) {
        this.allowSU6Delete = allowSU6Delete;
    }

    public String getAllowSU7Edit() {
        return allowSU7Edit;
    }

    public void setAllowSU7Edit(String allowSU7Edit) {
        this.allowSU7Edit = allowSU7Edit;
    }

    public String getAllowSU7Delete() {
        return allowSU7Delete;
    }

    public void setAllowSU7Delete(String allowSU7Delete) {
        this.allowSU7Delete = allowSU7Delete;
    }

    public String getAllowSU8Edit() {
        return allowSU8Edit;
    }

    public void setAllowSU8Edit(String allowSU8Edit) {
        this.allowSU8Edit = allowSU8Edit;
    }

    public String getAllowSU8Delete() {
        return allowSU8Delete;
    }

    public void setAllowSU8Delete(String allowSU8Delete) {
        this.allowSU8Delete = allowSU8Delete;
    }

    public String getAllowSU9Edit() {
        return allowSU9Edit;
    }

    public void setAllowSU9Edit(String allowSU9Edit) {
        this.allowSU9Edit = allowSU9Edit;
    }

    public String getAllowSU9Delete() {
        return allowSU9Delete;
    }

    public void setAllowSU9Delete(String allowSU9Delete) {
        this.allowSU9Delete = allowSU9Delete;
    }

    public String getAllowUserGroupEdit() {
        return allowUserGroupEdit;
    }

    public void setAllowUserGroupEdit(String allowUserGroupEdit) {
        this.allowUserGroupEdit = allowUserGroupEdit;
    }

    public String getAllowUserGroupDelete() {
        return allowUserGroupDelete;
    }

    public void setAllowUserGroupDelete(String allowUserGroupDelete) {
        this.allowUserGroupDelete = allowUserGroupDelete;
    }

    public String getAllowUserEdit() {
        return allowUserEdit;
    }

    public void setAllowUserEdit(String allowUserEdit) {
        this.allowUserEdit = allowUserEdit;
    }

    public String getAllowUserDelete() {
        return allowUserDelete;
    }

    public void setAllowUserDelete(String allowUserDelete) {
        this.allowUserDelete = allowUserDelete;
    }

}
