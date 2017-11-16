package weatherapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	private String isim;
	public Main main;
	@JsonProperty("weather")
	public List<havaDurumuBilesenleri> property;
	
	public String getName() {
		return isim;
	}
	public void setName(String name) {
		this.isim = name;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public List<havaDurumuBilesenleri> getProperty() {
		return property;
	}
	public void setProperty(List<havaDurumuBilesenleri> property) {
		this.property = property;
	}
	
	@Override
	public String toString() {
		return "Weather [name=" + isim + ", main=" + main + ", property="
				+ property + "]";
	}
	
	
	
}
