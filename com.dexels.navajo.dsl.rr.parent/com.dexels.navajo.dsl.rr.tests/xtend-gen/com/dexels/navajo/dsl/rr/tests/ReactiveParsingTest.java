/**
 * generated by Xtext 2.16.0
 */
package com.dexels.navajo.dsl.rr.tests;

import com.dexels.navajo.dsl.expression.Expression;
import com.dexels.navajo.dsl.rr.reactive.Model;
import com.dexels.navajo.dsl.rr.tests.ReactiveInjectorProvider;
import com.google.inject.Inject;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@InjectWith(ReactiveInjectorProvider.class)
@SuppressWarnings("all")
public class ReactiveParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(1+1)*2");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      final Consumer<Expression> _function = (Expression it) -> {
      };
      result.getExpressions().forEach(_function);
      System.err.println(("Out: " + result));
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
