package taller

class Ejercicio() {

  // Punto 1. Recorre n términos: el primero es 1 y cada uno sale del
  // anterior aplicando g. Cada término se eleva a la p y se combina con f.
  // Tal como está devuelve siempre 0 y las pruebas quedan en rojo.
  def opCurrified(n: Int)(p: Int)(f: (Int, Int) => Int)(g: Int => Int): Int = {
    @annotation.tailrec
    def aux(i:Int, acc:Int):Int = {
      if(i>n) acc
      else aux(g(i),f(acc,Math.pow(i,p).toInt))
    }
    val neutro = if(f(1,0)==0) 1 else 0
    aux(1,neutro)
  }

  // Punto 2. La suma de la sesión con tres grupos de parámetros.
  def suma4(f: Int => Int)(prox: Int => Int)(a: Int, b: Int): Int = {


  }

  // suma4 con f y prox ya fijados: cuadrados de uno en uno.
  def sumaCuadradosSuc: (Int, Int) => Int = {
    (a, b) =>  sumaCuadradosSuc(suma,suma4(a:Int = a*a)__)// Completar con una aplicación parcial de suma4
  }

  // Punto 3. La operación y su valor inicial en los dos primeros grupos.
  def reducirC(op: (Int, Int) => Int)(inicio: Int)
              (f: Int => Int, prox: Int => Int)
              (a: Int, b: Int): Int = {
    0 // Completar
  }

  // producto y factorialHOF se escriben con reducirC y nada más.
  def producto(f: Int => Int, prox: Int => Int, a: Int, b: Int): Int = {
    0 // Completar
  }

  def factorialHOF(n: Int): Int = {
    0 // Completar
  }

  // Punto 4. Funciones que devuelven funciones.
  def componer(f: Int => Int)(g: Int => Int): Int => Int = {
    (x: Int) => 0 // Completar
  }

  def aplicarN(f: Int => Int)(n: Int): Int => Int = {
    (x: Int) => 0 // Completar
  }

  def sumador(n: Int): Int => Int = {
    (x: Int) => 0 // Completar
  }
}
