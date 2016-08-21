/**
 */
package us.coastalhacking.semiotics.model.surfacearea;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.semiotics.model.surfacearea.SurfaceareaPackage
 * @generated
 */
public interface SurfaceareaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurfaceareaFactory eINSTANCE = us.coastalhacking.semiotics.model.surfacearea.impl.SurfaceareaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Surface Area Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Area Group</em>'.
	 * @generated
	 */
	SurfaceAreaGroup createSurfaceAreaGroup();

	/**
	 * Returns a new object of class '<em>Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Area</em>'.
	 * @generated
	 */
	SurfaceArea createSurfaceArea();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurfaceareaPackage getSurfaceareaPackage();

} //SurfaceareaFactory
