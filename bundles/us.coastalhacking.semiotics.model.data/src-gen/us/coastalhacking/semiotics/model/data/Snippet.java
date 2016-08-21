/**
 */
package us.coastalhacking.semiotics.model.data;

import us.coastalhacking.semiotics.model.base.Provable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.semiotics.model.data.Snippet#getData <em>Data</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.Snippet#getRow <em>Row</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.Snippet#getColumn <em>Column</em>}</li>
 *   <li>{@link us.coastalhacking.semiotics.model.data.Snippet#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.semiotics.model.data.DataPackage#getSnippet()
 * @model
 * @generated
 */
public interface Snippet extends Provable {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.semiotics.model.data.Data#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' container reference.
	 * @see #setData(Data)
	 * @see us.coastalhacking.semiotics.model.data.DataPackage#getSnippet_Data()
	 * @see us.coastalhacking.semiotics.model.data.Data#getSnippets
	 * @model opposite="snippets" transient="false"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.data.Snippet#getData <em>Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' container reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see us.coastalhacking.semiotics.model.data.DataPackage#getSnippet_Row()
	 * @model unique="false"
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.data.Snippet#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see us.coastalhacking.semiotics.model.data.DataPackage#getSnippet_Column()
	 * @model unique="false"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.data.Snippet#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see us.coastalhacking.semiotics.model.data.DataPackage#getSnippet_Length()
	 * @model unique="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link us.coastalhacking.semiotics.model.data.Snippet#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Snippet
