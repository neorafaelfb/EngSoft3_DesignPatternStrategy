package Strategy;

public class Main {
	
	public static void main(String[] args) {
		
		Aritmetica calculo = new Aritmetica();
		//Geometrica calculo = new Geometrica();
		
		Disciplina d = new Disciplina(calculo);
		
		d.setNome("Strategy");
		d.setP1(10);
		d.setP2(3);
		d.CalcularMedia();
		System.out.println(
				String.format("Nome:%s P1:%.2f P2:%.2f Media:%.2f Situação: %s",
						d.getNome(),d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
		
	}
	
}
