package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.WineDTO;

@Remote
public interface WineDAORemote extends GenericDAO<WineDTO>{

}
