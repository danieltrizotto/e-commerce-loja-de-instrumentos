

package model.bean;


public class Categorias {
    private int id_categoria;
    private String nome;

    public Categorias(int id_categoria, String nome) {
        this.id_categoria = id_categoria;
        this.nome = nome;
    }
     public Categorias(){
         
     }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
    
}
