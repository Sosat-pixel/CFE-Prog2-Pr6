package Ejercicio6;

public class Libro {

    private String titulo;

    private String autor;

    private int anio;

    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        if(anio <= 2025)
        {
            System.out.println("El año es correcto");
            this.anio = anio;
        }else{
            System.out.println("Año por defecto = 2025");
            this.anio = 2025;
        }
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setTitulo(String title){
        this.titulo = title;
    }
    public void setAutor(String creator){
        this.autor = creator;
    }
    public void setAnio(int year){
        this.anio = year;
    }
}

