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

/*
::read
List("Ola, professor, Bonifacio, professor, Bonifacio,")
 */
/*
::partition
List(List("Ola professor") List("Bonifacio professor") List("Bonifacio)")
 */
/*
::words_to_tuple
List((Ola, 1), (professor,1), (Bonifacio,1), (professor,1), ("Bonifacio,1")
 */
/*
::mapreduce
List((ola,1), (professor,2), (Bonifacio,2))
 */

