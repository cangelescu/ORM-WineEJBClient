package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.SupplierDTO;

@Remote
public interface SupplierDAORemote extends GenericDAO<SupplierDTO>{

}
