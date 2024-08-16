// Singleton

package projeto_java_curso_dio.gof;

import projeto_java_curso_dio.gof.facade.Facade;
import projeto_java_curso_dio.gof.strategy.ComportamentoAgressivo;
import projeto_java_curso_dio.gof.strategy.ComportamentoDefensivo;
import projeto_java_curso_dio.gof.strategy.ComportamentoNormal;
import projeto_java_curso_dio.gof.strategy.Robo;

public class teste {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
	
		@SuppressWarnings("unused")
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		ComportamentoNormal normal = new ComportamentoNormal();
		@SuppressWarnings("unused")
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		
		robo.setComportamento(defensivo);
		
		robo.mover();
		
		
		robo.setComportamento(agressivo);
		
		robo.mover();
		robo.mover();
		robo.mover();
		
// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
