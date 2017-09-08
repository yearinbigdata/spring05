package com.example.scala

import com.example.model.Dept
import org.apache.commons.logging.LogFactory

object DeptExample {
	var log = LogFactory.getLog(getClass)
	
	def main(args: Array[String]): Unit = {
		log.info("#########")
		log.info("main()...")
		log.info("#########")
		
		var dept1 = new Dept
		dept1.setDeptno(10)

		var dept2 = new Dept(20, "xxx", "yyy");
		dept2.setDeptno(30)
		dept2.setDname("개발부")
		dept2.setLoc("서울")
		
		println(dept1)
		println(dept2)
		
		println(dept1.getDeptno)
		println(dept2.getDname)
		
	}
}