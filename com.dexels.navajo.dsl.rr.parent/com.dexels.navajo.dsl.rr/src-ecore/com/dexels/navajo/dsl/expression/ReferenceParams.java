/**
 * generated by Xtext 2.16.0
 */
package com.dexels.navajo.dsl.expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dexels.navajo.dsl.expression.ReferenceParams#getGetterParams <em>Getter Params</em>}</li>
 * </ul>
 *
 * @see com.dexels.navajo.dsl.expression.ExpressionPackage#getReferenceParams()
 * @model
 * @generated
 */
public interface ReferenceParams extends EObject
{
	/**
	 * Returns the value of the '<em><b>Getter Params</b></em>' containment reference list.
	 * The list contents are of type {@link com.dexels.navajo.dsl.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Params</em>' containment reference list.
	 * @see com.dexels.navajo.dsl.expression.ExpressionPackage#getReferenceParams_GetterParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getGetterParams();

} // ReferenceParams