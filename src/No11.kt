/*
*
* @author 123msn
* @since 2019-11-13
*/
import com.sun.org.apache.xpath.internal.operations.Mod
import java.lang.StringBuilder
import java.util.*


fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    var num: Int = scan.nextInt()
    val sb = StringBuilder()
    for(i in num downTo 2){
        sb.append(i).append("\n")
    }
    sb.append(1)

    print(sb.toString())
}

