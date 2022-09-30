package ar.com.educationit.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ar.com.educationit.entity.Categoria;


@RestController
public class MLResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/categorias")
	public ResponseEntity<List<Categoria>> getApi() {
		String url = "https://api.mercadolibre.com/sites/MLA/categories";
		Categoria [] categorias = restTemplate.getForObject(url, Categoria[].class);
	
		return ResponseEntity.ok(Arrays.asList(categorias));
	}

}
