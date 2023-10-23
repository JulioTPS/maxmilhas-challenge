package com.maxmilhas.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Cpf {

	@Id
	private String id;

	@Indexed(unique = true)
	private long cpf;

	private Instant createdAt;

	public Cpf() {
	}

	public Cpf(long cpf, Instant createdAt) {
		this.cpf = cpf;
		this.createdAt = createdAt;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
}
