package dto;

public class CustomerMasterDTO {
int Cid;
String Cname;
String Cadd;
long Ctelephone;
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
	if (Cid != other.Cid)
		return false;
	return true;
}
@Override
public String toString() {
	return "CustomerMasterDTO [c_id=" + Cid + ", c_name=" + Cname + ", c_add=" + Cadd + ", c_telephone="
			+ Ctelephone + "]";
}
public int getCid() {
	return Cid;
}
public String getCname() {
	return Cname;
}
public String getCadd() {
	return Cadd;
}
public long getCtelephone() {
	return Ctelephone;
}
public void setCid(int cid) {
	this.Cid = cid;
}
public void setCname(String cname) {
	this.Cname = cname;
}
public void setCadd(String cadd) {
	this.Cadd = cadd;
}
public void setCtelephone(long ctelephone) {
	this.Ctelephone = ctelephone;
}


}
