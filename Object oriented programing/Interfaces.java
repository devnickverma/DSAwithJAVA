public class Interfaces{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();  
        king k = new king();
        k.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Left, Right, Up, Down, Diagonal");
    }
} 

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Left, Right, Up, Down");
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("Left, Right, Up, Down, Diagonal (All by one step)");
    }
}
