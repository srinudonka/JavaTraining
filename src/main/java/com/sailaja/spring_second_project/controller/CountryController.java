package com.sailaja.spring_second_project.controller;





	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.sailaja.spring_second_project.model.Country;
	import com.sailaja.spring_second_project.service.CountryService;

	@RestController
	@RequestMapping("/country")
	
	public class CountryController {

		@Autowired
		private CountryService countryService;


		@PostMapping("/addCountry")
		public String addCountry(@RequestBody Country country) {
			return countryService.addCountry(country);

		}

		@GetMapping("/listOfCountries")
		public List<Country> getListOfCountries() {
			return countryService.getListOfCountries();
		}
		
		@PutMapping("/updateCountry")
		public @ResponseBody String updateCountry(@RequestBody Country country) {
	        return countryService.updateCountryByCode(country);
		}
		

		@GetMapping("/countryByCode/{code}")
		public ResponseEntity<Country> getCodeByCountry(@PathVariable String code) {

			Country country = countryService.getCountryByCode(code);

			if (country != null) {
				return ResponseEntity.ok(country);
			}
			return null;

		}
		
		
	}


