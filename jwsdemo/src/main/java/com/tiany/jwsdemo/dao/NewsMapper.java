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
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    long countByExample(NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int deleteByExample(NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int insert(News record);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int insertSelective(News record);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    List<News> selectByExample(NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Thu Jun 20 10:54:04 CST 2019
     */
    int logicalDeleteByExample(@Param("example") NewsExample example);
}