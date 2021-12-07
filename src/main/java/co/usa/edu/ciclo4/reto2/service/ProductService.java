/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.ciclo4.reto2.service;
import co.usa.edu.ciclo4.reto2.model.Gadget;
import co.usa.edu.ciclo4.reto2.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author cesar
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository repositorioP;
    
    public List<Gadget> listarP(){
        return repositorioP.listarP();
    }
    public Optional<Gadget> getGadget(int id) {
        return repositorioP.getGadget(id);
    }
    public Gadget create(Gadget gadget){
        if(gadget.getId()==null){
            return gadget;
        }else{
            return repositorioP.create(gadget);
        }
    }
    public Gadget update(Gadget gadget){
       if(gadget.getId()!=null){
           Optional<Gadget> gDb = repositorioP.getGadget(gadget.getId());
            if(!gDb.isEmpty()){
                if(gadget.getBrand() !=null){
                    gDb.get().setBrand(gadget.getBrand());
                }
                if(gadget.getCategory() !=null){
                    gDb.get().setCategory(gadget.getCategory());
                }
                if(gadget.getName() !=null){
                    gDb.get().setName(gadget.getName());
                }
                if(gadget.getDescription() !=null){
                    gDb.get().setDescription(gadget.getDescription());
                }
                if(gadget.getPrice() !=0.0){
                    gDb.get().setPrice(gadget.getPrice());
                }
                if(gadget.getQuantity() !=0){
                    gDb.get().setQuantity(gadget.getQuantity());
                }
                if(gadget.getPhotography() !=null){
                    gDb.get().setPhotography(gadget.getPhotography());
                }
                repositorioP.update(gDb.get());
                return gDb.get();
            }else{
                return gadget;
            }
        }else{
            return gadget;
        }       
    }
    public boolean delete(int id) {
        Optional<Gadget> prod = repositorioP.getGadget(id);
        if (prod.isEmpty()){
            return false;
        }else{
            repositorioP.delete(prod.get());
            return true;
        }
    }
}
