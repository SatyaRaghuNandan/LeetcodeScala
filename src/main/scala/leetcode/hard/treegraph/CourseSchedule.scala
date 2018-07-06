package leetcode.hard.treegraph

/**
  * https://leetcode-cn.com/explore/interview/card/top-interview-questions-hard/57/trees-and-graphs/142/
  *
  * 现在你总共有 n 门课需要选，记为 0 到 n-1。
  * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
  * 给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？
  * 说明:
  *  - 输入的先决条件是由边缘列表表示的图形，而不是邻接矩阵。详情请参见图的表示法。
  *  - 你可以假定输入的先决条件中没有重复的边。
  * 提示:
  *  - 这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。
  *  - 通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。
  *  - 拓扑排序也可以通过 BFS 完成。
  */
object CourseSchedule {
  /**
    * 显然是有向图判断是否有环,可以用拓扑排序,Kahn算法
    * 缺点是只能判断是否有环,最后留下的不一定只有环,可能包含不在环内的节点,不过对于这一题就够用了
    * 具体的实现用BFS:
    * 1. 找入度=0的节点入栈
    * 2. 若栈非空,出栈,对应的边删除,若删除后原来边的另一边节点入度=0,入栈
    * 3. 图中还有点,则有环,否则无环
    */
  def canFinish(numCourses: Int, prerequisites: Array[Array[Int]]): Boolean = {
    val degree = Array.fill(numCourses)(0) //入度,==-1表示已经遍历,删掉
    prerequisites.foreach(n => degree(n(1)) += 1) //统计入度
    val edges = prerequisites.groupBy(_ (0)).mapValues(es => es.map(e => e(1))) //点=>边的终点Array
    def bfs(q: List[Int]): Unit = if (q.nonEmpty) {
      val next = edges.getOrElse(q.head, Array()) //当前点连接的点
      degree(q.head) = -1 //在入度数组中标记-1表示这个点删掉了
      next.foreach(n => degree(n) -= 1) //去掉当前点之后入度-1
      bfs(q.tail ++ next.filter(degree(_) == 0)) //继续搜索那些新的入度为0的节点
    }

    bfs(degree.zipWithIndex.filter(_._1 == 0).map(_._2).toList) //计算入度为0的节点,开始搜索
    degree.count(_ != -1) == 0 //最后看入度数组,如果全部是-1,则可以完成
  }
}
