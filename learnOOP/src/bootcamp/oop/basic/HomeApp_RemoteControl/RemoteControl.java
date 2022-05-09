package bootcamp.oop.basic.HomeApp_RemoteControl;

public class RemoteControl {
	
	// field  
			private String transmitMethod; //RF or IR
			
	//constructor
			public RemoteControl(String transmitMethod) {
				setTransmitMethod(transmitMethod);
			}
			
			public String getTransmitMethod()
			{
				return transmitMethod;
			}
			
			private void setTransmitMethod(String transmitMethod)
			{
				if(transmitMethod == "RF" || transmitMethod == "IF") {
					this.transmitMethod = transmitMethod;
				}
				else {
				this.transmitMethod = "RF";		
				}
			}
}
