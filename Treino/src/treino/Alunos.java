/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino;

/**
 *
 * @author TRISTAO
 */
public class Alunos {
    
    private String nome;
    private String email;
    private String telefone;
    
    private String sexo;
    private String curso;
    private String periodo;
    
    Alunos(){}
    
    Alunos (String nome2, String email2, String telefone2,String sexo2, String curso2, String periodo2){
        this.nome = nome2;
        this.email =email2;
        this.telefone = telefone2;
        this.sexo = sexo2;
        this.curso = curso2;
        this.periodo = periodo2;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

     public void exibeAluno(){
        
        System.out.println(getNome()+getEmail()+getTelefone()+getSexo()+getCurso()+getPeriodo());
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
    
    
}
