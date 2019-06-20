package com.tiany.jwsdemo.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class User implements Serializable {
    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public static final Integer NOT_DELETED = 0;

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public static final Integer DELETED = 1;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private String phone;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private String email;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private Integer is_delete;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private String password;

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column demo..user.id
     *
     * @return the value of demo..user.id
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public User withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column demo..user.id
     *
     * @param id the value for demo..user.id
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column demo..user.name
     *
     * @return the value of demo..user.name
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public User withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column demo..user.name
     *
     * @param name the value for demo..user.name
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column demo..user.phone
     *
     * @return the value of demo..user.phone
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public User withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column demo..user.phone
     *
     * @param phone the value for demo..user.phone
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method returns the value of the database column demo..user.email
     *
     * @return the value of demo..user.email
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public User withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    /**
     * This method sets the value of the database column demo..user.email
     *
     * @param email the value for demo..user.email
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method returns the value of the database column demo..user.is_delete
     *
     * @return the value of demo..user.is_delete
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public Integer getIs_delete() {
        return is_delete;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public User withIs_delete(Integer is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column demo..user.is_delete
     *
     * @param is_delete the value for demo..user.is_delete
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method returns the value of the database column demo..user.password
     *
     * @return the value of demo..user.password
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column demo..user.password
     *
     * @param password the value for demo..user.password
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    public void andLogicalDeleted(boolean deleted) {
        setIs_delete(deleted ? DELETED : NOT_DELETED);
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }
}