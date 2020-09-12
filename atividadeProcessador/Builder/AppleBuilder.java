package atividadeProcessador.Builder;

import atividadeProcessador.Interface.IProcessador;

public class AppleBuilder implements IProcessador {
    @Override
    public void buildMarca() {
        processador.setMarca("Apple");
    }

    @Override
    public void buildModelo(String modelo) {
        processador.setModelo(modelo);
    }

    @Override
    public void buildFrequencia(double freq) {
        processador.setFrequencia(freq);
    }

    @Override
    public void buildNucleos(int nucleos) {
        processador.setQntNucleos(nucleos);
    }

    @Override
    public void buildThreads(int threads) {
        processador.setQntThreads(threads);
    }
}
