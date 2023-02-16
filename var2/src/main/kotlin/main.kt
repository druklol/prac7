fun main(){

    val operator = Operator("MTS",7,100.0)
    val payment = PaymentOperator("MTS",7,100.0,true)
    println(operator.operatorName)
    println(operator.priceOneMinute)
    println(operator.calculation())
    println(payment.calculation())

}