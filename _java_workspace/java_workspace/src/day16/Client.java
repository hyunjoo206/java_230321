package day16;

import java.util.Objects;

public class Client implements Comparable<Client> {
	private String name;
	private int age;
	private int price;
	
	public Client(String name, int age){
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getPrice() {
		if(age >= 15) {
			return price = 100;
		}else {
			return price =50;			
		}		
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "이름:"+name +", 나이:"+age+", 비용:"+price;
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, name, price);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return age == other.age && Objects.equals(name, other.name) && price == other.price;
	}



	@Override
	public int compareTo(Client o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
