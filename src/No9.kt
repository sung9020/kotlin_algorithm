/*
*
* @author 123msn
* @since 2019-11-13
*/
import java.util.*


fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    var num: String = scan.next()
    var numArray: CharArray = num.toCharArray();
    val result = StringBuilder()
    var temp: Char? = null;
    for(i in 0 until numArray.size - 1){
        for(j in i+1 until numArray.size) {
            val a = numArray[i].toString().toInt()
            val b = numArray[j].toString().toInt()
            if(b > a){
                temp = numArray[i]
                numArray[i] = numArray[j]
                numArray[j] = temp
            }
        }
    }

    print(numArray.joinToString("").toInt())
}