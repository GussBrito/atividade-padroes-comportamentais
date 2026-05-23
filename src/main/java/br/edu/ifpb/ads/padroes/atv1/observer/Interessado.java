package br.edu.ifpb.ads.padroes.atv1.observer;

import br.edu.ifpb.ads.padroes.atv1.Disco;
import br.edu.ifpb.ads.padroes.atv1.notificacao.CanalNotificacao;

public class Interessado implements Observer {

    private String interesse;
    private CanalNotificacao canal;

    public Interessado(String interesse, CanalNotificacao canal) {
        this.interesse = interesse;
        this.canal = canal;
    }

    @Override
    public void update(Disco disco) {

        if (disco.getTitulo().contains(interesse)
                || disco.getArtista().contains(interesse)
                || disco.getGenero().contains(interesse)) {

            canal.enviar("Novo disco encontrado: " + disco.getTitulo());

        }

    }

}