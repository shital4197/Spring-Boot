package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.LibraryDao;
import com.tka.entity.Library;

@Service
public class LibraryService {
	
	@Autowired
	LibraryDao dao;

	public String insertData(Library l) {

		String msg = dao.insertData(l);
		return msg;
	}

	public String deleteData(int id) {

		String msg = dao.deleteData(id);
		return msg;
	}

	public String updatedata(Library l, int id) {

		String msg = dao.updateData(l, id);
		return msg;
	}

	public Library getSingleData(int id) {
		Library s2 = dao.getSingleData(id);
		return s2;
	}

	public List<Library> getAllRecord(Library l) {
		List<Library> list = dao.getAllData(l);
		return list;
	}
}


