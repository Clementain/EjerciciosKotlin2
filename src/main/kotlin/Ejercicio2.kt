import kotlin.math.pow

fun main() {
    val lista = listOf(10.0, 45.0, 234.0, 56.7, 234.9, 888.8)
    println(resta(lista) { a -> sumaCuadrados(a) })
}

fun sumaCuadrados(valor: Double) = valor + (valor.pow(2))

fun resta(valores: List<Double>, cuadrados: (Double) -> Double): List<Double> {
    val l = mutableListOf<Double>()
    for (i in valores.indices) {
        l.add(cuadrados(valores[i]) - (valores[i] / 2.0))
    }

    return l
}