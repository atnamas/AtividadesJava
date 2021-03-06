package com.lojinha.MinhaLojaDeDames.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank (message = "O valor não pode ser nulo e nem conter espaço")
	@Size(min = 2, max= 50, message ="No maximo 50 caracters")
	private String genero; 
	
	@NotBlank (message = "O valor não pode ser nulo e nem conter espaço")
	@Size(min = 2, max= 20, message ="No maximo 50 caracters")
	private String plataforma;
	
	@NotBlank (message = "O valor não pode ser nulo e nem conter espaço")
	@Size(min = 2, max= 50, message ="No maximo 50 caracters")
	private String condicao;
	
	@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL )
	@JsonIgnoreProperties("Categoria")
	private List<Produto> produto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	} 
	
	

}
