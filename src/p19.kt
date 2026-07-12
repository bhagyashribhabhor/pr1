fun main(){
  val a1=arrayOf(41,32,63,54)
  var max=a1[0]

    for(a in a1){
        if(a > max)
            max=a
    }
    println(max)
}