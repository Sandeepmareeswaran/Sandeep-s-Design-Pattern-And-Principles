//Design a system where a user can add products to a cart, view items, and calculate total price.
var users={};
var products={};

class User{

    constructor(name){
        this.name=name;
    }

    addUser(){
        users[this.name]={
            name:this.name,
            cart:[]
        }
        console.log(this.name);
    }
    showUser(){
        console.log(users);
    }
    addProductToCart(id){
        users[this.name].cart.push(products[id]);

    }
    showCart(){
        console.log(users[this.name].cart);
    }
}
class Product{
    addProduct(id,price){
        products[id]={
            id:id,
            price:price
        }
    }
    showProduct(){
       console.log(products);
    }
    
}
let u1=new User("sandeep");
u1.addUser();
let p1 = new Product();
p1.addProduct(1,100);
p1.addProduct(2,200);
p1.showProduct();

p1.addProduct(3,200);
p1.addProduct(4,200);
p1.addProduct(5,200);
p1.addProduct(6,200);
u1.addProductToCart(2);
u1.addProductToCart(3);
u1.showUser();
u1.showCart();

