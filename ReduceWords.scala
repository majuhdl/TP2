package wc

package object ReduceWords{
	def reduce_words(list:List[(String, List[Int])]) : List[(String, Int)] = {
		return list.map{case (s:String,l:List[Int]) =>(s, l.size)}.toList.sortBy(-_._2)
	}
}
/*Comment starts
.ReduceWords
- recebe a lista de tuplas e soma o elemento os elementos inteiros dentro da lista da tupla, o que corresponde ao numero de ocorrencias da palavra
Commnent ends*/