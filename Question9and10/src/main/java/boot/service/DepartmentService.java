package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.DepartmentRepository;
import boot.model.Department;

@Service
@Transactional
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}
	
	public List<Department> findAll(){
		List<Department> tasks = new ArrayList<>();
		for(Department task : departmentRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	
	public Department findTask(int id){
		return departmentRepository.findOne(id);
	}
	
	public void save(Department task){
		departmentRepository.save(task);
	}
	
	public void delete(int id){
		departmentRepository.delete(id);
	}
}
