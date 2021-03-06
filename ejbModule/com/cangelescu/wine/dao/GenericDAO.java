package com.cangelescu.wine.dao;

public interface GenericDAO<T> {
	void insert(T entity);

	T findById(int id);

	void delete(T entity);

	void update(T entity);
}
