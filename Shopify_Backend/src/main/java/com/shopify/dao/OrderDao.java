package com.shopify.dao;

import com.shopify.model.CustomerOrder;

public interface OrderDao {
boolean placeOrder(CustomerOrder order);

}
