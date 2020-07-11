// dag 1-6
public class BmiCheck {
  public static void main (String[] args) {
    double lengte, gewicht, bmi;
    lengte = 1.75;
    gewicht = 75.0;
    bmi = gewicht/(lengte*lengte);
    // vergelijk BMI met grenzen: <18, >25, of ertussen in en print kleur
    if (bmi<18){
		System.out.println("kleur: geel");
	} else if (bmi<25){
		System.out.println("kleur: groen");
	} else {
		System.out.println("kleur: rood");
	}		
  }
}