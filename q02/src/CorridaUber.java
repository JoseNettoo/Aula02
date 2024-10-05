class CorridaUber {
    double distancia;
    int tempoEspera;
    double tarifaBase;
    double fatorDemanda;

    CorridaUber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    void exibirDetalhesCorrida() {
        System.out.println("Valor Final: R$ " + calcularValorCorrida());
    }
}