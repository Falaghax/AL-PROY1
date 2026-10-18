
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de negocios a evaluar: ");
        int size = Integer.parseInt(tec.readLine());

        GridCreator grid = new GridCreator(size);

        for(int i = 0; i < size*size; i++){
            System.out.println("Ingrese la dependencia: " + i);
            grid.add(Double.parseDouble(tec.readLine()));
        }


        double[][] inverse = GridOperations.findInverse(GridOperations.calculateTecnologyMatrix(grid.grid));

        double[][] externals = new double[size][1];

        for(int i = 0; i < size; i++){
            externals[i][0] = Double.parseDouble(tec.readLine());
        }

        double[][] finals = GridOperations.multiplyGrids(inverse, externals);

        for (int i = 0; i < size; i++){
            System.out.println(finals[i][0]);
        }


        
    }
}