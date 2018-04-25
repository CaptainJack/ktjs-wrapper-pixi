package ru.capjack.ktjs.wrapper.pixi

fun Rectangle.divide(divider: Double): Rectangle {
	return when (divider) {
		1.0  -> this
		else -> Rectangle(
			this.x / divider,
			this.y / divider,
			this.width / divider,
			this.height / divider
		)
	}
}

fun Rectangle.rotate(): Rectangle {
	return Rectangle(
		this.x,
		this.y,
		this.height,
		this.width
	)
}

fun Rectangle.copyTo(x: Number, y: Number): Rectangle {
	return clone().also {
		it.x = x.toDouble()
		it.y = y.toDouble()
	}
}

val ru.capjack.ktjs.common.geom.Rectangle<out Number>.pixi
	get() = Rectangle(x, y, width, height)