package com.ethen.core.singleton;

/**
 * description => 枚举实现单例
 * 用枚举方式实现单例是最有效的方式
 */
public enum EnumSingleton {

    INSTANCE("fieldValue");

    private String field;

    EnumSingleton(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}
