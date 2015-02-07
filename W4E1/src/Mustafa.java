/**
 * Created by gokcer on 31.1.2015.
 */
public class Mustafa extends AbstractHumanGirisimci implements IGirisimci, IResmiDenetmen {

    private String denetmenId;

    RaportorAdapter raportorAdapter;

    public Mustafa() {
        raportorAdapter = new RaportorAdapter(this);
    }

    public boolean tesvikHaberVer(String tesvik) {

        return true;
    }

    @Override
    public IGirisimci kopyaOlustur() {
        IGirisimci clone = null;
        try {
            clone = (IGirisimci) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String getGenetmenId() {
        return denetmenId;
    }

    @Override
    public String sikintilariHaberVer() {
        return "Bir sey yok!";
    }

    @Override
    public void denetlemeSeviyesiAta(int seviye) {
        //
    }

    @Override
    public String raporVer() {
        return raportorAdapter.raporVer();
    }
}
