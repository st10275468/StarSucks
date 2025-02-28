package vcmsa.projects.starsucks

class Order() {

    //Giving the object attributes. In this case we giving the order the details
    lateinit var productName: String
    lateinit var customerName: String
    lateinit var customerCell: String
    lateinit var orderDate: String

    //Secondary constructor
    constructor(pName: String): this(){
        productName = pName
    }

    //Master Constructor. passing all variables through
    constructor(pName: String, cName: String, cCell: String, oDate: String) : this(pName){
        customerName = cName
        customerCell = cCell
        orderDate = oDate

    }

}