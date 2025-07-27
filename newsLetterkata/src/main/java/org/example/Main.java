package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsLetter newsLetter = new TimesNow();

        String topic = "world news";
        Subscriber subscriber = new Person("Raj");
        newsLetter.subscribe(topic,subscriber);
        newsLetter.setData(topic, "world war cancelled");
        List<String> topics = newsLetter.getTopicsForSubscriber(subscriber);
        System.out.println(topics);
    }
}