package com.lmgd04.abstractFactory_v2;

/**
 * 用于访问Access的User
 */
public class AccessUserDao implements IUserDao {
    public void insert(User user) {
        System.out.println("在 Access 中给User表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在 Access 表中根据id 查出一条记录");
        return null;
    }
}
