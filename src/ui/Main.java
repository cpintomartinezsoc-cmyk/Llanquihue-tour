package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours =
                gestor.cargarTours();

        System.out.println("LISTA DE TOURS");
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\nTOURS DE NATURALEZA");
        for (Tour tour : tours) {
            if (tour.getTipo().equals("Naturaleza")) {
                System.out.println(tour);
            }}}}