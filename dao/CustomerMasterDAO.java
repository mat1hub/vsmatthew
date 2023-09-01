package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerMasterDTO;
public interface CustomerMasterDAO {
public CustomerMasterDTO findByName(String name)throws SQLException;
public int updateCustomerMaster(CustomerMasterDTO cmd) throws SQLException;
public int deleteCustomerMaster(int del) throws SQLException;
public int addCustomerMaster(CustomerMasterDTO cmd) throws SQLException;
public List<CustomerMasterDTO> findAll() throws SQLException, Exception;
}
