package comidas.com.pachacama07.comidas.models;



public class Food {

    private Integer id;
    private String fullname;
    private String tipo;
    private String tiempo;
    private String precio;
    private String picture;

    public Food(){}

    public Food( Integer id, String fullname, String tipo, String tiempo, String precio, String picture ){

        this.id = id;
        this.fullname = fullname;
        this.tipo = tipo;
        this.tiempo = tiempo;
        this.precio = precio;
        this.picture = picture;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {this.tipo = tipo;}


    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {this.tiempo = tiempo;}

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {this.precio = precio;}


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", tiempo='" + tiempo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio='" + precio + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }


}
