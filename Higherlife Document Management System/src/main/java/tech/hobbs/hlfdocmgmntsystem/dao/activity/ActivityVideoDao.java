package tech.hobbs.hlfdocmgmntsystem.dao.activity;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.activity.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

public interface ActivityVideoDao extends AbstractDaoInterface<ActivityVideo> {
		
	ActivityVideo findByActivityName(Activity activity);
	
	ActivityVideo findByUploader(Student student);
	
}
