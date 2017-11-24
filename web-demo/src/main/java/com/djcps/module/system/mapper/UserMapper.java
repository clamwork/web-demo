package com.djcps.module.system.mapper;

import com.djcps.module.system.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Chengw
 * @since 2017/11/24 13:31.
 */
@Repository
public interface UserMapper {

    /**
     * 列表
     * @return
     */
    @Select("SELECT * FROM T_SYSTEM_USER")
    @Results({
            @Result(property = "name", column = "t_name"),
            @Result(property = "age", column = "t_age")
    })
    List<User> list();
}
