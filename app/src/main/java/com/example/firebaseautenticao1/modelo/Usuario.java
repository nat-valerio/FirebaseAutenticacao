package com.example.firebaseautenticao1.modelo;



public class Usuario {
    private String uid;
    private String email;
    private boolean valido;

    public Usuario(){

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }



}
