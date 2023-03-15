class Brand constructor(myName: String, myCountry: String, myPhone: String,myEmail: String){

    /*
    private String name
    private String country
    private String phone
    private String email
     */

    val name = myName
    val country = myCountry
    val phone = myPhone
    val email = myEmail

    override fun toString(): String {
        return "Brand(name='$name', country='$country', phone='$phone', email='$email')"
    }


}