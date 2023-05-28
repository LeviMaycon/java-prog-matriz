import javax.swing.*;
/**
 *
 * @author Levi Maycon
 */
public class ProgMatriz {

    public static void main(String entrada[]) {
        int vetor[] = {2,4,6,8,10};
        int matriz[][] = new int [2][3];
        String msg =  "vetor = ";
        
        // vetor  = ;
        for(int i =0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para posição" + i + "e" + j));
                msg = msg + matriz[i][j] + "";
            }
            
            msg = msg + "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
