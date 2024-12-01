package proj_bioskop;

public class Film {
    private String id_film;
    private String judul;
    private String sutradara;
    private float rating;
    private double harga;

    public Film(String id_film, String judul, String sutradara, float rating, double harga) {
        this.id_film = id_film;
        this.judul = judul;
        this.sutradara = sutradara;
        this.rating = rating;
        this.harga = harga;
    }

    public String getId_film() {
        return id_film;
    }

    public void setId_film(String id_film) {
        this.id_film = id_film;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    @Override
    public String toString() {
        return "Film{" +
                "idFilm='" + id_film + '\'' +
                ", judul='" + judul + '\'' +
                ", sutradara='" + sutradara + '\'' +
                ", rating=" + rating +
                ", harga=" + harga +
                '}';
    }
    
}