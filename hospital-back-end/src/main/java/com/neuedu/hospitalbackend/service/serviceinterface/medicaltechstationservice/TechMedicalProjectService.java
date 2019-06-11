package com.neuedu.hospitalbackend.service.serviceinterface.medicaltechstationservice;

import com.neuedu.hospitalbackend.model.vo.ProjectParam;
import com.neuedu.hospitalbackend.model.vo.PatientParam;
import com.neuedu.hospitalbackend.util.CommonResult;

/**
 * 4. 检查项目医技工作站
 */
public interface TechMedicalProjectService {


    /**
     * 患者查询
     * 输入患者病历号或姓名，可以查询到本科室（检查/检验）的待诊患者列表
     * @param patientParam: projectType, caseId, patientName
     * @return 待登记患者信息列表
     */
    CommonResult listPreparedPatientsByCaseIdOrName(PatientParam patientParam);

    /**
     * 患者查询
     * 选择患者可以相应申请的项目明细
     * @param patientParam: projectType, caseId, patientName
     * @return projectId, projectName, projectCollectionGMTCreate, t.status(是否已缴费), requirement
     */
    CommonResult listAppliedProjectsByCaseId(PatientParam patientParam);

    /**
     * 执行确认
     * 选中相应的患者，选中执行的项目，点击“执行确认”按钮，进行登记操作。
     * 只有已缴费的项目，才可以进行登记
     * 更新项目申请信息：状态更新、填写医技医生id
     * @param projectParam：projectType, collectionId, projectId, doctorRoleId
     * @return 改动数据库行数
     */
    CommonResult checkInProject(ProjectParam projectParam);

    /**
     * 取消执行
     * 选中相应的患者，选中项目，点击“取消执行”按钮，进行取消操作。
     * 更新项目申请信息：改变状态
     * @param projectParam：projectType, collectionId, projectId
     */
    CommonResult cancelProject(ProjectParam projectParam);

    /**
     * 填写结果
     * 显示所有已登记但未录入结果的项目
     * @param patientParam: projectType, caseId
     */
    CommonResult listCheckedInButNotRecordedProject(PatientParam patientParam);

    /**
     * 填写结果
     * 选中相应的患者和项目后，点击“结果录入”按钮，录入检查结果，如果检查项目有图片，上传检查结果图片
     * 录入结果: 结果文字、图片（非必填）、医生建议
     * @param projectParam:projectCollectionId, projectId, resultDescription, resultImage, advice
     */
    CommonResult recordResult(ProjectParam projectParam);

}