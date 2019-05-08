package com.aula.projetoaula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aula.projetoaula.models.Ordenar;

@Controller
public class OrdenarController {

	@RequestMapping("/ordenar")
	public String chamarPaginaOrdenar() {
		return "pagina-ordenar";
	}

	@RequestMapping(value = "/ordenar", method = RequestMethod.POST)
	public ModelAndView ordenarNumeros(Ordenar ordenar) {
		ModelAndView view = new ModelAndView("pagina-ordenar");
		if (ordenar.getValor2() > ordenar.getValor1()) {
			view.addObject("ordenados", ordenar.getValor1() + 
					", " + ordenar.getValor2());
		}else {
			view.addObject("ordenados", ordenar.getValor2() + 
					", " + ordenar.getValor1());
		}
		return view;
	}
}
