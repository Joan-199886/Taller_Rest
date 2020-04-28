/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.testws.testws1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author USUARIO
 */
@XmlRootElement(name = "salary")
@XmlType(propOrder = {"promedio","suma"})
public class Salary 
{
    int promedio;
    int suma;

    @XmlElement
    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    @XmlElement
    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    
    
}
