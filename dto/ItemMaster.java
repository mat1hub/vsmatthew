package dto;

import com.mysql.cj.jdbc.Blob;
public class ItemMaster {
int item_id;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((itemname == null) ? 0 : itemname.hashCode());
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
	ItemMaster other = (ItemMaster) obj;
	if (itemname == null) {
		if (other.itemname != null)
			return false;
	} else if (!itemname.equals(other.itemname))
		return false;
	return true;
}
public int getItem_id() {
	return item_id;
}
public String getItemname() {
	return itemname;
}
public String getUnit() {
	return unit;
}
public float getPrice() {
	return price;
}
public Blob getImage() {
	return image;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public void setPrice(float price) {
	this.price = price;
}
public void setImage(Blob image) {
	this.image = image;
}
String itemname;
@Override
public String toString() {
	return "ItemMaster [item_id=" + item_id + ", itemname=" + itemname + ", unit=" + unit + ", price=" + price
			+ ", image=" + image + "]";
}
String unit;
float price;
Blob image;
}
