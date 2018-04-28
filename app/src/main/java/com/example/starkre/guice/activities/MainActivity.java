package com.example.starkre.guice.activities;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.starkre.guice.R;
import com.example.starkre.guice.robot.Robot;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public final class MainActivity extends RoboActivity {

    @InjectView(R.id.imageView)
    private ImageView imageView;

    @Inject
    @Named("hello")
    private String hello;

    @Inject
    private Provider<Robot> robotProvider;

    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.imageView.setImageAlpha(25);
        for (int i = 0; i < 1000; i++){
            System.out.println("!!!");
            this.recallRobot();
        }
    }

    private void recallRobot() {
        final Robot robot = this.robotProvider.get();
        robot.say();
    }
}