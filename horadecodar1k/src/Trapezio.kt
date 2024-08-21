fun main(){
    println("Area do Trapézio")

    print("Digite a base Maior: ")
    val baseMaior:Double = readln().toDouble()
    print("Digite a base Menor: ")
    val baseMenor:Double = readln().toDouble()
    print("Digite a altura: ")
    val altura:Double = readln().toDouble()

    print("Resultado: ${((baseMaior+baseMenor)*altura)/2}")

}