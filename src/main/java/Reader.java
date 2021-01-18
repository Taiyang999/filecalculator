import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public File myf;
    public String operation;

    public Reader(File f, String op){
        this.myf = f;
        this.operation = op;
    }

    public void exec(){
        try {
            Scanner myReader = new Scanner(this.myf);
            int res = 0;
            String output = "";
            String operateur = "";
            if(this.operation.equals("+")){
                operateur = "addition";
            }else{
                operateur="multiplication";
            }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int line = Integer.parseInt(data);
                if(res == 0) {
                    if(operateur.equals("addition")){
                        res+=line;
                    }else{
                        res=1;
                        res*=line;}
                    System.out.println(res);}
                else{
                    if(operateur.equals("addition")){
                        res+=line;
                    }else{
                        res*=line;}
                    output = this.operation + line + "(=" + res +")";
                    System.out.println(output);
                }

            }
            for (int i = 0 ; i < output.length();i++){
                System.out.print("-");
            }
            System.out.println("\ntotal = "+res+"("+operateur+")");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
