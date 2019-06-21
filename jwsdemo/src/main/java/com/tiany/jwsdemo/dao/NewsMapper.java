package com.tiany.jwsdemo.dao;

import com.tiany.jwsdemo.entity.News;
import com.tiany.jwsdemo.entity.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewsMapper {
    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    long countByExample(NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int deleteByExample(NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int insert(News record);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int insertSelective(News record);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    List<News> selectByExample(NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    News selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    News selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int updateByPrimaryKeySelective(News record);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int updateByPrimaryKey(News record);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int logicalDeleteByExample(@Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Fri Jun 21 14:56:29 CST 2019
     */
    int logicalDeleteByPrimaryKey(Integer id);
}