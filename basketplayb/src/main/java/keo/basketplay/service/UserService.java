package keo.basketplay.service;

import keo.basketplay.model.User;

import java.util.List;

public interface UserService
{
    List<User> getUsers();

    User getUser( String user );

    User createUser( User user );

    User findUserByUserAndPassword( String user, String password );

}