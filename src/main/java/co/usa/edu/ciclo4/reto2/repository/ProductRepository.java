/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.ciclo4.reto2.repository;

import co.usa.edu.ciclo4.reto2.model.Gadget;
import co.usa.edu.ciclo4.reto2.repository.crud.ProductCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cesar
 */
@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository repop;
    
    public List<Gadget> listarP(){
	return repop.findAll();
    }
    public Optional<Gadget>getGadget(int id){
        return repop.findById(id);
    }
    public Gadget create(Gadget gadget){
        return repop.save(gadget);
    }
    public Gadget update(Gadget gadget){
        return repop.save(gadget);
    }
    public void delete(Gadget id) {
        repop.delete(id);
    } 
}
