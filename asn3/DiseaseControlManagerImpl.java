package edu.disease.asn3;
import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
	private Disease [] diseases;
	private Patient [] patients;
	int md,me,indexd=0,indexp=0;

	 public DiseaseControlManagerImpl(int maxDiseases,int maxPatient) {
		 try {
			 if(maxDiseases<=0||maxPatient<=0)
				{
					throw new IllegalArgumentException("Invalid Data");
				}
				else {
					diseases=new Disease[maxDiseases];
					patients=new Patient[maxPatient];
		 }
			}
		 catch(IllegalArgumentException e) {
			 
		 }
		
	}
	@Override
	public Disease addDisease(String name, boolean infectious) {
		if (md <= indexd) {
			throw new IllegalStateException("No more Disease can be added");
		} else {
			if (infectious) {
				return diseases[indexd++] = new InfectiousDisease();
			} else {
				return diseases[indexd++] = new NonInfectiousDisease();
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
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (me <= indexp) {
			throw new IllegalStateException("No more Patients can be added");
		} else {
			patients[indexp]=new Patient(maxDiseases, maxExposures);
			patients[indexp].setFirstName(firstName);
			patients[indexp].setLastName(lastName);
			return patients[indexp++];
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
	public void addDiseaseToPatient(UUID diseaseId, UUID patientId) {
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
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
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
			throw new IllegalArgumentException("Patient not Found");
		}
		else {
			ps.addExposure(exposure);
		}
	}
	@Override
	public Disease[] getDiseases() {
		
		return diseases;
	}
	@Override
	public Patient[] getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}
	
	}