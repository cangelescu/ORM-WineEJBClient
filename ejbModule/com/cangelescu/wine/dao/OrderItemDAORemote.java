package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.OrderItemDTO;

@Remote
public interface OrderItemDAORemote extends GenericDAO<OrderItemDTO>{

}
