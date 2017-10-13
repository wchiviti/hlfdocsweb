package tech.hobbs.hlfdocmgmntsystem.dao.genericdao;

import java.util.List;

public interface AbstractDaoInterface <T> {
	
	List<T> findAll();
	
	void saveOrUpdate(T model);
	
	void delete(T model);
	
}
