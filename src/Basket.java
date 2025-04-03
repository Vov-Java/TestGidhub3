public class Basket {

    public int countGoods;
    public int totalWeith;
    public String product = "";

    public void appProduct(String product,int countProduct,int weithProduct){
        this.product = product.concat(product);
        totalWeith = totalWeith + (weithProduct * countProduct);
        countGoods = countGoods + countProduct;
    }
    public String getProd (){
        return product;
    }
    public int countPr (){
        return countGoods;
    }
    public int weithPr (){
        return totalWeith;
    }

}

