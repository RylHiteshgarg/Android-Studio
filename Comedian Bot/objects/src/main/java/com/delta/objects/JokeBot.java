package com.delta.objects;
import java.util.ArrayList;


public class JokeBot extends Bot {

    public static ArrayList<Joke> jokesIKnow = null;

    public void tellJoke() {
        Double randomNum = new Double(Math.random() * jokesIKnow.size());
        int num = randomNum.intValue();

        Joke myJ = jokesIKnow.get(randomNum);
        sayJoke(myJ);
    }

    public JokeBot(ArrayList<Joke> jokesIKnow) {
        this.jokesIKnow = jokesIKnow;
    }

    protected void sayJoke(Joke aJ){
        talk(aJ.getJokeSetup());
        talk(aJ.getJokePunchline());
    }
}
