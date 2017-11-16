package weatherapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {

	@JsonProperty("0")
	public havaDurumuBilesenleri ozellik;

	public havaDurumuBilesenleri getProperty() {
		return ozellik;
	}

	public void setProperty(havaDurumuBilesenleri property) {
		this.ozellik = property;
	}

	@Override
	public String toString() {
		return "Test [property=" + ozellik + "]";
	}
}
