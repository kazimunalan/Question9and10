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

import boot.model.Department;
import boot.model.Employee;
import boot.service.DepartmentService;
import boot.service.EmployeeService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeService employeeService;


	
	@GetMapping("/all-department")
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", departmentService.findAll());
		request.setAttribute("mode", "MODE_DEPARTMENT");
		
		return "index";
	}
	
	@GetMapping("/update-department")
	public String updateTask(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", departmentService.findTask(id));
		request.setAttribute("mode", "MODE_UPDATE_DEPARTMENT");
		return "index";
	}
	
	@GetMapping("/new-department")
	public String newTask(HttpServletRequest request){
		request.setAttribute("employee", employeeService.findAll());
		request.setAttribute("mode", "MODE_NEW_DEPARTMENT");
		return "index";
	}
	
	@PostMapping("/save-department")
	public String saveTask(@ModelAttribute Department task, @ModelAttribute Employee employee, BindingResult bindingResult, HttpServletRequest request){
		//task.setDateCreated(new Date());
		Employee emp = employeeService.findTask(employee.getId());
		task.setEmployee(emp);
		departmentService.save(task);
		
		request.setAttribute("tasks", departmentService.findAll());
		request.setAttribute("mode", "MODE_DEPARTMENT");
		return "index";
	}

	
	
	@GetMapping("/delete-department")
	public String deleteTask(@RequestParam int id, HttpServletRequest request){
		departmentService.delete(id);
		request.setAttribute("tasks", departmentService.findAll());
		request.setAttribute("mode", "MODE_DEPARTMENT");
		return "index";
	}
}
