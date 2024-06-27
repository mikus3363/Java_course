package kursJava;

public class lekcja_9_Objekt {
    public static void main(String[] args) 
    {
        
        // yeah p = new yeah(20, 30);
        // yeah p2 = new yeah(20, 30);
        
        // if(p.equals(p2))
        // {
        //     System.out.println("są równe");
        // }
        Object[] punkty = new yeah[4];

        punkty[0] = new yeah(2,8);
        punkty[1] = new yeah(4,8);
        punkty[2] = new yeah(7,8);
        punkty[3] = new yeah(2,9);
        for(int i=0;i<punkty.length;i++)
        {
            System.out.println(punkty[i]);
        }
    }
}

class yeah extends Object
{
    private int x;
    private int y;

    yeah()
    {

    }
    yeah(int x , int y)
    {
        this.x = x;
        this.y = y;
    }

    int getiX()
    {
        return x;
    }
    int getiY()
    {
        return y;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(this.getClass()!=o.getClass()){
            return false;
        }
        yeah przeslany = (yeah)o;

        return this.x == przeslany.x && this.y == przeslany.y;
    }
    @Override
    public String toString()
    {
        return getiX()+" "+getiY();
    }
}
