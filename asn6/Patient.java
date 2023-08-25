package edu.disease.asn6;

import java.io.Serializable;
import java.util.Comparator;
import java.util.UUID;

import edu.disease.asn3.Exposure;

public class Patient implements Comparable<Patient>, Serializable {
	UUID patientId;
	String firstName;
	String lastName;
	Exposure[] exposures;

	public Exposure[] getExposures() {
		return exposures;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

	public void setDiseaselds(UUID[] diseaselds) {
		this.diseaseIds = diseaselds;
	}

	UUID[] diseaseIds;
	int maxDisease, maxExposures;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	int index = 0;
	int i = 0;

	public Patient(int maxDisease, int maxExposures) {
		try {
			if (maxDisease <= 0 || maxExposures <= 0) {
//				this.exposures =new Exposure[maxExposures];
//				this.diseaselds =new UUID[maxDisease];
				throw new IllegalArgumentException("invalid data");
			} else {
				diseaseIds = new UUID[maxDisease];
				this.maxExposures = maxExposures;
			}
		} 
		catch (IllegalArgumentException e) {

		}

	}

	public void addDiseaseId(UUID diseaseld) {
		if (index < maxDisease)
			diseaseIds[index++] = diseaseld;

		else {
			throw new ArrayIndexOutOfBoundsException("memory overloaded!");
		}

	}

	public void addExposure(Exposure exposures) {

		this.exposures[i++] = exposures;

	}

	@Override
	public int compareTo(Patient other) {
		// First, compare by last name
		int lastNameComparison = this.lastName.compareTo(other.lastName);

		if (lastNameComparison != 0) {
			return lastNameComparison;
		}

		// If last names are equal, compare by first name
		return this.firstName.compareTo(other.firstName);
	}
}
