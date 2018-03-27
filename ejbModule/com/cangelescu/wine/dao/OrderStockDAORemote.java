package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.OrderStockDTO;

@Remote
public interface OrderStockDAORemote extends GenericDAO<OrderStockDTO> {

}
