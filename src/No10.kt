/*
*
* @author 123msn
* @since 2019-11-13
*/
import com.sun.org.apache.xpath.internal.operations.Mod
import java.util.*


fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    var num1: Int = scan.nextInt()
    var num2: Int = scan.nextInt()

    println(gcd(num1,num2))
    println(lcm(num1,num2))
}

fun gcd(num1: Int, num2: Int): Int{
    var mod = num1 % num2
    var a = num1
    var b = num2
    while(mod != 0){
        mod = a % b
        a = b.also { b = mod }
    }
    return a
}

fun lcm(num1: Int, num2: Int): Int{
    return (num1 * num2) / gcd(num1,num2)
}