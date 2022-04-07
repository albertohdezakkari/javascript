/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import producto.Producto;

/**
 *
 * @author A7-PC150
 */
public interface DAO<E> {
    public void add(E objeto);
}
