package dto;

public class CustomerMasterDTO {
int c_id;
String c_name;
String c_add;
long c_telephone;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + c_id;
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
	CustomerMasterDTO other = (CustomerMasterDTO) obj;
	if (c_id != other.c_id)
		return false;
	return true;
}
@Override
public String toString() {
	return "CustomerMasterDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_add=" + c_add + ", c_telephone="
			+ c_telephone + "]";
}
public int getC_id() {
	return c_id;
}
public String getC_name() {
	return c_name;
}
public String getC_add() {
	return c_add;
}
public long getC_telephone() {
	return c_telephone;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public void setC_add(String c_add) {
	this.c_add = c_add;
}
public void setC_telephone(long c_telephone) {
	this.c_telephone = c_telephone;
}


}
