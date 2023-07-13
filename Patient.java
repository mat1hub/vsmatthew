package edu.disease.asn1;
import java.util.UUID;
public class Patient {
	
		UUID patientId;
		String firstName;
		String lastName;
		Exposure[] exposures;
		UUID[] diseaselds;
		int maxDisease, maxExposures;
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
			if() {
				
			}
			}
}

	