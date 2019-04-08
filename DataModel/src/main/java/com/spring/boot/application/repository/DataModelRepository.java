package com.spring.boot.application.repository;

import org.springframework.stereotype.Repository;

import com.spring.boot.application.domain.DataModel;

@Repository
public interface DataModelRepository extends Repository<DataModel, String> {
}
