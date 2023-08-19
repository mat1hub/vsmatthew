package edu.disease.asn1;
import java.util.UUID;
public class Patient {
	
		UUID patientId;
		String firstName;
		String lastName;
		Exposure[] exposures;
		UUID[] diseaselds;
		int maxDisease, maxExposures;
		public UUID getPatientId() {
			return patientId;
		}


		public String getFirstName() {
			return firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setPatientId(UUID patientId) {
			this.patientId = patientId;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		int index = 0;
		int i=0;
		public Patient(int maxDisease, int maxExposures) {
			try {
			if(maxDisease<=0 || maxExposures<=0) {
				throw new IllegalArgumentException("invalid data");
			}
			else {
				diseaselds = new UUID[maxDisease];
				this.maxExposures = maxExposures;
			}
			}
			catch(IllegalArgumentException e) {
				//e.printStackTrace();
			}
			
		}


		public void addDiseaseld(UUID diseaseld) {
			try {
			if(index < maxDisease)
				diseaselds[index++]=diseaseld; 
			
			else {
				throw new ArrayIndexOutOfBoundsException("memory overloaded!");
			}
			}
			catch(ArrayIndexOutOfBoundsException e) {
			}
		}
		
		public void addExposure(Exposure exposures ) {
			try {	
				if(i<maxExposures) 
			this.exposures[i++]=exposures;
				else {
					throw new ArrayIndexOutOfBoundsException("out of memory....!");
				}
			}
			catch(ArrayIndexOutOfBoundsException ai) {
				
			}
			}
}

	