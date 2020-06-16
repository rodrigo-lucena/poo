import java.io.*;
public class Teste {
    public static void main(final String[] args){
        Cliente cliente2;
        FileOutputStream fluxo;
        FileInputStream fluxo2;
        
        Cliente c11=new Cliente("223454","Ana");
        Cliente c12=new Cliente("4434", "Joe");
        
        
        
        try{
            fluxo = new FileOutputStream("cliente.ser");
            final ObjectOutputStream objarq = new ObjectOutputStream(fluxo);
            objarq.writeObject(c11);
            objarq.writeObject(c12);
            objarq.close();
            System.out.println("Arquivo gravado");
        }
        catch (final FileNotFoundException e){
            e.printStackTrace();
        }
        catch(final IOException e){
            e.printStackTrace();
        }
        try {
            fluxo2 = new FileInputStream("cliente.ser");
            ObjectInputStream objarq2 = new ObjectInputStream(fluxo2);
            while(true){
                cliente2 = (Cliente) objarq2.readObject();
                System.out.println("Objeto lido \n "+cliente2);
            }
        } 
        catch (EOFException eofExc) {
            System.out.println("Chegou no fim da linha");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
       
    }
}