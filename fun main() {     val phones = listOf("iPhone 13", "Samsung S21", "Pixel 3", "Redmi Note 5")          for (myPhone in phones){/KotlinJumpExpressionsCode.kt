fun main() {
    val phones = listOf("iPhone 13", "Samsung S21", "Pixel 3", "Redmi Note 5")
    
    for (myPhone in phones){ //this loops through the list of phones
        print("$myPhone: ")
        
        if(myPhone == "Pixel 3"){
            println("This is my phone!")
            continue
        }
        
        println("This is not my phone.")
    }
}
