import kotlin.math.max

fun main() {
    println("Exercício 1 Loop While"); at1ex1()
    println("Exercício 2 Loop While"); at1ex2()
    println("Exercício 3 Loop While"); at1ex3()

    println("Exercício 1 Do-While"); at2ex1()
    println("Exercício 2 Do-While"); at2ex2()
    println("Exercício 3 Do-While"); at2ex3()

    println("Exercício 1 Loop For"); at3ex1()
    println("Exercício 2 Loop For"); at3ex2()
    println("Exercício 3 Loop For"); at3ex3()


    println("Exercício 1 Range"); at4ex1()
    println("Exercício 2 Range"); at4ex2()
    println("Exercício 3 Range"); at4ex3()


    println("Exercício 1 Continue, Break & repeat"); at5ex1()
    println("Exercício 2 Continue, Break & repeat"); at5ex2()
    println("Exercício 3 Continue, Break & repeat"); at5ex3()

    println("Exercício 1 Strings"); at6ex1()
    println("Exercício 2 Strings"); at6ex2()
    println("Exercício 3 Strings"); at6ex3()

    println("Exercício 1 Array"); at7ex1()
    println("Exercício 2 Array"); at7ex2()
    println("Exercício 3 Array"); at7ex3()

    println("Desafio."); desafio()

}
//Explicando para uma criança: é um tipo de loop
// que executa um bloco de código repetidamente enquanto uma condição é verdadeira.
// Por exemplo, enquanto o valor de x for menor que 10, faça algo.
// Ele continua executando até que a condição se torne falsa.
//
//1 - Faça um loop while que imprima todos os números de 1 a 10:
//
//2 - Faça um loop while que imprima todos os números pares de 0 a 20:
//
//3 - Faça um loop while que imprima todos os números ímpares de 10 a 0:
fun at1ex1(){
    var num = 0
    while(num <10) {
        num++
    print("$num ")}
println("")}

fun at1ex2(){
        var num = 0
        while(num<=20) {
            num++
            if((num % 2) == 0){
            print("$num ")}
    }
    println("")}

fun at1ex3(){
    var num = 10
    while(num >= 0) {
        if((num % 2) != 0){
            print("$num ")
        }
        num--
    }
    println("")
}
//Loop Do-While:
//Explicando para uma criança: é semelhante ao loop while, mas a verificação da
//condição ocorre no final do loop em vez de no início. Isso garante que o bloco de
//código seja executado pelo menos uma vez. É um tipo de loop que executa um bloco
//de código repetidamente enquanto uma condição é verdadeira. Por exemplo, enquanto
//o valor de x for menor que 10, faça algo. Ele continua executando até que a condição
//se torne falsa.
//1 - Faça um loop do-while que imprima todos os números de 1 a 10:
//2 - Faça um loop do-while que peça ao usuário para digitar um número até que ele
//digite um número negativo:
//3 - Faça um loop do-while que peça ao usuário para digitar um número de 1 a 10 até
//que ele acerte o número sorteado:
fun at2ex1(){
     var x = 0
    do{
        x++
        print("$x ")
        continue
    } while (x<10)
    println("")
}

fun at2ex2(){
    var x : Int
    do{
        println("Digite um número: ")
        x = readLine()!!.toInt()
        if(x<0){println("Finalmente, você esta livre deste looping.")
        break}
    }while(x>=0)
    println("")
}

fun at2ex3(){
    val não_é_sorteio_se_eu_souber_a_resposta = 7
    var x : Int
    do {
        println("Digite um número: ")
       x = readLine()!!.toInt()
        if(x==não_é_sorteio_se_eu_souber_a_resposta){
            println("Acertou, sate sate sate.")
        break
        }
    }while(x!=não_é_sorteio_se_eu_souber_a_resposta)

    println("")
}
// Loop For:
//
// Exercícios - semana 2 2
// Explicando para uma criança: é outro tipo de loop que permite executar um bloco de
// código várias vezes, mas ele é usado principalmente para iterar sobre uma sequência
// de valores ou itens em uma lista ou array. O valor de x for menor que 10, faça algo. Ele
// continua executando até que a condição se torne falsa.
// 1 - Faça um loop for que imprima todos os números de 1 a 10:
// 2 - Faça um loop for que imprima todos os números pares de 0 a 20:
// 3 - Faça um loop for que imprima todos os números ímpares de 10 a 0:

