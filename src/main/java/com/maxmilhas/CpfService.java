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

    List<Cpf> findAll(){
        return cpfRepository.findAll();
    };

    List<Cpf> findByCpfNumber(Integer cpfNumber){
        return cpfRepository.findByCpfNumber(cpfNumber);
    };

    // Cpf saveOrUpdateCpf(Cpf Cpf);

    Cpf save(Cpf cpf){
        cpf.setCreatedAt(Instant.now());
        return cpfRepository.save(cpf);
    };
    
    // void deleteCpfById(String id);

}