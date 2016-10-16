package com.example;

import java.util.Random;

public class Joker {
    private static final Random random = new Random();
    private static String[] JOKES = {
            "Strong people don't put others down. They lift them up and slam them on the ground for maximum damage.",
            "I think my neighbor is stalking me as she's been googling my name on her computer. I saw it through my telescope last night.",
            "I can totally keep secrets. It's the people I tell them to that can't.",
            "Whatever you do always give 100 %. Unless you are donating blood.",

    };

    public static String tellJoke(){
        return JOKES[random.nextInt(JOKES.length)];
    }
}
