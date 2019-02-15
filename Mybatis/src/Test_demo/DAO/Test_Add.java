package Test_demo.DAO;

import Model.User;
import dao.impl.UserDaoImpl;

public class Test_Add {
    public static void main(String[] arge){
        UserDaoImpl userDao = new UserDaoImpl();
        User cat = new User("dog", 22);
        userDao.addUser(cat);
        System.err.println(cat);
    }
}
