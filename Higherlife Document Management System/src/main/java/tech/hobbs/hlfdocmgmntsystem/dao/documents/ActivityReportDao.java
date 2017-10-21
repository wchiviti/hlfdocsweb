package tech.hobbs.hlfdocmgmntsystem.dao.documents;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

public interface ActivityReportDao extends AbstractDaoInterface<ActivityReport> {
	
	List<ActivityReport> findByReportNo(String reportNo);
	
	ActivityReport findByStudent(Student student);
	
	List<ActivityReport> findByActivityName(Activity activity);

}
