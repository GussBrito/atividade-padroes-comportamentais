package br.edu.ifpb.ads.padroes.atv2;

public interface Visitor {

    void visitProdutoFisico(ProdutoFisico produto);

    void visitServico(Servico servico);

}