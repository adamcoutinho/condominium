package com.main.commons

import org.pf4j.Extension
import org.pf4j.ExtensionPoint

@Extension
abstract class IServiceController : ExtensionPoint {
    
    abstract fun execute(any: Any): Any?
}