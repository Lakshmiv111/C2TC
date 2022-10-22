package com.cg.shopping;

import java.util.Scanner;

public class Shopingcard {

	void electronics() {
		System.out.println("shoping elctronics");
	}

	void furniture() {
		System.out.println("shoping furniture");
	}

	void grosaries() {
		System.out.println("shoping  grosaries");
	}
}

class Electronics extends Shopingcard {
	void iphone() {

		System.out.println("**********ELECTRONICS**********");
		System.out.println("model 1: iphone");
		// System.out.println("select 1 to Buy or 2 to continue");
	}

	void vivo() {
		System.out.println("model 2: vivo");
	}

	void samsung() {
		System.out.println("model 3: samsung");
	}

	void sony() {
		System.out.println("model 4: sony");
	}

	void oppo() {
		System.out.println("model 5: oppo");
	}
}

class Iphone extends Electronics {
	void iphone3Gs() {

		System.out.println("model 1: iphone 3Gs");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 3Gs");
		else
			Shoping.shoppping();

	}

	void iphone4S() {
		System.out.println("model 2: iphone 4S ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 4S");
		else
			Shoping.shoppping();

	}

	void iphoneXR() {
		System.out.println("model 3: iphone XR ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone XR");
		else
			Shoping.shoppping();

	}

	void iphone5S() {
		System.out.println("model 4: iphone 5S");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 5S");
		else
			Shoping.shoppping();
	}

	void iphone12() {
		System.out.println("model 5: iphone12   ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 12");
		else
			Shoping.shoppping();

	}

	public void iphone11() {
		System.out.println("model 6: iphone11   ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 11");
		else
			Shoping.shoppping();

	}

	public void iphone13() {
		System.out.println("model 7: iphone13   ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 13");
		else
			Shoping.shoppping();

	}

	public void iphone10() {
		System.out.println("model 8: iphone10   ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 10");
		else
			Shoping.shoppping();

	}

	public void iphone15() {
		System.out.println("model 9: iphone15   ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("iphone 15");
		else
			Shoping.shoppping();

	}
}

class vivo extends Electronics {
	void vivo1920() {

		System.out.println("model 1: vivo1920");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("vivo1920");
		else
			Shoping.shoppping();
	}

