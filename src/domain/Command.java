package domain;

public interface Command{
	void ejecutar();
	void deshacer();
}