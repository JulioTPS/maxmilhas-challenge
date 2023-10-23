package com.maxmilhas.services;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxmilhas.models.Cpf;
import com.maxmilhas.repositories.CpfRepository;

@Service
public class CpfService {
    private final CpfRepository cpfRepository;

    @Autowired
    public CpfService(CpfRepository cpfRepository) {
        this.cpfRepository = cpfRepository;
    }

    public List<Cpf> findAll() {
        return cpfRepository.findAll();
    };

    public List<Cpf> findByCpfNumber(long cpfNumber) {
        System.out.println("finfding by");
        return cpfRepository.findByCpf(cpfNumber);
    };

    public Cpf save(Cpf cpf) {
        cpf.setCreatedAt(Instant.now());
        return cpfRepository.save(cpf);
    }

    public List<Cpf> deleteByCpf(long cpfNumber) {
        cpfRepository.deleteByCpf(cpfNumber);
        return cpfRepository.findByCpf(cpfNumber);
    };

}