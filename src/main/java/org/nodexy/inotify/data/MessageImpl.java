package org.nodexy.inotify.data;

/**
 * Created by phoenix on 11/3/16.
 */
public class MessageImpl implements Message {
    private String message;
    private String to;
    private String from;

    public MessageImpl() {
        message=null;
        to =null;
    }

    public MessageImpl(String from, String to, String message) {
        this.message=message;
        this.from = from;
        this.to = to;
    }

    @Override
    public String getText() {
        return message;
    }

    @Override
    public void setText(String message) {
        this.message = message;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "MessageImpl{" +
                "message='" + message.substring(0,16).replace("\n"," ").concat("...") + '\'' +
                ", to='" + to + '\'' +
                ", from='" + from + '\'' +
                '}';
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public void setTo(String record) {
        this.to = record;
    }
}
