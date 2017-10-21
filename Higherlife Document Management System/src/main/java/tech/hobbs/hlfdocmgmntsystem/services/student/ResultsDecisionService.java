package tech.hobbs.hlfdocmgmntsystem.services.student;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.student.ResultsDecision;

public interface ResultsDecisionService extends AbstractDaoInterface<ResultsDecision>{
	
	ResultsDecision findByResultsDecision(String decision);
	
	ResultsDecision findByDecisionId(int id);

}
