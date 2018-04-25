import de.undercouch.gradle.tasks.download.Download
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import ru.capjack.degos.publish.DegosPublishExtension
import java.net.URL

group = "ru.capjack.ktjs"

plugins {
	id("kotlin2js") version "1.2.40"
	id("ru.capjack.degos-publish") version "1.4.0"
	id("nebula.release") version "6.0.0"
	id("de.undercouch.download") version "3.4.2"
}

repositories {
	maven("http://artifactory.capjack.ru/public")
}

dependencies {
	implementation(kotlin("stdlib-js"))
	implementation("ru.capjack.ktjs:ktjs-common:0.1.0-SNAPSHOT")
}

tasks.withType<Kotlin2JsCompile> {
	kotlinOptions {
		moduleKind = "amd"
	}
}

task<Download>("downloadPixi") {
	src("https://github.com/pixijs/pixi.js/releases/download/v${ext["pixiVersion"]}/pixi.min.js")
	dest("$buildDir/download/pixi.min.js")
	doLast {
		file("src/main/resources/js/pixi.js").writeText(
			file("$buildDir/download/pixi.min.js").readText()
				.replace("//# sourceMappingURL=pixi.min.js.map\n", "")
		)
	}
}