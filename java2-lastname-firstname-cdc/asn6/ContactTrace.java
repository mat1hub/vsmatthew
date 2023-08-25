package edu.disease.asn6;

import java.util.Arrays;
import java.util.List;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;
import edu.disease.asn4.PatientZero;

class ContactTrace {
	List<Patient> patient;
	Exposure exposures;
	PatientZero patientZero;

	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.patient = Arrays.asList(diseaseControlManager.getPatients());
	}

	public PatientZero findPatientZero(Patient patient) {
		for (Exposure expo : patient.getExposures()) {
			if (expo.getExposureType().equalsIgnoreCase("D")) {
				if (exposures == null || expo.getDateTime().isBefore(exposures.getDateTime())) {
					exposures = expo;
				}
			}
		}
		if (exposures != null) {
			for (Patient p : this.patient) {
				for (Exposure e : p.getExposures()) {
					if (e.getExposureType().equalsIgnoreCase("D")) {
						if (e.getDateTime().isBefore(exposures.getDateTime())) {
							exposures = e;
							patientZero.setPatient(p);
							patientZero.setExposureDateTime(e.getDateTime());
							patientZero.setExposed(true);
							return findPatientZero(p);

						}
					}
				}
			}
		}
		return patientZero;

	}
}
