package dao;

import java.sql.SQLException;

import java.util.List;

import dto.InvoiceTransactionDTO;

public interface InvoiceTransactionDAO {
public InvoiceTransactionDTO  findById(int id) throws SQLException;
public int updateInvoiceTransaction( InvoiceTransactionDTO uit);
public int deleteInvoiceTransaction(int del);
public int addInvoiceTransaction(InvoiceTransactionDTO itc);
public List<InvoiceTransactionDTO> findAll();
}
