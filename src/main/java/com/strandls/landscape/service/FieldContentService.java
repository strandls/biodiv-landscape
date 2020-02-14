package com.strandls.landscape.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.strandls.landscape.pojo.FieldContent;

public interface FieldContentService {

	public FieldContent findById(Long id);
	public FieldContent findByPropertyWithCondtion(String property, String value, String condition);
	
	public FieldContent save(String jsonString) throws JsonParseException, JsonMappingException, IOException;
	public FieldContent save(FieldContent entity);
	public FieldContent update(FieldContent entity);
	public FieldContent delete(Long id);
	
	public List<FieldContent> findAll();
	public FieldContent getFieldContent(Long id, Long languageId);
	public List<FieldContent> getByPropertyWithCondtion(String property, Object value, String condition, int limit, int offset);
}
