package edu.fru.firstspring.service.patient.interfaces;

import edu.fru.firstspring.model.Patient;

import java.util.List;

public interface IPatientService {

    Patient create(Patient patient);
    Patient get(String id);
    Patient update(Patient patient);
    Patient delete(String id);
    List<Patient> getAll();
}
