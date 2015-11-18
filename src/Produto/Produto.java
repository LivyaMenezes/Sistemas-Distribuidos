package Produto;


public class Produto {
    
    //___________________atributos______________________________________//
    int id;
    String nomeProduto;
    double valorProduto;
    int quantidadeProduto;
    //_________________________________________________________________//

    //***********************construtor************************************//
    public Produto(String nomeProduto, double valorProduto, int quantidadeProduto) {
        
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }
    //************************************************************************//
    public Produto(){
    }
    
    
        //--------------------Getters e setters--------------------//
    
     public void setId(int id) {
        this.id = id;
    }
     
     public int getId() {
           return id;    
     }
     public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
     
      public String getNomeProduto() {
        return nomeProduto;
    }
      
     public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

   
    public double getValorProduto() {
        return valorProduto;
    }
    
      public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
//---------------------------fim de getters e setters-------------------------//
    
    @Override
    public String toString() {
        return  "Produto{" + "\nnomeProduto=" + nomeProduto + "\nvalorProduto=" + valorProduto + "\nquantidadeProduto=" + quantidadeProduto +  '}';
    }
}
