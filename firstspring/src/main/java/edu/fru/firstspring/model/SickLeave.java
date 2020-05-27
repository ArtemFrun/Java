package edu.fru.firstspring.model;

import java.sql.Time;
import java.time.LocalDate;

public class SickLeave {
    private String id;
    private LocalDate date;
    private Time time;
    // Doctor
    // Patient
    // если пациент = null тогда для пациента отображаеться возможность записи на прием
    // если пациент != null тогда нет доступа к записи на это время
}
