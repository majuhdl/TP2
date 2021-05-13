import scala.io.Source

object Main extends App {
	

  private val stopWords = Set("the", "about", "above", "after", "again", "against",
    "all", "and", "any", "because", "before", "below", "between", "but",
    "down", "during", "for", "from", "further", "here", "into", "more","once",
    "only", "other", "over", "same", "some", "such", "that", "then",
    "there", "these", "this", "those", "through", "under", "until", "very",
    "what", "when", "where", "which", "while", "who", "which",
    "with", "could", "were", "your", "have", "will", "been", "would",
    "they", "their", "should", "myself", "them", "upon", "might",
    "first", "eyes", "every", "you", "than", "thought", "whom", "ever",
    "most", "even","said", "shall", "towards", "found", "being",
    "time", "also", "him", "her", "still", "must", "many")

def read(path: String) : List[String] = {
	var newvar = Source.fromFile(path).getLines.toList
	//val allWords = newvar.flatMap(s => strWords(s))  
  	//val strWords = newvar.flatMap(str => str.split(" ").toList.map(s => s.replaceAll("[^a-zA-Z]", "").toLowerCase()))
	return newvar
}



def words(lines: List[String], nlines: Int) : List[List[String]] = {
	var part = lines.flatMap(s=> s.toLowerCase().split("\n").toList)
	var aux : List[String] = Nil
	var list : List[List[String]] = Nil
	var str : String = "a"

	if (nlines > part.size){
		list = List(part)
	}
	else {
		for (i<- 0 until part.size) {
			if ((i%nlines != 0) || (i == 0)){
				str = part(i)
				aux = aux:+str
			}
			else {
				list = list:+aux
				str = part(i)
				aux = aux:+str
			}
		}
	}
	list = list:+aux
	println(list+"before")
	for (w<-list){
		for (i<-w){
			//val allWords = (lst: List[String]) => lst.flatMap(s => strWords(s)) 
      //THIS LINE DOES NOTHING-WHY???
  			i.split(" ").toList.map(s => s.replaceAll("[^a-zA-Z]", "").toLowerCase())
		}
	}
	return list
}

	val source = read("text.txt")
	val word = words(source, 3)

   
   	println(source)
   	println(word)

}
