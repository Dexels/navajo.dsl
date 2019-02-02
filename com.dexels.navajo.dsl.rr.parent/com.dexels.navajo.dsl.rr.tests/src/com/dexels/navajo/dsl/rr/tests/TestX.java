package com.dexels.navajo.dsl.rr.tests;

import org.eclipse.emf.common.util.EList;
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
@ExtendWith(InjectionExtension.class)
@InjectWith(ReactiveInjectorProvider.class)
public class TestX {

	@Inject
	private ParseHelper<Model> parseHelper;

	private Expression parse(String exp) throws Exception {
		Model parse = parseHelper.parse(exp);
		EList<Expression> expressions = parse.getExpressions();
		return expressions.stream().findFirst().get();
	}
	
	@Test
	public void test() throws Exception {
		parse("'aap'").getParameters().stream().forEach(e->{
//			System.err.println(">>>>> "+e.getOperations().stream().findFirst().get());
			System.err.println("::: "+e.getValueString());
//			e.getOperations()
		});
		
	}
}
