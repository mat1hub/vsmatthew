package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImp implements DiseaseControlManager {
	private Disease[] diseases;
	private Patient[] patients;
	int md,me,indexdisease=0,indexpatient=0;
	public DiseaseControlManagerImp(int maxDisease, int maxpatients) {
		try{
		if(maxDisease<=0 || maxpatients<=0) 
			{
			   throw new IllegalArgumentException("Invalid Data");
			}
		else {
			  diseases=new Disease[maxDiseases];
			  patients=new Patient[maxPatient];
	              }
		}
		catch(IllegalArgumentException e){
			}


	@Override
	public Disease addDisease(String name, boolean infectious) {
                if (md <= indexdisease) {
			throw new IllegalStateException("No more Disease can be added");
		} else {
			if (infectious) {
				return diseases[indexdisease++] = new InfectiousDisease();
			} else {
				return diseases[indexdisease++] = new NonInfectiousDisease();
			}
		}
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for(Disease d:diseases) {
			if(d.diseaseId==diseaseId) {
				return d;
			}
			
		}
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
		if (me <= indexpatient) {
			throw new IllegalStateException("No more Patients can be added");
		} else {
			patients[indexpatient]=new Patient(maxDiseases, maxExposures);
			patients[indexpatient].setFirstName(firstName);
			patients[indexpatient].setLastName(lastName);
			return patients[indexpatient++];
		}
		
		
	}

	@Override
	public Patient getPatient(UUID patientId) {
		// TODO Auto-generated method stub
		for(Patient p:patients) {
			if(p.patientId==patientId) {
				return p;
			}
		}		
		
		return null;
	}

	

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
	Disease ds=null;
		Patient ps=null;
		int dg=0,pg=0;
		for (Disease d : diseases) {
			if (d.diseaseId == diseaseId) {
				ds=d;
				dg=1;
			}
		}
		if(dg==0)
		{
			throw new IllegalArgumentException("Disease not Found");
		}
		for (Patient p : patients) {
			if (p.patientId == patientId) {
				ps=p;
				pg=1;
			}
		}
		if(pg==0)
		{
			throw new IllegalArgumentException("Patient not Found");
		}
		if(dg==1&&pg==1)
		{
			ps.addDiseaseId(ds.diseaseId);
		}
		
		

	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposures) {
	int pg=0;
		Patient ps=null;
		for (Patient p : patients) {
			if (p.patientId == patientId) {
				ps=p;
				pg=1;
			}
		}
		if(pg==0)
		{
			throw new IllegalArgumentException("No patient was found...!");
		}
		else {
			ps.addExposure(exposure);
		}
	}

	

}
