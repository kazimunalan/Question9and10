package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.EmployeeRepository;
import boot.model.Employee;

//Crud islemleri icin gerekli anatosyanlardir. Servis saglar
@Service
@Transactional
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	//Tum kullanicilari listeler
	public List<Employee> findAll(){
		List<Employee> tasks = new ArrayList<>();
		for(Employee task : employeeRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	//id ye gore getirir.
	public Employee findTask(int id){
		return employeeRepository.findOne(id);
	}
	//User kaydini saglar
	public void save(Employee task){
		employeeRepository.save(task);
	}
	//Id Parametresine gore user siler.
	public void delete(int id){
		employeeRepository.delete(id);
	}
}
