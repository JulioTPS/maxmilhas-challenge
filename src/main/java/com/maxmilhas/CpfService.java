package com.maxmilhas;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpfService {
    private final CpfRepository cpfRepository;

    @Autowired
    public CpfService(CpfRepository cpfRepository) {
        this.cpfRepository = cpfRepository;
    }

    List<Cpf> findAll() {
        return cpfRepository.findAll();
    };

    List<Cpf> findByCpfNumber(Integer cpfNumber) {
        System.out.println("finfding by");
        return cpfRepository.findByCpf(cpfNumber);
    };

    Cpf save(Cpf cpf) {
        cpf.setCreatedAt(Instant.now());
        return cpfRepository.save(cpf);
    }

    public List<Cpf> deleteByCpf(Integer cpfNumber) {
        cpfRepository.deleteByCpf(cpfNumber);
        return cpfRepository.findByCpf(cpfNumber);
    };

}