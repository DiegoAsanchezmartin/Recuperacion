package com.appweb.recuperacion.models;
import javax.persistence.*;


@Entity
@Table (name="Direccion")

public class DireccionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long iddiereccion;


    private int idusuario;
    private String address;
    private String country;
    private String state;
    private String city;

    public DireccionModel() {

    }

    public Long getIddiereccion() {
        return iddiereccion;
    }

    public void setIddiereccion(Long iddiereccion) {
        this.iddiereccion = iddiereccion;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
