import java.util.Vector;

class GereLivro 
{

  private Vector <Livro> listaLivros;

   GereLivro() {
      listaLivros = new Vector<Livro>();
   }

  // adicionar
  public boolean adicionar(Livro aLivro) {
    if (listaLivros != null && aLivro != null)
      return listaLivros.add(aLivro);

    return false;
  }
  
  // listar
  public String listar() {

    if(listaLivros != null && listaLivros.size() > 0) {
      
      Enumeration indice = listaLivros.elements();
      String listagemLivros = "";
      while(indice.hasMoreElements()) {
        Livro livro = indice.nextElement();
        listagemLivros +=  livro + "\n";
      }
      return listagemLivros;
    }
    return null;
    
  }

  
  // pesquisar
  public Livro pesquisar(String aTitulo) {
    if(listaLivros != null && listaLivros.size() > 0) {

      Enumeration indice = listaLivros.elements();
      String listagemLivros = "";
      while(indice.hasMoreElements()) {
        Livro livro = indice.nextElement();
        if(livro.getTitulo().equals(aTitulo))
      }
      return listagemLivros;
    }
    return null;


    
  }


  // eliminar

    

  
}