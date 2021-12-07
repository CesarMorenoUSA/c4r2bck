/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.usa.edu.ciclo4.reto2.repository.crud;

import co.usa.edu.ciclo4.reto2.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author cesar
 */
public interface ProductCrudRepository extends MongoRepository<Gadget, Integer>{
    
}
