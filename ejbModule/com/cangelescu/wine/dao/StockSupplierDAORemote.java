package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.StockSupplierDTO;

@Remote
public interface StockSupplierDAORemote extends GenericDAO<StockSupplierDTO>{

}
