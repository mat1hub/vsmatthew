package dao.orderservice; 

import java.util.List;


public  interface  OrderServiceDAO {
	public List<OrderServiceDTO> findAll();
	public OrderServiceDTO findByOrderId(int pname);
	public int addOrder(OrderServiceDTO  insert);
	public int updateOrder(OrderServiceDTO  update);
	public int deleteOrder(OrderServiceDTO  delete);
}
