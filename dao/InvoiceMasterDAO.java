package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerMasterDTO;
import dto.InvoiceMasterDTO;
public interface InvoiceMasterDAO {
public InvoiceMasterDTO findById(int id) throws SQLException;
public int updateInvoiceMaster(InvoiceMasterDTO cmd) throws SQLException;
public int deleteInvoiceMaster(int del) throws SQLException;
public int addInvoiceMaster(InvoiceMasterDTO cmd) throws SQLException;
public List<InvoiceMasterDTO> findAll();

}
