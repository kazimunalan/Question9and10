package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
