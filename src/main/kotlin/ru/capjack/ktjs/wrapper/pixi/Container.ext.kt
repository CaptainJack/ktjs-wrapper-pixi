package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.common.geom.AxialValues
import ru.capjack.ktjs.common.geom.Axis

fun Container.getSize(axis: Axis): Double {
	return when (axis) {
		Axis.HORIZONTAL -> this.width
		Axis.VERTICAL   -> this.height
	}
}

fun Container.setSize(horizontal: Number, vertical: Number) {
	width = horizontal.toDouble()
	height = vertical.toDouble()
}

fun Container.setSize(axis: Axis, value: Number) {
	when (axis) {
		Axis.HORIZONTAL -> width = value.toDouble()
		Axis.VERTICAL   -> height = value.toDouble()
	}
}

fun <T : Displayable> Container.addChild(displayable: T): T {
	addChild(displayable.display)
	return displayable
}

fun <T : DisplayObject> Container.addChild(x: Number, y: Number, displayObject: T): T {
	displayObject.position.set(x, y)
	return addChild(displayObject)
}

fun <T : Displayable> Container.addChild(x: Number, y: Number, displayable: T): T {
	addChild(x, y, displayable.display)
	return displayable
}

fun Container.setSize(values: AxialValues<out Number>) {
	setSize(values.horizontal, values.vertical)
}