package tech.hobbs.hlfdocmgmntsystem.services.documents;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.Quotation;
import tech.hobbs.hlfdocmgmntsystem.services.genericService.AbstractServiceInterface;

public interface QuotationService extends AbstractServiceInterface<Quotation> {
	
	Quotation findByActivityName(Activity activity);
	
	Quotation findByQuotationId(int quotationId);

}
