package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.SupplierDTO;

@Remote
public interface SupplierDAORemote extends GenericDAO<SupplierDTO>{

}
