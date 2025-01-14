package io.kotest.engine.extensions

import io.kotest.core.Tag
import io.kotest.core.Tags
import io.kotest.core.extensions.TagExtension
import io.kotest.engine.extensions.RuntimeTagExtension.excluded
import io.kotest.engine.extensions.RuntimeTagExtension.included

/**
 * Allows including/excluding tags at runtime
 *
 * You can use the properties [included] and [excluded] to modify what behavior you should use for specific tests
 * at runtime. Any test tagged with tags in [included] will be included to run, and any tags in [excluded] will be excluded.
 */
object RuntimeTagExtension : TagExtension {

   val included = mutableSetOf<Tag>()
   val excluded = mutableSetOf<Tag>()

   override fun tags(): Tags {
      return Tags(included, excluded)
   }
}

