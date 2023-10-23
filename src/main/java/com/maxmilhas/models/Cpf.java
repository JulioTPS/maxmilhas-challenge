package com.maxmilhas.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Cpf {

	@Id
	private String id;

	@Indexed(unique = true)
	private String cpf;

	private Instant createdAt;

	public Cpf() {
	}

	public Cpf(String cpf, Instant createdAt) {
		this.cpf = cpf;
		this.createdAt = createdAt;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
}
