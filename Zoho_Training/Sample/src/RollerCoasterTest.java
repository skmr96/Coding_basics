//$Id$

public class RollerCoasterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int groups[] = {1,2,4,1};
		RollerCoaster r = new RollerCoaster(4,4,6);
		
		r.setGroupsInQueue(groups);
		r.findCost();
		System.out.println(r.getRideCost(1));
		System.out.println(r.getRideCost(2));
		System.out.println(r.getRideCost(3));
		System.out.println(r.getRideCost(4));
		System.out.println(r.getEarnedMoney()+" Euros");

	}

}
