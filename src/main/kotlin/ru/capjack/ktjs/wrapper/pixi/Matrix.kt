@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

external class Matrix(a: Double = definedExternally, b: Double = definedExternally, c: Double = definedExternally, d: Double = definedExternally, tx: Double = definedExternally, ty: Double = definedExternally)
{
	//todo:describe
//	fun fromArray(array: number[]): void;
//	set(a: number, b: number, c: number, d: number, tx: number, ty: number): Matrix;
//	toArray(transpose?: boolean, out?: number[]): number[];
//	apply(pos: Point, newPos?: Point): Point;
//	applyInverse(pos: Point, newPos?: Point): Point;
//	translate(x: number, y: number): Matrix;
//	scale(x: number, y: number): Matrix;
//	rotate(angle: number): Matrix;
//	append(matrix: Matrix): Matrix;
//	setTransform(x: number, y: number, pivotX: number, pivotY: number, scaleX: number, scaleY: number, rotation: number, skewX: number, skewY: number): PIXI.Matrix;
//	prepend(matrix: Matrix): Matrix;
//	invert(): Matrix;
//	identity(): Matrix;
//	decompose(transform: TransformBase): TransformBase;
//	clone(): Matrix;
//	copy(matrix: Matrix): Matrix;
	
	companion object {
		val IDENTITY: Matrix = definedExternally
		val TEMP_MATRIX: Matrix = definedExternally
	}
}