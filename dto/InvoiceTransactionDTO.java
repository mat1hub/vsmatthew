package dto;

public class InvoiceTransactionDTO {
int invoice_id;
public int getInvoice_id() {
	return invoice_id;
}
public int getItem_id() {
	return item_id;
}
public int getQty() {
	return qty;
}
public void setInvoice_id(int invoice_id) {
	this.invoice_id = invoice_id;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public void setQty(int qty) {
	this.qty = qty;
}
int item_id;
@Override
public String toString() {
	return "InvoiceTransaction [invoice_id=" + invoice_id + ", item_id=" + item_id + ", qty=" + qty + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + invoice_id;
	result = prime * result + item_id;
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
	InvoiceTransactionDTO other = (InvoiceTransactionDTO) obj;
	if (invoice_id != other.invoice_id)
		return false;
	if (item_id != other.item_id)
		return false;
	return true;
}
int qty;
}
