package dto;

import java.sql.Date;
public class InvoiceMasterDTO {
int invoice_id;
Date invoiceDate;
int discount;

public int getInvoice_id() {
	return invoice_id;
}
public Date getInvoiceDate() {
	return invoiceDate;
}
public int getDiscount() {
	return discount;
}
public void setInvoice_id(int invoice_id) {
	this.invoice_id = invoice_id;
}
public void setInvoiceDate(Date invoiceDate) {
	this.invoiceDate = invoiceDate;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
@Override
public String toString() {
	return "InvoiceMasterDTO [invoice_id=" + invoice_id + ", invoiceDate=" + invoiceDate + ", discount=" + discount
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + invoice_id;
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
	InvoiceMasterDTO other = (InvoiceMasterDTO) obj;
	if (invoice_id != other.invoice_id)
		return false;
	return true;
}
}
