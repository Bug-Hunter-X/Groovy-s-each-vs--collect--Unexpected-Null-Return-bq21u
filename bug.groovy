def list = [1, 2, 3, 4, 5]

println list.each { it * 2 } // This will print null

//The correct way
println list.collect { it * 2 } // This will print [2, 4, 6, 8, 10]