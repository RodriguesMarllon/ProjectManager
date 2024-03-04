package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Project;

public class ProjectService {

	public List<Project> findAll() {
		List<Project> list = new ArrayList<>();
		list.add(new Project(1, "P001 - Citrosuco - Evaporadores"));
		list.add(new Project(2, "P002 - COLPAL - PlantSystem Upgrade"));
		list.add(new Project(3, "P003 - COLPAL - Linhas Frugal"));
		list.add(new Project(4, "P004 - Ajinomoto - FOOD MES"));
		return list;
	}
}
