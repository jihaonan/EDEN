package com.liaoyb.ssm.po;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.liaoyb.ssm.controller.validation.ValidGroup2;
import com.liaoyb.ssm.controller.validation.ValidGroup_Register;


public class User {
    private Integer id;
    @Size(min=3,max=20,message="{user.name.length}",groups={ValidGroup_Register.class})
    private String username;

    //@NotEmpty(message="{user.password.isNull}",groups={ValidGroup_Register.class})
    @Size(min=3,max=20,message="{user.password.length}",groups={ValidGroup_Register.class})
    private String password;

    private String email;

    private String nickname;

    private Integer imgid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }
}