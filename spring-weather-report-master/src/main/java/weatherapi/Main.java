package weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	
	@JsonProperty("temp")
	private int gecici;
	private int basınç;
	private String isim;
	
	public int getTemp() {
		return gecici;
	}
	public void setTemp(double temp) {
		this.gecici = (int) (Math.floor(temp) - 273);
	}
	public int getPressure() {
		return basınç;
	}
	public void setPressure(int pressure) {
		this.basınç = pressure;
	}
	@Override
	public String toString() {
		return "Main [temp=" + gecici + ", pressure=" + basınç + "]";
	}
	
	
}
