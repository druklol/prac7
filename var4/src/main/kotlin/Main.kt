fun main() {
    val cabel=Cable("железо",7,12.4)
    val cabelPayment=PaymentCable("железо",7,12.4,true)
    println(cabel.diametr)
    println(cabel.getQ())
    println(cabelPayment.getQ())
    cabel.printInfo()
}