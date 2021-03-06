package keo.basketplay.model;

public class User
{

    private String password;

    private String username;


    public User()
    {
    }

    public User( String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    @Override
    public String toString()
    {
        return "User{" + " password='" + password + '\'' + ", username='"+ username + '\'' + '}';
    }
}
