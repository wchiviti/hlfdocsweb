package tech.hobbs.hlfdocmgmntsystem.dao;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.Quotation;

public interface QuotationDao extends AbstractDaoInterface<Quotation> {
	
	Quotation findByActivityName(Activity activity);
	
	Quotation findByQuotationId(int quotationId);

}
