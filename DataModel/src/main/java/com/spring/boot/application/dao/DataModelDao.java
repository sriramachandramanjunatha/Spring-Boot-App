package com.spring.boot.application.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.spring.boot.application.domain.DataModel;
import com.spring.boot.application.repository.DataModelRepository;

@Component
public class DataModelDao {

	DataModelRepository dataModelRepository;

	@Autowired
	public void setBuildingDao(DataModelRepository dataModelRepository) {
		this.dataModelRepository = dataModelRepository;
	}

	/*public void save(DataModel building) {
		this.dataModelRepository.save(building);

	}

	public Optional<DataModel> findById(String id) {
		return this.dataModelRepository.findById(id);
	}

	public boolean deleteById(String id) {

		boolean flag = false;
		try {
			this.dataModelRepository.deleteById(id);
			flag = true;
		} catch (Exception e) {
			flag = true;
			e.printStackTrace();
		} finally {
			return flag;
		}
	}

	public Iterable<DataModel> findAll() {
		// TODO Auto-generated method stub
		return this.dataModelRepository.findAll();
	}*/

}
