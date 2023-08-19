package edu.disease.asn2;

import java.util.UUID;
import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {
	public abstract Disease addDisease(String name, boolean infectious);

	public abstract Disease getDisease(UUID diseaseId);

	public abstract Patient addPatient(String firstName, String LastName, int maxDiseases, int maxExposures);

	public abstract Patient getPatient(UUID patientId);

	public abstract void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	public void addExposureToPatient(UUID patientId, Exposure exposures);

}
