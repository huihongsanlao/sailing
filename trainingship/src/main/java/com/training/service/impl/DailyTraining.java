package com.training.service.impl;

import com.supply.TrainingEnum;
import com.training.factory.ModelFactroy;
import com.training.service.TrainingHandler;
import org.springframework.stereotype.Component;

/**
 * 日常训练
 */
@Component
public class DailyTraining extends TrainingHandler {

    @Override
    public void coldWeapon() {
        System.out.println("日常训练---短兵相见");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ModelFactroy.initMap(TrainingEnum.DAILY.getCode(),this);
    }
}
