package assignment;

interface Camera {
	void takePhoto();
	
}
interface MusicPlayer{
	void playMusic();
}
interface SmartFeatures {
	void conectToWifi();
	
}
// class implementing multiple interface 
class SmartPhone implements Camera,MusicPlayer,SmartFeatures {
	public void takePhoto() {
		System.out.println("Photo Captuered Sucessfully");
	}
	public void playMusic() {
		System.out.println("Playing Music..");
	}
	public void conectToWifi() {
		System.out.println("Connected to Wifi");
	}
	
}

public class SmartDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone Phone = new SmartPhone();
		Phone.takePhoto();
		Phone.playMusic();
		Phone.conectToWifi();

	}

}
