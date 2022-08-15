package 국밥계산기;
import java.util.Scanner;

public class GC {
    private String text;
    public static void main(String[] args) {
        int bowl;
        Scanner sc = new Scanner(System.in);
        System.out.println("국밥 가격을 정해주세요");
        int gukbap = sc.nextInt();
        System.out.println(" 먹고 싶은 음식을 적어주세요");
        String text = sc.next();
        System.out.println(text +"의 가격을 적어주세요");
        int food = sc.nextInt();
        bowl = food/gukbap;
        if(gukbap > food) {
            food = gukbap - food;
            text = "그 돈이면 차라리 " +food+"원 보태서 뜨끈~하고 든든~한 국밥 한 그릇 사먹고 말지";
        } else if(gukbap == food) {
            text = "그 돈이면 차라리 뜨끈~하고 든든~한 국밥 한 그릇 사먹고 말지";
        } else {
            text = "그 돈이면 뜨끈~하고 든든~한 국밥 "+bowl+"그릇은 사먹을 수 있겠다";
        }
        if(food >= 100000000) {
            text = "그 돈이면 차라리 국밥집을 하나 사고말지";
        }
       System.out.println(text);
    }
}