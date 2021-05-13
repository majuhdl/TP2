package wc

package object MapWords{
	def map_words(list:List[List[(String, Int)]]): List[(String, List[Int])] = {
	  	return list.flatMap(n=>n.groupBy(_._1).mapValues(x => x.map(_._2)))
	}
}
