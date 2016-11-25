package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.MeetingsRepository;
import boot.model.Meetings;

@Service
@Transactional
public class MeetingsService {

	private final MeetingsRepository meetingsRepository;

	public MeetingsService(MeetingsRepository departmentRepository) {
		this.meetingsRepository = departmentRepository;
	}
	
	public List<Meetings> findAll(){
		List<Meetings> tasks = new ArrayList<>();
		for(Meetings task : meetingsRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	
	public Meetings findTask(int id){
		return meetingsRepository.findOne(id);
	}
	
	public void save(Meetings task){
		meetingsRepository.save(task);
	}
	
	public void delete(int id){
		meetingsRepository.delete(id);
	}
}
