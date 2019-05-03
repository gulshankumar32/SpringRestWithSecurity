package com.springrestwithsecurity.dao;

import com.springrestwithsecurity.entity.UserInfo;

public interface UserInfoDAO {
    UserInfo getActiveUser(String userName);
}
