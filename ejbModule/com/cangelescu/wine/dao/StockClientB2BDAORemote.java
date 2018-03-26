package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.StockClientB2BDTO;

@Remote
public interface StockClientB2BDAORemote extends GenericDAO<StockClientB2BDTO> {

}
