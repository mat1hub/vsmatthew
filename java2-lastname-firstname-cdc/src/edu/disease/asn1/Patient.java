package edu.disease.asn1;
import java.util.UUID;

/**
 * The class Patient represents a patient and their exposures to diseases.
 */
public class Patient {

	/** The unique identifier of the patient. */
	UUID patientId;

	/** The first name of the patient. */
	String firstName;

	/** The last name of the patient. */
	String lastName;

	/** An array of exposures associated with the patient. */
	Exposure[] exposures;

	/** An array of disease UUIDs associated with the patient. */
	UUID[] diseaselds;

	/** The maximum number of diseases that can be associated with the patient. */
	int maxDisease;

	/** The maximum number of exposures that can be associated with the patient. */
	int maxExposures;

	/** Index used for adding disease UUIDs to the array. */
	int index = 0;

	/** Index used for adding exposures to the array. */
	int i = 0;

	/**
	 * Gets the unique identifier of the patient.
	 *
	 * @return The patient's unique identifier.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Gets the first name of the patient.
	 *
	 * @return The first name of the patient.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the last name of the patient.
	 *
	 * @return The last name of the patient.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the unique identifier of the patient.
	 *
	 * @param patientId The unique identifier of the patient to set.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Sets the first name of the patient.
	 *
	 * @param firstName The first name of the patient to set.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the last name of the patient.
	 *
	 * @param lastName The last name of the patient to set.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Constructor to create an instance of Patient with specified maximum disease
	 * and exposure limits.
	 *
	 * @param maxDisease   The maximum number of diseases that can be associated
	 *                     with the patient.
	 * @param maxExposures The maximum number of exposures that can be associated
	 *                     with the patient.
	 */
	public Patient(int maxDisease, int maxExposures) {
		try {
			if (maxDisease <= 0 || maxExposures <= 0) {
				throw new IllegalArgumentException("Invalid data");
			} else {
				diseaselds = new UUID[maxDisease];
				this.maxExposures = maxExposures;
			}
		} catch (IllegalArgumentException e) {
			// Handle the exception
		}
	}

	/**
	 * Adds a disease UUID to the patient's array of associated diseases.
	 *
	 * @param diseaseld The disease UUID to add.
	 */
	public void addDiseaseld(UUID diseaseld) {
		try {
			if (index < maxDisease)
				diseaselds[index++] = diseaseld;
			else {
				throw new ArrayIndexOutOfBoundsException("Memory overloaded!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handle the exception
		}
	}

	/**
	 * Adds an exposure to the patient's array of exposures.
	 *
	 * @param exposure The exposure to add.
	 */
	public void addExposure(Exposure exposure) {
		try {
			if (i < maxExposures)
				this.exposures[i++] = exposure;
			else {
				throw new ArrayIndexOutOfBoundsException("Out of memory....!");
			}
		} catch (ArrayIndexOutOfBoundsException ai) {

		}
	}
}

	
