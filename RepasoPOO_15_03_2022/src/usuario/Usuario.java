
package usuario;

import java.util.ArrayList;
import producto.Producto;


public class Usuario {
    // ATRIBUTOS
        
        private int id;
        private String dni;
        private Usuario user;
        
        // Relación de dependencia
            private Producto producto;
            // Composición
            private ArrayList<Producto> misProductos;
    // CONSTRUCTOR
            //1
            /*public Usuario(String dni, Usuario user){
                this.dni = dni;
                this.user = user;
            }*/
            // 2
            // SELECT BD
            public Usuario(int id, String dni, ArrayList<Producto> lista){
                this.dni = dni;
                this.id = id;
                // COMPOSICIÓN - DEPENDENCIA FUERTE
                this.misProductos = lista;

            }
            // INSERT BD
            public Usuario(String dni){
                this.dni = dni;
            }
    // MÉTODOS
        // ACCIONES SOBRE OBJETOS
            public void addProducto(Producto producto){
            misProductos.add(producto);
        }
        // GETTER/SETTER
            public String getDni() {
                return dni;
            }
            public void setDni(String dni) {
                this.dni = dni;
            }

    public ArrayList<Producto> getMisProductos() {
        return misProductos;
    }

    
            
        
}
