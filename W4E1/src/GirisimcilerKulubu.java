import java.util.Vector;

/**
 * Created by gokcer on 31.1.2015.
 */
public class GirisimcilerKulubu {
    public GirisimcilerKulubu(String ad) {
        this.ad = ad;
    }

    private String ad;
    Vector<IGirisimci> uyeler = new Vector<IGirisimci>();

    public void uyeEkle(IGirisimci IGirisimci) {
        uyeler.add(IGirisimci);
    }

    public void yeniTesvikHaberVer(String tesvikUrl) {
        for (IGirisimci IGirisimci : uyeler) {
            IGirisimci.tesvikHaberVer(tesvikUrl);
        }
    }

    public void denetle() {
        for (IGirisimci iGirisimci : uyeler) {
            if (iGirisimci instanceof IResmiDenetmen) {
                String sikintiDurumu = ((IResmiDenetmen) iGirisimci).sikintilariHaberVer();
                System.out.println(sikintiDurumu);
            }
        }
    }

    public void acemiceDenetle() {
        for (IGirisimci iGirisimci : uyeler) {
            String sikintiDurumu = ((IResmiDenetmen) iGirisimci).sikintilariHaberVer();
            System.out.println(sikintiDurumu);
        }
    }

    public Vector<IGirisimci> getUyeler() {
/*        Vector<IGirisimci> uyelerKopyasi = new Vector<IGirisimci>();
        for (IGirisimci iGirisimci : uyeler) {
            uyelerKopyasi.add(iGirisimci.kopyaOlustur());
        }
        */

        Vector<IGirisimci> uyelerShallowCopy = new Vector<IGirisimci>(uyeler);
        return uyelerShallowCopy;
    }
}
