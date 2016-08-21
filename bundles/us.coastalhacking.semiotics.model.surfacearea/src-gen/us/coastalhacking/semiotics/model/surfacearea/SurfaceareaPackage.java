/**
 */
package us.coastalhacking.semiotics.model.surfacearea;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import us.coastalhacking.semiotics.model.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/us.coastalhacking.semiotics.model.surfacearea.edit/src-gen' forceOverwrite='true' basePackage='us.coastalhacking.semiotics.model'"
 * @generated
 */
public interface SurfaceareaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "surfacearea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "us.coastalhacking.semiotics.model.surfacearea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surfacearea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurfaceareaPackage eINSTANCE = us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceareaPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaGroupImpl <em>Surface Area Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaGroupImpl
	 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceareaPackageImpl#getSurfaceAreaGroup()
	 * @generated
	 */
	int SURFACE_AREA_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP__NAME = BasePackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Surface Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP__SURFACE_AREAS = BasePackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Surface Area Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP_FEATURE_COUNT = BasePackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Surface Area Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_GROUP_OPERATION_COUNT = BasePackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl <em>Surface Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl
	 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceareaPackageImpl#getSurfaceArea()
	 * @generated
	 */
	int SURFACE_AREA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__NAME = BasePackage.REVIEWABLE__NAME;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__EVIDENCE = BasePackage.REVIEWABLE__EVIDENCE;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__TRACES = BasePackage.REVIEWABLE__TRACES;

	/**
	 * The feature id for the '<em><b>Surface Area Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__SURFACE_AREA_GROUP = BasePackage.REVIEWABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA__CONTROLS = BasePackage.REVIEWABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Surface Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_FEATURE_COUNT = BasePackage.REVIEWABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Surface Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_AREA_OPERATION_COUNT = BasePackage.REVIEWABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup <em>Surface Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Area Group</em>'.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup
	 * @generated
	 */
	EClass getSurfaceAreaGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup#getSurfaceAreas <em>Surface Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surface Areas</em>'.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceAreaGroup#getSurfaceAreas()
	 * @see #getSurfaceAreaGroup()
	 * @generated
	 */
	EReference getSurfaceAreaGroup_SurfaceAreas();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea <em>Surface Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Area</em>'.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceArea
	 * @generated
	 */
	EClass getSurfaceArea();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getSurfaceAreaGroup <em>Surface Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Surface Area Group</em>'.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getSurfaceAreaGroup()
	 * @see #getSurfaceArea()
	 * @generated
	 */
	EReference getSurfaceArea_SurfaceAreaGroup();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceArea#getControls()
	 * @see #getSurfaceArea()
	 * @generated
	 */
	EReference getSurfaceArea_Controls();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurfaceareaFactory getSurfaceareaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaGroupImpl <em>Surface Area Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaGroupImpl
		 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceareaPackageImpl#getSurfaceAreaGroup()
		 * @generated
		 */
		EClass SURFACE_AREA_GROUP = eINSTANCE.getSurfaceAreaGroup();

		/**
		 * The meta object literal for the '<em><b>Surface Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_AREA_GROUP__SURFACE_AREAS = eINSTANCE.getSurfaceAreaGroup_SurfaceAreas();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl <em>Surface Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceAreaImpl
		 * @see us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceareaPackageImpl#getSurfaceArea()
		 * @generated
		 */
		EClass SURFACE_AREA = eINSTANCE.getSurfaceArea();

		/**
		 * The meta object literal for the '<em><b>Surface Area Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_AREA__SURFACE_AREA_GROUP = eINSTANCE.getSurfaceArea_SurfaceAreaGroup();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_AREA__CONTROLS = eINSTANCE.getSurfaceArea_Controls();

	}

} //SurfaceareaPackage
