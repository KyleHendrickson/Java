class TrigTableRadDeg {

		public static void main (String args[]){
				double c, s, t;
				int d = 0;
				double r =0, rround = 0;
				double pi = 3.141592653589793238462643383279502884197169399375105820974;
				int i = 15;
				final long ms0, ms1;
					final float sec0, sec1;
				String undefined = "UN";
				System.out.println("radian measurement is represented as rad");
				System.out.println("\trad \t\t|\tcos\t|\tsin\t|\ttan" );
				while (d <= 360){
						r = d * (pi/180.0);
						c = Math.cos(r);
						c = Math.round(c*1000.0)/1000.0;
						s = Math.sin(r);
						s = Math.round(s*1000.0)/1000.0;
						t = Math.tan(r);
						t = Math.round(t*1000.0)/1000.0;
						rround = (Math.round(r*1000.0))/1000.0;
						
					if (c == 0.0)
						{ System.out.println("\t\t"+rround+ "\t|\t"+ c +"\t|\t"+ s + "\t|\t UN "); 
						}else{
						  System.out.println("\t\t"+rround+ "\t|\t"+ c +"\t|\t"+ s + "\t|\t" + t);
						}
					d = d + i;
				}
		}
}
