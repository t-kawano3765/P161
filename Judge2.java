package game2;

public class Judge2 {

	public String judGement(int randomvarue,int userinput) { //mainメソッドから引数を変数randomvarue、userinputに代入
/*グーは１、チョキは２、パーは３と設定して、コンピューターとじゃんけんをするゲー
	ムです。コンピューターの手は１～３の数字を乱数で生成して決めます。次に自分の手を
	キーボードから入力します。コンピューターが選んだ 数と 自分の入力した 数を 比較して勝
	敗を判断します。*/
		
		String kekka="";  //各条件付けに合致した際のジャンケン結果を入れる為の変数
		String jyanken="";  //各条件付けに合致した際のCP側とユーザの出した手を入れる為の変数
		String lastanswer = "";
		int i=0;

		if (randomvarue== userinput ) {//条件randomvarueが１と同じでかつuserinputも1の時
			kekka = "引き分け";
			jyanken ="CP側グーVSユーザ側グーで";

		}
		else if (randomvarue==1  && userinput==2 ) {//条件randomvarueが１と同じでかつuserinputも2の時
			kekka = "ユーザの負け";
			jyanken ="CP側グーVSユーザ側チョキで";

		}
		else if (randomvarue==1  && userinput==3 ) {//条件randomvarueが１と同じでかつuserinputも3の時
			kekka = "ユーザの勝ち";
			jyanken ="CP側グーVSユーザ側パーで";

		}
		else if (randomvarue==2  && userinput==1) {//条件randomvarueが2と同じでかつuserinputも1の時
			kekka = "ユーザの勝ち";
			jyanken ="CP側チョキVSユーザ側グーで";

		}

		else if (randomvarue==2  && userinput==3) {//条件randomvarueが2と同じでかつuserinputも2の時
			kekka = "ユーザの負け";
			jyanken ="CP側チョキVSユーザ側パーで";

		}
		else if (randomvarue==3  && userinput==1) {//条件randomvarueが2と同じでかつuserinputも2の時
			kekka = "ユーザの負け";
			jyanken ="CP側パーVSユーザ側グーで";

		}
		else if (randomvarue==3  && userinput==2) {//条件randomvarueが2と同じでかつuserinputも2の時
			kekka =   "ユーザの勝ち";
			jyanken ="CP側ぱーVSユーザ側チョキ";

		}
		lastanswer =(jyanken+kekka);   // if (randomvarue==2  && userinput==3) {//条件randomvarueが2と同じでかつuserinputも3の時
		return lastanswer ;
	}
}


