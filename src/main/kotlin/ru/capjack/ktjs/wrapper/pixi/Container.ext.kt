package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.common.geom.Axial
import ru.capjack.ktjs.common.geom.Axis

fun Container.getSize(axis: Axis): Double {
	return when (axis) {
		Axis.X -> this.width
		Axis.Y   -> this.height
	}
}

fun Container.setSize(x: Number, y: Number) {
	width = x.toDouble()
	height = y.toDouble()
}

fun Container.setSize(axis: Axis, value: Number) {
	when (axis) {
		Axis.X -> width = value.toDouble()
		Axis.Y   -> height = value.toDouble()
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

fun Container.addChildren(vararg list: DisplayObject) {
	list.forEach { addChild(it) }
}

fun Container.addChildren(vararg list: Displayable) {
	list.forEach { addChild(it) }
}

fun Container.setSize(values: Axial<out Number>) {
	setSize(values.x, values.y)
}