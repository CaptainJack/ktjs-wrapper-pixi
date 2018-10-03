package ru.capjack.ktjs.wrapper.pixi

fun graphics(init: Graphics.() -> Unit): Graphics {
	return Graphics().apply(init)
}

fun Graphics.drawRect(rect: ru.capjack.ktjs.common.geom.Rectangle<out Number>): Graphics {
	return drawRect(rect.x, rect.y, rect.width, rect.height)
}

fun Graphics.fillRect(color: Int, x: Number = 0, y: Number = 0, width: Number, height: Number): Graphics {
	beginFill(color)
	drawRect(x, y, width, height)
	endFill()
	return this
}

fun Graphics.fillRoundedRect(color: Int, x: Number = 0, y: Number = 0, width: Number, height: Number, radius: Number): Graphics {
	beginFill(color)
	drawRoundedRect(x, y, width, height, radius)
	endFill()
	return this
}