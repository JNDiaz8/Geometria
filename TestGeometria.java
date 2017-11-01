public class TestGeometria{
	public static void main (String [] args){
		
		int lado = 5;
		int areaCuadrado = lado * lado;
		
	    int baseTriangulo = 6;
		int alturaTriangulo = 10;
		int areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
		
		int baseRectangulo = 8;
		int alturaRectangulo = 4;
		int areaRectangulo = baseRectangulo * alturaRectangulo;
		
		double radio = 5;
		double areaCirculo = radio *  radio * 3.14;
		
    int resultadoCuadrado = Geometria.areaCuadrado (areaCuadrado);
	System.out.println(" El area del cuadrado es: " + areaCuadrado);
	
	int resultadoTriangulo = Geometria.areaTriangulo (areaTriangulo);
	System.out.println(" El area del triangulo es: " + areaTriangulo);
	
	int resultadoRectangulo = Geometria.areaRectangulo (areaRectangulo);
	System.out.println(" El area del rectangulo es: " + areaRectangulo);
	
	double resultadoCirculo = Geometria.areaCirculo (areaCirculo);
	System.out.println(" El area del circulo es: " + areaCirculo);
	}
}
		