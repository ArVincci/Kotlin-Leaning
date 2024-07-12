fun main(vararg args: String) {

    println("Inserte un problema aritmetico...")
    var input = readLine()
    while (input != null && input.isNotBlank()) {

        val values = input.split(" ")

        if (values.size < 3) {
            println("Valor de entrada muy corto. Se esperaba Valor + Valor. Se recibio: $input")
        } else {

            val Operando = values[1]
            val NumIzq = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Valor de entrada invalido: ${values[0]}")
            val NumDer = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("Valor de entrada invalido: ${values[2]}")

            val result = when (Operando) {
                "+" -> NumIzq + NumDer
                "-" -> NumIzq - NumDer
                "*" -> NumIzq * NumDer
                "/" -> NumIzq / NumDer
                else -> throw IllegalArgumentException("Operacion Invalida: $Operando")
            }
            println(result)
            }
        input = readLine()
    }
    println("Hasta la próxima!")
}