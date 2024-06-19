package dao;

public interface GenericDao<T> {

	void insert(T entity);
	void delete(T entity);
	
}
