@file:JsModule("pixi.js")

package ru.capjack.ktjs.wrapper.pixi

import ru.capjack.ktjs.wrapper.pixi.PointLike

external class ObservablePoint(cb: () -> Any, scope: Any, x: Double = definedExternally, y: Double = definedExternally) : PointLike(x, y) {

}