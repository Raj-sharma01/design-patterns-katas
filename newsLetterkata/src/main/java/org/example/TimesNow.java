package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimesNow implements NewsLetter{

    Map<String, String>topicWiseData;
    Map<String,List<Subscriber>>subscriptions;

    TimesNow(){
        topicWiseData = new HashMap<>();
        subscriptions = new HashMap<>();
    }
    @Override
    public void subscribe(String topic, Subscriber subscriber) {
        subscriptions.computeIfAbsent(topic,k->new ArrayList<>()).add(subscriber);
    }

    @Override
    public void unsubscribe(String topic, Subscriber subscriber) {
        subscriptions.getOrDefault(topic, new ArrayList<>()).remove(subscriber);
    }

    @Override
    public void sendNotification(String topic) {
        for (Subscriber subscriber : subscriptions.get(topic)) {
            subscriber.update(this,topic);
        }
    }

    @Override
    public String getData(String topic) {
        return topicWiseData.get(topic);
    }

    @Override
    public void setData(String topic, String data) {
        topicWiseData.put(topic,data);
        sendNotification(topic);
    }

    @Override
    public List<String> getTopicsForSubscriber(Subscriber subscriber) {
        List<String>topics = new ArrayList<>();
        for(String topic : subscriptions.keySet()){
            if(subscriptions.get(topic).contains(subscriber)){
                topics.add(topic);
            }
        }
        return topics;
    }
}
