import datkt.prettyhash.prettyHash
import datkt.bytes.bytesFrom

fun main(args: Array<String>) {
  val bytes = bytesFrom(0xfe, 0xed, 0xbe, 0xef)
  println(prettyHash(bytes))
}
