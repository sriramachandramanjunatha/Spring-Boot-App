package com.spring.boot.application.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.boot.application.domain.DataModel;





@Service
public interface WebInterface {

	ResponseEntity<String> saveBuilding(String requestData) throws Exception;
	List<DataModel> getAllBuildings() throws Exception;
	DataModel getBuilding(String id) throws Exception;
	ResponseEntity<String> updateBuilding(String id,String requestData) throws Exception;
	ResponseEntity<String> deleteBuilding(String id) throws Exception;
	ResponseEntity<String> deleteAllBuildings() throws Exception;
	
}
