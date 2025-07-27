package org.example;


public class Person implements Subscriber{
    String name;

    Person(String name){
        this.name = name;
    }
    @Override
    public void update(NewsLetter newsLetter, String topic) {
        System.out.println(name + " received "+ newsLetter.getData(topic));
    }
}
