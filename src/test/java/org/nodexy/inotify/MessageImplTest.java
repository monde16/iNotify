package org.nodexy.inotify;

import junit.framework.TestCase;
import org.junit.Test;
import org.nodexy.inotify.data.Message;
import org.nodexy.inotify.data.MessageImpl;

/**
 * Created by phoenix on 11/3/16.
 */
public class MessageImplTest extends TestCase{
    private String text,from,to;
    @Override
    protected void setUp() {
        from="sender@domain.com";
        to="receiver@domain.com";
        text = "Motivation\n" +
                "Wiring everything together is a tedious part of application development.\n" +
                "There are several approaches to connect data, service, and presentation classes to one another.\n" +
                "To contrast these approaches, we'll write the billing code for a pizza ordering website:";
    }

    @Test
    public void test() {
        Message msg = new MessageImpl(from,to,text);
        System.out.println("msg: "+msg);
        assertTrue(msg.getFrom().equals(from));
        assertTrue(msg.getTo().equals(to));
        assertTrue(msg.getText().equals(text));
    }
}
