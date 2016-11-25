package boot.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Employee;

import boot.service.EmployeeService;

//Controller sınıfı
//Proje ' localhost:8080 ' adresinde çalismaktadir. 
@Controller
public class EmployeeController {
	//ASAGIDAKI TUM METODLAR CrudRepository ILE GELMISTIR.
	@Autowired
	private EmployeeService employeeService;
	

	//Mapping bize jsp sayfasinda olusturulan <c:when test="${mode == '??'}"> ozelligini kullanmamiza yarar. Bu sekilde bir nevi modulerlik saglar.
	@GetMapping("/")// acilis sayfasi icin mapping olusturulmustur. index sayfasina yonlendirilir.
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}

	
	@GetMapping("/all-tasks")//user verilerinin siralanmasini saglar
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", employeeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-task")//user verilerinin guncellenmesini saglar. 
	public String updateTask(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", employeeService.findTask(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/new-task")//kayit metodudur.
	public String newTask(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	//ModelAttribute anotasyonu RequestParam anotasyonuna gore tum class'i getirmektedir. RequestParam sadece istenen degeri getirir.
	@PostMapping("/save-task")//Kayit metodudur. <input type="submit" class="btn btn-primary" value="Save"/> butonu ile user kayit edilir.
	public String saveTask(@ModelAttribute Employee task, BindingResult bindingResult, HttpServletRequest request){
		//task.setDateCreated(new Date());
		employeeService.save(task);
		request.setAttribute("tasks", employeeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}

	
	
	@GetMapping("/delete-task")//User silmek icin crudRepository ile gelen delete metodu'dur. 
	public String deleteTask(@RequestParam int id, HttpServletRequest request){
		employeeService.delete(id);
		request.setAttribute("tasks", employeeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
}
