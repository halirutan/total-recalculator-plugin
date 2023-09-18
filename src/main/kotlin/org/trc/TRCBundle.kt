package org.trc

import com.intellij.DynamicBundle
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey

@NonNls
private const val BUNDLE = "messages.TRCBundle"

/**
 * Bundles like the TRCBundle here are the preferred way to handle names, descriptions and other strings
 * that would otherwise be used in-place. So in all the places, where you would usually use e.g. a name
 * of an inspection or any kind of description, you use `org.trc.TRCBundle.message` instead.
 *
 * This helps with localization and keeps all your messages in one place. Additionally,
 * IntelliJ IDEA offers many features for working with these bundle messages like auto-completion,
 * renaming or navigation.
 *
 * Finally, note that message bundles can be used
 * [within the `plugin.xml`](https://plugins.jetbrains.com/docs/intellij/plugin-configuration-file.html#idea-plugin__resource-bundle)
 * for message key attributes in extension declarations and for action and group localization.
 */
object TRCBundle : DynamicBundle(BUNDLE) {

    /**
     * Retrieves a localized message from the given resource bundle using the provided key and parameters.
     * In your code, you can then use all strings from the bundle after importing it with
     * `import org.trc.TRCBundle.message` like in this example:
     * ```kotlin
     * override fun getDefaultExtension(): String {
     *     return message("file.type.extension")
     * }
     * ```
     * @param key The key of the message to retrieve from the resource bundle.
     * @param params The additional parameters to format the message. Essentially, additional `params` are handed over
     * to `java.text.Format.format`
     * @return The localized message.
     */
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getMessage(key, *params)

    /**
     * Returns a lazy evaluated message pointer for the given key and optional parameters.
     */
    @Suppress("unused")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getLazyMessage(key, *params)
}
