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
import boot.model.Meetings;
import boot.service.DepartmentService;
import boot.service.MeetingsService;

@Controller
public class MeetingsController {
	
	@Autowired
	private MeetingsService meetingsService;
	
	@Autowired
	private DepartmentService departmentService;
	



	
	@GetMapping("/all-meetings")
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", meetingsService.findAll());
		request.setAttribute("mode", "MODE_MEETINGS");
		return "index";
	}
	
	@GetMapping("/update-meetings")
	public String updateTask(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", meetingsService.findTask(id));
		request.setAttribute("mode", "MODE_UPDATE_MEETINGS");
		return "index";
	}
	
	@GetMapping("/new-meetings")
	public String newTask(HttpServletRequest request){
		request.setAttribute("department", departmentService.findAll());
		request.setAttribute("mode", "MODE_NEW_MEETINGS");
		return "index";
	}
	
	@PostMapping("/save-meetings")
	public String saveTask(@ModelAttribute Meetings task, @ModelAttribute Department department, BindingResult bindingResult, HttpServletRequest request){
		//task.setDateCreated(new Date());
		Department dpr = departmentService.findTask(department.getId());
		task.setDepartment(dpr);
		meetingsService.save(task);
		request.setAttribute("tasks", meetingsService.findAll());
		request.setAttribute("mode", "MODE_MEETINGS");
		return "index";
	}

	
	
	@GetMapping("/delete-meetings")
	public String deleteTask(@RequestParam int id, HttpServletRequest request){
		meetingsService.delete(id);
		request.setAttribute("tasks", meetingsService.findAll());
		request.setAttribute("mode", "MODE_MEETINGS");
		return "index";
	}
}
