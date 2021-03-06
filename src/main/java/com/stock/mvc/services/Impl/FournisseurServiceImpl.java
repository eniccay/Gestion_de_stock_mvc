package com.stock.mvc.services.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IClientDao;
import com.stock.mvc.dao.IFournisseurDao;
import com.stock.mvc.entities.Fournisseur;
import com.stock.mvc.services.IFournisseurService;
@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	private IFournisseurDao dao;
	

	
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Fournisseur findOne(String parmName, Object paramValue) {
		return dao.findOne(parmName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] parmNames, Object[] paramValues) {
		return dao.findOne(parmNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
