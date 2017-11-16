package com.example.springvaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ClassResource;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import weatherapi.Weather;

public class havaDurumuBileseni{

	private int gecici;
	private String sehirAdı;
	private String Tanımlama;
	private String Simge;
	private VerticalLayout layout;
	
	public havaDurumuBileseni(Weather weather){
		this.gecici = weather.getMain().getTemp();
		this.sehirAdı = weather.getName();
		this.Tanımlama = weather.getProperty().get(0).getDescription();
		this.Simge = weather.getProperty().get(0).getIcon();
		
		Label tempLabel = new Label(String.valueOf(gecici) + "°C");
		tempLabel.addStyleName("tempLabel");
		Label cityNameLabel = new Label(sehirAdı);
		Label descriptionLabel = new Label(Tanımlama);
		
		if(Simge.contains("n")) {
			Simge = Simge.replace("n", "d");
		}
		
		Image image = new Image(null, new ClassResource("/" + Simge + ".jpg"));
		/*image.setWidth(60, Unit.PIXELS);
		image.setHeight(60, Unit.PIXELS);*/
		this.setLayout(new VerticalLayout(tempLabel, image, cityNameLabel, descriptionLabel));
	}

	public VerticalLayout getLayout() {
		return layout;
	}

	public void setLayout(VerticalLayout layout) {
		this.layout = layout;
	}
	
}
