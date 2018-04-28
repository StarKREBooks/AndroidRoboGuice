package com.example.starkre.guice.robot;

import java.util.Random;

/**
 * Created by StarKRE on 28.04.2018.
 */

public final class Robot {

    private int level;

    public final int getLevel(){
        return this.level;
    }

    public final void setLevel(final int level){
        this.level = level;
    }

    public final void say(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::My level is " + level);
    }
}