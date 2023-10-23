package com.maxmilhas.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;

public class Cpf {

	@Id
	private String id;

	private Integer cpf;
	private Instant createdAt;

	public Cpf() {
	}

	public Cpf(Integer cpf, Instant createdAt) {
		this.cpf = cpf;
		this.createdAt = createdAt;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
}
