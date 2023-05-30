package Repository;

import Models.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepositoryInterface{
    List <User> users;

    @Override
    public User save(User user) {
        this.users.add(user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

    @Override
    public List<User> FindUser(String UerName) {
        return null;
    }

    @Override
    public void deleteUser(String userName) {

    }

    @Override
    public void deleteAll(String userName) {

    }
}
