package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.common.geom.AxialValues
import ru.capjack.ktjs.common.geom.Axis

operator fun PointLike.get(axis: Axis): Double {
	return when (axis) {
		Axis.X -> this.x
		Axis.Y   -> this.y
	}
}

operator fun PointLike.set(axis: Axis, value: Number) {
	when (axis) {
		Axis.X -> this.x = value.toDouble()
		Axis.Y   -> this.y = value.toDouble()
	}
}

fun PointLike.set(both: Number) {
	set(both, both)
}

fun PointLike.set(values: AxialValues<out Number>) {
	set(values.x.toDouble(), values.y.toDouble())
}

fun PointLike.set(supplier: (axis: Axis) -> Number) {
	set(supplier(Axis.X).toDouble(), supplier(Axis.Y).toDouble())
}