fun at3ex1(){
    for(x in 1..10){
        print("$x ")
    }
    println("")
}

fun at3ex2(){
for(x in 0..20){
    if((x % 2) == 0) {
    print("$x ")}
    else{continue}
    }
    println("")
}


fun at3ex3(){
    for(x in 10 downTo 0){
        if((x % 2) == 0) {
           continue}
        else{  print("$x ")}
    }
    println("")
}


//Range:
//Explicando para uma criança: é um tipo de objeto que representa uma sequência de
//valores. Ele pode ser usado em conjunto com loops for para iterar sobre uma
//sequência de valores de uma maneira mais fácil.
//Explicando para uma criança: é um tipo de objeto que representa uma sequência de
//valores. Ele pode ser usado em conjunto com loops for para iterar sobre uma
//sequência de valores de uma maneira mais fácil.
//1 - Crie um range de números de 1 a 10 e imprima cada número:
//2 - Crie um range de letras de 'a' a 'z' e imprima cada letra:
//3 - Crie um range de números de 1 a 100 e imprima apenas os números pares:
fun at4ex1(){
 val range = 1..10;
    for(i in range){
        print("$i ")
    }
    println("")
}

fun at4ex2() {
    var cont = 0
    val range = ('A'..'Z');
    for (x in range) {
      println(x+" , "+ x.toLowerCase())
    }
    println("")
}

fun at4ex3(){
val range = 1..100;
    for(x in range){
        if((x%2)==0){
            print("$x ")
        }else{
            continue
        }
    }
    println("")
}

//**Continue, Break & Repeat:**
//
//Explicando para uma criança: são palavras-chave que permitem controlar o fluxo de um loop. O continue é usado para pular a execução de uma iteração e passar para a próxima, o break é usado para sair do loop imediatamente e o repeat é usado para repetir um bloco de código um número especificado de vezes, um tipo de objeto que representa uma sequência de valores. Ele pode ser usado em conjunto com loops for para iterar sobre uma sequência de valores de uma maneira mais fácil.
//
//1 - Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5, *usando continue.*
//
//2 - Escreva um programa que leia números do usuário e pare quando o número digitado for negativo usando break.
//
//3 - Escreva um programa que leia um número inteiro positivo do usuário e imprima todos os números pares de 0 até o número digitado, exceto o número 4, usando continue e break.

fun at5ex1(){
for(x in 1..10){
    if(x==5){
        continue
    }else{print("$x ")}

}
    println("")
}

fun at5ex2(){
    var x = 0
while(x>=0){
    println("Digite um número: ")
    x = readLine()!!.toInt()
    if(x<0){
        println("Oh, não! Você descobriu minha fraqueza.. malditos sejam os números negativos!.")
        break
    }
}
    println("")
}

fun at5ex3(){
println("Digite um número: ")
    var xis = readLine()!!.toInt()
for(i in 0..xis){
    if (i == 4) {
        continue
    }
    if (i % 2 != 0) {
        continue
    }
    if (i > xis) {
        break
    }
    print("$i ")
    }
    println("")
}
//**Strings**
//
//Explicando para uma criança: são objetos que representam sequências de caracteres. Você pode usar strings para armazenar e manipular texto em um programa.
//
//1 - Escreva um programa que leia uma frase do usuário e imprima quantos caracteres ela possui usando length.
//
//*2 -* Escreva um programa que leia uma frase do usuário e imprima a mesma frase em ordem inversa usando loop for.
//
//3 - Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da frase usando loop for e if.
fun at6ex1(){
    println("Digite uma frase: ")
    var x = readLine()!!
    print("A sua frase possui " + x.length +" caracteres")
    println("")
}

fun at6ex2(){
    println("Digite uma frase: ")
    var frase = readLine()!!
    var new =""
    for(y in frase.reversed()){
        new += y
    }
    print(new)
    println("")
}

fun at6ex3(){
    println("Digite uma frase: ")
    var frase = readLine()!!.toUpperCase()
    var new =""
    for(y in frase){
     if(y =='A' || y=='E' || y=='I' || y=='O' || y=='U'){
         new+="$y,"
     }
    }
print("As vogais encontradas foram: $new")
}


