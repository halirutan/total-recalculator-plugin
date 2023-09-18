package org.trc.language

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import org.trc.TRCBundle.message
import javax.swing.Icon


/**
 * Represents the file type for TRC files.
 *
 * TRCFileType is a subclass of LanguageFileType and provides methods to retrieve the name, description,
 * default file extension and icon for TRC files.
 */
class TRCFileType : LanguageFileType(TRCLanguage.INSTANCE) {

    /**
     * Retrieves the name of the file type. The returned value needs to match
     * the value given in the `plugin.xml`. Therefore, it's preferable to use a
     * [message bundle](org.trc.TRCBundle) to keep names, descriptions and other value in one
     * place.
     */
    override fun getName(): String {
        return message("file.type.name")
    }


    /**
     * The description of the file type that is show for instance in
     * **Settings | Editor | File Types** in the table where all assigned file types are listed
     */
    override fun getDescription(): String {
        return message("file.type.description")
    }

    override fun getDefaultExtension(): String {
        return message("file.type.extension")
    }

    /**
     * Returns the icon for the file type visible in the project view.
     * This is a good way to debug if your file type is actually registered correctly with the IntelliJ Platform.
     */
    override fun getIcon(): Icon {
        return AllIcons.FileTypes.Java
    }
}