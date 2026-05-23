package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class PushNotificacao implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("PUSH: " + mensagem);
    }

}