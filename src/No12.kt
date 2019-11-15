import java.util.*

/*
*
* @author 123msn
* @since 2019-11-15
*/

fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    val N = scan.nextInt()
    println(factorial(N))
}


fun factorial(N: Int): Int{
    if(N == 0) return 1
    if(N < 2) return N
    else{
        return N * factorial(N - 1)
    }
}