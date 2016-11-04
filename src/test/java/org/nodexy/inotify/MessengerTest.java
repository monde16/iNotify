package org.nodexy.inotify;

import junit.framework.TestCase;
import org.junit.Test;
import org.nodexy.inotify.comms.Messenger;
import org.nodexy.inotify.comms.MessengerImpl;
import org.nodexy.inotify.data.MessageImpl;

/**
 * Created by phoenix on 11/3/16.
 */
public class MessengerTest extends TestCase {
    private Messenger messenger;
    @Override
    protected void setUp() {
        messenger = new MessengerImpl();
    }
    @Test
    public void test() {
        messenger.add(new MessageImpl()).add(new MessageImpl("dui@quislectusNullam.co.uk","Aliquam@CuraeDonectincidunt.edu","The argument of EXISTS is an arbitrary SELECT statement, or subquery. The subquery is evaluated to determine whether it returns any rows. If it returns at least one row, the result of EXISTS is \"true\"; if the subquery returns no rows, the result of EXISTS is \"false\".\n\n" +
                "The subquery can refer to variables from the surrounding query, which will act as constants during any one evaluation of the subquery.\n" +
                "The subquery will generally only be executed far enough to determine whether at least one row is returned, not all the way to completion. It is unwise to write a subquery that has any side effects (such as calling sequence functions); whether the side effects occur or not may be difficult to predict."));

    }
}
