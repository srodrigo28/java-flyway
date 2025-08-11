package com.treina.treinamento.controllers;

import java.util.List;
import java.util.Optional;

import com.treina.treinamento.models.Proprietario;
import com.treina.treinamento.repository.ProprietarioRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("proprietario")
public class ProprietarioController {

    @Autowired
    private ProprietarioRepository propRepository;
    
    @GetMapping("/") // 1 lista todos
    public List<Proprietario> listar() {
      return propRepository.findAll();
    }

    @GetMapping("/proprietario2") // 2 busca por nome
    public Optional<Proprietario> buscar() {
      return propRepository.findByNomeContaining("Ana");
    }
    
    @GetMapping("/{id}") // 3 custa por id
    public ResponseEntity<Proprietario> buscar(@PathVariable Long id) {
      Optional<Proprietario> proprietario = propRepository.findById(id);
      
      if(proprietario.isPresent()){
        return ResponseEntity.ok(proprietario.get());
      }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/inserir") // 4. Inserir
    @ResponseStatus(HttpStatus.CREATED)
    public Proprietario adicionar(@RequestBody Proprietario proprietario){
      return propRepository.save(proprietario);
    }

    @PutMapping("/{id}") // 5. Atualizar
    public ResponseEntity<Proprietario> atualizar(@PathVariable Long id,
                                                  @RequestBody Proprietario proprietario) {
      if(!propRepository.existsById(id)) {
        return ResponseEntity.notFound().build();
      }
      proprietario.setId(id);
      Proprietario proprietarioAtualizado = propRepository.save(proprietario);

      return ResponseEntity.ok(proprietarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
      if(!propRepository.existsById(id)){
        return ResponseEntity.notFound().build();
      }
      propRepository.deleteById(id);
      return ResponseEntity.noContent().build();
    }
}