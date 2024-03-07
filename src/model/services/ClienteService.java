package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Cliente;

public class ClienteService {

	public List<Cliente> findAll() {
		List<Cliente> list = new ArrayList<>();
		list.add(new Cliente(1, null, null, null, null, null, null));
		return list;
	}
}
