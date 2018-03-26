package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescu.wine.dto.UserDTO;

@Remote
public interface UserDAORemote extends GenericDAO<UserDTO>{

}
