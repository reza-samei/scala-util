package me.samei.std

trait Convertor[I,O] {

    def title: String

    def unsafe(i:I):O

}

object Convertor {

    def apply[I,O](t: String)( f: I => O ): Convertor[I,O] = new Convertor[I,O] {
        override val title = t
        final override def unsafe(i:I):O = f(i)
    }
}

