package edu.disease.asn2;

import java.util.UUID;
import edu.disease.asn1.Exposure;

/**
 * The DiseaseControlManager interface defines methods for managing diseases,
 * patients, and exposures.
 */
public interface DiseaseControlManager {

	/**
	 * Adds a new disease to the control system.
	 *
	 * @param name       The name of the disease.
	 * @param infectious Indicates whether the disease is infectious or not.
	 * @return The created Disease object.
	 */
	public abstract Disease addDisease(String name, boolean infectious);

	/**
	 * Retrieves a disease based on its unique identifier.
	 *
	 * @param diseaseId The UUID of the disease to retrieve.
	 * @return The Disease object with the specified disease ID, or null if not
	 *         found.
	 */
	public abstract Disease getDisease(UUID diseaseId);

	/**
	 * Adds a new patient to the control system.
	 *
	 * @param firstName    The first name of the patient.
	 * @param lastName     The last name of the patient.
	 * @param maxDiseases  The maximum number of diseases the patient can have.
	 * @param maxExposures The maximum number of exposures the patient can have.
	 * @return The created Patient object.
	 */
	public abstract Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * Retrieves a patient based on their unique identifier.
	 *
	 * @param patientId The UUID of the patient to retrieve.
	 * @return The Patient object with the specified patient ID, or null if not
	 *         found.
	 */
	public abstract Patient getPatient(UUID patientId);

	/**
	 * Adds a disease to a patient's list of associated diseases.
	 *
	 * @param patientId The UUID of the patient.
	 * @param diseaseId The UUID of the disease to associate with the patient.
	 */
	public abstract void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	/**
	 * Adds an exposure to a patient's list of exposures.
	 *
	 * @param patientId The UUID of the patient.
	 * @param exposure  The Exposure object representing the exposure event.
	 */
	public void addExposureToPatient(UUID patientId, Exposure exposure);
}
