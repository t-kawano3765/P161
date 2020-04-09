package game2;
import java.util.Random;
import java.util.Scanner;
public class Input2 {

	public int  computer() {  //computerメソッド
		Random random = new Random(); //乱数生成の準備
		int randamno = random.nextInt(2);//生成した乱数を変数randomnoに代入する

		return randamno; //戻り値として変数ranndomnoを返す
	}

	public int User() { //Userメソッド
		System.out.println("ユーザ側の手の番号を入力して下さい。1:グー  2:パー  3:チョキ");//左記（）内を出力

		Scanner scan = new Scanner(System.in); //標準入力の準備
		int userinput = scan.nextInt(); //標準入力した値をを変数uerinputに代入

		return userinput; //戻り値として変数userinputを返す

	}
}