//**Array**
//
//Explicando para uma criança: são estruturas de dados que permitem armazenar um conjunto de valores em uma única variável. É como uma caixa com vários compartimentos, cada compartimento pode armazenar um valor. Você pode usar arrays para armazenar uma coleção de valores e acessá-los usando um índice.
//
//1 - Escreva um programa que crie um array de 10 números inteiros aleatórios e imprima o maior número do array.
//
//2 - Escreva um programa que crie um array de 10 números inteiros digitados pelo usuário e imprima a média dos números do array.
//
//3 - Escreva um programa que crie um array de 10 strings com nomes de frutas e imprima somente as frutas que começam com a letra "a" usando loop for e if.
fun at7ex1(){
    val array = intArrayOf(32, 81, 18, 66, 9, 44, 1, 89, 41, 84)
    println("Maior valor: " + array.max())
}

fun at7ex2(){
    var soma = 0
var array = IntArray(10)
   for(i in array.indices){
       println("Digite o ${i+1} número: ")
       array[i] = readLine()!!.toInt()
       soma+=array[i]
   }
    var lista = ""
    for (i in array.indices) {
        lista += array[i]
        if (i != array.size - 1) {
            lista += ", "
        } else {
            lista += "."
        }
    }
    print("[$lista]\nA média desses valores é de ${soma.toDouble()/array.size.toDouble()}")
    println("")
}

fun at7ex3(){
val array = arrayOf("banana","abacaxi","mamão","amora","melancia","abacate","goiaba","maça","kiwi","laranja")
    for(i in array){
        if(i.first()=='a'){
            print("$i, ")
        }
    }
}

//**Desafio semanal**:
//
//Crie um programa em Kotlin que permita ao usuário digitar o nome e a idade de várias pessoas, armazenando essas informações em um array de objetos Pessoa. O programa deve ter as seguintes funcionalidades:
//
//1 - Permitir ao usuário adicionar uma nova pessoa ao array, informando o nome e a idade.
//
//2 - Exibir a lista de todas as pessoas adicionadas ao array, mostrando o nome e a idade de cada uma.
//
//3 - Exibir a média de idade das pessoas adicionadas ao array.
//
//4 - Permitir ao usuário buscar uma pessoa pelo nome, exibindo o nome e a idade correspondentes.
//
//5 - Permitir ao usuário remover uma pessoa pelo nome, atualizando o array e exibindo a lista atualizada.
//
//É aconselhado utilizar os conceitos de loop while, loop do-while, loop for, range, continue, break & repeat, string e array.
fun desafio(){
    data class Pessoa(val nome: String, val idade: Int)
    var lista = mutableListOf<Pessoa>();

    var x = true
    while (x) {
        println("\nEscolha uma das opções abaixo:")
        println("1 - Adicionar pessoa")
        println("2 - Exibir lista de pessoas")
        println("3 - Exibir média de idade")
        println("4 - Buscar pessoa pelo nome")
        println("5 - Remover pessoa pelo nome")
        println("6 - Sair")


        var option = readLine()!!.toInt()

        when (option) {
            1 -> {
                println("Digite o nome da pessoa: ")
                var nome = readLine()!!
                println("Digite a idade da pessoa: ")
                var idade = readLine()!!.toInt()
                lista.add(Pessoa(nome, idade))
                println("Pessoa adicionada com sucesso!")
            }

            2 -> {
                println("Estas são as pessoas que foram adicionadas no array: ")
                lista.forEach { pessoa ->
                    println("${pessoa.nome} - ${pessoa.idade} anos")
                }
            }
                3-> {
                    var somaIdade= 0
                    var media = somaIdade/lista.size.toDouble()
                    lista.forEach{pessoa -> somaIdade += pessoa.idade}
                    println("Esta é a média de idade: $media anos")
                }
                4 -> {
                    println("Digite o nome da pessoa: ")
                    var busca = readLine()
                   lista.forEach{pessoa ->
                       if(pessoa.nome == busca){println("O usuário(a) ${pessoa.nome} foi localizado(a) e possui ${pessoa.idade} anos")}
                   }
                }
                5 -> {
                    println("Digite o nome da pessoa: ")
                    var busca = readLine()
                    val removido = lista.removeIf { pessoa ->
                        pessoa.nome == busca
                    }
                    if (removido) {
                        println("Pessoa removida com sucesso!")
                    } else {
                        println("Pessoa não encontrada.")
                    }
                        }
            6-> break
            }
        }
    }

