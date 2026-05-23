package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class EmailNotificacao implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("EMAIL: " + mensagem);
    }

}