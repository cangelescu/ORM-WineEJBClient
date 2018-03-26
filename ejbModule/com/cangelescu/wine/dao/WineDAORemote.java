package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.WineDTO;

@Remote
public interface WineDAORemote extends GenericDAO<WineDTO>{

}
