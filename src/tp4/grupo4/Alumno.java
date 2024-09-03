/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.grupo4;

import Vistas.Vista_Principal;
import java.util.ArrayList;
import java.util.HashSet;


/**
 *
 * @author Netbook
 */
public class Alumno {
    /*Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista HashSet de
materias en las que está inscripto; para ello tiene un método agregarMateria que permite
inscribir al Alumno en una materia determinada (implementar de manera tal que no deje
inscribir un alumno en dos materias iguales.) y otro método cantidadMaterias que devuelve la
cantidad de materias a las que está inscripto el alumno.
*/
    private int legajo;
    private String apellido, nombre;
    private ArrayList<Materia> materiasIncriptas=new ArrayList();

    public ArrayList getMateriasIncriptas() {
        return materiasIncriptas;
    }

    public void setMateriasIncriptas(ArrayList materiasIncriptas) {
        this.materiasIncriptas = materiasIncriptas;
    }
    

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    public void agregarMateria(Materia m){
        materiasIncriptas.add(m);
    }
    public int cantidadMaterias(){
        return materiasIncriptas.size();
    }
}
