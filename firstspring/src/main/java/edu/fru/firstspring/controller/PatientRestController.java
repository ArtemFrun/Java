package edu.fru.firstspring.controller;

import edu.fru.firstspring.model.Patient;
import edu.fru.firstspring.service.patient.impls.PatientServiceImpl;
import edu.fru.firstspring.service.patient.interfaces.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientRestController {

    @Autowired
    PatientServiceImpl service;

    @RequestMapping("/list")
    List<Patient> getPatients()
    {
        return service.getAll();
    }
}
