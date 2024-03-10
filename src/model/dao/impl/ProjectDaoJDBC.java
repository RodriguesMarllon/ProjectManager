package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.dao.ProjectDao;
import model.entities.Project;

public class ProjectDaoJDBC implements ProjectDao{

	private Connection conn;
	
	public ProjectDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Project obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Project obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Project findById(Integer id) {

	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
