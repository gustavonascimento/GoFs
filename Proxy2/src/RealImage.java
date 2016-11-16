
public class RealImage implements Image {

	private String filename;
	
	public RealImage(String filename){
		this.filename = filename;
	}
	
	private void loadImageFromDisk(){
		System.out.println("Loading " + filename);
	}
	
	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
}
