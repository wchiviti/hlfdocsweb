package tech.hobbs.hlfdocmgmntsystem.services.documents;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface ActivityReportService extends AbstractServiceInterface<ActivityReport> {
	
	List<ActivityReport> findByReportNo(String reportNo);
	
	ActivityReport findByStudent(Student student);
	
	List<ActivityReport> findByActivityName(Activity activity);

}
