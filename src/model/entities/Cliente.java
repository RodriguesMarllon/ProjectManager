package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idCliente;
	private String cnpj;
	private String nome;
	private String endereco;
	private String telefone;
	private String responsavel;
	private Date data_InsertUpdate;
	
	public Cliente() {
	}

	public Cliente(Integer idCliente, String cnpj, String nome, String endereco, String telefone, String responsavel,
			Date data_InsertUpdate) {
		super();
		this.idCliente = idCliente;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.responsavel = responsavel;
		this.data_InsertUpdate = data_InsertUpdate;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getData_InsertUpdate() {
		return data_InsertUpdate;
	}

	public void setData_InsertUpdate(Date data_InsertUpdate) {
		this.data_InsertUpdate = data_InsertUpdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, data_InsertUpdate, endereco, idCliente, nome, responsavel, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(data_InsertUpdate, other.data_InsertUpdate)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nome, other.nome) && Objects.equals(responsavel, other.responsavel)
				&& Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", responsavel=" + responsavel + ", data_InsertUpdate=" + data_InsertUpdate
				+ "]";
	}
}
