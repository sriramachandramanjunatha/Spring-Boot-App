package com.spring.boot.application.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.boot.application.dao.DataModelDao;
import com.spring.boot.application.domain.DataModel;
import com.spring.boot.application.interfaces.WebInterface;
import com.spring.boot.application.representers.WebRepresenter;

//import com.spring.boot.application.utils.Response;



@Service
public class WebService implements WebInterface {

	private DataModelDao dataModelDao;

	
	public DataModel getDetails(String id) throws Exception {
		return null;//this.dataModelDao.findById(id);
	}


	@Override
	public ResponseEntity<String> saveBuilding(String requestData) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<DataModel> getAllBuildings() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataModel getBuilding(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResponseEntity<String> updateBuilding(String id, String requestData) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResponseEntity<String> deleteBuilding(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResponseEntity<String> deleteAllBuildings() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
}
