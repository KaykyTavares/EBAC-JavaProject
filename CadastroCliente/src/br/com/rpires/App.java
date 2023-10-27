package br.com.rpires;

import br.com.rpires.dao.ClienteMapDAO;
import br.com.rpires.dao.IClienteDAO;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String args[]){
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "1 - Cadastro\n2 - Consultar\n3 - exclusão\n4 - Alteração\n5 - Sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaovalida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }

            opcao = JOptionPane.showInputDialog(null,
                    "OPÇÃO INVÁLIDA\n1 - Cadastro\n2 - Consultar\n3 - exclusão\n4 - Alteração\n5 - Sair",
                    "Digite um número válido", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null,
                "Até logo", "sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaovalida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }

        return false;
    }
}
