/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressaoregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TRISTAO
 */
public class ExpressaoRegular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //String padrao = "Java";
        //String texto = "Java";
        boolean b = "Java".matches("Java");
        System.out.println("1-" + b);
        /*
        MODIFICADORES
        --------->
        (?i), ignora maiúscula e minúscula
        (?x) comentários ---considerando varias linhas
        (?m), multilinhas
        (?s) dottal   
         */
        b = "Java".matches("(?i)java");
        System.out.println("MODIFICADORES : 2" + b);

        /*  
        METACARACTERES----->
        sao caracteres especias que indicam a ocorrencia dos caracteres sequintes
        .qualquer caracter  
        \d digitos      [0-9]
        \D não é digito  [^0-9]
        \espaçoes       [\t\n\x\x0B\f\r]
        \S não é espaço   [^\s]
        \w letra     [a-zA-Z_0-9]
        \W não é letra
         */
        //  b =  "@".matches(".");
        //   b =  "a".matches("\\d");
        //    b =  "a".matches("\\w");
        //   b =  " ".matches("\\s");
        //    b =  "PIa".matches("...");
        //   b =  "31".matches("\\d\\d");
        //  b =  "a".matches("\\d");
        /*
        QUANTIFICADORES------>
             procura a correncia de determinado caracter n vezes
        x{n}    x, exatamente n vezes
        x{n,}   x,  pelo menos n vezes
        x{n, m} x, pelo menos n mas não mais que m vezes
        x?      x, 0 ou  1 vez
        x*      x, 0 ou mais vezes
        x+      x, 1 ou + vezes       
         */
        b = "55".matches("\\d{2}");//exatamente
        b = "2353".matches("\\d{2,}");//pelo menos
        b = "56677".matches("\\d{2,5}");//pelo menos 2  mas nao pode passar de 5
        b = "!#".matches(".?");//se tem 0 ou 1 caracter
        b = "789".matches("\\d*");//se tem 0 ou mais vezes
        b = "".matches(".+");//se tem 1 ou mais vezes
        System.out.println("4-" + b);

        String cep = "\\d{5}-\\d{3}";
        b = "55655-365".matches(cep);
        System.out.println("cep-" + b);

        b = "04/07/1993".matches("\\d{2}/\\d{2}/\\d{1,4}");
        System.out.println("QUANTIFICADORES: cep-" + b);
        /*
         
       -----> METACARACTER DE FRONTEIRA
        
       VERIFICA SE A STRING 
        ^  Inicia
        $  Finaliza
        |  ou 
         */

        b = "Filipe23".matches("verifica o começo" + "^Filipe.*");//saber se o texto começa com a palavra Filipe
        b = "Filipe23".matches(".*23$");//saber se o texto termina  com os numeros 23
        b = "tem java aqui".matches(".*java.*");//no meio tem java
        b = "tem java aqui".matches("^tem.*aqui$");//incia com tem e termina com aqui e no meio da frase pode ser qualquer coisa
        b = "nao".matches("sim|nao");// sim ou nao
        System.out.println("METACARACTER: " + b);

        /*
        AGRUPADORES
        agrupam conjuntos de caracteres
        [...]           agrupamento
        [a-z]           alcance
        [a-e][i-u]      União
        [a-z&&[aeiou]]  Interseção
        [^abc]          Exceção
        [a-z&&[^m-p]]   subtração
        \x              fuga literal
        
         */
        b = "X".matches("[A-Z]");
        b = "x".matches("[a-z]");
        b = "3".matches("[0-9]");
        b = "True".matches("[tT]rue");//Se inicio com t minusculo ou maiusculo
        b = "yes".matches("[tT]rue|[Yy]es");
        b = "Filipe".matches("[A-Z][a-zA-Z]*");//primeira letra maiuscula e as seguintes minusculas ou maiusculas
        b = "Filipe".matches("[A-Z][a-zA-Z]*");//primeira letra maiuscula e as seguintes minusculas
        b = "olho".matches("[^abc]lho");
        b = "creu".matches("cr[ae]u");
        System.out.println("AGRUPADORES: " + b);

        b = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");
        System.out.println("VALIDAÇÃO DE E-MAIL: " + b);

        //CLASSE PATTERN
//prepara ela uma vez para usar ela varias vezes depois
        //ou seja, se vc for fazer muitas validações é mais performatico usar a classe pattern
        //se for uma validação simples a classe String com metodo matches é melhor
        String doce = "Qual é o Doce mais doCe que o doce?";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()) {
            System.out.println("classe pattern " + matcher.group());

        }

        /*SUBSTUIÇÕES
         */
        System.out.println("SUBSTITUIÇÃO");
        String r = doce.replaceAll("(?i)doce", "docinho");
        System.out.println(r);

        String rato = "O rato roeu  a roupa do rei de roma";
        r = rato.replaceAll("r[aeiou]", "xx");
        System.out.println(r);
        r = "Tabular o texto".replaceAll("\\s", "\t");
        System.out.println(r);

        String url = "www.xti.com.br/clientes-2011.html";
        //http://www.xti.com.br/2011/clientes.jsp//objetivo
        //String re ="www.xti.com.br/\\w{2,}-\\d{4}.html";
        String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
        b = url.matches(re);
        System.out.println("padrao e-mail: " + "\n" + url + "\n" + b);

        re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
        r = url.replaceAll(re, "http://$1/$3/$2.jsp");
        System.out.println("ANTES: " + url);
        System.out.println("DEPOIS: " + r);

    }
}
