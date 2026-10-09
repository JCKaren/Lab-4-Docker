package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

	private final CalculadoraService calculadoraService;

	public CalculadoraController(CalculadoraService calculadoraService) {
		this.calculadoraService = calculadoraService;
	}

	@GetMapping("/suma")
	public BigDecimal sumar(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
		return calculadoraService.sumar(a, b);
	}

	@GetMapping("/resta")
	public BigDecimal restar(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
		return calculadoraService.restar(a, b);
	}

	@GetMapping("/producto")
	public BigDecimal multiplicar(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
		return calculadoraService.multiplicar(a, b);
	}
}