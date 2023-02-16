open class Operator(val operatorName: String, val priceOneMinute: Int, val coverageArea: Double) {

    fun calculation(priceOneMinute:Int,coverageArea:Double):Double{
        var Q = 100*coverageArea/priceOneMinute
        return Q
    }

}