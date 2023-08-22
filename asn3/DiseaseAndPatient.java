package edu.disease.asn3;
/**
 * Class to manage arrays of diseases and patients.
 */
public class DiseaseAndPatient {

    private Disease[] disease;   // Array to store Disease objects.
    private Patient[] patients;   // Array to store Patient objects.

    /**
     * Get the array of diseases.
     *
     * @return The array of Disease objects.
     */
    public Disease[] getDisease() {
        return disease;
    }

    /**
     * Get the array of patients.
     *
     * @return The array of Patient objects.
     */
    public Patient[] getPatients() {
        return patients;
    }

    /**
     * Set the array of diseases.
     *
     * @param disease The array of Disease objects to set.
     */
    public void setDisease(Disease[] disease) {
        this.disease = disease;
    }

    /**
     * Set the array of patients.
     *
     * @param patients The array of Patient objects to set.
     */
    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}
