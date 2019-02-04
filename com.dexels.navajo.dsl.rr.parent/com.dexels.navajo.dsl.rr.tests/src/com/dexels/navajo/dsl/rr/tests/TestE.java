package com.dexels.navajo.dsl.rr.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import com.dexels.navajo.dsl.expression.Expression;
import com.dexels.navajo.dsl.rr.reactive.Model;
import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(ReactiveInjectorProvider.class)
@ExtendWith(InjectionExtension.class)
public class TestE {
	
	@Inject
	private ParseHelper<Model> parseHelper;

	private Expression parse(String exp) throws Exception {
		return parseHelper.parse("1+1").getExpressions().stream().findFirst().get();
	}
	@Test
	public void test() throws Exception {
		parse("1+1").getElements();
	}
	
}
