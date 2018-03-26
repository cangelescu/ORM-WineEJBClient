package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.ClientOrderDTO;

@Remote
public interface ClientOrderDAORemote extends GenericDAO<ClientOrderDTO>{

}
