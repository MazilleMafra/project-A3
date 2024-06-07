package a3.project.ValidadorCPF;


import javax.swing.JOptionPane;

public class ValidadorCPF {

    public ValidadorCPF(){
        super();
    }
    public void validaCPF(String CPF){
        int [] CpfArray = CPFtoArray(CPF);

        if (verificaCodigo(1, CpfArray)== true){
            JOptionPane.showMessageDialog(null, "CPF válido!");
        }else{
            JOptionPane.showMessageDialog(null, "CPF inválido!");
        }
    }
    private int [] CPFtoArray(String CPF){
        int [] CpfArray = new int[11];
        for(int i = 0; i <= 10; i++){
            CpfArray [i] = Integer.parseInt(String.valueOf(CPF.charAt(i)));
        }
        return CpfArray;
    }
    private boolean verificaCodigo(int posicaoCodigo, int[] CPF){
        int j = 0;
        if(posicaoCodigo == 1){
            j = 10;
        }else{
            j = 11;
        }
        int indexParameter = 7 + posicaoCodigo;
        int resultado = 0;
        for(int i = 0; i <= indexParameter; i++){
            resultado += j * CPF[i];
            j--;
        }
        int restoDiv = resultado % 11;
        if (restoDiv < 2){
            if(CPF[indexParameter + 1] == 0){
                if(posicaoCodigo == 1){
                    return verificaCodigo(2, CPF);
                } else {
                    return true;
                }
            } else{
                return false;
            }
        } else {
            int dif = 11 - restoDiv;
            if(CPF[indexParameter + 1] == dif){
                if(posicaoCodigo == 1){
                    return verificaCodigo(2, CPF);
                }else{
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
