package xml.Cars_project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class QueryCars 
{
	public static void run() 
	{
		List<Car> cars = new ArrayList<>();
		try {
			File inputFile = new File("myFiles/myCars.xml");
			SAXBuilder saxBuilder = new SAXBuilder();
			Document document = saxBuilder.build(inputFile);
			System.out.println("Root element :" + document.getRootElement().getName());
			Element classElement = document.getRootElement();

			List<Element> carsList = classElement.getChildren();
			System.out.println("----------------------------");

			for (int i = 0; i < carsList.size(); i++) 
			{
				Element car = carsList.get(i);
				Element plateNumber = carsList.get(i).getChild("licencePlate").getChild("number");
				Element plateColor = carsList.get(i).getChild("licencePlate").getChild("color");
				
				System.out.println("Current Element:" + car.getName());
				LicencePlate plateTmp = parseLicencePlate(plateNumber,plateColor);
				Car tmp = parseCar(car,plateTmp);
				cars.add(tmp);
				System.out.println(tmp);
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
	
	private static LicencePlate parseLicencePlate(Element plateNumber, Element plateColor) 
	{
		String number = plateNumber.getText();
		String color = plateColor.getText();
		
		return new LicencePlate(number,color);
	}

	private static Car parseCar(Element car,LicencePlate licencePlate) 
	{
		String manufacturer = car.getChild("manufacturer").getText();
		String model = car.getChild("model").getText();
		String year = car.getChild("year").getText();
	
		return new Car(manufacturer, model, year,licencePlate);
	}
	

}
