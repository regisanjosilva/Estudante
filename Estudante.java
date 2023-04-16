
public class Estudante {
	
	private String nome;
	private double media;
	
	
	
	public Estudante(String nome, double media) {
	
		this.nome = nome;
		//valida qua a meida é > 0 e <= 100
		if(media > 0.0)
			if(media <=100)
		this.media = media;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getMedia() {
		return media;
	}



	public void setMedia(double media) {
		if(media > 0.0)
			if(media <=100)
		
		this.media = media;
	}
	
	public String getLetraGrau() {
	String letraGrau = "";
	if(media >=90)
		letraGrau = "A";
	else if(media >= 80)
		letraGrau = "B";
	else if(media >=70)
		letraGrau = "C";
	else if(media >=60)
		letraGrau = "D";
	else 
		letraGrau = "F";
	return letraGrau;
	
	}
}
