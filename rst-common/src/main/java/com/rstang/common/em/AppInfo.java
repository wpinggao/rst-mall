package com.rstang.common.em;

/**
 * Created by yeyx on 2017/9/5.
 */
public enum AppInfo {

    MALL("mall", "商城"), AGENT("agent", "代理商"), SYS("sys", "系统基础"), WECHAT("WC", "微信");

    private String code;
    private String desc;

    AppInfo(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
