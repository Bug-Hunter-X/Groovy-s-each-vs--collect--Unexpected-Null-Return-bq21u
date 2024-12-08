def list = [1, 2, 3, 4, 5]

// Incorrect usage of 'each' – this prints null
println list.each { println it * 2 }

// Correct usage of 'collect' – this returns a new list with the transformed elements
def doubledList = list.collect { it * 2 }
println doubledList // Output: [2, 4, 6, 8, 10]

//Alternative using collect with an implicit return
def doubledList2 = list.collect { it * 2 }
println doubledList2