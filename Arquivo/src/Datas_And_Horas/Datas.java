/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datas_And_Horas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author TRISTAO
 */
public class Datas {

    public static void main(String[] args) {

        /*DATAS SAO REPRESETANDAS POR OBJETOS DO TIPO DATE E MANIPULADAS POR OBJTOS DO TIPO CALENDAR
        * TODO TEMPO EH PRESENTADO EM MILISEGUNDOS COMO TIPO LONG
        * O TEMPO EH MEDIDO APARTIR DE 1 DE JAN DE 1970
        *
         */
        System.out.println(System.currentTimeMillis());

        Date agora = new Date();

        System.out.println(agora);

        Date data = new Date(1_000_000_000_000L);
        System.out.println(data);

        /*METODOS*/
        data.getTime();
        data.setTime(1_000_000_000_000L);
        data.compareTo(agora);//se a data for menor que o parametro =menor que 0
        //se for igual =0
        //se for maior um valor maior que =0 

        /*GregorianCalendar();*/
        Calendar c = Calendar.getInstance();//retorna o calendario 
        c.set(1980, Calendar.FEBRUARY, 21);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));//ano
        System.out.println(c.get(Calendar.MONTH));//mes comeca apartir do 0
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do mes

        c.set(Calendar.YEAR, 1972);//altera ano
        c.set(Calendar.MONTH, Calendar.MARCH);//altera mes
        c.set(Calendar.DAY_OF_MONTH, 25);//altera dia 
        System.out.println(c.getTime());
        
        c.clear(Calendar.MINUTE);//limpa o campo de minuto
        c.clear(Calendar.SECOND);//limpa o campo de segundo
        System.out.println(c.getTime());
        
         c.add(Calendar.DAY_OF_MONTH,1);//add ao dia do mes uma unidade
        c.add(Calendar.YEAR,1);//add ao ano uma unidade 
        System.out.println(c.getTime());
        
        c.add(Calendar.DAY_OF_MONTH,-1);//diminui ao dia do mes uma unidade
        c.add(Calendar.YEAR,-1);//dminui ao ano uma unidade 
        System.out.println(c.getTime());
        
       
        c.roll(Calendar.DAY_OF_MONTH,30);//add as unidades das datas, mas nao modifica a unidade de tempo superior
        System.out.println(c.getTime());
        
        /*saudação*/
        
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora);
        if(hora<=12){
            System.out.println("Bom dia!");
        }else if(hora >12 && hora <18){
        System.out.println("Boa tarde!");
        
    }else if(hora>18){
            System.out.println("Boa noite!");
    }
        
        
        
    }

}
