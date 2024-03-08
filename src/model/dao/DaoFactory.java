package model.dao;

import model.dao.impl.ProjectDaoJDBC;

public class DaoFactory {
	
	public static ProjectDao createProjectDao() {
		return new ProjectDaoJDBC();
	}
}
