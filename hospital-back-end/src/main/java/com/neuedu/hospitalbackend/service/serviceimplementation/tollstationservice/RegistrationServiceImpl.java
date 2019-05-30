package com.neuedu.hospitalbackend.service.serviceimplementation.tollstationservice;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.neuedu.hospitalbackend.model.dao.ArrangementMapper;
import com.neuedu.hospitalbackend.model.dao.PatientMapper;
import com.neuedu.hospitalbackend.model.dto.RegistrationParam;
import com.neuedu.hospitalbackend.model.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Service
public class RegistrationServiceImpl implements com.neuedu.hospitalbackend.service.serviceinterface.tollstationservice.RegistrationService {


    @Autowired
    private ArrangementMapper arrangementMapper;
    @Override
    public JSONObject listAvailableDoctors(RegistrationParam registrationParam){
        List<Arrangement> availableDoctors = arrangementMapper.listAvailableDoctors(registrationParam.getAppointmentDateStr(), registrationParam.getRegistrationLevelId(), registrationParam.getDepartmentId());
        for(Arrangement a: availableDoctors){
            System.out.println(a.getUserName());
        }
        JSONObject result = new JSONObject();
        result.put("availableDoctors", availableDoctors);
        return result;
    }

    @Override
    public void updateRemainingAppointment(Arrangement arrangement){

    }
    @Override
    public int calculateAmount(JSONObject jsonObject){
        return 0;
    }
    @Override
    public void insertRegistrationLog(Registration registration){

    }
    @Override
    public void insertPatientCaseLog(PatientCase patientCase){

    }
}