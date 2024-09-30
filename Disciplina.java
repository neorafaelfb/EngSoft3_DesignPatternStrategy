package Strategy;

public class Disciplina {
	
	private ICalcMedia calcMedia;
	private double Media;
	private String Nome;
	private double P1;
	private double P2;
	private String Situacao;
	
	public Disciplina() {
		
	}
	public Disciplina(ICalcMedia calcMedia) {
		
		this.calcMedia = calcMedia;
		
	}
		
	public ICalcMedia getCalcMedia() {
		
		return calcMedia;
		
	}
	public void setCalcMedia(ICalcMedia calcMedia) {
		
		this.calcMedia = calcMedia;
		
	}
	
	
	public double getP1() {
		
		return P1;
		
	}
	public void setP1(double P1) {
		
		this.P1 = P1;
	
	}
	
	public double getP2() {
		
		return P2;
		
	}
	public void setP2(double P2) {
		
		this.P2 = P2;
	
	}
	
	public double getMedia() {
		
		return Media;
		
	}
	public void setMedia(double Media) {
		
		this.Media = Media;
	
	}
	
	public String getNome() {
		
		return Nome;
		
	}
	public void setNome(String Nome) {
		
		this.Nome = Nome;
	
	}
	
	public String getSituacao() {
		
		return Situacao;
		
	}
	public void setSituacao(String Situacao) {
		
		this.Situacao = Situacao;
	
	}
	
	public void CalcularMedia() {
		
		this.Media = calcMedia.CalculaMedia(P1, P2);
		this.Situacao = calcMedia.Situacao(Media);
		
	}
}
