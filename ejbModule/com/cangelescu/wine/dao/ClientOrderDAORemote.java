package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.ClientOrderDTO;

@Remote
public interface ClientOrderDAORemote extends GenericDAO<ClientOrderDTO>{

}
