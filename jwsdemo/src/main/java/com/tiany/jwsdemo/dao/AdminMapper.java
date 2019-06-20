package com.tiany.jwsdemo.dao;

import com.tiany.jwsdemo.entity.Admin;
import com.tiany.jwsdemo.entity.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {
    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    long countByExample(AdminExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int deleteByExample(AdminExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int insert(Admin record);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int insertSelective(Admin record);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByPrimaryKey(Admin record);
}