	void vivoy21() {
		System.out.println("model 2:vivo y21 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("vivo y21");
		else
			Shoping.shoppping();

	}

	void vivoy75() {
		System.out.println("model 3:  vivo y75 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("vivo y75");
		else
			Shoping.shoppping();

	}

	void vivov23pro() {
		System.out.println("model 4: vivov y23 pro");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("vivo y23 pro");
		else
			Shoping.shoppping();

	}

	void vivoy15s() {
		System.out.println("model 5: vivo y15s  ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("vivo y15s");
		else
			Shoping.shoppping();

	}
}

class Samsung extends Electronics {
	void samsunggalaxy() {

		System.out.println("model 1: samsung galaxy");
		System.out.println("select 1 to Buy or 2 to continue");

		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("samsung galaxy");
		else
			Shoping.shoppping();
	}

	void samsungj7() {
		System.out.println("model 2:samsung j7");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("samsung j7");
		else
			Shoping.shoppping();

	}

	void samsunggalaxyA22() {
		System.out.println("model 3: samsung galaxy A22");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("samsung galaxy A22");
		else
			Shoping.shoppping();

	}

	void samsungcare() {
		System.out.println("model 4:samsung care+");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("samsung care+");
		else
			Shoping.shoppping();

	}

	void ssamsunggalaxyj5() {
		System.out.println("model 5:samsung galaxy j5 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("samsung galaxy j5");
		else
			Shoping.shoppping();

	}
}

class Sony extends Electronics {
	void sonya7() {

		System.out.println("model 1: sony a7");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("sony a7");
		else
			Shoping.shoppping();

	}

	void sonyAlpha850() {
		System.out.println("model 2:sony Alpha 850");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("sony Alpha 850");
		else
			Shoping.shoppping();

	}

	void sonyAlpha900() {
		System.out.println("model 3:sony Alpha 900");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("sony Alpha 900");
		else
			Shoping.shoppping();
	}

	void sonyAlpha55() {
		System.out.println("model 4:sony Alpha 55");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("sony Alpha 55");
		else
			Shoping.shoppping();
	}

	void sonyAlpha500() {
		System.out.println("model 5: sony Alpha 500 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("sony Alpha 500");
		else
			Shoping.shoppping();
	}
}

class Oopo extends Electronics {
	void oopoA31() {

		System.out.println("model 1:oopo A31 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("oopo A31");
		else
			Shoping.shoppping();
	}

	void oopoF15() {
		System.out.println("model 2:oopo F15");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("oopo F15");
		else
			Shoping.shoppping();
	}

	void oopoF19pro() {
		System.out.println("model 3:oopo F19 pro");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("oopo F19 pro");
		else
			Shoping.shoppping();
	}

	void oopoF17pro() {
		System.out.println("model 4:oopoF17pro");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("oopoF17pro");
		else
			Shoping.shoppping();
	}

	void oopoA92020() {
		System.out.println("model 5: oopo A9 2020");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("oopo A9 2020");
		else
			Shoping.shoppping();
	}
}

class Furniture extends Shopingcard {
	void chairs() {

		System.out.println("model 1: chairs");
	}

	void doores() {
		System.out.println("model 2: doores");
	}

	void tables() {
		System.out.println("model 3: tables");
	}

	void cuboards() {
		System.out.println("model 4: cubords");
	}

	void woddensofa() {
		System.out.println("model 5: woddensofa ");
	}
}

class Chairs extends Furniture {
	void chair1() {

		System.out.println("model 1: chair1");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("chair1");
		else
			Shoping.shoppping();
	}

	void chair2() {
		System.out.println("model 2: chair2");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("chair2");
		else
			Shoping.shoppping();
	}

	void chair3() {
		System.out.println("model 3: chair3");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("chair3");
		else
			Shoping.shoppping();
	}

	void chair4() {
		System.out.println("model 4: chair4");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("chair4");
		else
			Shoping.shoppping();
	}

	void chair5() {
		System.out.println("model 5: chair5 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("chair5");
		else
			Shoping.shoppping();
	}
}

class Doores extends Furniture {
	void door1() {

		System.out.println("model 1: door1");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("door1");
		else
			Shoping.shoppping();
	}

	void door2() {
		System.out.println("model 2: door2");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("door2");
		else
			Shoping.shoppping();
	}

	void door3() {
		System.out.println("model 3: door3");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("door3");
		else
			Shoping.shoppping();
	}

	void door4() {
		System.out.println("model 4: door4");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("door4");
		else
			Shoping.shoppping();
	}

	void door5() {
		System.out.println("model 5: door5 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("door5");
		else
			Shoping.shoppping();
	}
}

class Tables extends Furniture {
	void table1() {

		System.out.println("model 1: table1");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("table1");
		else
			Shoping.shoppping();
	}

	void table2() {
		System.out.println("model 2: table2");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("table2");
		else
			Shoping.shoppping();
	}

	void table3() {
		System.out.println("model 3: table3");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("table3");
		else
			Shoping.shoppping();
	}

	void table4() {
		System.out.println("model 4: table4");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("table4");
		else
			Shoping.shoppping();
	}

	void table5() {
		System.out.println("model 5: table5 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("table5");
		else
			Shoping.shoppping();
	}
}

class Cuboard extends Furniture {
	void cuboard1() {

		System.out.println("model 1: cuboard1");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cuboard1");
		else
			Shoping.shoppping();
	}

	void cuboard2() {
		System.out.println("model 2: cuboard2");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cuboard2");
		else
			Shoping.shoppping();
	}

	void cuboard3() {
		System.out.println("model 3: cuboard3");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cuboard3");
		else
			Shoping.shoppping();
	}

	void cuboard4() {
		System.out.println("model 4: cuboard4");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cuboard4");
		else
			Shoping.shoppping();
	}

	void cuboard5() {
		System.out.println("model 5: cuboard5 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cuboard5");
		else
			Shoping.shoppping();
	}
}

class Woddensofa extends Furniture {
	void woddensofa1() {

		System.out.println("model 1: woddensofa1");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("woddensofa1");
		else
			Shoping.shoppping();
	}

	void woddensofa2() {
		System.out.println("model 2: woddensofa2");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("woddensofa2");
		else
			Shoping.shoppping();
	}

	void woddensofa3() {
		System.out.println("model 3: woddensofa3");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("woddensofa3");
		else
			Shoping.shoppping();
	}

	void woddensofa4() {
		System.out.println("model 4: woddensofa4");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("woddensofa4");
		else
			Shoping.shoppping();
	}

	void woddensofa5() {
		System.out.println("model 5: woddensofa5 ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("woddensofa5");
		else
			Shoping.shoppping();
	}
}

class Grosaries extends Shopingcard {
	void dhal() {

		System.out.println("model 1: dhal");

	}

	void oil() {
		System.out.println("model 2: oil");

	}

	void species() {
		System.out.println("model 3: species");

	}

	void grams() {
		System.out.println("model 4: grams");

	}

	void floures() {
		System.out.println("model 5: floures");

	}
}

class Dhal extends Grosaries {
	void channadhal() {

		System.out.println("model 1:channa dhal ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("channa dhal");
		else
			Shoping.shoppping();
	}

	void mungbean() {
		System.out.println("model 2: mung bean");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("mung bean");
		else
			Shoping.shoppping();
	}

	void soybean() {
		System.out.println("model 3: soy bean");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("soy bean");
		else
			Shoping.shoppping();
	}

	void cowpea() {
		System.out.println("model 4: cow pea");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cow pea");
		else
			Shoping.shoppping();
	}

	void toordhal() {
		System.out.println("model 5: toor dhal ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("toor dhal");
		else
			Shoping.shoppping();
	}
}

class Oil extends Furniture {

	void freedomoil() {

		System.out.println("model 1:freedom oil ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("freedom oil ");
		else
			Shoping.shoppping();
	}

	void coconutoil() {
		System.out.println("model 2:coconut oil ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("coconut oil");
		else
			Shoping.shoppping();
	}

	void palmoil() {
		System.out.println("model 3:palm oil ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("palm oil");
		else
			Shoping.shoppping();
	}

	void Greapseedoil() {
		System.out.println("model 4: Greapseed oil");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("Greapseed oil");
		else
			Shoping.shoppping();
	}

	void almondoil() {
		System.out.println("model 5:almond oil");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("almond oil");
		else
			Shoping.shoppping();
	}
}

class Species extends Furniture {
	void pepper() {

		System.out.println("model 1:pepper ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("pepper");
		else
			Shoping.shoppping();
	}

	void Turmaric() {
		System.out.println("model 2: Turmaric");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("Turmaric");
		else
			Shoping.shoppping();
	}

	void cardamom() {
		System.out.println("model 3: cardamom");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cardamom");
		else
			Shoping.shoppping();
	}

	void cloves() {
		System.out.println("model 4:cloves ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cloves");
		else
			Shoping.shoppping();
	}

	void cuminseeds() {
		System.out.println("model 5: cumin seeds ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cumin seeds");
		else
			Shoping.shoppping();
	}
}

class Grams extends Furniture {
	void horsegrams() {

		System.out.println("model 1:horse grams ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("horse grams");
		else
			Shoping.shoppping();
	}

	void mothgram() {
		System.out.println("model 2:moth gram ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("moth gram");
		else
			Shoping.shoppping();
	}

	void blackgram() {
		System.out.println("model 3: black gram");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("black gram");
		else
			Shoping.shoppping();
	}

	void Greengram() {
		System.out.println("model 4: Green gram");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("Green gram");
		else
			Shoping.shoppping();
	}

	void splitgreengram() {
		System.out.println("model 5: split green gram  ");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("split green gram ");
		else
			Shoping.shoppping();
	}
}

class Floures extends Furniture {
	void cakeflour() {

		System.out.println("model 1: cake flour");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("cake flour");
		else
			Shoping.shoppping();
	}

	void wheatflour() {
		System.out.println("model 2: wheat flour");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("wheat flour");
		else
			Shoping.shoppping();
	}

	void glutenfreeflour() {
		System.out.println("model 3: gluten-free flour");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("gluten-free flour");
		else
			Shoping.shoppping();
	}

	void breadflour() {
		System.out.println("model 4: bread flour");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("bread flour");
		else
			Shoping.shoppping();
	}

	void midaflour() {
		System.out.println("model 5: mida flour");
		System.out.println("select 1 to Buy or 2 to continue");
		if (new Scanner(System.in).nextInt() == 1)
			Shoping.buy("mida flour");
		else
			Shoping.shoppping();
	}
}

 class Shoping {
	public static void buy(String str) {
		System.out.println("Thank you for purchasing " + str + ", Item will be delivered shortly");
	}

	public static void shoppping() {
		System.out.println("my name is Lakshmi V");
		System.out.println("laxmivuma@gmail.com");
		System.out.println("  ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. FOR ELECTRONICS");
		System.out.println("2. FOR FURNIUTRE");
		System.out.println("3. FOR GROSARIES");
		System.out.println("4. FOR CLOSE APPLICATION");
		int in = sc.nextInt();

		if (in == 1) {
			Electronics e = new Electronics();
			e.iphone();
			e.vivo();
			e.samsung();
			e.sony();
			e.oppo();
			System.out.println("Select modle number");
			int num = new Scanner(System.in).nextInt();
			if (num == 1) {
				Iphone i = new Iphone();
				i.iphone11();
				i.iphone12();
				i.iphone13();
				i.iphone10();
				i.iphone15();
			}
			if (num == 2) {
				vivo v = new vivo();
				v.vivo1920();
				v.vivov23pro();
				v.vivoy15s();
				v.vivoy21();
				v.vivoy75();
			}
			if (num == 3) {
				Samsung s = new Samsung();
				s.samsunggalaxy();
				s.samsungcare();
				s.samsunggalaxyA22();
				s.samsungj7();
				s.ssamsunggalaxyj5();
			}
			if (num == 4) {
				Sony y = new Sony();
				y.sonya7();
				y.sonyAlpha500();
				y.sonyAlpha55();
				y.sonyAlpha850();
				y.sonyAlpha900();
			}
			if (num == 5) {
				Oopo p = new Oopo();
				p.oopoA31();
				p.oopoA92020();
				p.oopoF15();
				p.oopoF17pro();
				p.oopoF19pro();
			}
		} else if (in == 2) {
			System.out.println("___________________________________");

			Furniture f = new Furniture();
			f.chairs();
			f.doores();
			f.tables();
			f.cuboards();
			f.woddensofa();

			System.out.println("Select Model number ");
			int a = new Scanner(System.in).nextInt();
			if (a == 1) {
				Chairs c = new Chairs();
				c.chair1();
				c.chair2();
				c.chair3();
				c.chair4();
				c.chair5();
			}
			if (a == 2) {
				Doores d = new Doores();
				d.door1();
				d.door2();
				d.door3();
				d.door4();
				d.door5();
			}
			if (a == 3) {
				Tables t = new Tables();
				t.table1();
				t.table2();
				t.table3();
				t.table4();
				t.table5();
			}

			if (a == 4) {
				Cuboard C = new Cuboard();
				C.cuboard1();
				C.cuboard2();
				C.cuboard3();
				C.cuboard4();
				C.cuboard5();
			}
			if (a == 5) {
				Woddensofa w = new Woddensofa();
				w.woddensofa1();
				w.woddensofa2();
				w.woddensofa3();
				w.woddensofa4();
				w.woddensofa5();
				System.out.println("___________________________________");
			}
		} else if (in == 3) {
			Grosaries g = new Grosaries();
			g.dhal();
			g.oil();
			g.species();
			g.grams();
			g.floures();
			System.out.println("select model number");
			int d = new Scanner(System.in).nextInt();
			if (d == 1) {
				Dhal l = new Dhal();
				l.channadhal();
				l.mungbean();
				l.cowpea();
				l.soybean();
				l.toordhal();
			}

			if (d == 2) {

				Oil O = new Oil();
				O.almondoil();
				O.coconutoil();
				O.freedomoil();
				O.Greapseedoil();
				O.palmoil();
			}
			if (d == 3) {
				Species S = new Species();
				S.cardamom();
				S.cuminseeds();
				S.cloves();
				S.pepper();
				S.Turmaric();
			}
			if (d == 4) {
				Grams G = new Grams();
				G.blackgram();
				G.Greengram();
				G.horsegrams();
				G.splitgreengram();
				G.mothgram();
			}
			if (d == 5) {
				Floures F = new Floures();
				F.breadflour();
				F.cakeflour();
				F.glutenfreeflour();
				F.midaflour();
				F.wheatflour();
			}
		} else if (in == 4) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		shoppping();

	}
}
	

