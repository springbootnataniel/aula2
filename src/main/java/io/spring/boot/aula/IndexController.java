/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.spring.boot.aula;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Olá eu sou a tela inicial da API";
    }
    @RequestMapping(value = "/nome/{nome}", method = RequestMethod.GET)
    public String index(@PathVariable String nome) {
        return "Olá eu sou a tela inicial da API " + nome;
    }
   
    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public Usuario index(@RequestBody Usuario usuario) {
        return usuario;
    }
    @RequestMapping(value = "/usuario", method = RequestMethod.PUT)
    public Usuario indexPut(@RequestBody Usuario usuario) {
        return usuario;
    }
    @RequestMapping(value = "/usuario", method = RequestMethod.DELETE)
    public Usuario indexDelete(@RequestBody Usuario usuario) {
        return usuario;
    }
    
    

}
