package com.jeff.sbtstudy.mixincompound

object CompoundClassTest {
    def main(args: Array[String]): Unit = {
    	class MixinMorph extends Clickable("Jeff") with Openable with Echo1 
    	val theMorph = new MixinMorph
    	clickAndOpenAndAnyEcho(theMorph)
    }

    def clickAndOpenAndAnyEcho(theMorph: Clickable with Openable with Echo1): Unit = {
    	theMorph.click
    	theMorph.open
    	theMorph.echo
    }
    
}
