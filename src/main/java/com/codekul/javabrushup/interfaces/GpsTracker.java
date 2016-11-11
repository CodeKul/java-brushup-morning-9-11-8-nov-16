package com.codekul.javabrushup.interfaces;

/**
 * Created by aniruddha on 11/11/16.
 */
public class GpsTracker {

    public void track(GpsListener listener) {

        listener.location();

      /*  Human human = (Human) listener;
        human.age();*/

        if(listener instanceof Human){
            Human human = (Human) listener;
            human.age();
            human.location();
        }
        else if(listener instanceof Bird) {
            Bird bird = (Bird) listener;
            bird.fly();
            bird.location();
        }

    }
}
