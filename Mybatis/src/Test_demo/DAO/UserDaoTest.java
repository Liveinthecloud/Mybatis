package Test_demo.DAO;

import Model.User;
import dao.impl.UserDaoImpl;

import java.util.List;

public class UserDaoTest {

    public static void main(String[] arge){
        UserDaoImpl dao = new UserDaoImpl();
        //通过id
        User userByID = dao.findUserByID(10);
        System.err.println(userByID);

        List<User> l = dao.findUserByName("王");
        for (User u:l
             ) {
            System.err.println(u);
        }
    }
}
