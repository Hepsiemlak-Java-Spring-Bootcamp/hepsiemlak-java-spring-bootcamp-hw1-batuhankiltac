public class Main {

    public static void main(String[] args) {
        //User company = new User(UserType.COMPANY, "REMAX", "LTD.", "sube@remax.com", "02161234567");
        User user = new User(UserType.INDIVIDUAL, "Ayşe", "Sarı", "ayse.sari@gmail.com", "02122222222");

        System.out.println("\n- MESSAGE LIST -");
        user.setMessages(Message.prepareMessageBox());
        user.showMessageList();

        System.out.println("\n- FAVORITE LIST -");
        user.setFavorites(Advertisement.prepareFavoriteAdvertisement());
        user.showFavorites();

        System.out.println("\n- FILTER LIST -");
        user.setFilters(Advertisement.prepareFilter());
        user.showFilters();

        System.out.println("\n- ADVERTISEMENT LIST OF HEPSIEMLAK.COM -");
        user.setAdvertisements(Advertisement.prepareAdvertisement());
        user.showAdvertisementList();

        System.out.println("\n- REAL ESTATE LIST OF HEPSIEMLAK.COM -");
        user.setRealEstates(RealEstate.prepareRealEstate());
        user.showRealEstateList();
    }
}