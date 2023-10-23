
package com.maxmilhas;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cpf", path = "cpf")
public interface CpfRepository extends MongoRepository<Cpf, String> {

	// Pesquisa customizada
	List<Cpf> findByCpf(@Param("cpf") Integer cpf);

	void deleteByCpf(@Param("cpf") Integer cpf);

}
