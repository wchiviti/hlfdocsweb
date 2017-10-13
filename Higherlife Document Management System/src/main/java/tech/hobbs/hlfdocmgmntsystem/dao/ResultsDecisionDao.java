package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.ResultsDecision;

public interface ResultsDecisionDao extends AbstractDaoInterface<ResultsDecision>{
	
	ResultsDecision findByResultsDecision(String decision);
	
	ResultsDecision findByDecisionId(int id);

}
