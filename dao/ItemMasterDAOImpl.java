package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import dto.ItemMaster;
public class ItemMasterDAOImpl implements ItemMasterDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public ItemMasterDAOImpl(Connection con) {
		this.con = con;
	}
	@Override
	public ItemMaster findbyName(String name) {
		try {
        ps =con.prepareStatement("select *from itemmaster where itemname=?");
        ps.setString(1, name);
        rs=ps.executeQuery();
        ItemMaster im =new ItemMaster();
        if(rs.next()) {
        	im.setItem_id(rs.getInt(1));
        	im.setItemname(rs.getString(2));
        	im.setPrice(rs.getFloat(3));
        	im.setUnit(rs.getString(4));
        	//im.setImage(rs.getBlob(5));
        	return im;
        }
		}
        catch(SQLException se) {
        	se.printStackTrace();
        	
        }
		return null;
	}

	@Override
	public int updateInvoiceMaster(ItemMaster im) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceMaster(int del) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addItemMaster(ItemMaster add) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ItemMaster> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
