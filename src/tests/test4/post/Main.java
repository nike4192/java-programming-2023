package tests.test4.post;

public class Main {
    public static void main(String[] args) {
        PackageShipment packageShipment = new PackageShipment(
            "Primorskiy kray, Vladivostok, Volodarskogo, bld. 19",
            "Respublika Tatarstan, Kazan, Adoratskogo Ul., bld. 45, appt. 81",
            0.8
        );

        Page orderedLetter = new Page("Ordered letter", "Many Manufacturing, Inc. ...");
        Page postcard = new Page("Postcard", "Dear Grandma, ...");

        packageShipment.addPage(orderedLetter);
        packageShipment.send();

        packageShipment.addPage(postcard);  // Don't add, because already send

        packageShipment.printInfo(true);
    }
}
