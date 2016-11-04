package org.nodexy.inotify.data;

/**
 * Created by phoenix on 11/3/16.
 */
public interface Message {
    String getText();
    void setText(String message);
    String getFrom();
    void setFrom(String from);
    String getTo();
    void setTo(String record);
}
