package com.developrogramming.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pinturas")
@Setter
@Getter
public class Pintura {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String descripcion;
	private String tecnica;
	private String soporte;
	private String anio;
	private String medidas;
	private BigDecimal precio;
	private String imagen;
	
} 
