package com.neuedu.hospitalbackend.model.testPO;

import java.util.Date;

public class Treatment {
    private Integer id;

    private Integer caseId;

    private Integer projectId;

    private Boolean status;

    private Integer creatorRoleId;

    private Integer inspectorRoleId;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCreatorRoleId() {
        return creatorRoleId;
    }

    public void setCreatorRoleId(Integer creatorRoleId) {
        this.creatorRoleId = creatorRoleId;
    }

    public Integer getInspectorRoleId() {
        return inspectorRoleId;
    }

    public void setInspectorRoleId(Integer inspectorRoleId) {
        this.inspectorRoleId = inspectorRoleId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}