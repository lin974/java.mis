package ex07;

public class BuildObject {                      //主類別
    public static void main(String[] args) {    //主程式
	    Rectangle rec1;            //宣告rec1物件　　　
        rec1 = new Rectangle();   	//建立rec1物件
        rec1.high = 20;             //設定rec1物件的high屬性值
        rec1.wide = 10.5;           //設定rec1物件的wide屬性值
        rec1.calArea();             //呼叫rec1物件的方法
        double r1_peri;       		//宣告變數r1_peri　
        r1_peri = rec1.getPeri(20, 10.5);  // 將周長傳回值指派給變數
        
        System.out.println("*** 矩形物件rec1 ***");
        System.out.println("高度 = " + rec1.high);
        System.out.println("寬度 = " + rec1.wide);
        System.out.println("面積 = " + rec1.area);
        System.out.println("周長 = " + r1_peri);
	}
}
