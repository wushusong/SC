package com.mywork.sc.entity;

public class Orderstate {
    private Integer osid;

    private String stateDesc;

    public Integer getOsid() {
        return osid;
    }

    public void setOsid(Integer osid) {
        this.osid = osid;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }
}