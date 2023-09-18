package org.trc.language

import com.intellij.lang.Language


/**
 * Every custom language needs to have an implementation like this that inherits from
 * `com.intellij.lang.Language.Language`. This is the first step when creating a plugin for a
 * custom language. The other important part is to [register a file type](org.trc.language.TRCFileType).
 *
 * Here, nothing special needs to be implemented except for calling the constructor of the parent class
 * with a unique name of your language. Every implementation usually holds a static instance of this class
 * which is used throughout plugin development in many places.
 */
class TRCLanguage: Language("TRC") {
    companion object {
        val INSTANCE = TRCLanguage()
    }
}