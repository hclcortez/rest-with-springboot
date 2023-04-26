package br.com.hclcortez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.hclcortez.Sum;

@RestController
public class MathController {
	
	@Autowired
	private Sum sum;

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value =  "numberTwo") String numberTwo
			) throws Exception {
		return this.sum.sum(numberOne, numberTwo);
	}
	
}
