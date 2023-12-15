package hf.dp.SingletonPattern;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler uniqueInstance;  // volatile => 이 변수에 대해서는 어떠한 최적화 처리도 하지 않는다는 것 => 외부에서 값을 바꿀 수 있는 가능성이 있는 변수에서만 사용하게 되는데 이유는 컴파일러가 코드를 어떻게 짜든 자동적으로 최적화를 하는 기능이 있는데 이 과정에서 이 값이 변할 수 도 있기 때문에
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	} 
	
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			synchronized(ChocolateBoiler.class) { // 이 부분을 작성해 주지 않으면 멀티 스레드 환경에서 두개 이상의 스레드가 getInstance()를 하게 될 경우 두개의 인스턴스가 생겨버릴 수도 있음(동시성의 문제, thread unsafe)
				if (uniqueInstance == null) { // 더블 체크를 하는 이유 성능 저하를 완화 시키기 위함 하지만 완벽한 방법은 아님
					System.out.println("Creating unique instance of Chocolate Boiler");
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
		// fill the boiler with a milk/chocolate mixture
			empty = false;
			boiled = false; 
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
		// drain the boiled milk and chocolate
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
		// bring the contents to a boil
			boiled = true;
		}
	}
	
	public void reportBoilerState() {
		System.out.println("State: empty[" + empty + "] " + "boiled[" + boiled + "]");
	}
	
	public boolean isEmpty() { return empty; }
	public boolean isBoiled() { return boiled; }

} // public class ChocolateBoiler

