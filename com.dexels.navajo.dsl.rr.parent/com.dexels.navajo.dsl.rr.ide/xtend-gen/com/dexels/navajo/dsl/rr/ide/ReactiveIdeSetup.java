/**
 * generated by Xtext 2.16.0
 */
package com.dexels.navajo.dsl.rr.ide;

import com.dexels.navajo.dsl.rr.ReactiveRuntimeModule;
import com.dexels.navajo.dsl.rr.ReactiveStandaloneSetup;
import com.dexels.navajo.dsl.rr.ide.ReactiveIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ReactiveIdeSetup extends ReactiveStandaloneSetup {
  @Override
  public Injector createInjector() {
    ReactiveRuntimeModule _reactiveRuntimeModule = new ReactiveRuntimeModule();
    ReactiveIdeModule _reactiveIdeModule = new ReactiveIdeModule();
    return Guice.createInjector(Modules2.mixin(_reactiveRuntimeModule, _reactiveIdeModule));
  }
}