package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Double qtt_sac;
        Double qtt_dep;
        Double qtt_trans;
        boolean exit = false;
        int Esc;
        boolean filled = false;
        
        while (exit==false){
            Esc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção:\n1-Preencher os dados\n2-Consultar o saldo\n3-Sacar\n4-Depositar\n5-Transferir\n6-Ver o status da conta\n7-Sair do programa"));

            switch (Esc) {
                //Dados
                case 1:
                    c1.Agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Agência:"));
                    c1.Conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Conta:"));
                    c1.Saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu Saldo:"));
                    c1.Nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
                    filled = true;
                    break;

                //Saldo
                case 2:
                    if(filled = false){
                        JOptionPane.showMessageDialog(null,"Não houve preenchimento dos dados nescessários");
                    } else {
                        c1.consultSaldo();
                    }
                    break;
            
                //Sacar
                case 3:
                    if(filled = false){
                        JOptionPane.showMessageDialog(null,"Não houve preenchimento dos dados nescessários");
                    } else {
                        qtt_sac = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto queres sacar?"));
                        c1.sacar(qtt_sac);
                    }
                    break;
            
                //Depositar
                case 4:
                    if(filled = false){
                        JOptionPane.showMessageDialog(null,"Não houve preenchimento dos dados nescessários");
                    } else {
                        qtt_dep = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto queres depositar?"));
                        c1.deposit(qtt_dep);
                    }
                    break;
            
                //Tranferir
                case 5:
                    if(filled = false){
                        JOptionPane.showMessageDialog(null,"Não houve preenchimento dos dados nescessários");
                    } else {
                        c2.Nome = JOptionPane.showInputDialog(null, "Digite o nome para quem vais transferir para quem vais transferir:");
                        c2.Agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Agência para quem vais transferir:"));
                        c2.Conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Conta para quem vais transferir:"));
                        qtt_trans = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite quanto será tranferido:"));
                        c1.transfer(qtt_trans, c2);
                    }
                    break;
            
                //Status
                case 6:
                    if(filled = false){
                        JOptionPane.showMessageDialog(null,"Não houve preenchimento dos dados nescessários");
                    } else {
                        c1.status();
                    }
                    break;

                //Sair
                case 7:
                    exit=true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
            }
        }        
    }
}