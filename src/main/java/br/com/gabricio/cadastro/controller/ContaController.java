package br.com.gabricio.cadastro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gabricio.cadastro.models.Usuarios;
import br.com.gabricio.cadastro.servicos.ServicoUsuario;

@Controller
public class ContaController {

    @Autowired
    private ServicoUsuario servicoUsuario;

    @GetMapping("/login")
    public String login(){
        return "conta/login";
    }

    @GetMapping("/registration")
    public ModelAndView registration(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("conta/registrar");
        mv.addObject("usuario", new Usuarios());
        return mv;
    }

    @PostMapping("/registration")
    public ModelAndView registration(@Valid Usuarios usuario, BindingResult result){

        ModelAndView mv = new ModelAndView();
        Usuarios usr = servicoUsuario.encontrarPorEmail(usuario.getEmail());
        if(usr != null){
            result.rejectValue("email", "", "Usuário ja cadastrado");
        }
        if(result.hasErrors()){
            mv.setViewName("conta/registrar");
            mv.addObject("usuario", usuario);
        }else {
            servicoUsuario.salvar(usuario);
            mv.setViewName("redirect:/login");
        }
        return mv;
    }
}