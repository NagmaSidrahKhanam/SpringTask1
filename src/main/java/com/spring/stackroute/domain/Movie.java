package com.spring.stackroute.domain;

public class Movie {
    Actor actor;
    Actor actor1;
    Actor actor2;
    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor() {
        return actor;
    }

    public String display(){
        return actor.getName();
    }



}
