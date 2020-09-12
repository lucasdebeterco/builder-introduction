package atividadeProcessador.Director;

import atividadeProcessador.Class.ProcessadorProduct;
import atividadeProcessador.Interface.IProcessador;

public class ProcessadorDirector {
    protected IProcessador builder;
    public ProcessadorDirector(IProcessador processadorbuilder) {
        this.builder = processadorbuilder;
    }

    public void construirProcessador(String modelo, double frequencia, int nucleos, int threads) {
        builder.buildMarca();
        builder.buildModelo(modelo);
        builder.buildFrequencia(frequencia);
        builder.buildNucleos(nucleos);
        builder.buildThreads(threads);
    }

    public ProcessadorProduct getProcessador() {
        return builder.build();
    }
}
