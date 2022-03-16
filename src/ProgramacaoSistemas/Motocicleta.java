package ProgramacaoSistemas;

public class Motocicleta {
    String modelo;
    String marca;
    int nroChassi;
    String nroPlaca;
    String cor;
    int nroCilindradas;
    
    public String licenciar(){
        String mes="", finalPlaca;
        int tam = nroPlaca.length();
        finalPlaca = nroPlaca.substring(tam-1,tam);
        switch(finalPlaca){
            case "1": 
                mes="abril";
                    break;
            case "2": 
                mes="maio";
                    break;
            case "3": 
                mes="junho";
                    break;
            case "4": 
                mes="julho";
                    break;
            case "5": case "6": 
                mes="agosto";
                    break;
            case "7": 
                mes="setembro";
                    break;
            case "8": 
                mes="outubro";
                    break;
            case "9": 
                mes="novembro";
                    break;
            case "0": 
                mes="dezembro";
                    break;
        }
        return mes;
    }
    
    public boolean checaChassi (int nro){
        if (nroChassi==nro)
            return true;
        else
            return false;
    }

    
}