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
@XmlRootElement(name = "person")
@XmlType(propOrder = {"id","fullName","age","salary"})
public class Person {
    
    private int id;
    private String fullName;
    private int age;
    private int salary;
   

    @XmlElement
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @XmlElement
    public int getSalary() {
        return (getAge()*980657)/3;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
