package com.supply;

/**
 * 训练场景枚举
 */
public enum TrainingEnum {

    /*    public static String DAILY = "001";
        public static String wormhole = "002";*/
    DAILY("001", "日常训练"),
    WORMHOLE("002", "虫洞训练"),

    ;
    private String code;
    private String desc;

    TrainingEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
