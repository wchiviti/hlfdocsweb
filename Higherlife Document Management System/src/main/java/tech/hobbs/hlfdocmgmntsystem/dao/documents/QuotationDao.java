package tech.hobbs.hlfdocmgmntsystem.dao.documents;

import tech.hobbs.hlfdocmgmntsystem.dao.genericdao.AbstractDaoInterface;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.Quotation;

public interface QuotationDao extends AbstractDaoInterface<Quotation> {
	
	Quotation findByActivityName(Activity activity);
	
	Quotation findByQuotationId(int quotationId);

}
