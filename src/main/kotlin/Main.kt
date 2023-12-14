fun main() {
    val rectangle = Rectangle(x = 1, y = 2, width = 3, height = 4)
    val rectangleClone = rectangle.clone()
    println("rectangle params: x = ${rectangle.x}, y = ${rectangle.y}, width = ${rectangle.width}, height = ${rectangle.height}")
    println("clone of rectangle params: x = ${rectangleClone.x}, y = ${rectangleClone.y}, width = ${rectangleClone.width}, height = ${rectangleClone.height}")

    val circle = Circle(x = 1, y = 2, radius = 3)
    val circleClone = circle.clone()
    println("circle params: x = ${circle.x}, y = ${circle.y}, radius = ${circle.radius}")
    println("clone of circle params: x = ${circleClone.x}, y = ${circleClone.y}, radius = ${circleClone.radius}")
}