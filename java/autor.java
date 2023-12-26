class Autor {
  private String nome;
  private String morada;

  public Autor(String aNome, String aMorada){
    nome = aNome;
    morada = aMorada;
  }

  public void setMorada(String aMorada) {
    morada = aMorada;
  }

  public String toString ()
  {
    return "Autor chamado "+ nome;
  }
  
}