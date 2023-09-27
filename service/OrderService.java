package service;

import java.util.List;

import dao.orderservice.OrderServiceDTO;
public interface OrderService {
	
	public List<OrderServiceDTO> getOrders();
}
