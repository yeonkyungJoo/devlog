package chap17;

interface TV2 {
	public void onTV();
}

class TVImpl2 implements TV2 {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer2 {
	public void dataReceive();
}

class ComputerImpl2 {
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV2 implements TV2, Computer2 {
	
//	ComputerImpl2 comp = new ComputerImpl2();
//	TVImpl2 tv = new TVImpl2();
	
	public void onTV() {
		System.out.println("영상 출력 중");
	}
	
//	public void onTV() {
//		tv.onTV();
//	}
	
	
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
//	public void dataReceive() {
//		comp.dataReceive();
//	}
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class Ex1_1 {

	public static void main(String[] args) {
		
		IPTV2 iptv = new IPTV2();
		iptv.powerOn();
		
//		TV2 tv = iptv;
//		Computer2 comp = iptv;
	}
}
