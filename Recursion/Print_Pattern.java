package Recursion_Basic_Adv;

import java.util.ArrayList;
import java.util.List;

public class Print_Pattern {
    public List<Integer> pattern(int N){
        List<Integer>res=new ArrayList<>();
        gfg(N,res);
        return res;

    }
    private void gfg(int n,List<Integer>res){
        if(n<=0){
            res.add(n);
            return;

        }
        res.add(n);

        gfg(n-5,res);
        res.add(n);
    }
}
