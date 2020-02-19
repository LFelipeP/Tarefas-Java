package javaapplication7;
import javax.swing.JOptionPane;
public class JavaApplication7 {
    public static void main(String[] args) {
       String s1 = JOptionPane.showInputDialog(null,"Digite o primeiro numero");
       String s2 = JOptionPane.showInputDialog(null,"Digite o segundo numero");
       String tipo = JOptionPane.showInputDialog(null,"Digite (1) +,(2) -,(3) *, (4) /");
       float resposta;
       
       float n1 = Integer.parseInt(s1);
       float n2 = Integer.parseInt(s2);
       int tipon = Integer.parseInt(tipo);
       
       switch (tipon){
            case 1:
               resposta = n1 + n2;
            break;
            case 2:
               resposta = n1 - n2;
            break;
            case 3:
               resposta = n1 * n2;
            break;
            case 4:
               resposta = n1 / n2;
            break;
            default:
               resposta = 0;
            break;
       }
       JOptionPane.showMessageDialog(null, resposta);
    }
    
}
