class PaymentOperator( operatorName: String, priceOneMinute:Int, coverageArea:Double,var P:Boolean):Operator(operatorName, priceOneMinute, coverageArea) {

    fun calculationQp():Double{
        val q:Double=calculation(priceOneMinute,coverageArea)
        if(P) {
            val Qp: Double = 0.7 *q
            return Qp
        }
        else {
            val Qp = 1.5 * q
            return Qp
        }
    }

}
