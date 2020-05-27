package edu.fru.firstspring.service.patient.impls;

import edu.fru.firstspring.model.Patient;
import edu.fru.firstspring.service.patient.interfaces.IPatientService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService {

    private List<Patient> patients = new ArrayList<>(
            Arrays.asList(
                    new Patient("1", "Vasya","Petrov", LocalDate.of(1978,05,10)),
                    new Patient("2", "Kolya","Ivanov",LocalDate.of(1975,07,15)),
                    new Patient("3", "Anna","Sidorova",LocalDate.of(1985,02,23))
            )
    );

    @Override
    public Patient create(Patient patient) {
        return null;
    }

    @Override
    public Patient get(String id) {
        return patients.stream().filter(patient -> id.equals(patient.getId())).findFirst().orElse(null);
    }

    @Override
    public Patient update(Patient patient) {
        return null;
    }

    @Override
    public Patient delete(String id) {
        return null;
    }

    @Override
    public List<Patient> getAll() {
        return patients;
    }
}
