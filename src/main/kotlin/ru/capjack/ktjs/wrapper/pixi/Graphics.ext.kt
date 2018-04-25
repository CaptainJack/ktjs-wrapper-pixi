package ru.capjack.ktjs.wrapper.pixi

fun Graphics.drawRect(rect: ru.capjack.ktjs.common.geom.Rectangle<out Number>): Graphics {
	return drawRect(rect.x, rect.y, rect.width, rect.height)
}