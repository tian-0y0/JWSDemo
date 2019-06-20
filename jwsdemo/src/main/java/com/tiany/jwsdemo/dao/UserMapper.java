package com.tiany.jwsdemo.dao;

import com.tiany.jwsdemo.entity.User;
import com.tiany.jwsdemo.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    User selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int updateByPrimaryKey(User record);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int logicalDeleteByExample(@Param("example") UserExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 15:13:53 CST 2019
     */
    int logicalDeleteByPrimaryKey(Integer id);
}