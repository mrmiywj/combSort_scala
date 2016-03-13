/**
  * Created by Administrator on 2016/3/14.
  */
import combSort.combSort
import org.scalatest.{ FlatSpec, Matchers }

class combSortTest extends FlatSpec with Matchers{
  "combSort" should "sort correctly" in {
    combSort.combSort(Seq(3,1,2)) should be (Seq(1,2,3), 2)
    combSort.combSort(Seq(5,4,3,2,1)) should be (Seq(1,2,3,4,5),2)
    combSort.combSort(Seq(1)) should be (Seq(1),0)
  }
}
