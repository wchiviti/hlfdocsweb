package tech.hobbs.hlfdocmgmntsystem.dao.documents.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import tech.hobbs.hlfdocmgmntsystem.dao.documents.QuotationDao;
import tech.hobbs.hlfdocmgmntsystem.model.activity.Activity;
import tech.hobbs.hlfdocmgmntsystem.model.documents.Quotation;

@Repository
public class QuotationsDaoImpl implements QuotationDao {

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
