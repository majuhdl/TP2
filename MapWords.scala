package wc

package object MapWords{
	def map_words(list:List[List[(String, Int)]]): List[(String, List[Int])] = {
			val big_list = list.flatten
	  	return big_list.groupBy(_._1).mapValues(_.map(_._2)).toList
	}
}
/*Comment starts
.MapWords
-Recebe a lista de listas de tuplase a transforma em uma só liats de tuplas
- apos isso agrupa as tupla que contema  mesma chave
Commnent ends*/