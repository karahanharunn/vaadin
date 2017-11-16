package com.example.springvaadin;

import org.springframework.beans.factory.annotation.Autowired;

import weatherapi.Weather;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.annotations.Theme;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ClassResource;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("colored")
public class VaadinUI extends UI{
	
	private static final long serialVersionUID = 5021273462572274733L;
	@Autowired
	private Kaynak kaynak;
	private Weather hava;
	private havaDurumuBileseni component;
	Button button ; 
	@Override
	protected void init(VaadinRequest request) {
		TextField name = new TextField("Şehir Adı Giriniz");
                
		button = new Button("Ara", VaadinIcons.SEARCH);
                button.addStyleName("friendly");
		VerticalLayout layout = new VerticalLayout(name, button);
                layout.addComponent(button);
		layout.setMargin(true);
		layout.setSpacing(true);
		setContent(layout);
		button.addClickListener(new ClickListener(){
			private static final long serialVersionUID = -8424487726640573041L;

			@Override
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				if(component != null) layout.removeComponent(component.getLayout());
				component = new havaDurumuBileseni(kaynak.getWeather(name.getValue()));
				layout.addComponent(component.getLayout());
			}
		});
	}

}
