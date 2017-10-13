package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.ProgressReport;
import tech.hobbs.hlfdocmgmntsystem.model.Student;

public interface ProgressReportDao extends AbstractDaoInterface<ProgressReport> {
	
	ProgressReport findByYear(int Year);
	
	ProgressReport findProgressReportByStudent(Student student);
	
	ProgressReport findProgressReportByTertiaryLevelId(int levelId);

}
