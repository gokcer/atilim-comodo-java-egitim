/**
 * Created by gokcer on 31.1.2015.
 */
public class RaportorAdapter implements IRaportor {
    private IGirisimci iGirisimci;

    public RaportorAdapter(IGirisimci iGirisimci) {
        this.iGirisimci = iGirisimci;
    }

    @Override
    public String raporVer() {
        // girişimciye sorular sor
        // drle topla formatla
        // yaz yolla
        // ödemeni al
        return "";
    }
}
