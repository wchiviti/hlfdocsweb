package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.Group;

public interface GroupDao extends AbstractDaoInterface<Group>{
	
	Group findByGroupName(String name);
	
	Group findByGroupId(int groupId);

}
