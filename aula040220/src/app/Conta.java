package app;

import javax.swing.JOptionPane;

public class Conta{
    public int Agencia;
    public int Conta;
    public double Saldo;
    public String Nome;

    public void consultSaldo(){
        JOptionPane.showMessageDialog(null, Saldo);
    }

    public void deposit(double qtt){
        Saldo += qtt;
            JOptionPane.showMessageDialog(null, "Depositastes R$"+qtt+" e agora tu tens R$"+Saldo);
    }

    public void sacar(double qtt){
        if(Saldo >= qtt){
            Saldo -= qtt;
            JOptionPane.showMessageDialog(null, "Sacastes R$"+qtt);
        } else {
            JOptionPane.showMessageDialog(null, "Não podes Sacar");
        }
    }

    public void transfer(double qtt, Conta c2){
        if(Saldo >= qtt){
        Saldo -= qtt;
        c2.Conta += qtt;
            JOptionPane.showMessageDialog(null, "Transferistes R$"+qtt+" para "+c2.Nome+" e agora tu tens R$"+Saldo);
        } else{
            JOptionPane.showMessageDialog(null, "Não foi possível a tranferência");
        }
    }

    public void status(){
        JOptionPane.showMessageDialog(null, "\nO nome da conta é: "+Nome+"\nA agência da conta é: "+Agencia+"\nA conta é: "+Conta+"\nO saldo da conta é: "+Saldo);
    }
}