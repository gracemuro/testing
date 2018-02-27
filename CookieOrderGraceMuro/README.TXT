        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1000));
        goodies.addOrder(new CookieOrder("Shortbread", 10));
        goodies.addOrder(new CookieOrder("Macaroon", 10));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        
        System.out.println( "Old order \n" + goodies );
        System.out.println( "Total boxes: " + goodies.getTotalBoxes() );
        System.out.println( "Number removed: " + goodies.removeVariety( "Chocolate Chip" ) + "\n");
        System.out.println( "New order \n" + goodies );
        System.out.println( "Total boxes: " + goodies.getTotalBoxes() );
