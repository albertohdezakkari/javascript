package repasopoo_15_03_2022;

import producto.Producto;
import usuario.Usuario;


public class RepasoPOO_15_03_2022 {

    
    public static void main(String[] args) {
         // Voy a dar vida a mi proyecto
         ///////////////////////////
            // ARRAY LIST
                // ESTRUCTURA DE DATOS
            Usuario usuario1 = new Usuario("LOLO");
            Usuario usuario2 = new Usuario("LELO");
            Usuario usuario3 = new Usuario("LILI");
         /////////////
            Usuario picachu1 = new Usuario("PICACHU");
            picachu1.setDni("1234567A");
            Usuario picachu2 = picachu1;
            picachu2.setDni("234567F");
            System.out.println(picachu1.toString());
                // picachu = 0X2534F
            Producto producto1 = new Producto();
            producto1.setNombre("TOMATE");
            producto1.setDescripcion("PIZZA DE TOMATE Y QUESO");
            picachu1.addProducto(producto1);
            
            Producto producto2 = new Producto();
            producto2.setNombre("NAPOLITANA");
            producto2.setDescripcion("PIZZA DE CARNE, TOMATE Y QUESO");
            picachu1.addProducto(producto2);
            
            for (Producto producto : picachu1.getMisProductos()) {
                System.out.println(producto.toString());
            }
            
            
            
            
         
    }
    
}
