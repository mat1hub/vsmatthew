package dto;

import java.sql.Date;
public class InvoiceMasterDTO {
int invoiceId;
Date invoiceDate;
int discount;

public int getInvoiceid() {
	return invoice_id;
}
public Date getInvoiceDate() {
	return invoiceDate;
}
public int getDiscount() {
	return discount;
}
public void setInvoiceid(int invoice_id) {
	this.invoiceId = invoice_id;
}
public void setInvoiceDate(Date invoiceDate) {
	this.invoiceDate = invoiceDate;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
@Override
public String toString() {
	return "InvoiceMasterDTO [invoice_id=" + invoiceId + ", invoiceDate=" + invoiceDate + ", discount=" + discount
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + invoiceId;
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
	if (invoiceId != other.invoiceId)
		return false;
	return true;
}
}
