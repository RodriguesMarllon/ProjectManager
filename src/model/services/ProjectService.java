package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Project;

public class ProjectService {

	public List<Project> findAll() {
		List<Project> list = new ArrayList<>();
		list.add(new Project(1, "Teste de nome de projeto", null, null, null, null, null, null, null, null, null));
		return list;
	}
}
