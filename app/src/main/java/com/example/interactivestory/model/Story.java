package com.example.interactivestory.model;

import com.example.interactivestory.R;

public class Story {
    private Page pages[];
    public Story(){
        pages=new Page[7];
        pages[0]=new Page ( R.drawable.page0
                ,R.string.Page01,
                R.string.Page02,
                new Choice(R.string.Page0_choice1,1),
                new Choice (R.string.Page0_choice2,5)
        );
        pages[1]=new Page ( R.drawable.pagesrt
                ,R.string.PageSRT1,
                R.string.PageSRT2,
                new Choice(R.string.PageSRT_choice1,2),
                new Choice (R.string.PageSRT_choice2,3)
        );
        pages[2]=new Page ( R.drawable.pagewy
                ,R.string.PageWY1,
                R.string.PageWY2,
                new Choice(R.string.PageWY_choice1,3),
                new Choice (R.string.PageWY_choice2,5)
        );
        pages[3]=new Page ( R.drawable.pagerp
                ,R.string.PageRP1,
                R.string.PageRP2,
                new Choice(R.string.PageRP_choice1,4),
                new Choice (R.string.PageRP_choice2,6)
        );
        pages[4]=new Page ( R.drawable.pagerd
                ,R.string.PageRD1,
                R.string.PageRD2,
                new Choice(R.string.PageRD_choice1,2),
                new Choice (R.string.PageRD_choice2,6)
        );
        pages[5]=new Page ( R.drawable.pagemm
                ,R.string.PageMM1,
                R.string.PageMM2,
                new Choice(R.string.PageMM_choice1,1),
                new Choice (R.string.PageMM_choice2,4)
        );
        pages[6]=new Page ( R.drawable.pagety,R.string.PageTY1,R.string.PageTY2);





    }

    public Page getPage(int pageNumber) {
        if(pageNumber>6||pageNumber<0){
            return pages[0];
        }
        return pages[pageNumber];
    }
}
