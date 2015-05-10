package basic07.training03.match;

public class NumberMatchVO {
	int player, com, count;

	public int game(int com, int player){
		int result=0;
		if(getPlayer()==getCom()){
			System.out.println( getPlayer() + "정답 !!");
		
			result=1;
		}else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 "+getCom()+" 입니다.");
			result=0;
		}
		return result;
	}
	
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		
		if(player<1 || player>5 ){
			System.out.println("1부터 5 까지 정수만 입력해야 합니다.");
		}else{
			this.player = player;
		}
		
		
	}

	public int getCom() {
		return com;
	}

	public void setCom() {
		this.com = (int) ((Math.random()*5)+1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	//com=Math.random()*100+1;
}
