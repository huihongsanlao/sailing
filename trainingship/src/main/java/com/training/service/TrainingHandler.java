package com.training.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public abstract class TrainingHandler implements InitializingBean {

    public void coldWeapon() {
        throw new UnsupportedOperationException("未实现该业务");
    }

    public void thermalWeapon() {
        throw new UnsupportedOperationException("未实现该业务");
    }

}
