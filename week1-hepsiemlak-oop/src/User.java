import java.util.ArrayList;

public class User {
    private UserType userType;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private ArrayList<Message> messages;
    private ArrayList<Advertisement> advertisements;
    private ArrayList<Advertisement> favorites;
    private ArrayList<RealEstate> realEstates;
    private ArrayList<RealEstate> filters;

    private User user;

    public User() {}

    public User(UserType userType, String name, String surname, String email, String phone) {
        this.userType = userType;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public ArrayList<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(ArrayList<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public ArrayList<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(ArrayList<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public ArrayList<Advertisement> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Advertisement> favorites) {
        this.favorites = favorites;
    }

    public ArrayList<RealEstate> getFilters() {
        return filters;
    }

    public void setFilters(ArrayList<RealEstate> filters) {
        this.filters = filters;
    }

    public void showMessageList() {
        for (Message m : messages) {
            System.out.println("Message Title: " + m.getMessageTitle()
                    +"\nMessage Description: " + m.getDescription()
                    +"\nMessage Sent Date: " +  m.getSentDate()
                    +"\nMessage Read Date: " +  m.getReadDate()
                    +"\nMessage Is Seen ?: " +  m.isSeen()
                    +"\nMessage Posting User: " +  m.getPostingUser()
                    +"\nMessage Domain User: " +  m.getDomainUser() + "\n");
        }
    }

    public void showAdvertisementList() {
        for (Advertisement a : advertisements) {
            System.out.println("Advertisement Type: " + a.getRealEstateType()
                    +"\nAdvertisement Title: " + a.getTitle()
                    +"\nAdvertisement Price: " + a.getPrice()
                    +"\nAdvertisement Duration Time: " + a.getDurationTime()
                    +"\nAdvertisement Listing Date: " + a.getListingDate()
                    +"\nAdvertisement Is Active ?: " + a.isActive()
                    +"\nAdvertisement Is Promotion?: " + a.isPromotion() + "\n");
        }
    }

    public void showRealEstateList() {
        for (RealEstate r : realEstates) {
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

    public void showFavorites() {
        User user = new User(UserType.INDIVIDUAL, "Ayşe", "Sarı", "ayse.sari@gmail.com", "02122222222");
        for (Advertisement fav : favorites) {
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

    public void showFilters() {
        for (RealEstate filters : filters) {
            if (filters.getTown().contains("İstanbul")
                    && (filters.getRooms().contains("2") || filters.getRooms().contains("3"))
                    && filters.getPrice() <= 3000) {
            System.out.println(filters.getTitle() + " - " +filters.getRooms() + " - " + filters.getPrice());
            } else {
                System.out.println("No results were found matching your search criteria.");
                break;
            }
        }
    }
}