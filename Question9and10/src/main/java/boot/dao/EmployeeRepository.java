package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Employee;
//UserRepository interface'i CrudRepository sınıfını extend etmiştir.
//Bu interface crud metodlarini yazilamaktan kurtarmistir. Bu sayade controller class inda kolaylikla metodlar kullanilmistir.
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
