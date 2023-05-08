package tareaobligatoria;

public class SalaDeCine {
	 private boolean[][] sala;

	    public SalaDeCine(int fila, int asiento) {
	    this.sala=new boolean [fila][asiento];

	    }

	    public boolean estaOcupada(int fila, int asiento) {
	        return this.sala[fila][asiento];
	    }

	    public void ocuparButaca(int fila, int asiento) {
	        if (!sala[fila][asiento])
	            sala[fila][asiento] = true;
	        else
	            System.err.print("La butaca está ocupada");
	    }

	    public int cantidadDeButacasOcupadas() {
	        int contar=0;
	        for (int i=0;i<sala.length;i++) 
	            for(int j = 0;j<sala[i].length;j++) 
	                if (sala[i][j]==true) 
	                    contar++;
	        return contar;
	    }

	    boolean hayEspacioPara(int fila ,int cantidadDePersonas) {
	        int contador = 0;
	            for(int j=0;j<this.sala[0].length;j++) {
	                if(this.sala[fila][j]==false) {
	                    contador++;
	                }
	            }
	            if (!(cantidadDePersonas < contador) || (cantidadDePersonas>= sala[0].length)) {
	                return false;
	            }

	            contador=0;
	        
	        return true;
	    }

	    public static void main(String[] args) {
	       
	    	SalaDeCine s1 = new SalaDeCine(8, 5);
	        s1.estaOcupada(2, 4);
	        s1.ocuparButaca(2, 1);
	        s1.ocuparButaca(2, 3);
	        s1.ocuparButaca(5, 3);
	        s1.ocuparButaca(3, 3);

	        System.out.println(s1.estaOcupada(2, 2));
	        System.out.println("La cantidad de butacas ocupadas es "+s1.cantidadDeButacasOcupadas()+" :D");
	        System.out.println(s1.hayEspacioPara(3, 4));
	        System.out.println(s1.hayEspacioPara(1, 4));
	    }
}
