package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImp implements DiseaseControlManager {
	private Disease[] diseases;
	private Patient[] patients;

	public DiseaseControlManagerImp(int maxDisease, int maxpatients) {
		if(maxDisease<=0 || maxpatients<=0) {
			
		}
	}

	@Override
	public Disease addDisease(String name, boolean infectious) {

		return null;
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
	    for(Disease disease:diseases) {
	    	if(disease.getDiseaseld()==diseaseId) {
	    		return disease;
	    	}
	    }
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String LastName, int maxDiseases, int maxExposures) {
		
		return null;
	}

	@Override
	public Patient getPatient(UUID patientId) {
		 for(Patient patient:patients) {
		    	if(patient.getPatientId()==patientId) {
		    		return patient;
		    	}
		    }
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
	

	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposures) {
	

	}

}
