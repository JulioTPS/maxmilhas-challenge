package com.maxmilhas;

import java.time.Instant;

import org.springframework.data.annotation.Id;

public class Cpf {

	@Id
	private String id;

	private Integer cpfNumber;
	private Instant createdAt;

	public Cpf() {}

	public Cpf(Integer cpfNumber, Instant createdAt) {
        this.cpfNumber = cpfNumber;
        this.createdAt = createdAt;
    }

	public Integer getCpfNumber() {
		return cpfNumber;
	}

	public void setCpfNumber(Integer cpfNumber) {
		this.cpfNumber = cpfNumber;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
}
