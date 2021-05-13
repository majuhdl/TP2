package wc

import scala.io.Source

package object Partition{
	def read(path: String) : List[String] = {
		return Source.fromFile(path).getLines.toList
	}

	def partition(lines: List[String], nlines: Int) : List[List[String]] = {
		val part = lines.flatMap(s=> s.toLowerCase().split("\n").toList)
		return part.grouped(nlines).toList
	}
}
