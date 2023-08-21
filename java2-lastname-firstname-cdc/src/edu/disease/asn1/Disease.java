package edu.disease.asn1;
import java.util.UUID;
public  class Disease {
UUID diseaseld;
String name;
// public abstract String[]  getExamples();
public UUID getDiseaseld() {
	return diseaseld;
}
public void setDiseaseld(UUID diseaseld) {
	this.diseaseld = diseaseld;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((diseaseld == null) ? 0 : diseaseld.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Disease other = (Disease) obj;
	if (diseaseld == null) {
		if (other.diseaseld != null)
			return false;
	} else if (!diseaseld.equals(other.diseaseld))
		return false;
	return true;
}
@Override
public String toString() {
	return "Disease [diseaseld=" + diseaseld + ", name=" + name + ", getDiseaseld()=" + getDiseaseld() + ", getName()="
			+ getName() + ", hashCode()=" + hashCode() + "]";
}
}
// class InfectiousDisease extends Disease{
// 	@Override
// 	public String[] getExamples() {
// 		String[] d1 = {"corona","diabetics","virus","AIDS"};
// 		return d1;
// 	}
// }
// class NonInfectiousDisease extends Disease{

// 	@Override
// 	public String[] getExamples() {
// 		String[] d2 = {"corona-2023" ,"diabetics -12","virus-23","fever-12"};
// 		return d2;
// 	}
	
// }
