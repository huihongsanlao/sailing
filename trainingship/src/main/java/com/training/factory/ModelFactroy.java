package com.training.factory;

import com.training.service.TrainingHandler;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 训练模式工厂类
 */
public class ModelFactroy {

    private static Map<String,TrainingHandler> handlerMap = new ConcurrentHashMap<>();

    public static void initMap(String type,TrainingHandler handler){
        if(StringUtils.isEmpty(type)|| ObjectUtils.isEmpty(handler)){
            return ;
        }
        handlerMap.put(type,handler);
    }
    public static TrainingHandler getInvokeStrategy(String type){
        TrainingHandler handler = handlerMap.get(type);
        if(ObjectUtils.isEmpty(handler)){
            throw new UnsupportedOperationException("没有该类型对应的执行类");
        }
        return handler;
    }


}
