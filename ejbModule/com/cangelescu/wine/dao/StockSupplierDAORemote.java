package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.StockSupplierDTO;

@Remote
public interface StockSupplierDAORemote extends GenericDAO<StockSupplierDTO>{

}
