@file:JsModule("ktjs-wrapper-pixi/pixi.min")

package ru.capjack.ktjs.wrapper.pixi

external fun autoDetectRenderer(): SystemRenderer

external fun autoDetectRenderer(options: AutoDetectRendererOptions): SystemRenderer