/**
 */
package us.coastalhacking.semiotics.model.surfacearea.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import us.coastalhacking.semiotics.model.surfacearea.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurfaceareaFactoryImpl extends EFactoryImpl implements SurfaceareaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurfaceareaFactory init() {
		try {
			SurfaceareaFactory theSurfaceareaFactory = (SurfaceareaFactory)EPackage.Registry.INSTANCE.getEFactory(SurfaceareaPackage.eNS_URI);
			if (theSurfaceareaFactory != null) {
				return theSurfaceareaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurfaceareaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceareaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurfaceareaPackage.SURFACE_AREA_GROUP: return createSurfaceAreaGroup();
			case SurfaceareaPackage.SURFACE_AREA: return createSurfaceArea();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceAreaGroup createSurfaceAreaGroup() {
		SurfaceAreaGroupImpl surfaceAreaGroup = new SurfaceAreaGroupImpl();
		return surfaceAreaGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceArea createSurfaceArea() {
		SurfaceAreaImpl surfaceArea = new SurfaceAreaImpl();
		return surfaceArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceareaPackage getSurfaceareaPackage() {
		return (SurfaceareaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurfaceareaPackage getPackage() {
		return SurfaceareaPackage.eINSTANCE;
	}

} //SurfaceareaFactoryImpl
