@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Matrix(a: Double = definedExternally, b: Double = definedExternally, c: Double = definedExternally, d: Double = definedExternally, tx: Double = definedExternally, ty: Double = definedExternally) {
	var a: Double = definedExternally
	var b: Double = definedExternally
	var c: Double = definedExternally
	var d: Double = definedExternally
	var tx: Double = definedExternally
	var ty: Double = definedExternally
	
	fun append(matrix: Matrix): Matrix
	fun apply(pos: Point, newPos: Point?): Point
	fun applyInverse(pos: Point, newPos: Point?): Point
	fun clone(): Matrix
	fun copy(matrix: Matrix): Matrix
	fun decompose(transform: TransformBase): TransformBase
	fun fromArray(array: Array<Double>)
	fun identity(): Matrix
	fun invert(): Matrix
	fun prepend(matrix: Matrix): Matrix
	fun rotate(angle: Double): Matrix
	fun scale(x: Double, y: Double): Matrix
	fun set(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix
	fun setTransform(x: Double, y: Double, pivotX: Double, pivotY: Double, scaleX: Double, scaleY: Double, rotation: Double, skewX: Double, skewY: Double): Matrix
	fun toArray(transpose: Boolean, out: Array<Float>?): Array<Double>
	fun translate(x: Double, y: Double): Matrix
	
	companion object {
		val IDENTITY: Matrix = definedExternally
		val TEMP_MATRIX: Matrix = definedExternally
	}
}