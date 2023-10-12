/**
 */
package artifact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.ArtifactPackageInterface#getInterfaceOf <em>Interface Of</em>}</li>
 * </ul>
 *
 * @see artifact.Artifact_Package#getArtifactPackageInterface()
 * @model
 * @generated
 */
public interface ArtifactPackageInterface extends ArtifactPackage {
	/**
	 * Returns the value of the '<em><b>Interface Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Of</em>' reference.
	 * @see #setInterfaceOf(ArtifactPackage)
	 * @see artifact.Artifact_Package#getArtifactPackageInterface_InterfaceOf()
	 * @model required="true"
	 * @generated
	 */
	ArtifactPackage getInterfaceOf();

	/**
	 * Sets the value of the '{@link artifact.ArtifactPackageInterface#getInterfaceOf <em>Interface Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Of</em>' reference.
	 * @see #getInterfaceOf()
	 * @generated
	 */
	void setInterfaceOf(ArtifactPackage value);

} // ArtifactPackageInterface
