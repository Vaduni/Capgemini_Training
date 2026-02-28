package capgemini;

import com.dk.String1;

class Downloader implements Runnable{
	String1 images;
	Downloader(String1 images){
		this.images=images;
}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("downloading"+images);
	}
}
public class ImageDownlaoder{
	public static void main(String1 args[]) {
		String1 images[]= {"image1","image2","image3"};
		for(int i=0;i<images.length;i++) {
			Downloader loader=new Downloader(images[i]);
			Thread thread=new Thread(loader);
			thread.start();
		}
	}
		}
