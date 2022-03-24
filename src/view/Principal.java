package view;

import java.util.concurrent.Semaphore;

import controller.CarroController;

public class Principal {

	public static void main(String[] args) {
		String[] direcoes = { "Norte para o Sul", "Leste para o Oeste", "Oeste para o Leste", "Sul para o Norte" };
		Semaphore semaforo = new Semaphore(1);
		for (int ThreadId = 1; ThreadId < 5; ThreadId++) {
			CarroController car = new CarroController(direcoes[ThreadId - 1], semaforo);
			car.start();
		}
	}
}