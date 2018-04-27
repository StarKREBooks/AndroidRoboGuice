package com.example.starkre.guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by StarKRE on 28.04.2018.
 */

public final class MainModule extends AbstractModule {

    @Override
    protected final void configure() {
        bind(String.class).annotatedWith(Names.named("hello")).toInstance("Hello world!");
    }
}
