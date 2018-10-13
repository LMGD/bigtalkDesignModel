package com.lmgd04.abstractFactory_v2;

public class AccessUserDaoFactory implements IUserDaoFactory {
    public IUserDao createUserDao() {
        return new AccessUserDao();
    }
}
