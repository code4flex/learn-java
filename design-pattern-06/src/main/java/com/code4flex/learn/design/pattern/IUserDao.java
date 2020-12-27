package com.code4flex.learn.design.pattern;

import com.code4flex.learn.design.pattern.agent.Select;

public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
