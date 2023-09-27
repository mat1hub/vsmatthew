package service;

import java.util.List;
import dao.product.ProductDao;
import dao.product.ProductDaoImpl;
import dao.product.ProductDto;

public class ProductServiceImpl implements ProductService,Cloneable{
	
	private ProductServiceImpl() {
		System.out.println("ProductService service impl object created...");
		
	}
	
	private static ProductServiceImpl cs;
	
	synchronized public static ProductServiceImpl getServiceImpl() {
		if(cs==null) {
			cs=new ProductServiceImpl();
			return cs;
		}
		else {
			return cs.createClone();
		}
	}
	private ProductServiceImpl createClone() {
		try {
			return (ProductServiceImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<ProductDto> getProducts() {
		ProductDao pdao=ProductDaoImpl.getServiceImpl();
		List<ProductDto> dto=pdao.findAll();
		return dto;
	}
	
}
