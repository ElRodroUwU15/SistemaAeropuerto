/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import lombok.Data;

/**
 *
 * @author Milton
 */
@Data
public class Vuelo {
    private int idVuelo;
    private int idCompany;
    private int idIterinario;
    private int idAvion;
    private int idTiposVuelo;
    private int Estado;
}
