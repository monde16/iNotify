package org.nodexy.inotify.comms;

import org.nodexy.inotify.data.Message;
import org.nodexy.inotify.struct.Pair;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by phoenix on 11/3/16.
 */
public class MessengerImpl implements Messenger {
    /**
     * Each pair contains the message, and its last sent date.
     */
    private List<Pair<Message,Date>> pairs;

    public MessengerImpl() {
        pairs = new LinkedList<>();
    }

    @Override
    public void publish() {
        pairs.forEach(it->{
            System.out.println("Sending : "+it.getKey()+"...");
            it.setValue(new Date());
        });
    }

    @Override
    public List<Pair<Message, Date>> getSent() {
        List<Pair<Message, Date>> sent = new LinkedList<>();
        pairs.stream().forEach(it->{
            if (it.getValue() != null) sent.add(it);
        });
        return sent;
    }

    @Override
    public List<Message> getUnsent() {
        List<Message> list = new LinkedList<>();
        pairs.stream().forEach(it->{
            if (it.getValue() == null) list.add(it.getKey());
        });
        return list;
    }

    @Override
    public Messenger add(Message message) {
        pairs.add(new Pair<>(message,null));
        return this;
    }

    @Override
    public Messenger add(List<Message> messages) {
        messages.forEach(msg->pairs.add(new Pair<>(msg,null)));
        return this;
    }

    @Override
    public int size() { return pairs.size(); }
}
