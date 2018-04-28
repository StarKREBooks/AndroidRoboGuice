package com.example.starkre.guice.provider;

import com.example.starkre.guice.robot.Robot;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import java.util.Random;

/**
 * Created by StarKRE on 28.04.2018.
 */

public final class RobotProvider implements Provider<Robot> {

    @Inject
    @Named("hello")
    private String string;

    @Override
    public final Robot get() {
        System.out.println("I'm ROBOT " + string);
        final Robot robot = new Robot();
        robot.setLevel(new Random().nextInt(1000));
        return robot;
    }
}


//System.out.println("I'm ROBOT");
//final Robot robot = new Robot();
//        robot.setLevel(new Random().nextInt(1000));
//        return robot;