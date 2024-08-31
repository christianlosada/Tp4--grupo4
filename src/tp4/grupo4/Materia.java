/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.grupo4;



/**
 *
 * @author Netbook
 */
public class Materia {
    /*La Materia tiene
un idMateria, un nombre
de la materia y año al que
pertenece, tiene además
un constructor que
inicializa sus propiedades
y métodos get y set para
cada uno de sus
atributos.*/
     private int idMateria, anio;
     private String nombreMateria;
     

    public Materia(int idMateria, int anio, String nombreMateria) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.nombreMateria = nombreMateria;
    }

    @Override
    public String toString() {
        return nombreMateria ;
    }
    

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    
}
