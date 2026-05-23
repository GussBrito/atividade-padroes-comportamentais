package br.edu.ifpb.ads.padroes.atv1;

import br.edu.ifpb.ads.padroes.atv1.notificacao.EmailNotificacao;
import br.edu.ifpb.ads.padroes.atv1.notificacao.PushNotificacao;
import br.edu.ifpb.ads.padroes.atv1.notificacao.SmsNotificacao;
import br.edu.ifpb.ads.padroes.atv1.observer.Interessado;

public class Main {

    public static void main(String[] args) {

        RepositorioDiscos repositorio = new RepositorioDiscos();

        Interessado interessado1 =
                new Interessado(
                        "Rock",
                        new EmailNotificacao()
                );

        Interessado interessado2 =
                new Interessado(
                        "Metallica",
                        new SmsNotificacao()
                );

        Interessado interessado3 =
                new Interessado(
                        "Pop",
                        new PushNotificacao()
                );

        repositorio.subscribe(interessado1);
        repositorio.subscribe(interessado2);
        repositorio.subscribe(interessado3);

        Disco disco = new Disco(
                "Metallica",
                "Black Album",
                "Rock",
                1991
        );

        repositorio.addDisco(disco);

    }

}