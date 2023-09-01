package dao;

import java.util.List;

import dto.ItemMaster;
public interface ItemMasterDAO {
public ItemMaster findbyName(String name);
public int updateInvoiceMaster(ItemMaster im);
public int deleteInvoiceMaster(int del);
public int addItemMaster(ItemMaster add);
public List<ItemMaster> findAll();

}
