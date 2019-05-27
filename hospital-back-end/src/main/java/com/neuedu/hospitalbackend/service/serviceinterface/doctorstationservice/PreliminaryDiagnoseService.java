package com.neuedu.hospitalbackend.service.serviceinterface.doctorstationservice;


import com.alibaba.fastjson.JSONObject;
import com.neuedu.hospitalbackend.model.po.Patient;
import com.neuedu.hospitalbackend.model.po.PatientCaseTemplate;

import java.util.List;


/**
 * 3.1  门诊病历首页
 * 包含关于门诊病历首页的service方法
 * @author Steve
 */
public interface PreliminaryDiagnoseService {


    /**
     * get all  waited patient of the doctor
     * @param doctorId of the doctor
     * @return list of patient
     */
    public List<Patient> listWaitedPatients(Integer doctorId);


    /**
     * 得到该医生的所有已诊患者
     * @param doctorId of the doctor
     * @return list of patient
     */
    public List<Patient> listDiagnosedPatients(Integer doctorId);


    /**
     * 将当前病历首页中的内容存入数据库
     * @param caseInfo 当前病历首页中的内容
     */
    public void saveCurrentPreCase(JSONObject caseInfo);


    /**
     * 提交最终版病历首页中的内容到数据库
     * @param caseInfo 当前病历首页中的内容
     */
    public void saveFinalPreCase(JSONObject caseInfo);


















}