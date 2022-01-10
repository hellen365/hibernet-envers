package com.vhdnas.musiclibary.controller;

import com.vhdnas.musiclibary.model.Alimentador;
import com.vhdnas.musiclibary.repository.AlimentadorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class AlimentadorController {

    private final AlimentadorRepository alimentadorRepository;

    public AlimentadorController(AlimentadorRepository alimentadorRepository) {
        this.alimentadorRepository = alimentadorRepository;
    }

    @RequestMapping(value = "/listar/alimentador", method = RequestMethod.GET)
    public ResponseEntity<?> listarAlimentador(){
        return ResponseEntity.ok().body(alimentadorRepository.findAll());
    }

    @RequestMapping(value = "/salvar/alimentador", method = RequestMethod.POST)
    public ResponseEntity<?> savarAlimentador(@RequestBody Alimentador alimentador){
        alimentadorRepository.save(alimentador);
        return ResponseEntity.ok().body("Salvo com sucesso.");
    }

    @RequestMapping(value = "/atualizar/alimentador", method = RequestMethod.PUT)
    public ResponseEntity<?> atualizarAlimentador(@RequestBody Alimentador alimentador){
        Alimentador alimentador1 = alimentadorRepository.findById(alimentador.getId());
        updateData(alimentador1, alimentador);
        alimentadorRepository.save(alimentador1);
        return ResponseEntity.noContent().build();
    }

    private void updateData(Alimentador newAlimentador, Alimentador obj) {
        newAlimentador.setBebedouro(obj.getBebedouro());
        newAlimentador.setComedouro(obj.getComedouro());
        newAlimentador.setUltimaAlteracao(obj.getUltimaAlteracao());
    }

}
