import javax.sound.midi.Soundbank;

public class Array1 {
    public static void main(String[] args) {
        float[] shub=new float[30];
        String[] names={"shubham","virat","rahul"};

        shub[0]=(float) 0.3;
        shub[1]=(float)10.9;
        shub[2]=(float)20.90;

        // System.out.println(shub[0]);
        // System.out.println(shub[1]);
        // System.out.println(shub[2]);

        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        // System.out.println(shub.length);

        // for(int i=0;i<=3;i++)
        // {
        //     System.out.println(shub[i]);
        // }
        // for(int i=0;i<=names.length;i++)
        // {
        //     System.out.println(names[i]);

        // }
        // for(float s : shub)
        // {
        //     System.out.println(s);
        // }

        // *while loop*
        int i=0;
        while(i<=3)
        {
            System.out.println(shub[i]);
            ++i;
        }
    }
}
