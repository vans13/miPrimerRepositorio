
package empleado;


public class Empleado {
  float horasN, horasE;
  String nom;
  public Empleado(String nombre, float horas,float horasEx ){
      horasN=horas;
      horasE=horasEx;
      nom=nombre;
  }
  
  public float calcular(){
      float sueldo, sueldo2, valorE=0;
      if(horasE<10){
          valorE=horasE*7000;
      }else{
          valorE=horasE*7000+((horasE-10)*8500);
      }
      sueldo=(horasN*6000)+valorE;
      return sueldo;
  }
}
