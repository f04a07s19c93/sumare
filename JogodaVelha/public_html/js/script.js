var jogador ='x';
var jogada = 0;

function  chkJogo(id){
    var src = chkSrc(id);
    var cpu =document.getElementById('cpu').checked;
   if(src=="branco.png"){
       /*se src for igual ao src do branco entao ele vai substituir por  */
       document.getElementById(id).src = "imagens/"+jogador +".png";
       jogada++;
       
       if(chkVitoria() ){
           alert("Fim do jogo! Vitória do "+jogador);
           jogador='z';
           location.reload();
       }
       if(jogada>=9 && chkVitoria()==false){
           alert('jogo empatado!');
           location.reload();
       }
       
       if(jogador=='x'){
           jogador= 'o';         
       }else{
           jogador ='x';
       }
   }
   if(cpu && jogador =='o'){
       chkJogo(jogadaDoComputador());
   }
      
}

//IA
function jogadaDoComputador(){
    if(chkSrc('cel5')=='branco.png'){
        return'cel5';
    }
    return 'cel'+ Math.floor((Math.random() *9) + 1);//flor numero inteiro
}

function chkSrc(id){
    var src = document.getElementById(id).src;//vai pegar o  endereço da imagem
    return src.substring(src.length - 10, src.length);
}

function chkVitoria(){
    if(chkSrc('cel1')==chkSrc('cel2')  && chkSrc('cel1')==chkSrc('cel3') && chkSrc('cel1')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel4')==chkSrc('cel5')  && chkSrc('cel4')==chkSrc('cel6') && chkSrc('cel4')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel7')==chkSrc('cel8')  && chkSrc('cel7')==chkSrc('cel9') && chkSrc('cel7')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel1')==chkSrc('cel4')  && chkSrc('cel1')==chkSrc('cel7') && chkSrc('cel1')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel2')==chkSrc('cel5')  && chkSrc('cel2')==chkSrc('cel8') && chkSrc('cel2')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel3')==chkSrc('cel6')  && chkSrc('cel3')==chkSrc('cel9') && chkSrc('cel3')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel1')==chkSrc('cel5')  && chkSrc('cel1')==chkSrc('cel9') && chkSrc('cel1')!= 'branco.png'){
        return true;
    }
    if(chkSrc('cel3')==chkSrc('cel5')  && chkSrc('cel3')==chkSrc('cel7') && chkSrc('cel3')!= 'branco.png'){
        return true;
    }
    
    
    return false;
}