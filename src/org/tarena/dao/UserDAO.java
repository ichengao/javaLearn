package org.tarena.dao;

import org.tarena.entity.User;

public interface UserDAO {
	public User findByName(String name);
}
