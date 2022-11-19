package com.ola.mundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ola.mundo.model.OlaMundoModel;

@RestController
public class OlaMundoController {

    @GetMapping("/ola")
    public OlaMundoModel dizerOla(
            @RequestParam(value = "id", defaultValue = "5") int id,
            @RequestParam(value = "menssagem") String menssagem) {
        return new OlaMundoModel(id, menssagem);
    }

}
