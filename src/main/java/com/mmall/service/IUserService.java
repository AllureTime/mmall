package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

public interface IUserService {
    /**
     * 登陆接口
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 注册接口
     * @param user
     * @return
     */
    ServerResponse<String> register(User user);

    /**
     * 校验接口
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 根据username找回密码
     * @param username
     * @return
     */
    ServerResponse selectQUestion(String username);

    /**
     * 校验找回密码的问题和答案
     * @param username
     * @param question
     * @param answer
     * @return
     */
    ServerResponse<String> CheckAnswer(String username, String question, String answer);

    /**
     * 找回密码后的重置密码
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);

    /**
     * 登陆状态下的密码重置
     * @param passwordOld
     * @param passwordNew
     * @param user
     * @return
     */
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    /**
     * 更新个人信息
     * @param user
     * @return
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 校验是否是管理员
     * @param user
     * @return
     */
    ServerResponse checkAdminRole(User user);
}
