package JavaActivity3;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double seconds= 1000000000;
		
		double EarthSeconds = 31557600;
		double MercurySeconds = 7600543.81992;
		double VenusSeconds = 19414149.052176;
		double MarsSeconds = 59354032.69008;
		double JupiterSeconds = 374355659.124;
		double SaturnSeconds = 929292362.8848;
		double UranusSeconds = 2651370019.3296;
		double NeptuneSeconds = 5200418560.032;
		
		System.out.println("Age on Mercury in Earthyears: " + seconds  / MercurySeconds);
        System.out.println("Age on Venus in Earthyears: " + seconds / VenusSeconds);
        System.out.println("Age on Earth in Earthyears: " + seconds / EarthSeconds);
        System.out.println("Age on Mars in Earthyears: " + seconds / MarsSeconds);
        System.out.println("Age on Jupiter in Earthyears: " + seconds / JupiterSeconds);
        System.out.println("Age on Saturn in Earthyears: " + seconds /  SaturnSeconds);
        System.out.println("Age on Uranus in Earthyears: " + seconds /  UranusSeconds);
        System.out.println("Age on Neptune in Earthyears: " + seconds / NeptuneSeconds);
    }

	}


