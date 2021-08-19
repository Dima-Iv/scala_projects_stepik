val sampleTuple = new Tuple2(2, "Hello, World")
println(sampleTuple.copy(_2 = "Scala").swap._1)