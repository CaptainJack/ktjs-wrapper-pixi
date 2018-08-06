@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external class Matrix(a: Double = definedExternally, b: Double = definedExternally, c: Double = definedExternally, d: Double = definedExternally, tx: Double = definedExternally, ty: Double = definedExternally) {
	var a: Double
	
	var b: Double
	
	var c: Double
	
	var d: Double
	
	var tx: Double
	
	var ty: Double
	
	fun append(matrix: Matrix): Matrix
	
	fun apply(pos: Point, newPos: Point = definedExternally): Point
	
	fun applyInverse(pos: Point, newPos: Point = definedExternally): Point
	
	fun clone(): Matrix
	
	fun copy(matrix: Matrix): Matrix
	
	fun decompose(transform: TransformBase): TransformBase
	
	fun fromArray(array: Array<Number>)
	
	fun identity(): Matrix
	
	fun invert(): Matrix
	
	fun prepend(matrix: Matrix): Matrix
	
	fun rotate(angle: Number): Matrix
	
	fun scale(x: Number, y: Number): Matrix
	
	fun set(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): Matrix
	
	fun setTransform(x: Number, y: Number, pivotX: Number, pivotY: Number, scaleX: Number, scaleY: Number, rotation: Number, skewX: Number, skewY: Number): Matrix
	
	fun toArray(): Array<Number>
	
	fun toArray(transpose: Boolean = definedExternally, out: Array<Number> = definedExternally): Array<Number>
	
	fun translate(x: Number, y: Number): Matrix
	
	companion object {
		val IDENTITY: Matrix = definedExternally
		
		val TEMP_MATRIX: Matrix = definedExternally
	}
}