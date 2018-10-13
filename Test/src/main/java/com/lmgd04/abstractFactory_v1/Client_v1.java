package com.lmgd04.abstractFactory_v1;

public class Client_v1 {
    public static void main(String[] args) {
        User user = new User();
        SqlserverUser su = new SqlserverUser();

        su.insert(user);
        User u = su.getUser(1);
    }
}
