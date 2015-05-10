package java01.lang;

public class No4_MathRandomDemo2PraseOMatic {
	public static void main(String[] args) {
        //세종류의 단어 목록 만들기
        String[] flowerList = {"튤립", "카라", "아이리스", "장미" };
        String[] treeList = {"고무나무","소나무","단풍나무","떡갈나무"};
        String[] animalList = {"강아지","고양이","원숭이","호랑이"};
        //각 단어목록에 몇개가 들어있는지 확인
        System.out.println("꽃 리스트 개수 : "+flowerList.length);
        //난수 세개를 발생시키기
        int flowerRand = (int)(Math.random()*flowerList.length);
        int treeRand = (int)(Math.random()*treeList.length);
        int animalRand = (int)(Math.random()*flowerList.length);
        //구문작성
        String phrase = flowerList[flowerRand]+"\t" + treeList[treeRand]
                        +"\t"+ animalList[animalRand];
        System.out.println(phrase);
    }
}
