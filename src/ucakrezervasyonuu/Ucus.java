package ucakrezervasyonuu;

public class Ucus {
	private String kalkis;
    private String varis;
    private Date kalkisZamani;
    private Date varisZamani;
    private String ucusNumarasi;

    public Ucus() {
        // Boş yapıcı metod
    }

    public Ucus(String kalkis, String varis, Date kalkisZamani, Date varisZamani, String ucusNumarasi) {
        this.kalkis = kalkis;
        this.varis = varis;
        this.kalkisZamani = kalkisZamani;
        this.varisZamani = varisZamani;
        this.ucusNumarasi = ucusNumarasi;
    }

    public String getKalkis() {
        return kalkis;
    }

    public void setKalkis(String kalkis) {
        this.kalkis = kalkis;
    }

    public String getVaris() {
        return varis;
    }

    public void setVaris(String varis) {
        this.varis = varis;
    }

    public Date getKalkisZamani() {
        return kalkisZamani;
    }

    public void setKalkisZamani(Date kalkisZamani) {
        this.kalkisZamani = kalkisZamani;
    }

    public Date getVarisZamani() {
        return varisZamani;
    }

    public void setVarisZamani(Date varisZamani) {
        this.varisZamani = varisZamani;
    }

    public String getUcusNumarasi() {
        return ucusNumarasi;
    }

    public void setUcusNumarasi(String ucusNumarasi) {
        this.ucusNumarasi = ucusNumarasi;
    }
}
