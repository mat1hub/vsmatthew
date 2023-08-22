package edu.disease.asn3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DiseaseFileRepository {
	String folderPath;

	public void save(Disease[] disease, Patient[] patient) throws IOException {
		FileOutputStream disease1 = new FileOutputStream(folderPath + "\\Disease.dat");
		ObjectOutputStream outputdisease = new ObjectOutputStream(disease1);
		outputdisease.writeObject(disease1);
		// serialize for the Disease class
		FileOutputStream patient1 = new FileOutputStream("D:\\DiseaseAndPatient\\Patient.dat");
		ObjectOutputStream outputPatient = new ObjectOutputStream(patient1);
		outputPatient.writeObject(patient1);
	}

	public DiseaseAndPatient init(String folderPath) throws IOException, ClassNotFoundException {
		if (folderPath != null) {
			DiseaseAndPatient diseaseAndPatient = new DiseaseAndPatient();
			this.folderPath = folderPath;
			FileInputStream disease = new FileInputStream(folderPath + "\\Disease.dat");
			ObjectInputStream Inputdisease = new ObjectInputStream(disease);
			diseaseAndPatient.setDisease((Disease[]) Inputdisease.readObject());
			return diseaseAndPatient;
		} else {
			throw new IllegalArgumentException("No content was found inside the folder....!");
		}

	}
}
