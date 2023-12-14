open class Shape(open val x: Int, open val y: Int) {

    protected constructor(source: Shape) : this(source.x, source.y)

    open fun clone(): Shape =
        Shape(x, y)
}

class Rectangle : Shape {

    var width: Int = 0
    var height: Int = 0

    constructor(x: Int, y: Int, width: Int, height: Int) : super(x, y) {
        this.width = width
        this.height = height
    }

    private constructor(source: Rectangle) : super(source) {
        width = source.width
        height = source.height
    }

    override fun clone(): Rectangle =
        Rectangle(this)
}

class Circle : Shape {

    var radius: Int = 0

    constructor(x: Int, y: Int, radius: Int) : super(x, y) {
        this.radius = radius
    }

    private constructor(source: Circle) : super(source) {
        radius = source.radius
    }

    override fun clone(): Circle =
        Circle(this)
}