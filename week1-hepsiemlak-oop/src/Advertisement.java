import java.util.ArrayList;

public class Advertisement {
    private RealEstateType realEstateType;
    private String title;
    private int price;
    private String durationTime;
    private String listingDate;
    private boolean isActive;
    private boolean isPromotion;

    public Advertisement(RealEstateType realEstateType, String title, int price, String durationTime, String listingDate, boolean isActive, boolean isPromotion) {
        this.realEstateType = realEstateType;
        this.title = title;
        this.price = price;
        this.durationTime = durationTime;
        this.listingDate = listingDate;
        this.isActive = isActive;
        this.isPromotion = isPromotion;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }

    public String getListingDate() {
        return listingDate;
    }

    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(boolean promotion) {
        isPromotion = promotion;
    }

    public static ArrayList<Advertisement> prepareAdvertisement() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        advertisements.add(new Advertisement(RealEstateType.SALE, "Beşiktaş 3+1 Satılık", 3000000, "30 Days", "11.12.2021", true, false));
        advertisements.add(new Advertisement(RealEstateType.RENT, "Şişli 2+1 Kiralık", 4000, "30 Days", "12.01.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.RENT, "Avcılar 2+1 Kiralık", 2500, "30 Days", "12.01.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.SALE, "Beylikdüzü 3+1 Satılık", 950000, "30 Days", "11.12.2021", true, false));
        advertisements.add(new Advertisement(RealEstateType.RENT, "Sefaköy 1+1 Kiralık", 1800, "30 Days", "02.02.2022", true, false));
        advertisements.add(new Advertisement(RealEstateType.SALE, "Bahçelievler 1+1 Satılık", 500000, "30 Days", "17.01.2022", true, false));
        return advertisements;
    }

    public static ArrayList<Advertisement> prepareFavoriteAdvertisement() {
        ArrayList<Advertisement> favorites = new ArrayList<>();
        favorites.add(new Advertisement(RealEstateType.RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false));
        favorites.add(new RealEstate(RealEstateType.RENT, "Nizip 1+1 Kiralık", 1000, "30 Days", "28.09.2022", true, false,  "Güney Doğu Anadolu", "Gaziantep", "1+1", 60, 3));
        favorites.add(new Advertisement(RealEstateType.RENT, "Sefaköy 1+1 Kiralık", 1800, "30 Days", "02.02.2022", true, false));
        favorites.add(new RealEstate(RealEstateType.SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, true,  "Marmara", "İstanbul", "1+1", 55, -2));
        return favorites;
    }

    public static ArrayList<RealEstate> prepareFilter() {
        ArrayList<RealEstate> realEstates = new ArrayList<>();
        realEstates.add(new RealEstate(RealEstateType.SALE, "Beşiktaş 3+1 Satılık", 3000000, "30 Days", "11.12.2021", true, false, "Marmara", "İstanbul", "3+1", 135, 5));
        realEstates.add(new RealEstate(RealEstateType.RENT, "Şişli 2+1 Kiralık", 4000, "30 Days", "12.01.2022", true, false,  "Marmara", "İstanbul", "2+1", 85, 3));
        realEstates.add(new RealEstate(RealEstateType.SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, true,  "Marmara", "İstanbul", "1+1", 55, -2));
        realEstates.add(new RealEstate(RealEstateType.RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false,  "Marmara", "İstanbul", "1+1", 60, 0));
        realEstates.add(new RealEstate(RealEstateType.SALE, "Yeni Mahalle 3+1 Satılık", 2000000, "30 Days", "15.01.2022", true, false, "İç Anadolu", "Ankara", "3+1", 115, 8));
        realEstates.add(new RealEstate(RealEstateType.RENT, "Urla 2+1 Kiralık", 2500, "30 Days", "02.06.2022", true, false,  "Ege", "İzmir", "2+1", 90, 1));
        realEstates.add(new RealEstate(RealEstateType.SALE, "Fethiye 1+1 Satılık", 350000, "30 Days", "23.04.2022", true, true,  "Ege", "Muğla", "1+1", 70, 2));
        realEstates.add(new RealEstate(RealEstateType.RENT, "Nizip 1+1 Kiralık", 1000, "30 Days", "28.09.2022", true, false,  "Güney Doğu Anadolu", "Gaziantep", "1+1", 60, 3));
        return realEstates;
    }
}