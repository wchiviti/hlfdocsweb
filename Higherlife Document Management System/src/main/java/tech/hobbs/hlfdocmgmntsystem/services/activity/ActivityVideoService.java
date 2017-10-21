package tech.hobbs.hlfdocmgmntsystem.services.activity;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface ActivityVideoService extends AbstractServiceInterface<ActivityVideo> {
		
	ActivityVideo findByActivityName(Activity activity);
	
	ActivityVideo findByUploader(Student student);
	
}
