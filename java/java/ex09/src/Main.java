// 1. Instrument 抽象類別
abstract class Instrument {
    protected String instrumentName;

    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName; // 指定 instrumentName
    }

    public String getInstrumentName() {
        return instrumentName; // 回傳 instrumentName
    }

    public abstract void playSound(); // 子類別應該要實作這個方法
}

// 2. Playable 介面
interface Playable {
    void playNote(String note); // 定義彈奏音符的方法
}

// 3. 具體樂器類別
class Piano extends Instrument implements Playable {
    public Piano() {
        super("鋼琴");
    }

    @Override
    public void playSound() {
        System.out.println("鋼琴發出優美的琴聲");
    }

    @Override
    public void playNote(String note) {
        System.out.println("鋼琴彈奏音符: " + note);
    }
}

class Guitar extends Instrument implements Playable {
    public Guitar() {
        super("吉他");
    }

    @Override
    public void playSound() {
        System.out.println("吉他發出清脆的弦音");
    }

    @Override
    public void playNote(String note) {
        System.out.println("吉他彈奏音符: " + note);
    }
}

class Violin extends Instrument implements Playable {
    public Violin() {
        super("小提琴");
    }

    @Override
    public void playSound() {
        System.out.println("小提琴發出悠揚的琴聲");
    }

    @Override
    public void playNote(String note) {
        System.out.println("小提琴演奏音符: " + note);
    }
}

// 4. 主程式類別
public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3]; // 宣告陣列

        instruments[0] = new Piano();
        instruments[1] = new Guitar();
        instruments[2] = new Violin();

        String[] notes = { "Do", "Re", "Mi" }; // 要演奏的音符

        System.out.println("--- 樂團開始演奏 ---");

        for (int i = 0; i < instruments.length; i++) {
            Instrument inst = instruments[i];

            System.out.println("樂器名稱: " + inst.getInstrumentName());
            inst.playSound();

            if (inst instanceof Playable && i < notes.length) {
                ((Playable) inst).playNote(notes[i]);
            }

            System.out.println("---");
        }

        System.out.println("--- 樂團演奏結束 ---");
    }
}
