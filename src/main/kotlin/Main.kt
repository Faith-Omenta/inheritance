fun main() {
    var car=Car("Porsche","carrera","black",5)
    car.carry(5)
    car.carry(7)
    car.identity()
    car.calculateParkingFees(200)

var bus=Bus("matrix","toyota","white",5)
    var maximum=bus.maxTripFare(arrayOf
        (600.0,300.0,400.0))
    println(maximum)
  println(bus.calculateParkingFees(8))
}
open class Machine(var make:String,var model:String,var color:String,var capacity:Int){
 open   fun carry(people:Int){
        var x= people - capacity
        if (people <= capacity){
            println("carrying $people passengers")
        }else{
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var product=hours*20
        return product
    }
}
class Car(make:String, model:String, color:String,capacity:Int):Machine(make,model,color,capacity){
    override  fun carry(people:Int){
           var x= capacity
            if (people<=(capacity)){
            println("carrying $people passengers")
            }else{
              println("Over capacity by $x people")
            }
    }
    }
class Bus(make:String,model:String,color:String,capacity:Int):Machine(make,model,color,capacity){
    fun maxTripFare(fare:Array<Double>):Double{
        var trip=fare.max()
return trip
      }

    override fun calculateParkingFees(hours: Int): Int {
        var parkingFees=hours*capacity
        return parkingFees
    }
    }






