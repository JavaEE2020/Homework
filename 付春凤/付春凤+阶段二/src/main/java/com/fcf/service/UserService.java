package com.fcf.service;

import com.fcf.model.User;

public interface UserService {

    /**
     * 根据员工工号，查询员工
     * @param userId 员工工号
     * @return  List<User>
     */
    public User selectUser(String userId);

}
