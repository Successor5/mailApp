package Repository;

import Models.Mail;
import Models.User;

import java.util.List;

public interface UserRepositoryInterface {
    User  save(User user);
    List <User> findAll ();
    List <User> FindUser(String UerName);
    void deleteUser(String userName);
    void  deleteAll(String userName);
}
