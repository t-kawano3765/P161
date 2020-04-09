package game2;

public class Judge2 {

	public String judGement(int randomvarue,int userinput) { //mainメソッドから引数を変数randomvarue、userinputに代入

		String kekka;  //各条件付けに合致した際のジャンケン結果を入れる為の変数
		String jyanken;  //各条件付けに合致した際のCP側とユーザの出した手を入れる為の変数
		if (randomvarue==1  && userinput==1 ) {//条件randomvarueが１と同じでかつuserinputも1の時
			kekka = "引き分け";
			jyanken ="CP側グーVSユーザ側グーで";
		}
		else if (randomvarue==1  && userinput==2 ) {//条件randomvarueが１と同じでかつuserinputも2の時
			kekka = "CPの負け";
			jyanken ="CP側グーVSユーザ側パーで";
		}
		else if (randomvarue==1  && userinput==3 ) {//条件randomvarueが１と同じでかつuserinputも3の時
			kekka = "CPの勝ち";
			jyanken ="CP側グーVSユーザ側チョキで";
		}
		else if (randomvarue==2  && userinput==1) {//条件randomvarueが2と同じでかつuserinputも1の時
			kekka = "ユーザの負け";
			jyanken ="CP側グーVSユーザ側パーで";
		}
		else if (randomvarue==2  && userinput==2) {//条件randomvarueが2と同じでかつuserinputも2の時
			kekka = "引き分け";
			jyanken ="CP側パーVSユーザ側パーで";
		}
		else{// if (randomvarue==2  && userinput==3) {//条件randomvarueが2と同じでかつuserinputも3の時
			kekka = "ユーザの勝利";
			jyanken ="CP側パーVSユーザ側チョキで";
		}
		String lastanswer = (jyanken+kekka);
		return lastanswer ;
	}
}

//		if (randomvarue==1) {//生成された乱数が１の時
//		System.out.println("コンピュータ側"+randomvarue+":  グー"); //"コンピュータ側"+randomvarue+":  グー"を出力
//	}
//	else if (randomvarue==2) {//生成された乱数が２の時
//		System.out.println(("コンピュータ側"+randomvarue+":  パー"); //"コンピュータ側"+randomvarue+":  パー"を出力
//	}
//	else if (randomvarue==3) {//生成された乱数が３の時
//		System.out.println(("コンピュータ側"+randomvarue+":  チョキ");  //"コンピュータ側"+randomvarue+":  チョキ"を出力
//	}
