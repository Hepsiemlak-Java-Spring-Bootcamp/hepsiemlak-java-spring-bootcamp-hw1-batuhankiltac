import java.util.ArrayList;

public class RealEstate extends Advertisement {
    private String province;
    private String town;
    private String rooms;
    private int size;
    private int floor;

    public RealEstate(RealEstateType realEstateType, String title, int price, String durationTime, String listingDate, boolean isActive, boolean isPromotion, String province, String town, String rooms, int size, int floor) {
        super(realEstateType, title, price, durationTime, listingDate, isActive, isPromotion);
        this.province = province;
        this.town = town;
        this.rooms = rooms;
        this.size = size;
        this.floor = floor;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public static ArrayList<RealEstate> prepareRealEstate() {
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

    public static void showRealEstateList() {
        for (RealEstate r : prepareRealEstate()) {
            System.out.println("Real Estate Type: " + r.getRealEstateType()
                    + "\nReal Estate Title: " + r.getTitle()
                    + "\nReal Estate Price: " + r.getPrice()
                    + "\nReal Estate Duration Time: " + r.getDurationTime()
                    + "\nReal Estate Listing Date: " + r.getListingDate()
                    + "\nReal Estate Is Active ?: " + r.isActive()
                    + "\nReal Estate Is Promotion?: " + r.isPromotion()
                    + "\nReal Estate Province: " + r.getProvince()
                    + "\nReal Estate Town: " + r.getTown()
                    + "\nReal Estate Rooms: " + r.getRooms()
                    + "\nReal Estate Size: " + r.getSize()
                    + "\nReal Estate Floor: " + r.getFloor() + "\n");
        }
    }
}