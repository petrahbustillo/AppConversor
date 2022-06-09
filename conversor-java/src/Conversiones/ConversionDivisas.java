package Conversiones;

import javax.swing.JOptionPane;

public class ConversionDivisas extends Conversion {
		
	private String tipoConversion;
		
		public String selectTipoConversion() {
			this.tipoConversion = (JOptionPane.showInputDialog(null,"Selecciona la divisa que desea convertir su dinero","Divisas", 
					  JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							  "De Pesos a Dólar",
							  "De Pesos a Euros",
							  "De Pesos a Libras Esterlinas",
							  "De Pesos a Yen Japonés",
							  "De Pesos a Won Surcoreano",
							  "De Dólar a Pesos",
							  "De Euros a Pesos",
							  "De Libras Esterlinas a Pesos",
							  "De Yen Japonés a Pesos",
							  "De Won Surcoreano a Pesos",
					  },"De Pesos a Dólar")).toString();
			return tipoConversion;
		}
		
		public double calculoConversion(String tipoConversion, double cantidad) {
			
			switch (tipoConversion) {
			case "De Pesos a Dólar":
				cantidad = cantidad / 3.8;
				
				break;
				
			case "De Pesos a Euros":
				cantidad = cantidad / 2.0;
				
				break;
				
			case "De Pesos a Libras Esterlinas":
				cantidad = cantidad / 3.6;
				
				break;
				
			case "De Pesos a Yen Japonés":
				cantidad = cantidad / 1.08;
				
				break;
				
			case "De Pesos a Won Surcoreano":
				cantidad = cantidad / 10.31;
				
				break;
				
			case "De Dólar a Pesos":
				cantidad = cantidad * 3.8;
				
				break;
				
			case "De Euros a Pesos":
				cantidad = cantidad * 2.0;
				
				break;
				
			case "De Libras Esterlinas a Pesos":
				cantidad = cantidad * 3.6;
				
				break;
				
			case "De Yen Japonés a Pesos":
				cantidad = cantidad * 1.08;
				
				break;
				
			case "De Won Surcoreano a Pesos":
				cantidad = cantidad * 10.31;
				
				break;
				

			default:
				break;
			}
			return cantidad;
			
		}

}
