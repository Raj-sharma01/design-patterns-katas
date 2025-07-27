package org.example;

import java.util.List;

public interface NewsLetter {
    void subscribe(String topic, Subscriber subscriber);
    void unsubscribe(String topic, Subscriber subscriber);
    void sendNotification(String topic);
    String getData(String topic);
    void setData(String topic, String data);
    List<String> getTopicsForSubscriber(Subscriber s);
}
