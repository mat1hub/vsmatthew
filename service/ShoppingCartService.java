package service;

import java.util.List;

import dao.shoppingcart.ShoppingCartDTO;

public interface ShoppingCartService {
public List<ShoppingCartDTO> getCartItems();
}
