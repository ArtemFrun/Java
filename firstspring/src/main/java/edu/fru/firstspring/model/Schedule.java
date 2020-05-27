package edu.fru.firstspring.model;

import java.sql.Time;
import java.time.LocalDate;

/*
* Расписание
*/

public class Schedule {
    private String id;
    private LocalDate dateOfReceipt; //Дата приема
    private Time startOfReceipt; //начало приема
    private Time endOfReceipt; //конец приема
    private String cabinetNumber;
}
