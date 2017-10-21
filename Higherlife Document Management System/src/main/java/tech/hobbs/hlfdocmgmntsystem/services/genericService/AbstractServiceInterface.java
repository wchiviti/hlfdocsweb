package tech.hobbs.hlfdocmgmntsystem.services.genericService;

import java.util.List;

public interface AbstractServiceInterface<T> {

	List<T> findAll();

	void saveOrUpdate(T model);

	void delete(T model);

}
