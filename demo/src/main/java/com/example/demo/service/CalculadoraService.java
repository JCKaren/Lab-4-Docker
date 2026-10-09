package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	public BigDecimal sumar(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}

	public BigDecimal restar(BigDecimal a, BigDecimal b) {
		return a.subtract(b);
	}

	public BigDecimal multiplicar(BigDecimal a, BigDecimal b) {
		return a.multiply(b);
	}
}