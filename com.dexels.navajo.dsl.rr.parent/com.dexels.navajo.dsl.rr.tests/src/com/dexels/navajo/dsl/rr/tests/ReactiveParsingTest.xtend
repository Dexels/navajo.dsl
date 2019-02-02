/*
 * generated by Xtext 2.16.0
 */
package com.dexels.navajo.dsl.rr.tests

import com.dexels.navajo.dsl.rr.reactive.Model
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.^extension.ExtendWith

@InjectWith(ReactiveInjectorProvider)
class ReactiveParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			(1+1)*2
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		result.expressions.forEach[]
		System.err.println("Out: "+result)
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
