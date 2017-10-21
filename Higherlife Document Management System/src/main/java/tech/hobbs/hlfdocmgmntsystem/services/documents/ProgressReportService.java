package tech.hobbs.hlfdocmgmntsystem.services.documents;

import tech.hobbs.hlfdocmgmntsystem.model.documents.ProgressReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface ProgressReportService extends AbstractServiceInterface<ProgressReport> {
	
	ProgressReport findByYear(int Year);
	
	ProgressReport findProgressReportByStudent(Student student);
	
	ProgressReport findProgressReportByTertiaryLevelId(int levelId);

}
