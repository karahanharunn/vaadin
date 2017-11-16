package weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class havaDurumuBilesenleri {

	private int kimlik;
	private String main;
	private String tanımlama;
	private String resimAdı;
	private String icon;
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getId() {
		return kimlik;
	}
	public void setId(int id) {
		this.kimlik = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return tanımlama;
	}
	public void setDescription(String description) {
		this.tanımlama = description;	
	}
	
	public void setImageName(String imageName){
		this.resimAdı = imageName;
	}
	
	public String getImageName(){
		return this.resimAdı;
	}
	
	@Override
	public String toString() {
		return "WeatherProperties [id=" + kimlik + ", main=" + main
				+ ", description=" + tanımlama + "]";
	}
}
