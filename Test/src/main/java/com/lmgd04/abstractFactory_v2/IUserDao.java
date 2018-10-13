package com.lmgd04.abstractFactory_v2;

/**
 * 访问User表的对象(就是相当于以前写的dao层)
 */
public interface IUserDao {
    void insert(User user);

    User getUser(int id);
}
