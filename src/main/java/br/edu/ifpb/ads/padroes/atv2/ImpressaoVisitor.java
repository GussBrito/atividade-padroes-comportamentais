package br.edu.ifpb.ads.padroes.atv2;

public class ImpressaoVisitor implements Visitor {

    @Override
    public void visitProdutoFisico(ProdutoFisico produto) {

        System.out.println(
                "Produto: "
                        + produto.getNome()
                        + " | Valor: R$ "
                        + produto.getValor()
        );

    }

    @Override
    public void visitServico(Servico servico) {

        System.out.println(
                "Serviço | Valor: R$ "
                        + servico.getValor()
        );

    }

}