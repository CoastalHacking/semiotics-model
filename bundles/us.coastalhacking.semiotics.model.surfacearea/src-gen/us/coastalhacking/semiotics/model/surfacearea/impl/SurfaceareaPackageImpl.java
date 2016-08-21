/**
 */
package us.coastalhacking.semiotics.model.surfacearea.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.coastalhacking.semiotics.model.base.BasePackage;

import us.coastalhacking.semiotics.model.control.ControlPackage;

import us.coastalhacking.semiotics.model.surfacearea.SurfaceArea;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceareaFactory;
import us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurfaceareaPackageImpl extends EPackageImpl implements SurfaceareaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceAreaGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceAreaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SurfaceareaPackageImpl() {
		super(eNS_URI, SurfaceareaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SurfaceareaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SurfaceareaPackage init() {
		if (isInited) return (SurfaceareaPackage)EPackage.Registry.INSTANCE.getEPackage(SurfaceareaPackage.eNS_URI);

		// Obtain or create and register package
		SurfaceareaPackageImpl theSurfaceareaPackage = (SurfaceareaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SurfaceareaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SurfaceareaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ControlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSurfaceareaPackage.createPackageContents();

		// Initialize created meta-data
		theSurfaceareaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSurfaceareaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SurfaceareaPackage.eNS_URI, theSurfaceareaPackage);
		return theSurfaceareaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceAreaGroup() {
		return surfaceAreaGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceAreaGroup_SurfaceAreas() {
		return (EReference)surfaceAreaGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceArea() {
		return surfaceAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceArea_SurfaceAreaGroup() {
		return (EReference)surfaceAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceArea_Controls() {
		return (EReference)surfaceAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceareaFactory getSurfaceareaFactory() {
		return (SurfaceareaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		surfaceAreaGroupEClass = createEClass(SURFACE_AREA_GROUP);
		createEReference(surfaceAreaGroupEClass, SURFACE_AREA_GROUP__SURFACE_AREAS);

		surfaceAreaEClass = createEClass(SURFACE_AREA);
		createEReference(surfaceAreaEClass, SURFACE_AREA__SURFACE_AREA_GROUP);
		createEReference(surfaceAreaEClass, SURFACE_AREA__CONTROLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		ControlPackage theControlPackage = (ControlPackage)EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		surfaceAreaGroupEClass.getESuperTypes().add(theBasePackage.getNameable());
		surfaceAreaEClass.getESuperTypes().add(theBasePackage.getReviewable());

		// Initialize classes, features, and operations; add parameters
		initEClass(surfaceAreaGroupEClass, SurfaceAreaGroup.class, "SurfaceAreaGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurfaceAreaGroup_SurfaceAreas(), this.getSurfaceArea(), this.getSurfaceArea_SurfaceAreaGroup(), "surfaceAreas", null, 0, -1, SurfaceAreaGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceAreaEClass, SurfaceArea.class, "SurfaceArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurfaceArea_SurfaceAreaGroup(), this.getSurfaceAreaGroup(), this.getSurfaceAreaGroup_SurfaceAreas(), "surfaceAreaGroup", null, 0, 1, SurfaceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceArea_Controls(), theControlPackage.getControl(), null, "controls", null, 0, -1, SurfaceArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SurfaceareaPackageImpl
