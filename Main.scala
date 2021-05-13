import wc.Partition._
import wc.CreateTuples._
import wc.MapWords._
import wc.ReduceWords._

object Main extends App {
	
	val source = read("test/text.txt")
	val part = (partition(source, 3))
	val create_tuple = words_to_tuple(split(part))
	val mapreduce = reduce_words(map_words(create_tuple))
	
	println(source+"\n\n")
	println(mapreduce)

}
