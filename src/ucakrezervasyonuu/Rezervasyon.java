package ucakrezervasyonuu;
public class Rezervasyon {
	
	    private Musteri musteri;
	    private Ucus ucus;
	    private String rezervasyonNumarasi;

	    public Rezervasyon() {
	    }

	    public Rezervasyon(Musteri musteri, Ucus ucus, String rezervasyonNumarasi) {
	        this.musteri = musteri;
	        this.ucus = ucus;
	        this.rezervasyonNumarasi = rezervasyonNumarasi;
	    }

	    public Musteri getMusteri() {
	        return musteri;
	    }

	    public void setMusteri(Musteri musteri) {
	        this.musteri = musteri;
	    }

	    public Ucus getUcus() {
	        return ucus;
	    }

	    public void setUcus(Ucus ucus) {
	        this.ucus = ucus;
	    }

	    public String getRezervasyonNumarasi() {
	        return rezervasyonNumarasi;
	    }

	    public void setRezervasyonNumarasi(String rezervasyonNumarasi) {
	        this.rezervasyonNumarasi = rezervasyonNumarasi;
	    }
	}