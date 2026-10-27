// Extracted Java code snippet 11 from the supplied notes.
import java.io.ByteArrayInputStream;
public class newdemo {
public static void main(String argv[]){
String content = "You may freely edit this file.";
byte [] bObj = content.getBytes();
ByteArrayInputStream inputByte = new ByteArrayInputStream(bObj);
int contentVal;
for(int y = 0 ; y < 1; y++) {
while(( contentVal = inputByte.read())!= -1) {
System.out.print(Character.toUpperCase((char)contentVal));
}
}
}
}
