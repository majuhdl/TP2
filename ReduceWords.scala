package wc

package object ReduceWords{
	def reduce_words(list:List[(String, List[Int])]) : List[(String, Int)] = {
		return list.map{case (s:String,l:List[Int]) =>(s, l.reduceRight(_+_))}.groupBy(_._1).toList.map{case (s:String,l:List[(String,Int)]) =>(s, l.size)}.sortBy (-_._2)
		
	}

}
