/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;//
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author Alberto
 */

@ManagedBean
@ViewScoped
public class RestauranteController {

	private List<Restaurante> restaurantes;
	
	private List<Restaurante> empleadosFiltrados;
	
	private RestauranteService restauranteService = new RestauranteService();
	
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	
	public void consultarRestaurantes() {
		this.restaurantes = this.restauranteService.consultarRestaurantes();
	
	}

	public List<Restaurante> getEmpleados(){
		return restaurantes;
	}
	
	public void setEmpleados(List<Restaurante> empleados) {
		this.restaurantes = empleados;
	}
	/**
	 * @return the empleadosFiltrados
	 */
	public List<Restaurante> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Restaurante> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	
}
