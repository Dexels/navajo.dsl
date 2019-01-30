/*
 * generated by Xtext 2.16.0
 */
package com.dexels.navajo.dsl.rr.ide

import com.dexels.navajo.dsl.rr.ReactiveRuntimeModule
import com.dexels.navajo.dsl.rr.ReactiveStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ReactiveIdeSetup extends ReactiveStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ReactiveRuntimeModule, new ReactiveIdeModule))
	}
	
}