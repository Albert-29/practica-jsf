/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;
import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * 
 */
public class RestauranteService {

	public List<Restaurante> consultarRestaurantes() {
		
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante restaurante1 = new Restaurante();
		Restaurante restaurante2 = new Restaurante();
		Restaurante restaurante3 = new Restaurante();
		Restaurante restaurante4 = new Restaurante();
		Restaurante restaurante5 = new Restaurante();
		
		restaurante1.setNombre("McDonalds");
		restaurante1.setDireccion("Av. Ruiz");
		restaurante1.setPais("Estados Unidos");
		
		Gerente gerente1 = new Gerente();
		gerente1.setNombre("Diego");
		gerente1.setPrimerApellido("Paniagua");
		gerente1.setSegundoApellido("Lopez");
		
		restaurante1.setGerente(gerente1);
		
		restaurante2.setNombre("La vid Argentina");
		restaurante2.setDireccion("Av. Adolfo Lopez");
		restaurante2.setPais("Argentina");
		
		Gerente gerente2 = new Gerente();
		gerente2.setNombre("Diego");
		gerente2.setPrimerApellido("Maradona");
		gerente2.setSegundoApellido("Canche");
		
		restaurante2.setGerente(gerente2);
		
		restaurante3.setNombre("La Chilaca");
		restaurante3.setDireccion("Av. Presidente");
		restaurante3.setPais("Chile");
		
		Gerente gerente3 = new Gerente();
		gerente3.setNombre("Pedro");
		gerente3.setPrimerApellido("Cortez");
		gerente3.setSegundoApellido("Flores");
		
		restaurante3.setGerente(gerente3);
		
		restaurante4.setNombre("Socarrat");
		restaurante4.setDireccion("Paraiso XXI");
		restaurante4.setPais("España");
		
		Gerente gerente4 = new Gerente();
		gerente4.setNombre("Diego");
		gerente4.setPrimerApellido("Romero");
		gerente4.setSegundoApellido("Colon");
		
		restaurante4.setGerente(gerente4);
		
		restaurante5.setNombre("Cienega");
		restaurante5.setDireccion("Av. Rodriguez");
		restaurante5.setPais("Colombia");
		
		Gerente gerente5 = new Gerente();
		gerente5.setNombre("Pablo");
		gerente5.setPrimerApellido("Escobar");
		gerente5.setSegundoApellido("Patron");
		
		restaurante5.setGerente(gerente5);
		
		restaurantes.add(restaurante1);
		restaurantes.add(restaurante2);
		restaurantes.add(restaurante3);
		restaurantes.add(restaurante4);
		restaurantes.add(restaurante5);
		
		return restaurantes;

	}
}
