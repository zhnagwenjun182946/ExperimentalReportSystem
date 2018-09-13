package com.nanwulife.service.impl;

import com.nanwulife.dao.MajorMapper;
import com.nanwulife.pojo.Major;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Project: ExperimentalReportSystem
 * @Description: 专业信息Service层实现
 * @Author: Cenjie
 * @Date: Created in 2018/9/13
 */

@Service("iMajorService")
public class MajorServiceImpl {

    private Logger logger = LoggerFactory.getLogger(MajorServiceImpl.class);

    @Autowired
    MajorMapper majorMapper;

//    public ArrayList<Major> getMajors(){
////        ArrayList<Major> majors = majorMapper.
//
//    }
}
