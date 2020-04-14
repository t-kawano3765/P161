package game2;
import java.util.Scanner;
public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in); //標準入力の準備

		for (int i= 0; ; i++) {

			//while(true) {
			System.out.println("じゃんけんしましよう");  //左記（）内を出力
			System.out.println("ゲーム終了:0" + "   |   " +"つづける:1");  //左記（）内を出力
			int select = scan.nextInt(); //標準入力
			if (select ==1){ //条件 変数selectが１と同じ時
				System.out.println("1が選択されたのでジャンケンを開始します。");   ////左記（）内を出力

				Input2  input2 =  new Input2();//Inputクラスのインスタンス化
				int	randomvarue=  input2.computer();//computerメソッドへメッセージと戻り値の代入先
				randomvarue = randomvarue+1;   //乱数の１~３が必要な為０~２に対して+1した値を変数randomvarueに代入
				//System.out.println("コンピュータの手は"+randomvarue);   //左記（）内を出力する

				int userinput = input2.User();  //input2メソッドに対してメッセージも取り値を変数userinputに代入
				//
				System.out.println(userinput);//変数userinputを出力

				Judge2 judge =new Judge2(); // Judge2クラスのインスタンス化
				String answer= judge.judGement(randomvarue,userinput);  //judGementへメッセージと引数を送り戻り値を変数answerに代入
				System.out.println( answer);  //左記（）内を出力
				System.out.println(""); //一行分改行
			}

			if (select ==0) { //条件 変数selectが０と同じ時
				System.out.println("0が選択されたので終了します。");   //()内の内容を表示する
				break; //繰り返しから抜ける
			}
		}
	}
}