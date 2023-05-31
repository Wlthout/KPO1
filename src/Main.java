public class Main
{
    public static void main(String []args)
    {
        Helmet obj1 = new Helmet();
        obj1.price = 300;
        obj1.fabric = "Сталь";
        obj1.PriceHelmet();
        obj1.FabricHelmet();
        Boots obj2 = new Boots();
        obj2.price = 450;
        obj2.fabric = "Алюминий";
        obj2.PriceBoots();
        obj2.FabricBoots();
        Breatsplate obj3 = new Breatsplate();
        obj3.price = 2500;
        obj3.fabric = "Золото";
        obj3.PriceBreatsplate();
        obj3.FabricBreatsplate();
        Greaves obj4 = new Greaves();
        obj4.price = 400;
        obj4.fabric = "Платина";
        obj4.PriceGreaves();
        obj4.FabricGreaves();
        Knight obj5 = new Knight(obj1, obj3, obj4, obj2);
        obj5.MinAmmunition();
        obj5.MaxAmmunition();
        obj5.SummaAmmunition();
    }
}