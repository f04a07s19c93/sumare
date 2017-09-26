/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author TRISTAO
 */
public class ColecaoMap {
    public static void main(String[] args) {
        Map<String,String> pais = new HashMap<>();
        pais.put("BR","Brasil");
        pais.put("RU", "Rússia");
        pais.put("IN", "Índia");
        pais.put("CN", "China");
        System.out.println(pais);
        System.out.println(pais.containsKey("BR"));//confere se a chave existe
        System.out.println(pais.containsValue("Brasil"));//confere se o conteudo existe
        System.out.println(pais.get("CN"));//busca pela chave
        pais.remove("RU");//remove
        
        Set<String> keys = pais.keySet();
        
        for(String key : keys){
            System.out.println(key+" : "+pais.get(key));
        }
    }
    
}
