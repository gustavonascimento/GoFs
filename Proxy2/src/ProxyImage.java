
public class ProxyImage implements Image{

	private RealImage image;
	private String filename;
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}
	@Override
	public void displayImage() {
		if (image == null){
			image = new RealImage(filename);
		}
		image.displayImage();
	}
}
