public class GridCreator {
    public double [][] grid;
    private int currentSpace;
    private int size;

    public GridCreator(int size) {
        this.size = size;
        this.grid = new double[size][size];
        this.currentSpace = 0;
    }

    public void add(double element){
        if (currentSpace >= size*size) return;
        int row = currentSpace / size;
        int column = currentSpace++ % size;

        System.out.println(row + ", " + column);

        grid[row][column] = element;
    }

    
}