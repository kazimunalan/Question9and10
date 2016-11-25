package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Meetings;

public interface MeetingsRepository extends CrudRepository<Meetings, Integer>{

}
