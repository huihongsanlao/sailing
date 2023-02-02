package com.training.service.impl;

import com.supply.TrainingEnum;
import com.training.factory.ModelFactroy;
import com.training.service.TrainingHandler;
import org.springframework.stereotype.Component;

/**
 * 虫洞训练
 */
@Component
public class WormholeTraining extends TrainingHandler {

    @Override
    public void thermalWeapon() {
        System.out.println("虫洞训练-----热武器激战");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ModelFactroy.initMap(TrainingEnum.WORMHOLE.getCode(),this);
    }
}
