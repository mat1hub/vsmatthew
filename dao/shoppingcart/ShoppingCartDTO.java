package dao.shoppingcart;

import java.sql.Date;

public class ShoppingCartDTO {
private int shoppingcartid;
private int customerid;
private String productcode;
private int isactive;
private Date lastupdated;

public Date getLastupdated() {
	return lastupdated;
}
public void setLastupdated(Date lastupdated) {
	this.lastupdated = lastupdated;
}
public void setShoppingcartid(int shoppingcartid) {	
	this.shoppingcartid =shoppingcartid;
}
public int getShoppingcartid() {
	return shoppingcartid;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getProductcode() {
	return productcode;
}
public void setProductcode(String productcode) {
	this.productcode = productcode;
}
public int  getIsactive() {
	return isactive;
}
public void setIsactive(int isactive) {
	this.isactive = isactive;
}
@Override
public String toString() {
	return "ShoppingCartDTO [shoppingcartid=" + shoppingcartid + ", customerid=" + customerid + ", productcode="
			+ productcode + ", isactive=" + isactive + " +\", lastupdated=" + lastupdated +"]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + customerid;
	result = prime * result + ((productcode == null) ? 0 : productcode.hashCode());
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
	ShoppingCartDTO other = (ShoppingCartDTO) obj;
	if (customerid != other.customerid)
		return false;
	if (productcode == null) {
		if (other.productcode != null)
			return false;
	} else if (!productcode.equals(other.productcode))
		return false;
	return true;
}



}
