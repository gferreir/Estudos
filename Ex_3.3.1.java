class BalancoTrimestral{

	public static void main(String[] args){
		
		int jan = 15000;
		int fev = 23000;
		int mar = 17000;

		int gastoTrimestre = jan + fev + mar;
		int mediaMensal = gastoTrimestre / 3;

		System.out.println("O gasto do trimestre foi de: " + gastoTrimestre);

		System.out.println("O gasto médio mensal do trimestre foi de: " + mediaMensal);		

	}
}
