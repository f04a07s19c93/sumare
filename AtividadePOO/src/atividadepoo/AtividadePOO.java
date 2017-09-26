/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo;

/**
 *
 * @author Filipe
 */
public class AtividadePOO implements Alimentacao{
    private String leon;
    
    @Override
    public String alimentacao() {

        return "Carnívoro  ";
    
    }
    
    
    
    
    public static void main(String[] args) {
      
        Mamifero homem = new Mamifero();
        Mamifero leao = new Mamifero();
        
        Reptil serpente = new Reptil();
        Reptil crocodilo = new Reptil(); 
       
        Peixes salmao = new Peixes();
        Peixes san_peter =  new Peixes();
        
        Aves pombo = new Aves();
        Aves galinha = new Aves();
        
        Anfibio ra = new Anfibio();
        Anfibio cobra_cega = new Anfibio();
        
        Insectos piolho = new Insectos();
        Insectos gafanhoto = new Insectos();
        
        homem.setporcentagem_pelo(30);              
        homem.setLocomocao("Plantígrado e  Bipedalismo.");//Plantígrados - (andam com a planta dos pés)/ Bipedalismo -andar sobre as duas patas posteriores.                                                                   
        homem.setPatas(2);
        homem.setPorte("medio");
        homem.setSexo('F');
        homem.setSom("Guerra!");
        homem.setVivo(true);
             String vivo=(homem.getvivo()==true)?" vivo":"morto";
        homem.setSaude("Saudável");
        homem.setNome_do_tipo("Reino: Animalia | Filo: Cordados | Classe: Mamíferos | Ordem: Primatas |" +
        " Familia: Hominídeos | Género: Homo | Espécie: Homo sapiens(Humano)");
        
        System.out.println("Tipo: "+homem.getNome_do_tipo());
        System.out.println("Porcentagem de pelos no corpo: " + homem.getporcentagem_pelos()+"%");
        System.out.println("Locomoção: "+homem.getLocomocao());
        System.out.println("Alimentação: "+homem.alimentacao());
        System.out.println("Reproducao: "+homem.reproducao());
        System.out.println("Quantidade  de patas: "+homem.getPatas());
        System.out.println("Porte: "+homem.getPorte());
        System.out.println("Sexo: "+homem.getSexo());
        System.out.println("Estado do animal:"+vivo);
        
        
        //-------------------------------------------------------------------
       
        leao.setporcentagem_pelo(97);              
        leao.setLocomocao("Digitígrado e Quadrupedalismo.");// anda sobre os dedos/ Quadrupedalismo -andar sobre quatro patas                                                                    
        leao.setPatas(4);
        leao.setPorte("medio");
        leao.setSexo('M');
        leao.setSom("Rugir");
        leao.setVivo(true);
              vivo=(leao.getvivo()==true)?" vivo":"morto";
        leao.setSaude("Saudável");
        leao.setNome_do_tipo("\"Reino: Animalia | Filo: Cordados | Classe: Mamíferos | Ordem: Carnívoros |" +
        " Familia: Felinos | Género: Panthera | Espécie: Leão" );
        
      
        
        System.out.println("\nTipo: "+leao.getNome_do_tipo());
        System.out.println("Porcentagem de pelos no corpo: " + leao.getporcentagem_pelos()+"%");
        System.out.println("Locomoção: "+leao.getLocomocao());
        System.out.println("Alimentação: "+leao.alimentacao().substring(0,10));//modificarei um metodo       
        System.out.println("Reproducao: "+leao.reproducao());
        System.out.println("Quantidade  de patas: "+leao.getPatas());
        System.out.println("Porte: "+leao.getPorte());
        System.out.println("Sexo: "+leao.getSexo());
        System.out.println("Estado do animal:"+vivo);//
        
        //--------------------------------------
        
        serpente.setEscamas(true);     
                 String escamas=(serpente.getEscamas()==true)?" Tem escamas":"Não tem escamas";
        serpente.setcarapaca_com_placas(false);    
                 String carapacas = (serpente.getcarapaca_com_placas()==true)?"Tem carapaças":" Não tem carapaças";
        serpente.setPatas(0);
        serpente.setPorte("medio-pequeno");
        serpente.setSexo('M');
        serpente.setSom("Sibila");
        serpente.setVivo(true);
              vivo=(serpente.getvivo()==true)?" vivo":"morto";
        serpente.setSaude("Saudável");
        serpente.setNome_do_tipo("\"Reino: Animalia | Filo: Cordados | Classe: Répteis | Ordem: Escamados |" +
        " Subordem: Serpentes" );
        
       
        
        
        
        System.out.println("\nTipo: "+serpente.getNome_do_tipo());
        System.out.println("Escamas no corpo: " + escamas);//ternario
        System.out.println("Com carapaças:  "+carapacas);
        System.out.println("Alimentação: "+serpente.alimentacao().substring(0,21));
        System.out.println("Reproducao: "+serpente.reproducao());
        System.out.println("Quantidade  de patas: "+serpente.getPatas());
        System.out.println("Porte: "+serpente.getPorte());
        System.out.println("Sexo: "+serpente.getSexo());
        System.out.println("Estado do animal:"+vivo);
        
        
        //-----------------------------
        crocodilo.setEscamas(true);     
                 escamas=(crocodilo.getEscamas()==true)?" Tem escamas":"Não tem escamas";
        crocodilo.setcarapaca_com_placas(false);    
                carapacas = (crocodilo.getcarapaca_com_placas()==true)?"Tem carapaças":" Não tem carapaças com placas";
        crocodilo.setPatas(4);
        crocodilo.setPorte("grande");
        crocodilo.setSexo('F');
        crocodilo.setSom("grasna ou  brame");
        crocodilo.setVivo(true);
              vivo=(crocodilo.getvivo()==true)?" vivo":"morto";
        crocodilo.setSaude("Saudável");
        crocodilo.setNome_do_tipo("Reino: Animalia | Filo: Cordados | Classe: Répteis | Ordem: Crocodilia |" +
        " Família: Crocodilos " );
        
        System.out.println("\nTipo: "+crocodilo.getNome_do_tipo());
        System.out.println("Escamas no corpo: " + escamas);//ternario
        System.out.println("Com carapaças  "+carapacas);
        System.out.println("Alimentação: "+crocodilo.alimentacao().substring(0,9));//usar um metodo
        System.out.println("Reproducao: "+crocodilo.reproducao());
        System.out.println("Quantidade  de patas: "+crocodilo.getPatas());
        System.out.println("Porte: "+crocodilo.getPorte());
        System.out.println("Sexo: "+crocodilo.getSexo());
        System.out.println("Estado do animal:"+vivo);
       
        
        //-----------------------------------------------------
        
        salmao.setCorpo_escamas(true);     
              escamas=(salmao.getCorpo_escamas()==true)?" Tem escamas":"Não tem escamas";     
        salmao.setPatas(0);
        salmao.setPorte("pequeno");
        salmao.setSexo('M');
        salmao.setSom("Ronca");
        salmao.setVivo(true);
              vivo=(salmao.getvivo()==true)?" vivo":"morto";
        salmao.setSaude("Saudável");
        salmao.setNome_do_tipo("\"Reino: Animalia | Filo: Cordados | Classe: peixes | Ordem: Salmoniformes |" +
        " Família: salmonídeos ou salmões" );
        
        System.out.println("\nTipo: "+salmao.getNome_do_tipo());
        System.out.println("Escamas no corpo: " + escamas);//ternario  
        System.out.println("Alimentação: "+salmao.alimentacao());
        System.out.println("Reproducao: "+salmao.reproducao());
        System.out.println("Quantidade de patas: "+salmao.getPatas());
        System.out.println("Porte: "+salmao.getPorte());
        System.out.println("Sexo: "+salmao.getSexo());
        System.out.println("Estado do animal:"+vivo);
        //---------------------------------------------
       
        san_peter.setCorpo_escamas(true);
                 escamas=(salmao.getCorpo_escamas()==true)?" Tem escamas":"Não tem escamas";
        san_peter.setPatas(0);
        san_peter.setPorte("pequeno");
        san_peter.setSexo('F');
        san_peter.setSom("Ronca");
        san_peter.setVivo(true);
              vivo=(san_peter.getvivo()==true)?" vivo":"morto";
        san_peter.setSaude("Saudável");
        san_peter.setNome_do_tipo("Reino: Animalia | Filo: Cordados | Classe: peixes | Ordem: perciformes |" +
        " Família: Cichlidae  Espécie: san peter (tilápia vermelha)" );
        
        System.out.println("\nTipo: "+san_peter.getNome_do_tipo());
        System.out.println("Escamas no corpo: " + escamas);//ternario  
        System.out.println("Alimentação: "+san_peter.alimentacao());
        System.out.println("Reproducao: "+san_peter.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+san_peter.getPatas());
        System.out.println("Porte: "+san_peter.getPorte());
        System.out.println("Sexo: "+san_peter.getSexo());
        System.out.println("Estado do animal:"+vivo);
        
        //----------------------------------------------------
      
        pombo.setcorpo_coberto_penas(true);
               String penas=(pombo.getCorpo_coberto_penas()==true)?"Sim":"Não";
        pombo.setvoa(true);
                String voa=(pombo.getvoa()==true)?"Sim ":"Não";
        pombo.setPatas(2);
        pombo.setPorte("pequeno");
        pombo.setSexo('M');
        pombo.setSom("arrulha, geme, rulha, suspira, turturilha, tuturina");
        pombo.setVivo(true);
              vivo=(pombo.getvivo()==true)?" vivo":"morto";
        pombo.setSaude("Doente");
        pombo.setNome_do_tipo("\"Reino: Animalia | Filo: Cordados | Classe: Aves | Ordem: Columbiformes |" +
        " Família: Columbidae | Género: Columba | Espécie: Pombo" );
        
        
        
        System.out.println("\nTipo: "+pombo.getNome_do_tipo());
        System.out.println("Corpo coberto por penas: "+penas);
        System.out.println("Voa: "+voa);
        System.out.println("Escamas no corpo: " + escamas);//ternario  
        System.out.println("Alimentação: "+pombo.alimentacao());
        System.out.println("Reproducao: "+pombo.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+pombo.getPatas());
        System.out.println("Porte: "+pombo.getPorte());
        System.out.println("Sexo: "+pombo.getSexo());
        System.out.println("Estado do animal:"+vivo);
        //----------------
        galinha.setcorpo_coberto_penas(true);
               penas=(galinha.getCorpo_coberto_penas()==true)?"Sim":"Não";
        galinha.setvoa(false);
                voa=(galinha.getvoa()==true)?"Sim ":"Não";
        galinha.setPatas(2);
        galinha.setPorte("pequeno");
        galinha.setSexo('F');
        galinha.setSom("cacareja, carcareja, carcareia, cocoreja");
        galinha.setVivo(true);
              vivo=(galinha.getvivo()==true)?" vivo":"morto";
        galinha.setSaude("Saudável");
        galinha.setNome_do_tipo("\"Reino: Animalia | Filo: Cordados | Classe: Aves | Ordem: galináceos |" +
        " Família: Phasianidae | Género: Gallus | Espécie: Galinha" );
        
        
        
        System.out.println("\nTipo: "+galinha.getNome_do_tipo());
        System.out.println("Corpo coberto por penas: "+penas);
        System.out.println("Voa: "+voa);
        System.out.println("Escamas no corpo: " + escamas);//ternario  
        System.out.println("Alimentação: "+galinha.alimentacao().substring(0,21));
        System.out.println("Reproducao: "+galinha.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+galinha.getPatas());
        System.out.println("Porte: "+galinha.getPorte());
        System.out.println("Sexo: "+galinha.getSexo());
        System.out.println("Estado do animal:"+vivo);
        //----------------------------------
        
       
       
        ra.setpele_nua(true);
              String pecilotermicos=(ra.getpele_nua()==true)?"Sim":"Não";       
        ra.setPatas(4);
        ra.setPorte("pequeno");
        ra.setSexo('F');
        ra.setSom("Coaxa, gargareja, grasna, grasne, ronca, rouqueja");
        ra.setVivo(true);
              vivo=(ra.getvivo()==true)?" vivo":"morto";
        ra.setSaude("Saudável");
        ra.setNome_do_tipo("Reino: Animalia | Filo: Cordados | Classe: Anfibio | Ordem: Anura |" +
        " Família: Ranidae ou Rã" );
      
        System.out.println("\nTipo: "+ra.getNome_do_tipo());
        System.out.println("Pele nua: " + pecilotermicos);       
        System.out.println("Alimentação: "+ra.alimentacao().substring(0,10));
        System.out.println("Reproducao: "+ra.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+ra.getPatas());
        System.out.println("Porte: "+ra.getPorte());
        System.out.println("Sexo: "+ra.getSexo());
        System.out.println("Estado do animal:"+vivo);
        
        //---------------------------------------------------
        cobra_cega.setpele_nua(false);
               pecilotermicos=(cobra_cega.getpele_nua()==true)?"Sim":"Não";       
        cobra_cega.setPatas(0);
        cobra_cega.setPorte("pequeno");
        cobra_cega.setSexo('M');
        cobra_cega.setSom("...");
        cobra_cega.setVivo(true);
              vivo=(cobra_cega.getvivo()==true)?" vivo":"morto";
        cobra_cega.setSaude("Saudável");
        cobra_cega.setNome_do_tipo("Reino: Animalia | Filo: Cordados | Classe: Anfibio | Ordem: Gymnophiona |" +
        " Espécie: Cobra-Cega." );
      
        System.out.println("\nTipo: "+cobra_cega.getNome_do_tipo());
        System.out.println("Pele nua: " + pecilotermicos);        
        System.out.println("Alimentação: "+cobra_cega.alimentacao());
        System.out.println("Reproducao: "+cobra_cega.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+cobra_cega.getPatas());
        System.out.println("Porte: "+cobra_cega.getPorte());
        System.out.println("Sexo: "+cobra_cega.getSexo());
        System.out.println("Estado do animal:"+vivo);
        //--------------------------------------------------------------
        
     piolho.setqtd_patas(6);//modificar
        
        piolho.setasas(true);
            String asa = (piolho.getasas()==true)?"Sim":"Não";
     piolho.setPatas(6);//modificar
        piolho.setPorte("pequeno");
        piolho.setSexo('F');
        piolho.setSom("...");
        piolho.setVivo(true);
              vivo=(piolho.getvivo()==true)?" vivo":"morto";
        piolho.setSaude("Saudável");
        piolho.setNome_do_tipo("Reino: Animalia | Filo: Artrópode | Classe: inseto | Ordem: Phthiraptera |" +
        " Espécie: Piolho" );
      
        System.out.println("\nTipo: "+piolho.getNome_do_tipo());
        System.out.println("Asas: " + asa);        
        System.out.println("Alimentação: "+piolho.alimentacao().substring(23,35));
        System.out.println("Reproducao: "+piolho.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+piolho.getPatas());
        System.out.println("Porte: "+piolho.getPorte());
        System.out.println("Sexo: "+piolho.getSexo());
        System.out.println("Estado do animal:"+vivo);
        //----------------------------------------
        
        
        
         gafanhoto.setasas(true);
           asa = (gafanhoto.getasas()==true)?"Sim":"Não";
     gafanhoto.setPatas(6);//modificar
        gafanhoto.setPorte("pequeno");
        gafanhoto.setSexo('F');
        gafanhoto.setSom("chichia, zizia, zumbe");
        gafanhoto.setVivo(true);
              vivo=(gafanhoto.getvivo()==true)?" vivo":"morto";
        gafanhoto.setSaude("Saudável");
        gafanhoto.setNome_do_tipo("Reino: Animalia | Filo: Artrópode | Classe: inseto | Ordem: ortópteros |" +
        " Subordem: Caelifera | Espécie: Gafanhoto" );
      
        System.out.println("\nTipo: "+gafanhoto.getNome_do_tipo());
        System.out.println("Asas: " + asa);        
        System.out.println("Alimentação: "+gafanhoto.alimentacao().substring(0,21));
        System.out.println("Reproducao: "+gafanhoto.reproducao());//usar um metodo
        System.out.println("Quantidade de patas: "+gafanhoto.getPatas());
        System.out.println("Porte: "+gafanhoto.getPorte());
        System.out.println("Sexo: "+gafanhoto.getSexo());
        System.out.println("Estado do animal:"+vivo);
        
        
    }

   
    
}
