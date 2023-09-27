package service;

import java.util.List;

import dao.orderservice.OrderServiceDAO;
import dao.orderservice.OrderServiceDAOImpl;
import dao.orderservice.OrderServiceDTO;
import dao.product.ProductDao;
import dao.product.ProductDaoImpl;
import dao.product.ProductDto;

public class OrderServiceImp implements OrderService {
	private static OrderServiceImp cs;
	
	synchronized public static OrderServiceImp getOrderImp() {
		if(cs==null) {
			cs=new OrderServiceImp();
			return cs;
		}
		else {
			return cs.createClone();
		}
	}
	private OrderServiceImp createClone() {
		try {
			return (OrderServiceImp)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

		public List<OrderServiceDTO> getOrders() {
		    OrderServiceDAO pdao=OrderServiceDAOImpl.getServiceImpl();
			List<OrderServiceDTO> dto=pdao.findAll();
			return dto;
		}
	}


