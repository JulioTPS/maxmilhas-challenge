package com.maxmilhas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxmilhas.models.Cpf;
import com.maxmilhas.services.CpfService;

@RestController
@RequestMapping(path = "api/v1/cpf")
public class CpfController {
    private final CpfService cpfService;

    @Autowired
    public CpfController(CpfService cpfService) {
        this.cpfService = cpfService;
    }

    @GetMapping
    public List<Cpf> getCpfAll() {
        return cpfService.findAll();
    }

    @GetMapping(path = "{cpf}")
    public Cpf getCpf(@PathVariable("cpf") String cpfNumber) {
        return cpfService.findByCpfNumber(cpfNumber);
    }

    @PostMapping
    public Cpf save(@RequestBody Cpf cpf) {
        return cpfService.save(cpf);
    }

    @DeleteMapping(path = "{cpf}")
    public void delete(@PathVariable("cpf") String cpfNumber) {
        cpfService.deleteByCpf(cpfNumber);
        return;
    }
}
