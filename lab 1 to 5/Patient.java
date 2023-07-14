package edu.disease.asn1;

import java.util.UUID;

public class Patient {
	UUID patientId;
	String firstName;
	String lastName;
	Exposure exposures;
	UUID[] diseaselds;
	int maxDisease, maxExposures;
	int index = 0;
	public Patient(int maxDisease, int maxExposures) {
		this.maxDisease = maxDisease;
		this.maxExposures = maxExposures;
	}


	public void addDiseaseld(UUID diseaseld) {
		if(index < maxDisease)
			diseaselds[index++]=diseaseld; 
		else
			throw new ArrayIndexOutOfBoundsException("memory overloaded!");
	}
	public void addExposure() {
		
	}

}
