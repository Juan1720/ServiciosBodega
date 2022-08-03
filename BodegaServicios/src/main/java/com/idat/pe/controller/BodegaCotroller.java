package com.idat.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.service.BodegaService;

@RestController
@RequestMapping("/api/bodega/v1")
public class BodegaCotroller {
	@Autowired
	private BodegaService service;

}
