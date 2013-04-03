package org.kurron.profile;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 4/3/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class DevelopmentMessageGenerator implements MessageGenerator
{
    @Override
    public String message()
    {
        return "Development!";
    }
}
