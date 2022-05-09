package bootcamp.oop.basic.HomeApp_absttraction;

import java.time.LocalTime;

public interface Appliable {
	
	LocalTime turnOn();
	long turnOff(LocalTime on);

}
