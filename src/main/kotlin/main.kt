import kotlin.browser.document
import kotlin.browser.window

/**
 * @author ChangWei Li
 * @version 2017-12-01 10:27
 */

fun main(args: Array<String>) {
    document.body?.style?.border = "5px solid green"
    window.alert("Kotlin 插件生效")
}
