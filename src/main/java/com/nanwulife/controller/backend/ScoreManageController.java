package com.nanwulife.controller.backend;

import com.nanwulife.service.IExperimentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project: ExperimentalReportSystem
 * @Description: 实验成绩管理模块
 * @Author: Cenjie Creams
 * @Date: Created in 2018/9/14
 */
@Controller
@RequestMapping("/manage/score")
public class ScoreManageController {

    private static final Logger logger = LoggerFactory.getLogger(ScoreManageController.class);

    @Autowired
    IExperimentService iExperimentService;

//    public ServerResponse<Score>
    
    
    
}

