class Kitchen{
    public static void main(String[] args){
        Toaster t = new Toaster("Chromster");
        System.out.println(t.name + " has a darkness setting of " + t.getDarkness());
        t.toast();
        Toaster t2 = new Toaster("PlastiToast");
        t2.isBagel = true;
        t2.setDarkness(890);
        t.setDarkness(-2);
        t2.toast();
        t.toast();
        System.out.println("------ Now we have an AIR FRYER!!!!");
        AirFryer fryer = new AirFryer("Clark Kent");
        fryer.slices = 12;
        fryer.isBagel = true;
        fryer.toast();
        fryer.fry();

    }
}