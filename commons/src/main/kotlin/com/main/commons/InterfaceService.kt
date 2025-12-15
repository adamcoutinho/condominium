package com.main.commons

import org.pf4j.ExtensionPoint

interface InterfaceService : ExtensionPoint {
    fun execute(any:Any):Any?
}