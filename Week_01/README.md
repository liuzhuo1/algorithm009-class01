学习笔记
**用add first或add last这套新的API改写Deque的代码**
```java
public class Deque{
    public void deque(){
        Deque<String> deque = new LinkedList<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);
        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);
        while (deque.size() > 0) {
            System.out.println(deque.removeLast());
        }
        System.out.println(deque);
    }
}
```

### 本周总结-week01
 **五毒神掌**
 * 审题，15分钟无想法，直接看答案；
 * 直接写，写完比较时间，空间复杂度
 * 隔一天，接着写
 * 隔一周，复习，重新写
 * 面试前一周再刷一遍
 
 **做题心得**
 * 一定要正确理解题目，一定要正确理解题目，一定要正确理解题目！！！
 * 15分钟还没做出来，直接看解答；
 * 要在一周的前几天内，把视频刷完，课后题刷完，不然后面可能没时间。