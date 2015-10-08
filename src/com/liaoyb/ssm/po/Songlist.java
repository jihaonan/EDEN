package com.liaoyb.ssm.po;

public class Songlist {
    private Integer id;

    private String listname;

    private String listinfo;

    private Integer collectcount;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname == null ? null : listname.trim();
    }

    public String getListinfo() {
        return listinfo;
    }

    public void setListinfo(String listinfo) {
        this.listinfo = listinfo == null ? null : listinfo.trim();
    }

    public Integer getCollectcount() {
        return collectcount;
    }

    public void setCollectcount(Integer collectcount) {
        this.collectcount = collectcount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}