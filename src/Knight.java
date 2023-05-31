class Helmet
{
    public int price;
    public String fabric;

    public void PriceHelmet()
    {
        System.out.println("Стоимость шлема = " + price);
    }
    public void FabricHelmet()
    {
        System.out.println("Материал шлема -  " + fabric);
    }
}
class Boots
{
    public int price;
    public String fabric;

    public void PriceBoots()
    {
        System.out.println("Стоимость сапог = " + price);
    }
    public void FabricBoots()
    {
        System.out.println("Материал сапог - " + fabric);
    }
}
class Breatsplate
{
    public int price;
    public String fabric;

    public void PriceBreatsplate()
    {
        System.out.println("Стоимость нагрудника = " + price);
    }
    public void FabricBreatsplate()
    {
        System.out.println("Материал нагрудника - " + fabric);
    }
}
class Greaves
{
    public int price;
    public String fabric;

    public void PriceGreaves()
    {
        System.out.println("Стоимость понож = " + price);
    }
    public void FabricGreaves()
    {
        System.out.println("Материал понож - " + fabric);
    }
}
class Knight
{
    Helmet helmet;
    Breatsplate breatsplate;
    Greaves greaves;
    Boots boots;
    int [] ammunition;
    public Knight(Helmet value1, Breatsplate value2, Greaves value3, Boots value4)
    {
        helmet = value1;
        breatsplate = value2;
        greaves = value3;
        boots = value4;
        ammunition = new int[4];
        ammunition[0] = helmet.price;
        ammunition[1] = breatsplate.price;
        ammunition[2] = greaves.price;
        ammunition[3] = boots.price;
    }
    public void MaxAmmunition ()
    {
        int max = ammunition[0];
        for (int i = 0; i < ammunition.length; i++)
        {
            if (ammunition[i] > max)
            {
                max = ammunition[i];
            }
        }
        System.out.println("Максимальная стоимость вещи = " + max);
    }
    public void MinAmmunition ()
    {
        int min = ammunition[0];
        for (int i = 0; i < ammunition.length; i++)
        {
            if (ammunition[i] < min)
            {
                min = ammunition[i];
            }
        }
        System.out.println("Минимальная стоимость вещи = " + min);
    }
    public void SummaAmmunition ()
    {
        int summ = ammunition[0];
        for (int i = 0; i < ammunition.length; i++)
        {
            summ+=ammunition[i];
        }
        System.out.println("Сумма стоимостей вещей = " + summ + "\n");
    }
}