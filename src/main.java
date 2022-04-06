
import java.io.*;



public class main {

    public static void main(String[] args) throws FileNotFoundException  {
        // write your code here

//File reading
//        byte data[]=new byte[11];
//        System.out.println("Please enter a word");
//        System.in.read(data);
//
//        for(int i=0;i<data.length;i++){
//            System.out.println((char) data[i]);
//        }



        //  Scanner get_input;
        //Reads file
        int i;
        FileInputStream word;
        FileOutputStream  edit1;
        try{
            word=new FileInputStream("C:\\Users\\Aaron\\Desktop\\NewTextDocument.txt");
            edit1=new FileOutputStream("C:\\Users\\Aaron\\Desktop\\NewText.txt",true);

        }
        catch(FileNotFoundException e){
            System.out.println("Error reading file"+e.getMessage());
            return;
        }
        try {
            do {
                i = word.read();
                if (i!= -1) {
                    System.out.print((char) i);
                    edit1.write((char) i);
                }
            }
            while(i!=-1);
        }
        catch(IOException IOE){
            System.out.print("Error Reading File");
            return;
        }

        //Writes to file

        FileOutputStream edit;
        try{
            edit=new FileOutputStream("C:\\Users\\Aaron\\Desktop\\NewText.txt",true);


            byte[] data;
            data = new byte[20];
            System.out.println("Please enter what you want to write the file with?");
            System.in.read(data);
            edit.write(data);
            edit.close();

        }
        catch(IOException IOE){
            System.out.print("Error Writing File");
            return;
        }

    }

}