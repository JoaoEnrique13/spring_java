package br.com.eteczl.workshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {
    @GetMapping("/cadastro-alunos")
    public ModelAndView acessoHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cadastro");
        return modelAndView;
    }
}
