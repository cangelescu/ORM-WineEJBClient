package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.OrderDTO;

@Remote
public interface OrderDAORemote extends GenericDAO<OrderDTO> {

}
