package com.cangelescu.wine.dao;

import javax.ejb.Remote;

import com.cangelescuwine.dto.UserDTO;

@Remote
public interface UserDAORemote extends GenericDAO<UserDTO>{

}
