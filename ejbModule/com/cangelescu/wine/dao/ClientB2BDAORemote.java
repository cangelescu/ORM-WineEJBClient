package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.ClientB2BDTO;

@Remote
public interface ClientB2BDAORemote extends GenericDAO<ClientB2BDTO> {

}
