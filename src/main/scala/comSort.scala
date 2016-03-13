/**
  * Created by Administrator on 2016/3/14.
  */
object combSort {
  val shrink = 1.25
  def combSort[T: Ordering](src: Seq[T]):(Seq[T], Int) = {
    var gap = src.size
    val len = src.size
    var swap = true
    val res = src.toBuffer
    var count = 0
    while (gap > 1 || swap){
      gap = if (gap / shrink <= 1) 1 else (gap / shrink).toInt
      swap = false
      for (i <- 0.to(len-gap - 1)){
        if (implicitly[Ordering[T]].compare(res(i), res(i+gap)) > 0) {
          count += 1
          val tmp = res.apply(i)
          res(i) = res(i + gap)
          swap = true
          res(i + gap) = tmp
        }
      }
    }
    (res.toSeq, count)
  }
}
