package com.maxmilhas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/cpf")
public class CpfController {
    private final CpfService cpfService;

    @Autowired
    public CpfController(CpfService cpfService) {
        this.cpfService = cpfService;
    }

    @GetMapping
    public List<Cpf> getCpf(@RequestParam(value = "cpfNumber", required = false) Integer cpfNumber) {
        if(cpfNumber == null){
             return cpfService.findAll();
        }
        return cpfService.findByCpfNumber(cpfNumber);
    }
    
    @PostMapping
    public Cpf save(@RequestBody Cpf cpf) {
        return cpfService.save(cpf);
    }
}
