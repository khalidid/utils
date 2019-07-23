package org.foo
class Utilities implements Serializable {
	def steps
	Utilities(steps) {
		this.steps = steps
	}
	def mvn(args) {
		steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
	}
	
	static void main(def args){
		def mylist= [1,2,"Lars","4"]
		mylist.each{ println it }
	}
}