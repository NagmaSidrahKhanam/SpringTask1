package com.spring.stackroute.domain;

public class Movie {

    private Actor actor;  //object dependency injection

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }

    public void Action()
    {
        System.out.println(actor.getName());
        System.out.println(actor.getAge());
        System.out.println(actor.getGender());

    }
}
