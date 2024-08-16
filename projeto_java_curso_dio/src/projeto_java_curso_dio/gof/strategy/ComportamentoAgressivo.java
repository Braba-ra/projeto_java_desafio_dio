package projeto_java_curso_dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}
}
