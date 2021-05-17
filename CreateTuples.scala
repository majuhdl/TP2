package wc

package object CreateTuples{
	def split(list_split:List[List[String]]) : List[List[String]] ={
		val strWords = (str: String) => str.replaceAll("[^a-zA-Záàâãéèêíïóôõöúçñ]", " ").toLowerCase().split("\\s+").toList
		return list_split.map(n => n.flatMap(s => strWords(s))) 
	}

	def words_to_tuple(data_str:List[List[String]]) : List[List[(String,Int)]] = {

	  	var result : List[List[(String, Int)]] = List()
	  	
	  	var newlist : List[(String, Int)] = List()
	  	
	  	var str : String = "a"
	  	
	  	for (w <- data_str){
	  		for (i <- w) {
	  			str = i
	  			newlist = newlist:+(str,1)
	  		}
	  		result = result:+newlist
	  		newlist = List() 
	  	}
	  	
	  	return result
	}
}
