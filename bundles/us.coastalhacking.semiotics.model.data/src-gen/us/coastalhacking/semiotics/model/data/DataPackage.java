/**
 */
package us.coastalhacking.semiotics.model.data;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see us.coastalhacking.semiotics.model.data.DataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/us.coastalhacking.semiotics.model.data.edit/src-gen' forceOverwrite='true' basePackage='us.coastalhacking.semiotics.model'"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "us.coastalhacking.semiotics.model.data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = us.coastalhacking.semiotics.model.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.data.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.data.impl.DataImpl
	 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = BasePackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SNIPPETS = BasePackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_GROUP = BasePackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = BasePackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = BasePackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.data.impl.DataGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.data.impl.DataGroupImpl
	 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getDataGroup()
	 * @generated
	 */
	int DATA_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__NAME = BasePackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP__DATA = BasePackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_FEATURE_COUNT = BasePackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GROUP_OPERATION_COUNT = BasePackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl <em>Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.data.impl.SnippetImpl
	 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getSnippet()
	 * @generated
	 */
	int SNIPPET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NAME = BasePackage.PROVABLE__NAME;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__REVIEWERS = BasePackage.PROVABLE__REVIEWERS;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__TRACES = BasePackage.PROVABLE__TRACES;

	/**
	 * The feature id for the '<em><b>Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__DATA = BasePackage.PROVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__ROW = BasePackage.PROVABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__COLUMN = BasePackage.PROVABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__LENGTH = BasePackage.PROVABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_FEATURE_COUNT = BasePackage.PROVABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_OPERATION_COUNT = BasePackage.PROVABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.data.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.data.impl.FileImpl
	 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATA_GROUP = DATA__DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FULL_PATH = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.data.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.data.impl.RequestImpl
	 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__DATA_GROUP = DATA__DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__RESPONSE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.semiotics.model.data.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.semiotics.model.data.impl.ResponseImpl
	 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SNIPPETS = DATA__SNIPPETS;

	/**
	 * The feature id for the '<em><b>Data Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DATA_GROUP = DATA__DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__REQUEST = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.data.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.data.Data#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Snippets</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Data#getSnippets()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Snippets();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.data.Data#getDataGroup <em>Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Group</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Data#getDataGroup()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataGroup();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.data.DataGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see us.coastalhacking.semiotics.model.data.DataGroup
	 * @generated
	 */
	EClass getDataGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link us.coastalhacking.semiotics.model.data.DataGroup#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.data.DataGroup#getData()
	 * @see #getDataGroup()
	 * @generated
	 */
	EReference getDataGroup_Data();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.data.Snippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Snippet
	 * @generated
	 */
	EClass getSnippet();

	/**
	 * Returns the meta object for the container reference '{@link us.coastalhacking.semiotics.model.data.Snippet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Snippet#getData()
	 * @see #getSnippet()
	 * @generated
	 */
	EReference getSnippet_Data();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.data.Snippet#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Snippet#getRow()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Row();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.data.Snippet#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Snippet#getColumn()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Column();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.data.Snippet#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Snippet#getLength()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_Length();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.data.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see us.coastalhacking.semiotics.model.data.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.semiotics.model.data.File#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see us.coastalhacking.semiotics.model.data.File#getFullPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FullPath();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.data.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link us.coastalhacking.semiotics.model.data.Request#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Request#getResponse()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Response();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.semiotics.model.data.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the reference '{@link us.coastalhacking.semiotics.model.data.Response#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see us.coastalhacking.semiotics.model.data.Response#getRequest()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Request();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.data.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.data.impl.DataImpl
		 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Snippets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SNIPPETS = eINSTANCE.getData_Snippets();

		/**
		 * The meta object literal for the '<em><b>Data Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA_GROUP = eINSTANCE.getData_DataGroup();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.data.impl.DataGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.data.impl.DataGroupImpl
		 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getDataGroup()
		 * @generated
		 */
		EClass DATA_GROUP = eINSTANCE.getDataGroup();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GROUP__DATA = eINSTANCE.getDataGroup_Data();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.data.impl.SnippetImpl <em>Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.data.impl.SnippetImpl
		 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getSnippet()
		 * @generated
		 */
		EClass SNIPPET = eINSTANCE.getSnippet();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNIPPET__DATA = eINSTANCE.getSnippet_Data();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__ROW = eINSTANCE.getSnippet_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__COLUMN = eINSTANCE.getSnippet_Column();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__LENGTH = eINSTANCE.getSnippet_Length();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.data.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.data.impl.FileImpl
		 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FULL_PATH = eINSTANCE.getFile_FullPath();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.data.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.data.impl.RequestImpl
		 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__RESPONSE = eINSTANCE.getRequest_Response();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.semiotics.model.data.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.semiotics.model.data.impl.ResponseImpl
		 * @see us.coastalhacking.semiotics.model.data.impl.DataPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__REQUEST = eINSTANCE.getResponse_Request();

	}

} //DataPackage
