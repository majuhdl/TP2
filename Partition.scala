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

/*
.read
- le um arquivo txt e transform ele em uam lista de linhas pertencente a um arquivo
.partition
- Cria uma lista de listas onde cada lista contem a quantidade de linhas especificadas pelo parametro nlines

Commnent ends*/
