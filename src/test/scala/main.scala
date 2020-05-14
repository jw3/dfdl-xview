import java.io.File

import org.apache.daffodil.sapi.Daffodil

object main extends App {
  val schema = getClass.getResource("xview/xsd/labels.dfdl.xsd").getPath

  val c = Daffodil.compiler()
  val pf = c.compileFile(new File(schema))
  pf.getDiagnostics.filter(_.isError).foreach(println)
}
