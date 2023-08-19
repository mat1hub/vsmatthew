package edu.disease.asn2;
import java.util.Comparator;
import java.util.UUID;
import edu.disease.asn1.Exposure;
public class Patient implements Comparable<Patient>{
		UUID patientId;
		String firstName;
		String lastName;
		Exposure[] exposures;
		UUID[] diseaselds;
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
		int i=0;
		public Patient(int maxDisease, int maxExposures) {
			try {
			if(maxDisease<=0 || maxExposures<=0) {
//				this.exposures =new Exposure[maxExposures];
//				this.diseaselds =new UUID[maxDisease];
				throw new IllegalArgumentException("invalid data");
			}
			else {
				diseaselds = new UUID[maxDisease];
				this.maxExposures = maxExposures;
			}
			}
			catch(IllegalArgumentException e) {
				
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
				
				
			this.exposures[i++]=exposures;
			
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

	