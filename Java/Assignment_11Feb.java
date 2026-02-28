package capgemeini_training;
import java.io.*;
public class Assignment_11Feb {
     //call the non statc readline method of the bufferreader class
     //How to work with abstract class : by creating a child class and then creating an object of the child class
    public static void main(String[] args) throws IOException {
      //  Reader r=new Reader(); //cannot instantiate the type reader because it is abstract
try{
  FileReader f=new FileReader("Input");
  BufferedReader b=new BufferedReader(f);
  b.readLine();
  b.close();
} 
catch(FileNotFoundException e){
    System.out.println("File not found");
}

}
}
 