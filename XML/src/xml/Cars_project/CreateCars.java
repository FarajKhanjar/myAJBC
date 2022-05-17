package xml.Cars_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class CreateCars 
{

	public static void run() 
	{
		try 
		{
			// root element
			Element carsElement = new Element("cars");
			Document doc = new Document(carsElement);

			// car_1 element
			Element car_1Element = new Element("car_1");

			// car_1 elements:	
			Element carElement1 = new Element("manufacturer");
			carElement1.setText("Ford");
			Element carElement2 = new Element("model");
			carElement2.setText("Focus");
			Element carElement3 = new Element("year");
			carElement3.setText("2015");
			
			Element licencePlateElement = new Element("licencePlate");
			licencePlateElement.setAttribute(new Attribute("unique", "true"));
			Element carElement4 = new Element("number");
			carElement4.setText("7307313");
			Element carElement5 = new Element("color");
			carElement5.setText("yellow");
			
			car_1Element.addContent(carElement1);
			car_1Element.addContent(carElement2);
			car_1Element.addContent(carElement3);
			licencePlateElement.addContent(carElement4);
			licencePlateElement.addContent(carElement5);
			car_1Element.addContent(licencePlateElement);
			
			// car_2 element
			Element car_2Element = new Element("car_2");

			// car_2 elements:	
			Element car_2Element1 = new Element("manufacturer");
			car_2Element1.setText("Toyota");
			Element car_2Element2 = new Element("model");
			car_2Element2.setText("Auris");
			Element car_2Element3 = new Element("year");
			car_2Element3.setText("2021");
			
			Element car_2licencePlateElement = new Element("licencePlate");
			car_2licencePlateElement.setAttribute(new Attribute("unique", "true"));
			Element car_2Element4 = new Element("number");
			car_2Element4.setText("4715521");
			Element car_2Element5 = new Element("color");
			car_2Element5.setText("yellow");
			
			
			car_2Element.addContent(car_2Element1);
			car_2Element.addContent(car_2Element2);
			car_2Element.addContent(car_2Element3);
			car_2licencePlateElement.addContent(car_2Element4);
			car_2licencePlateElement.addContent(car_2Element5);
			car_2Element.addContent(car_2licencePlateElement);

			
			
			// car_3 element
			Element car_3Element = new Element("car_3");

			// car_3 elements:	
			Element car_3Element1 = new Element("manufacturer");
			car_3Element1.setText("Volkswagen");
			Element car_3Element2 = new Element("model");
			car_3Element2.setText("Golf");
			Element car_3Element3 = new Element("year");
			car_3Element3.setText("2020");
			
			Element car_3licencePlateElement = new Element("licencePlate");
			car_3licencePlateElement.setAttribute(new Attribute("unique", "true"));
			Element car_3Element4 = new Element("number");
			car_3Element4.setText("12575784");
			Element car_3Element5 = new Element("color");
			car_3Element5.setText("white");
			
			
			car_3Element.addContent(car_3Element1);
			car_3Element.addContent(car_3Element2);
			car_3Element.addContent(car_3Element3);
			car_3licencePlateElement.addContent(car_3Element4);
			car_3licencePlateElement.addContent(car_3Element5);
			car_3Element.addContent(car_3licencePlateElement);
			
			
			
			// car_4 element
			Element car_4Element = new Element("car_4");

			// car_4 elements:	
			Element car_4Element1 = new Element("manufacturer");
			car_4Element1.setText("Seat");
			Element car_4Element2 = new Element("model");
			car_4Element2.setText("Leon");
			Element car_4Element3 = new Element("year");
			car_4Element3.setText("2019");
			
			Element car_4licencePlateElement = new Element("licencePlate");
			car_4licencePlateElement.setAttribute(new Attribute("unique", "true"));
			Element car_4Element4 = new Element("number");
			car_3Element4.setText("07474111");
			Element car_4Element5 = new Element("color");
			car_4Element5.setText("white");
			
			
			car_4Element.addContent(car_4Element1);
			car_4Element.addContent(car_4Element2);
			car_4Element.addContent(car_4Element3);
			car_4licencePlateElement.addContent(car_4Element4);
			car_4licencePlateElement.addContent(car_4Element5);
			car_4Element.addContent(car_4licencePlateElement);
			
			// car_5 element
			Element car_5Element = new Element("car_5");

			// car_5 elements:	
			Element car_5Element1 = new Element("manufacturer");
			car_5Element1.setText("Opel");
			Element car_5Element2 = new Element("model");
			car_5Element2.setText("Astra");
			Element car_5Element3 = new Element("year");
			car_5Element3.setText("2013");
			
			Element car_5licencePlateElement = new Element("licencePlate");
			car_5licencePlateElement.setAttribute(new Attribute("unique", "true"));
			Element car_5Element4 = new Element("number");
			car_5Element4.setText("15555521");
			Element car_5Element5 = new Element("color");
			car_5Element5.setText("yellow");
			
			
			car_5Element.addContent(car_5Element1);
			car_5Element.addContent(car_5Element2);
			car_5Element.addContent(car_5Element3);
			car_5licencePlateElement.addContent(car_5Element4);
			car_5licencePlateElement.addContent(car_5Element5);
			car_5Element.addContent(car_5licencePlateElement);
			
			doc.getRootElement().addContent(car_1Element);
			doc.getRootElement().addContent(car_2Element);
			doc.getRootElement().addContent(car_3Element);
			doc.getRootElement().addContent(car_4Element);
			doc.getRootElement().addContent(car_5Element);

			XMLOutputter xmlOutput = new XMLOutputter();

			// display format
			xmlOutput.setFormat(Format.getPrettyFormat());
			// save to a file
			File outputFile = new File("myFiles/myCars.xml");
			OutputStream outputStream = new FileOutputStream(outputFile);
			xmlOutput.output(doc, outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
