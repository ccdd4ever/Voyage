package com.voyage.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @Author: void.
 * @Date: 9/28/16.
 */
@Document(collection = "user")
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    @Field("user_name")
    private String userName;

    @Field("pwd")
    private String passWord;

    private String salt;

    @Field("cn_name")
    private String cnName;

    @Field("phone_num")
    private String phoneNum;

    @Field("email")
    private String Email;

    @Field("create_at")
    private Long createAt;

    @Field("update_at")
    private Long UpdateAt;

    @Field("is_active")
    private boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return UpdateAt;
    }

    public void setUpdateAt(Long updateAt) {
        UpdateAt = updateAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", cnName='" + cnName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", Email='" + Email + '\'' +
                ", createAt=" + createAt +
                ", UpdateAt=" + UpdateAt +
                ", isActive=" + isActive +
                '}';
    }

    //TODO Add param check
    public boolean valid() {
        return true;
    }
}
