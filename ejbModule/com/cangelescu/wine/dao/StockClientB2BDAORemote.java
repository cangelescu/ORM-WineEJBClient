package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.StockClientB2BDTO;

@Remote
public interface StockClientB2BDAORemote extends GenericDAO<StockClientB2BDTO> {

}
