class Vehicle constructor(myID: Int, myName: String, myBrand: Brand, myWorkshop: ArrayList<Workshop>, myWeight: Int, mymaxPermissableWeight: Int, mySpeed: Double, myMaxSpeed: Double){
    /*
    private int id
private String name
private Brand brand
private ArrayList<Workshop> workshops
private int weight
private int maxPermissableWeight
private double speed
private double maxSpeed
     */
    var  id = myID
    var name = myName
    var  brand = myBrand
    var workshops = myWorkshop
    var  weight = myWeight
    var  maxPermissableWeight = mymaxPermissableWeight
    var speed = mySpeed
    var maxSpeed = myMaxSpeed

    fun accelerate(): Double{
        speed+=10
        if (speed > maxSpeed){
            speed = maxSpeed
        }
        return speed
    }
    fun brake(): Double{
        speed-=10
        if (speed < 0){
            speed = 0.0
        }
        return speed
    }

    fun drive(kilometers: Int){
        for (n in 1..kilometers){
            accelerate()
            brake()
            accelerate()
            brake()
            accelerate()
            brake()
        }
    }
    fun printInfo(){
        println("$id, $name, ${brand.toString()}, ${workshops.toString()}, $weight, $maxPermissableWeight, $speed, $maxSpeed")
    }

    fun getWorkshop(postcode: Int): Workshop?{
        for (w in workshops){
            if (w.postcode == postcode){
                return w
            }
        }
        return null
    }

}