package edu.disease.asn3;

import java.util.UUID;
import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {

    /**
     * Add a new disease to the system.
     *
     * @param name       The name of the disease.
     * @param infectious True if the disease is infectious, false otherwise.
     * @return The created Disease object.
     */
    public abstract Disease addDisease(String name, boolean infectious);

    /**
     * Get a disease by its unique identifier.
     *
     * @param diseaseId The unique identifier of the disease.
     * @return The Disease object associated with the given ID, or null if not found.
     */
    public abstract Disease getDisease(UUID diseaseId);

    /**
     * Add a new patient to the system.
     *
     * @param firstName    The first name of the patient.
     * @param lastName     The last name of the patient.
     * @param maxDiseases   The maximum number of diseases the patient can have.
     * @param maxExposures The maximum number of exposures the patient can have.
     * @return The created Patient object.
     */
    public abstract Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

    /**
     * Get a patient by their unique identifier.
     *
     * @param patientId The unique identifier of the patient.
     * @return The Patient object associated with the given ID, or null if not found.
     */
    public abstract Patient getPatient(UUID patientId);

    /**
     * Add a disease to a patient's list of diseases.
     *
     * @param patientId The unique identifier of the patient.
     * @param diseaseId The unique identifier of the disease to add.
     */
    public abstract void addDiseaseToPatient(UUID patientId, UUID diseaseId);

    
    public void addExposureToPatient(UUID patientId, Exposure exposures);

    
    public Disease[] getDiseases();

    /**
     * Get an array of all patients in the system.
     *
     * @return An array of Patient objects.
     */
    public Patient[] getPatients();
}
