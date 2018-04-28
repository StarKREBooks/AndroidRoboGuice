package com.example.starkre.guice.modules;

import com.example.starkre.guice.robot.Robot;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import java.util.Random;

/**
 * Created by StarKRE on 28.04.2018.
 */

public final class MainModule extends AbstractModule {

    @Override
    protected final void configure() {
        bind(String.class).annotatedWith(Names.named("hello")).toInstance("Hello world!");
    }

    @Provides
    public Robot provideRobot(){
        System.out.println("I'm ROBOT");
        final Robot robot = new Robot();
        robot.setLevel(new Random().nextInt(1000));
        return robot;
    }
}
