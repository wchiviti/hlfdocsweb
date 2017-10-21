package tech.hobbs.hlfdocmgmntsystem.dao.documents.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.documents.ProgressReportDao;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ProgressReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

@Repository
public class ProgressReportDaoImpl implements ProgressReportDao {

	@Override
	public List<ProgressReport> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ProgressReport model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ProgressReport model) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProgressReport findByYear(int Year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgressReport findProgressReportByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgressReport findProgressReportByTertiaryLevelId(int levelId) {
		// TODO Auto-generated method stub
		return null;
	}

}
