import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

/**
 * Created by gokcer on 31.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        GirisimcilerKulubu kulup = new GirisimcilerKulubu("Atılımlılar");

        Mert mert= new Mert();
        Mustafa mustafa = new Mustafa();
        Ozan ozan = new Ozan();
        Deniz deniz = new Deniz();

        kulup.uyeEkle(mustafa);
        kulup.uyeEkle(mert);

        //kulup.yeniTesvikHaberVer("http://tesvik.tubitak.gov.tr/tesvik/12345");

        Vector<IGirisimci> uyeler = kulup.getUyeler();



        for (IGirisimci iGirisimci : uyeler) {
            int a = 1; // rastgele metod
        }





        Main main = new Main();
        main.start();


    }

    public void start() {
        JPanel panel = new JPanel();
        Frame frame = new Frame();
        panel.addMouseListener(new MyMouseListener());
    }

    public class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Fare tıklandı. Tıklama koordinatı: "+e.getPoint());
        }
    }






























    public class CommonMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


}
