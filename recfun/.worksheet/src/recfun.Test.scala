package recfun

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(135); 
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$0 = 
  product(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
  product(x => x)(1, 5);System.out.println("""res1: Int = """ + $show(res$1));$skip(51); 
  
  def factorial(n: Int) = product(x => x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$2 = 
  factorial(4);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  factorial(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(178); 
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(95); 
  
  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$4 = 
  product2(x => x)(1, 5);System.out.println("""res4: Int = """ + $show(res$4))}
}
