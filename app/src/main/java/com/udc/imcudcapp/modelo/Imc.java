package com.udc.imcudcapp.modelo;

public class Imc {
    private String nomapel;
    private double peso;
    private double altura;

    public Imc(String nomapel,String peso,String altura) {
            this.nomapel=nomapel;
            this.peso=Double.valueOf(peso);
            this.altura=(Double.valueOf(altura))/100;
    }

    public String getNomapel() {
        return nomapel;
    }

    public void setNomapel(String nomapel) {
        this.nomapel = nomapel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = Double.valueOf(peso);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = (Double.valueOf(altura))/100;
    }

    private double calcularIMC(){
        return peso/Math.pow(altura,2);
    }

    private String indicadorIMC(){
        String mensaje="";
        if(calcularIMC()<18.5){
            mensaje="Bajo Peso";
        }
        else if(calcularIMC()>=18.5 && calcularIMC()<25){
            mensaje="Peso Normal";
        }
        else if(calcularIMC()>=25 && calcularIMC()<30){
            mensaje="Sobrepeso";
        }
        else if(calcularIMC()>=30){
            mensaje="Obeso";
        }

        return mensaje;
    }

    public String calcularIMCString(){
        return  "Nombres y Apellidos:"+nomapel+"\n"+
                "\n"+
                "IMC:"+String.format("%.2f",calcularIMC())+"\n"+
                "\n"+
                "Nivel de Peso:"+indicadorIMC();
    }

}
