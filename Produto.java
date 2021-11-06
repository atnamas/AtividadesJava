package com.lojinha.MinhaLojaDeDames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_produto")
public class Produto {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_produto;
	
	@NotBlank(message ="o valor não pode ser nulo e nem conter espaço")
	@Size(min= 5, max= 100, message= "o texto deve conter no minimo 5 caracters e no maximo 100")
	private String titulo;
	
	@NotBlank(message ="o valor não pode ser nulo e nem conter espaço")
	private Double preco;
	
	@ManyToOne
    @JsonIgnoreProperties("categoria")	
	private Categoria categoria;
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public long getId_produto() {
		return id_produto;
	}
	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
