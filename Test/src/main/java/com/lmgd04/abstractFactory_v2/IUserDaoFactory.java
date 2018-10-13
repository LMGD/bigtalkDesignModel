package com.lmgd04.abstractFactory_v2;

/**
 * 定义一个创建访问User表对象的抽象工程接口
 */
public interface IUserDaoFactory {
    IUserDao createUserDao();
}
