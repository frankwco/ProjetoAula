package com.aula.projetoaula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraController {

	@RequestMapping("/")
	public String index() {
		return "index2";
	}
}
