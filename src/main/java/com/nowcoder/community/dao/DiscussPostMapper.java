package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    //offset:每一页的起始行号   limit:每一页最多多少条数据

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);

}
