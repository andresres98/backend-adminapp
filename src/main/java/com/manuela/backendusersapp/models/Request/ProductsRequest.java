package com.manuela.backendusersapp.models.Request;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ProductsRequest {
    @NotEmpty
    @Size(min = 5)
    @Column(unique = true)
    private String name;

    @Column(name = "price")
    private Double precio;

    @NotBlank
    @Column(name = "description")
    private String descripcion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
