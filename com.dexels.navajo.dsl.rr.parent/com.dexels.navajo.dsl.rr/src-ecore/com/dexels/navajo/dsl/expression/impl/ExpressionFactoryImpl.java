/**
 * generated by Xtext 2.16.0
 */
package com.dexels.navajo.dsl.expression.impl;

import com.dexels.navajo.dsl.expression.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init()
	{
		try
		{
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
			if (theExpressionFactory != null)
			{
				return theExpressionFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ExpressionPackage.TOP_LEVEL: return createTopLevel();
			case ExpressionPackage.EXPRESSION: return createExpression();
			case ExpressionPackage.FUNCTION_CALL: return createFunctionCall();
			case ExpressionPackage.MAP_GET_REFERENCE: return createMapGetReference();
			case ExpressionPackage.REFERENCE_PARAMS: return createReferenceParams();
			case ExpressionPackage.TML_REFERENCE: return createTmlReference();
			case ExpressionPackage.EXISTS_TML_REFERENCE: return createExistsTmlReference();
			case ExpressionPackage.FUNCTION_OPERANDS: return createFunctionOperands();
			case ExpressionPackage.OPERATION: return createOperation();
			case ExpressionPackage.PATH_SEQUENCE: return createPathSequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevel createTopLevel()
	{
		TopLevelImpl topLevel = new TopLevelImpl();
		return topLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression()
	{
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall()
	{
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapGetReference createMapGetReference()
	{
		MapGetReferenceImpl mapGetReference = new MapGetReferenceImpl();
		return mapGetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceParams createReferenceParams()
	{
		ReferenceParamsImpl referenceParams = new ReferenceParamsImpl();
		return referenceParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmlReference createTmlReference()
	{
		TmlReferenceImpl tmlReference = new TmlReferenceImpl();
		return tmlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsTmlReference createExistsTmlReference()
	{
		ExistsTmlReferenceImpl existsTmlReference = new ExistsTmlReferenceImpl();
		return existsTmlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOperands createFunctionOperands()
	{
		FunctionOperandsImpl functionOperands = new FunctionOperandsImpl();
		return functionOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation()
	{
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathSequence createPathSequence()
	{
		PathSequenceImpl pathSequence = new PathSequenceImpl();
		return pathSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPackage getExpressionPackage()
	{
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage()
	{
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
