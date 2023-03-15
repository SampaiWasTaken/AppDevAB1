class Workshop constructor(myname: String, mycountry: String, mypostcode: Int, mycity: String, mystreet: String, myphone: String) {
    /*
    private String name
private String country
private int postcode
private String city
private String street
private String phone
     */
    val name = myname
    val country = mycountry
    val postcode = mypostcode
    val city = mycity
    val street = mystreet
    val phone = myphone


    override fun toString(): String {
        return "Workshop(name='$name', country='$country', postcode=$postcode, city='$city', street='$street', phone='$phone')"
    }


}