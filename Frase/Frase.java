import java.util.StringTokenizer;

class Frase
{
    //variaveis
    private String conteudo;
    private int nPalavras;
    private int nCaracteres;

    // construtores
    Frase(String aConteudo)
    {
        this.conteudo = aConteudo;
        nPalavras = contaPalavras();
        nCaracteres = contaCaracteres();
    }

    Frase ()
    {
        this("sem conteudo");
    }

    //metodo ou ações

    public void setConteudo(String aConteudo)
    {
        conteudo = aConteudo;
    }

    public String getConteudo()
    {
        return conteudo;
    }

    private int contaPalavras()
    {
        StringTokenizer str = new StringTokenizer(conteudo);
        int contador = 0;

        while(str.hasMoreElements())
        {
            contador++;
            str.nextToken();
        }
        return contador;
    } 

    private int contaPalavrasSplit()
    {
        String [] palavras = conteudo.split(" ");
        return palavras.length;
    }

    private int contaCaracteres() 
    {
        return conteudo.length();
    }

    public String toString()
    {
        String visualizacao = "";
        visualizacao = " Frase : "+conteudo+" Numero de caracteres: "+nCaracteres+" Numero de palavras: "+nPalavras;
    
        return visualizacao;

    }

}
  