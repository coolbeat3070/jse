package oop01.encapsule;

public class NumberMatchService {
	NumberMatchVO vo = new NumberMatchVO();
	int player;
	public int game(int player){
		int result;
		vo.setCom();
		vo.setPlayer(player);
		if(vo.getPlayer()==vo.getCom()){
			
			System.out.println( vo.getPlayer() + "정답 !!");
			result = 1;
		}else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 "+vo.getCom()+" 입니다");
			result = 0;
		}
		return result;
		
	}
}
