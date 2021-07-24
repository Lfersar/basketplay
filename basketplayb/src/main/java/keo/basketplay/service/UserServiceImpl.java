package keo.basketplay.service;

import keo.basketplay.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();

    @Autowired
    public UserServiceImpl(){}

    @PostConstruct
    private void populateSampleData()
    {
        users.add( new User( "luisa", "123") );
    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( String user )
    {
        return users.get( 0 );
    }

    @Override
    public User createUser( User user )
    {
        return users.get( 0 );
    }


    @Override
    public User findUserByUserAndPassword( String user, String password )
    {
        User userr = null;
        for(User usr: users){
            if (usr.getPassword().equals(password) && usr.getUsername().equals(user)){
                userr= usr;
            }
        }
        return userr;
    }

}
