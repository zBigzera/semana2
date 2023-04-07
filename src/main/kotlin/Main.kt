fun main() {
    //Funções do exercício sobre Loop While

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
fun at6ex1(){}

fun at6ex2(){}

fun at6ex3(){}
