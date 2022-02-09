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

    public static void showAdvertisementList() {
        for (Advertisement a : prepareAdvertisement()) {
            System.out.println("Advertisement Type: " + a.getRealEstateType()
                    +"\nAdvertisement Title: " + a.getTitle()
                    +"\nAdvertisement Price: " + a.getPrice()
                    +"\nAdvertisement Duration Time: " + a.getDurationTime()
                    +"\nAdvertisement Listing Date: " + a.getListingDate()
                    +"\nAdvertisement Is Active ?: " + a.isActive()
                    +"\nAdvertisement Is Promotion?: " + a.isPromotion() + "\n");
        }
    }

    public static ArrayList<Advertisement> prepareFavoriteAdvertisement() {
        ArrayList<Advertisement> favorites = new ArrayList<>();
        favorites.add(new Advertisement(RealEstateType.RENT, "Ortaköy 1+1 Kiralık", 3000, "30 Days", "02.02.2022", true, false));
        favorites.add(new RealEstate(RealEstateType.RENT, "Nizip 1+1 Kiralık", 1000, "30 Days", "28.09.2022", true, false,  "Güney Doğu Anadolu", "Gaziantep", "1+1", 60, 3));
        favorites.add(new Advertisement(RealEstateType.RENT, "Sefaköy 1+1 Kiralık", 1800, "30 Days", "02.02.2022", true, false));
        favorites.add(new RealEstate(RealEstateType.SALE, "Levent 1+1 Satılık", 1400000, "30 Days", "17.01.2022", true, true,  "Marmara", "İstanbul", "1+1", 55, -2));
        return favorites;
    }

    public static void showFavoriteAdvertisement() {
        User user = new User(UserType.INDIVIDUAL, "Ayşe", "Sarı", "ayse.sari@gmail.com", "02122222222");
        for (Advertisement fav : prepareFavoriteAdvertisement()) {
            if (user.getEmail().equals("ayse.sari@gmail.com")) {
                System.out.println("Favorite Type: " + fav.getRealEstateType()
                        +"\nFavorite Title: " + fav.getTitle()
                        +"\nFavorite Price: " + fav.getPrice()
                        +"\nFavorite Listing Date: " + fav.getListingDate() + "\n");
            } else {
                System.out.println("Wrong email address.");
            }
        }
    }
}