package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idProjeto;
	private String nome;
	private Date dataInicio;
	private Date dataTermino;
	private Integer hPrevDesenv;
	private Double orcamento;
	private String responsavel;
	private String cliente;
	private String status;
	private String criador;
	private Date data_InsertUpdate;
	
	public Project() {
	}

	public Project(Integer idProjeto, String nome, Date dataInicio, Date dataTermino, Integer hPrevDesenv,
			Double orcamento, String responsavel, String cliente, String status, String criador,
			Date data_InsertUpdate) {
		super();
		this.idProjeto = idProjeto;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.hPrevDesenv = hPrevDesenv;
		this.orcamento = orcamento;
		this.responsavel = responsavel;
		this.cliente = cliente;
		this.status = status;
		this.criador = criador;
		this.data_InsertUpdate = data_InsertUpdate;
	}

	public Integer getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Integer gethPrevDesenv() {
		return hPrevDesenv;
	}

	public void sethPrevDesenv(Integer hPrevDesenv) {
		this.hPrevDesenv = hPrevDesenv;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCriador() {
		return criador;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}

	public Date getData_InsertUpdate() {
		return data_InsertUpdate;
	}

	public void setData_InsertUpdate(Date data_InsertUpdate) {
		this.data_InsertUpdate = data_InsertUpdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProjeto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(idProjeto, other.idProjeto);
	}

	@Override
	public String toString() {
		return "Project [idProjeto=" + idProjeto + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataTermino="
				+ dataTermino + ", hPrevDesenv=" + hPrevDesenv + ", orcamento=" + orcamento + ", responsavel="
				+ responsavel + ", cliente=" + cliente + ", status=" + status + ", criador=" + criador
				+ ", data_InsertUpdate=" + data_InsertUpdate + "]";
	}
}