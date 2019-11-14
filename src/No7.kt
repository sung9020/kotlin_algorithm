import java.util.*

/*
*
* @author 123msn
* @since 2019-11-13
*/

/*
*
* @author 123msn
* @since 2019-11-13
*/
fun main(args:Array<String>){
    val a = Scanner(System.`in`)
    var b: Int = a.nextInt()
    for (c in 0 until b){
        for(d in b downTo c + 1){
            print("*")
        }
       println()
    }

}