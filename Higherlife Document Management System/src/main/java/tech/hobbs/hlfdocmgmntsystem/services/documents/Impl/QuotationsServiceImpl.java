package tech.hobbs.hlfdocmgmntsystem.services.documents.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.Quotation;
import tech.hobbs.hlfdocmgmntsystem.services.documents.QuotationService;

@Service
@Transactional
public class QuotationsServiceImpl implements QuotationService {

	@Override
	public List<Quotation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Quotation model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Quotation model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Quotation findByActivityName(Activity activity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quotation findByQuotationId(int quotationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
