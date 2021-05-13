package wc

package object ReduceWords{
	def reduce_words(list:List[(String, List[Int])]) : List[(String, Int)] = {
		return list.map{case (s:String,l:List[Int]) =>(s, l.reduceLeft(_+_))}
	}
}
