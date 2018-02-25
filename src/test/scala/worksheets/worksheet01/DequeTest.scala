/*
package worksheets.worksheet01

import org.scalatest.{FlatSpec, Matchers}

class DequeTest extends FlatSpec with Matchers {

  "A Deque" should "handle push then pop" in {
    val deque = new Deque[Char]()
    deque.push('a')
    deque.push('b')
    deque.pop should be(Some('b'))
    deque.pop should be(Some('a'))
    //    linkedList.pop should be (None)
  }

  it should "handle push then shift" in {
    pending
    val deque = new Deque[Char]()
    deque.push('a')
    deque.push('b')
    deque.shift should be(Some('a'))
    deque.shift should be(Some('b'))
    //    linkedList.shift should be (None)
  }

  it should "handle unshift then shift" in {
    pending
    val deque = new Deque[Char]()
//    deque.unshift('a')
//    deque.unshift('b')
    deque.shift should be(Some('b'))
    deque.shift should be(Some('a'))
  }

  it should "handle unshift then pop" in {
    pending
    val deque = new Deque[Char]()
//    deque.unshift('a')
//    deque.unshift('b')
    deque.pop should be(Some('a'))
    deque.pop should be(Some('b'))
  }

  it should "handle complex interaction" in {
    pending
    val deque = new Deque[Int]()
    deque.push(1)
    deque.push(2)
    deque.pop should be(Some(2))
    deque.push(3)
//    deque.unshift(4)
    deque.push(5)
    deque.shift should be(Some(4))
    deque.pop should be(Some(5))
    deque.pop should be(Some(3))
  }
}
*/