package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.OrderItemDTO;

@Remote
public interface OrderItemDAORemote extends GenericDAO<OrderItemDTO>{

}
