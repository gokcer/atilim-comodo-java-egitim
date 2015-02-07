/**
 * Created by gokcer on 31.1.2015.
 */
public class Mert  extends Human implements IGirisimci {

    private String uyeNo;
    @Override
    public boolean tesvikHaberVer(String tesvikUrl) {
        // şu an için bir şey yapma
        return false;
    }

    @Override
    public IGirisimci kopyaOlustur() {
        IGirisimci clone = null;
        try {
            clone = (IGirisimci)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String getUyeNo() {
        return uyeNo;
    }

    @Override
    public String raporVer() {
        return "kendi raporum";
    }
}
