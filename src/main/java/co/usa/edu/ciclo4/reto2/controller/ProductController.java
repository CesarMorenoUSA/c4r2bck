/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.ciclo4.reto2.controller;

import co.usa.edu.ciclo4.reto2.model.Gadget;
import co.usa.edu.ciclo4.reto2.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cesar
 */
@RestController
@RequestMapping("/api/gadget")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService serviP;
    @GetMapping("/all")
    public List<Gadget> listarP(){
        return serviP.listarP();
    }
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget create(@RequestBody Gadget gadget){
        return serviP.create(gadget);
    }    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget){
        return serviP.update(gadget);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return serviP.delete(id);
    }
    
}
