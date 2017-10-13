package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.ActivityVideo;
import tech.hobbs.hlfdocmgmntsystem.model.Student;

public interface ActivityVideoDao extends AbstractDaoInterface<ActivityVideo> {
		
	ActivityVideo findByActivityName(Activity activity);
	
	ActivityVideo findByUploader(Student student);
	
}
