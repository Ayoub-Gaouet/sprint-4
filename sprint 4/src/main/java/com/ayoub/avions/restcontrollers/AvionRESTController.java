package com.ayoub.avions.restcontrollers;

import com.ayoub.avions.entities.Avion;
import com.ayoub.avions.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AvionRESTController {
    @Autowired
    AvionService avionService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Avion> getAllAvions() {
        return avionService.getAllAvions();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Avion getAvionById(@PathVariable("id") Long id) {
        return avionService.getAvion(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Avion createAvion(@RequestBody Avion avion) {
        return avionService.saveAvion(avion);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Avion updateAvion(@RequestBody Avion avion) {
        return avionService.updateAvion(avion);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteAvion(@PathVariable("id") Long id)
    {
        avionService.deleteAvionById(id);
    }
    @RequestMapping(value="/avscom/{idCom}",method = RequestMethod.GET)
    public List<Avion> getAvionsByCatId(@PathVariable("idCom") Long idCom) {
        return avionService.findByCompanyIdCom(idCom);
    }

}
