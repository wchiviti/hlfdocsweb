package tech.hobbs.hlfdocmgmntsystem.dao.documents.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.documents.ActivityReportDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.ActivityReport;
import tech.hobbs.hlfdocmgmntsystem.model.student.Student;

@Repository
public class ActivityReportDaoImpl implements ActivityReportDao {

	@Override
	public List<ActivityReport> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ActivityReport model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ActivityReport model) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ActivityReport> findByReportNo(String reportNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivityReport findByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityReport> findByActivityName(Activity activity) {
		// TODO Auto-generated method stub
		return null;
	}

}
