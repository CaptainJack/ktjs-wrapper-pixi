package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.common.geom.AxialValues
import ru.capjack.ktjs.common.geom.Axis

operator fun PointLike.get(axis: Axis): Double {
	return when (axis) {
		Axis.HORIZONTAL -> this.x
		Axis.VERTICAL   -> this.y
	}
}

operator fun PointLike.set(axis: Axis, value: Number) {
	when (axis) {
		Axis.HORIZONTAL -> this.x = value.toDouble()
		Axis.VERTICAL   -> this.y = value.toDouble()
	}
}

fun PointLike.set(both: Number) {
	set(both, both)
}

fun PointLike.set(values: AxialValues<out Number>) {
	set(values.horizontal.toDouble(), values.vertical.toDouble())
}

fun PointLike.set(supplier: (axis: Axis) -> Number) {
	set(supplier(Axis.HORIZONTAL).toDouble(), supplier(Axis.VERTICAL).toDouble())
}
