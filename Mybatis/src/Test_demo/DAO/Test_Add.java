package Test_demo.DAO;

import Model.User;
import dao.impl.UserDaoImpl;

public class Test_Add {
    public static void main(String[] arge){
        UserDaoImpl userDao = new UserDaoImpl();
        User cat = new User("cat", 50);
        userDao.addUser(cat);
        System.err.println(cat);
    }
}
