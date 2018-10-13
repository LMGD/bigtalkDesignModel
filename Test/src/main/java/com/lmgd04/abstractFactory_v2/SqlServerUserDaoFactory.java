package com.lmgd04.abstractFactory_v2;

public class SqlServerUserDaoFactory implements IUserDaoFactory {
    public IUserDao createUserDao() {
        return new SqlserverUserDao();
    }
}
