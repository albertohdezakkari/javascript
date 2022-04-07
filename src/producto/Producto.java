package producto;

import interfaces.DAO;

public class Producto implements DAO<Producto>{
    //ATRIBUTOS
        private int id;
        private String nombre;
        private String descripcion;
    //CONSTRUCTOR
        public Producto(int id, String nombre, String descripcion){
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public Producto() {
        }
    //MÉTODOS
    // ACCIONES SOBRE OBJETOS
    // GETTER/SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    @Override
    public void add(Producto producto) {
        throw new 
        UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
