open class Cable(val type:String,val count:Int,val diametr:Double) {

    fun getQ():Double{
    val Q=diametr/count
        return Q
}

}