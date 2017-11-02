/**Generamos documentacion para el archivopubli
test geometria
@author Joaquin Diaz
@version 1.0
*/
public class TestGeometria{
	public static void main (String [] args){
		
    int resultadoCuadrado = Geometria.calculaAreaCuadrado (5);
	System.out.println(" El area del cuadrado es: " + resultadoCuadrado);
	
	int resultadoTriangulo = Geometria.calculaAreaTriangulo (6,10);
	System.out.println(" El area del triangulo es: " + resultadoTriangulo);
	
	int resultadoRectangulo = Geometria.calculaAreaRectangulo (8,4);
	System.out.println(" El area del rectangulo es: " + resultadoRectangulo);
	
	double resultadoCirculo = Geometria.calculaAreaCirculo (5);
	System.out.println(" El area del circulo es: " + resultadoCirculo);
	}
}
		