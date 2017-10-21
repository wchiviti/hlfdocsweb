package tech.hobbs.hlfdocmgmntsystem.dao.documents;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ProgressReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

public interface ProgressReportDao extends AbstractDaoInterface<ProgressReport> {
	
	ProgressReport findByYear(int Year);
	
	ProgressReport findProgressReportByStudent(Student student);
	
	ProgressReport findProgressReportByTertiaryLevelId(int levelId);

}
