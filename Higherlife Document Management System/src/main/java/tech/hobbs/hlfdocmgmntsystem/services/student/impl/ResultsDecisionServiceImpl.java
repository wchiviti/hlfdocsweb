package tech.hobbs.hlfdocmgmntsystem.services.student.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.student.ResultsDecision;
import tech.hobbs.hlfdocmgmntsystem.services.student.ResultsDecisionService;

@Service
@Transactional
public class ResultsDecisionServiceImpl implements ResultsDecisionService {

	@Override
	public List<ResultsDecision> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(ResultsDecision model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ResultsDecision model) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultsDecision findByResultsDecision(String decision) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultsDecision findByDecisionId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
