package atividadeProcessador.Interface;

import atividadeProcessador.Class.ProcessadorProduct;

public interface IProcessador {
    ProcessadorProduct processador = new ProcessadorProduct();

    void buildMarca();
    void buildModelo(String modelo);
    void buildFrequencia(double freq);
    void buildNucleos(int nucleos);
    void buildThreads(int threads);
    default ProcessadorProduct build() {
        return processador;
    }
}
