package dev.webfx.j2clmavenplugintest;

import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsMethod;

/**
 * @author Bruno Salmon
 */
public class J2clEntryApp {

    @JsMethod()
    public void entryPoint() {
        DomGlobal.console.log("Hello world!");
    }

}