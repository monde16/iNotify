package org.nodexy.inotify.comms;

import org.nodexy.inotify.data.Message;
import org.nodexy.inotify.struct.Pair;

import java.util.Date;
import java.util.List;

/**
 * Created by phoenix on 11/3/16.
 */
public interface Messenger {
    void publish();
    List<Pair<Message,Date>> getSent();
    List<Message> getUnsent();
    Messenger add(Message message);
    Messenger add(List<Message> messages);
    int size();
}
