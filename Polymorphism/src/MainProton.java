
public class MainProton {

	public static void main(String[] args) {
		        Proton obj1 = new Proton();
		        System.out.println ("Proton Features:");
	    
	 	      //encapsulation
	 	        Proton s = new Proton();
		        s.setTyresize(10);
		        System.out.println(s.tyreSize);
		
		        s.setBrand("Continental");
		        System.out.println(s.getBrand());
		  
				ProtonSaga g = new ProtonSaga();
				System.out.println("Proton Saga features :- ");
				//s.fuel();
				s.printProton();
				s.sum(30000, 45000);
				s.run();
				
				System.out.println("\t");
				
				ProtonPersona p = new ProtonPersona();
				System.out.println("\nProton Persona features :- ");
				p.boot();
				p.printProton();
				p.run();	
				
				System.out.println("\t");
				
				ProtonX70 p1 = new ProtonX70();
				System.out.println("Proton X70 features :- ");
				p1.pilot();
				p1.printProton();
				p1.run();
				
				System.out.println("\t");
				
				ProtonX50 p2 = new ProtonX50();
				System.out.println("Proton X50 features :- ");
				p2.parking();
				p2.pilot();
				p2.printProton();
				p2.sum(79000, 85000, 103000);
				p2.run();
				
				
				
				

			}
	
	}


