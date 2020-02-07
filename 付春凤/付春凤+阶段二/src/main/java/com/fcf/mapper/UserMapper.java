package com.fcf.mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.fcf.model.User;

@Repository
public interface UserMapper {
    @Select("SELECT id, user_id userId, user_name userName FROM user_tab WHERE user_id = #{userId}")
    @ResultType(User.class)
    User selectUser(String userId);

}
