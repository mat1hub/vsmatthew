package dto;

public class InvoiceTransactionDTO {
int invoiceId;
public int getInvoiceId() {
	return invoice_id;
}
public int getItemId() {
	return item_id;
}
public int getQty() {
	return qty;
}
public void setInvoiceId(int invoiceId) {
	this.invoice_id = invoice_id;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public void setQty(int qty) {
	this.qty = qty;
}
int itemId;
@Override
public String toString() {
	return "InvoiceTransaction [invoice_id=" + invoiceId + ", item_id=" + itemId + ", qty=" + qty + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + invoiceId;
	result = prime * result + itemId;
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
	if (invoiceId != other.invoiceId)
		return false;
	if (itemId != other.itemId)
		return false;
	return true;
}
int qty;
}
