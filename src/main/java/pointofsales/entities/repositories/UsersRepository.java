package pointofsales.entities.repositories;

import java.util.ArrayList;
import java.util.List;

import pointofsales.entities.User;

public class UsersRepository implements Repository<User> {
    private List<User> users;
    
    public UsersRepository() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void add(User user) throws Exception {
        if(user.getLoginCode() == null) {
            throw new Exception("Must have a login code");
        }

        if(user.getLoginCode().length() < 6) {
            throw new Exception("Must have a login code at least 6 characters long");
        }
        this.users.add(user);
    }

    @Override
    public void delete(User entity) {
        this.users.remove(entity);
    }

    @Override
    public User get(String id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void update(User entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
