package section34_JavaOOP_Part1_basics.samples;

import section34_JavaOOP_Part1_basics.interfaces.CentralTraffic;
import section34_JavaOOP_Part1_basics.interfaces.ContinentalTraffic;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object for AustralianTraffic
		// to implement methods presenting in CentralTraffic interface
		CentralTraffic centralTraffic = new AustralianTraffic();  
		centralTraffic.redStop();
		centralTraffic.greenGo();
		centralTraffic.yellowFlash();
		
		AustralianTraffic australianTraffic = new AustralianTraffic();
		australianTraffic.walkOnSymbol();
		
		ContinentalTraffic continentalTraffic = new AustralianTraffic();  
		continentalTraffic.trainSymbol();
		
		australianTraffic.redStop();
		australianTraffic.trainSymbol();
//		centralTraffic.trainSymbol();		//Error
	}
	
	public void walkOnSymbol() {
		System.out.println("walking");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("yellowFlash implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
