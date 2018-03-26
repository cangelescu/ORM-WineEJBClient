package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.PromoDTO;

@Remote
public interface PromoDAORemote extends GenericDAO<PromoDTO>{

}
