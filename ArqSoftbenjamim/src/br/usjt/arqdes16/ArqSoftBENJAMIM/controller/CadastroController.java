package br.usjt.arqdes16.ArqSoftBENJAMIM.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqdes16.BENJAMIM.beans.Filme;

@Controller
public class CadastroController {

	@RequestMapping ("/cadastrar")
	public String m (Filme f) {
		Random r = new Random();
		int id = r.nextInt();
	
		
		return id + "cadastrado";
		
		
		
	}
}
