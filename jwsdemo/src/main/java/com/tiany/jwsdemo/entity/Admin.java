package com.tiany.jwsdemo.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Admin implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    private String password;

    /**
     *
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    private String name;

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column demo..admin.id
     *
     * @return the value of demo..admin.id
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public Admin withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column demo..admin.id
     *
     * @param id the value for demo..admin.id
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column demo..admin.username
     *
     * @return the value of demo..admin.username
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public Admin withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column demo..admin.username
     *
     * @param username the value for demo..admin.username
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column demo..admin.password
     *
     * @return the value of demo..admin.password
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public Admin withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column demo..admin.password
     *
     * @param password the value for demo..admin.password
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column demo..admin.name
     *
     * @return the value of demo..admin.name
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public Admin withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column demo..admin.name
     *
     * @param name the value for demo..admin.name
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
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
        Admin other = (Admin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}