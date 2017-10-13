package tech.hobbs.hlfdocmgmntsystem.dao;

import java.util.List;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.ActivityReport;
import tech.hobbs.hlfdocmgmntsystem.model.Student;

public interface ActivityReportDao extends AbstractDaoInterface<ActivityReport> {
	
	List<ActivityReport> findByReportNo(String reportNo);
	
	ActivityReport findByStudent(Student student);
	
	List<ActivityReport> findByActivityName(Activity activity);

}
