/**
 * Created by gokcer on 31.1.2015.
 */
public interface IGirisimci extends IRaportor{

    public boolean tesvikHaberVer(String tesvikUrl);

    public IGirisimci kopyaOlustur();

    public String getUyeNo();
}
