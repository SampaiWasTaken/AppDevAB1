fun main(args: Array<String>) {
    var v1 = Vehicle(1, "Bre", Brand("bmw", "germany oder so", "klingeling", "@me.com"), ArrayList(listOf<Workshop>(Workshop("test", "bre country", 9020, "bre city", "sus", "165"))), 5, 5, 5.0, 500.0 )
    v1.printInfo()
    v1.drive(20)
    println(v1.getWorkshop(9020))
    v1.printInfo()
}