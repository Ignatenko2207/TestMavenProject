package info.sjd;

import info.sjd.model.User;

public class ApplicationRunner
{
    public static void main( String[] args )
    {
        User user = new User("Alex", "123456");
        System.out.println(user.toString());
    }
}
