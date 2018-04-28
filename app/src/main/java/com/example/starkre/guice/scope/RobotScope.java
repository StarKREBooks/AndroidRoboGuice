package com.example.starkre.guice.scope;

import com.example.starkre.guice.provider.RobotProvider;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;

/**
 * Created by StarKRE on 28.04.2018.
 */

public final class RobotScope implements Scope {

    @Override
    public final <T> Provider<T> scope(final Key<T> key, final Provider<T> provider) {
        return (Provider<T>) new RobotProvider();
    }
}