/**
 */
package org.classupplier;

import java.util.Date;

import org.classupplier.impl.Constructable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>State</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.classupplier.State#getName <em>Name</em>}</li>
 * <li>{@link org.classupplier.State#getLanguage <em>Language</em>}</li>
 * <li>{@link org.classupplier.State#getTimestamp <em>Timestamp</em>}</li>
 * <li>{@link org.classupplier.State#getNumber <em>Number</em>}</li>
 * <li>{@link org.classupplier.State#getVersion <em>Version</em>}</li>
 * <li>{@link org.classupplier.State#getStage <em>Stage</em>}</li>
 * <li>{@link org.classupplier.State#getProjectName <em>Project Name</em>}</li>
 * <li>{@link org.classupplier.State#getDeployableUnitName
 * <em>Deployable Unit Name</em>}</li>
 * <li>{@link org.classupplier.State#getEPackage <em>EPackage</em>}</li>
 * <li>{@link org.classupplier.State#getDynamicEPackage
 * <em>Dynamic EPackage</em>}</li>
 * <li>{@link org.classupplier.State#getGeneratedEPackage
 * <em>Generated EPackage</em>}</li>
 * </ul>
 *
 * @see org.classupplier.ClassSupplierPackage#getState()
 * @model superTypes="org.classupplier.Constructable"
 * @generated
 */
public interface State extends EObject, Constructable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.classupplier.ClassSupplierPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.classupplier.ClassSupplierPackage#getState_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getLanguage
	 * <em>Language</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.classupplier.ClassSupplierPackage#getState_Timestamp()
	 * @model id="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getTimestamp
	 * <em>Timestamp</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.classupplier.ClassSupplierPackage#getState_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getNumber
	 * <em>Number</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see org.classupplier.ClassSupplierPackage#getState_Version()
	 * @model dataType="org.classupplier.Version"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getVersion
	 * <em>Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute. The
	 * default value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see org.classupplier.ClassSupplierPackage#getState_ProjectName()
	 * @model default=""
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getProjectName
	 * <em>Project Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Deployable Unit Name</b></em>'
	 * attribute. The default value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployable Unit Name</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Deployable Unit Name</em>' attribute.
	 * @see org.classupplier.ClassSupplierPackage#getState_DeployableUnitName()
	 * @model default="" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDeployableUnitName();

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' attribute list. The
	 * list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>EPackage</em>' attribute list.
	 * @see org.classupplier.ClassSupplierPackage#getState_EPackage()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        transient="true" extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getEPackage();

	/**
	 * Returns the value of the '<em><b>Dynamic EPackage</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic EPackage</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dynamic EPackage</em>' containment
	 *         reference.
	 * @see #setDynamicEPackage(EPackage)
	 * @see org.classupplier.ClassSupplierPackage#getState_DynamicEPackage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#ePackage'"
	 * @generated
	 */
	EPackage getDynamicEPackage();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getDynamicEPackage
	 * <em>Dynamic EPackage</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Dynamic EPackage</em>' containment
	 *            reference.
	 * @see #getDynamicEPackage()
	 * @generated
	 */
	void setDynamicEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Generated EPackage</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated EPackage</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generated EPackage</em>' containment
	 *         reference.
	 * @see #setGeneratedEPackage(EPackage)
	 * @see org.classupplier.ClassSupplierPackage#getState_GeneratedEPackage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#ePackage'"
	 * @generated
	 */
	EPackage getGeneratedEPackage();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getGeneratedEPackage
	 * <em>Generated EPackage</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generated EPackage</em>' containment
	 *            reference.
	 * @see #getGeneratedEPackage()
	 * @generated
	 */
	void setGeneratedEPackage(EPackage value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void fireJobsCompleted();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	String formatVersion();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.classupplier.CoreException"
	 *        monitorDataType="org.classupplier.IProgressMonitor"
	 * @generated
	 */
	void setProjectVersion(IProgressMonitor monitor) throws CoreException;

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute. The default
	 * value is <code>"DEFINED"</code>. The literals are from the enumeration
	 * {@link org.classupplier.Phase}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see org.classupplier.Phase
	 * @see #setStage(Phase)
	 * @see org.classupplier.ClassSupplierPackage#getState_Stage()
	 * @model default="DEFINED"
	 * @generated
	 */
	Phase getStage();

	/**
	 * Sets the value of the '{@link org.classupplier.State#getStage
	 * <em>Stage</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Stage</em>' attribute.
	 * @see org.classupplier.Phase
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Phase value);

} // State
