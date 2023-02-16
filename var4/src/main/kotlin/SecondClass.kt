class PaymentCable( type:String, count:Int, diametr:Double,var P:Boolean):Cable( type, count, diametr) {
fun getQp():Double
{
    val Q=getQ()
    if(P)
    {
        val Qp=2*Q
        return Qp
    }
    else
    {
        val Qp=0.7*Q
        return Qp
    }
}
}