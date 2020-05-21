package com.delta.objects;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;

public class ComedianBot extends JokeBot{

    public ComedianBot(String name){
        super(null);
        setName(name);
        jokesIKnow = JokeWriter.getJokeListTwo();
    }

    public void performShow()
    {
        talk("good morning everyone, my name is" + getName());
        talk("why don't i tell you some of my favorite jokes");

        for (Joke joke: jokesIKnow)
        {
            sayJoke(joke);
        }

        talk("Thanks Everyone, GoodNight!");
    }

    @Override
    protected void sayJoke(Joke joke)
    {
        talk(joke.getJokeSetup() + "...." + joke.getJokePunchline());
    }
}
