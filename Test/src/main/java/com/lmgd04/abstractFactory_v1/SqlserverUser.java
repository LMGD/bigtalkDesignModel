package com.lmgd04.abstractFactory_v1;

public class SqlserverUser {
    public void insert(User user) {
        System.out.println("在 SQL Server 中给User表增加一条记录");
    }

    public User getUser(Integer id) {
        System.out.println("在SQL Server表中根据id 查出一条记录");
        return null;
    }
}
