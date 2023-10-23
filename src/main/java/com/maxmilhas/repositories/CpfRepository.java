
package com.maxmilhas.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.maxmilhas.models.Cpf;

@RepositoryRestResource(collectionResourceRel = "cpf", path = "cpf")
public interface CpfRepository extends MongoRepository<Cpf, String> {

	// Pesquisa customizada
	public List<Cpf> findByCpf(@Param("cpf") String cpf);

	public void deleteByCpf(@Param("cpf") String cpf);

}
