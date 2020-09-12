package atividadeProcessador;


import atividadeProcessador.Builder.AmdBuilder;
import atividadeProcessador.Builder.AppleBuilder;
import atividadeProcessador.Builder.IntelBuilder;
import atividadeProcessador.Builder.QualcommBuilder;
import atividadeProcessador.Class.ProcessadorProduct;
import atividadeProcessador.Director.ProcessadorDirector;

public class Main {
    public static void main(String[] args) {
        ProcessadorDirector fabricaProcessador = new ProcessadorDirector(new AmdBuilder());
        fabricaProcessador.construirProcessador("Ryzen 7",3.80,8,16);
        ProcessadorProduct processador = fabricaProcessador.getProcessador();
        System.out.println(processador);

        fabricaProcessador = new ProcessadorDirector(new IntelBuilder());
        fabricaProcessador.construirProcessador("Core i9 10900k",4.80,10,20);
        processador = fabricaProcessador.getProcessador();
        System.out.println(processador);

        fabricaProcessador = new ProcessadorDirector(new QualcommBuilder());
        fabricaProcessador.construirProcessador("Snapdragon 865",2.65,8,8);
        processador = fabricaProcessador.getProcessador();
        System.out.println(processador);

        fabricaProcessador = new ProcessadorDirector(new AppleBuilder());
        fabricaProcessador.construirProcessador("Apple A13 Bionic",1.90,6,6);
        processador = fabricaProcessador.getProcessador();
        System.out.println(processador);
    }
}
