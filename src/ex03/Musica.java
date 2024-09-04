package ex03;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;
    double somatoriaAvaliacoes;
    double mediaAvaliacoes;

    public void fichaTec(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de Lançamento: "+anoLancamento);
        System.out.println("Avaliações: "+ numAvaliacao);
        System.out.println("Número de Avaliações: "+numAvaliacao);
        System.out.println("Média de Avaliações; "+mediaAvaliacoes);
    }

    public void lerDadosMusica() {
        System.out.println("Infome o Titulo: " + titulo);
        System.out.println("Informe o Artista: " + artista);
        System.out.println("Informe o Ano de Lançamento: " + anoLancamento);
        System.out.println("Deixe a sua Avaliação: " + numAvaliacao);
        atualizamedia(avaliacao);
    }

    public void atualizamedia(double avaliacao){
        numAvaliacao++;
        somatoriaAvaliacoes = somatoriaAvaliacoes + avaliacao;
        mediaAvaliacoes = somatoriaAvaliacoes / numAvaliacao;
    }
}
