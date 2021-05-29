package slick.util

import scala.reflect.macros.blackbox.Context
import scala.reflect.NameTransformer
import scala.collection.mutable.ListBuffer

object MacroSupportInterpolationImpl {
  def b(ctx: Context)(args: ctx.Expr[Any]*): ctx.Expr[Unit] = {
    ???
  }
}
