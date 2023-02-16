open class Cable(protected val type: String, val count: Int, val diametr: Double) {

    open fun getQ(): Double {
        val Q = diametr / count
        return Q
    }
    fun printInfo() {
        println("тип:$type , кол-во:$count , диаметр:$diametr, q:${getQ()}")
    }

}