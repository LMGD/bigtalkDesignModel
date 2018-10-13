package com.lmgd04.abstractFactory_v2;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        IUserDaoFactory userDaoFactory = new SqlServerUserDaoFactory();//因为这里已经指定啦，就是SQLServer数据库
        IUserDao userDao = userDaoFactory.createUserDao();//用接口接收接好啦
        //如果你这里用    SqlserverUserDao userDao = (SqlserverUserDao) userDaoFactory.createUserDao();
        //  那你 访问  AccessUserDao 的insert 你还得再  写一个   AccessUserDao userDao = (AccessUserDao) userDaoFactory.createUserDao();
        // 还得改  上面new 的那个  数据库,那你何必写工厂方法嘞。

        userDao.insert(user);
        userDao.getUser(1);

    }
}
