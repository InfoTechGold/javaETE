
public class matriz {
    public static void main(String[]args){
        
        int numeros[][]={{1,2,3},{4,5,6},{7,8,9}};
        int acumulo=0;
        double media=0;
        

        
        
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros.length;j++){
                
                acumulo+=numeros[i][j];
                System.out.print(numeros[i][j]);
               
            }
            media=acumulo/(numeros.length*3);
        }
        System.out.print(media);
    }
}
