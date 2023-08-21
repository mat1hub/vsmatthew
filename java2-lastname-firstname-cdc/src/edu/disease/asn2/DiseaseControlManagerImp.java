package edu.disease.asn2;

import java.util.UUID;
import edu.disease.asn1.Exposure;

/**
 * The DiseaseControlManagerImp class implements the DiseaseControlManager interface
 * and provides methods for managing diseases, patients, and exposures.
 */
public class DiseaseControlManagerImp implements DiseaseControlManager {

    private Disease[] diseases;
    private Patient[] patients;

    /**
     * Constructor to create an instance of DiseaseControlManagerImp with maximum disease and patient limits.
     *
     * @param maxDisease The maximum number of diseases.
     * @param maxpatients The maximum number of patients.
     */
    public DiseaseControlManagerImp(int maxDisease, int maxpatients) {
        if (maxDisease <= 0 || maxpatients <= 0) {
            // Handle invalid data
        }
        // Initialize arrays or collections to hold diseases and patients
    }

    @Override
    public Disease addDisease(String name, boolean infectious) {
        // To be implemented
        return null;
    }

    @Override
    public Disease getDisease(UUID diseaseId) {
        for (Disease disease : diseases) {
            if (disease.getDiseaseld().equals(diseaseId)) {
                return disease;
            }
        }
        return null;
    }

    @Override
    public Patient addPatient(String firstName, String LastName, int maxDiseases, int maxExposures) {
        Patient patient = new Patient(maxDiseases, maxExposures);
        patient.setFirstName(firstName);
        // Set other patient attributes if needed
        // Add the patient to the patients array or collection
        return patient;
    }

    @Override
    public Patient getPatient(UUID patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        return null;
    }

    @Override
    public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
        // To be implemented
    }

    @Override
    public void addExposureToPatient(UUID patientId, Exposure exposure) {
        // To be implemented
    }
}
