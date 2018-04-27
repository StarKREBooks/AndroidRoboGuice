package com.example.starkre.guice;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public final class MainActivity extends RoboActivity {

    @InjectView(R.id.imageView)
    private ImageView imageView;

    @Inject
    private TestGuice guice;

    @Inject
    @Named("hello")
    private String hello;

    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.imageView.setImageAlpha(25);
        this.guice.say();
        System.out.println(this.hello);
    }
}


