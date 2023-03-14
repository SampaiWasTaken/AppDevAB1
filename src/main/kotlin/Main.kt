fun main(args: Array<String>) {
    class Brand()
    class Workshop()
    class Vehicle(id: Int, name: String, brand: Brand, workshops: ArrayList<Workshop>, weight: Int)
    println("Program arguments: ${args.joinToString()}")
}