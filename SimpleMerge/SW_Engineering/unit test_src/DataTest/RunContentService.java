package DataTest;

import Data.ComparableBlock;
import Service.ContentService;
import Model.ViewerModel;

import java.util.ArrayList;

public class RunContentService {
    ContentService cont;

    public void setCont(ContentService cont){
        this.cont = cont;
    }

    public ArrayList<ComparableBlock>[] compare(ArrayList<ComparableBlock> leftContent, ArrayList<ComparableBlock> rightContent){
        System.out.println("Compare Test  ");

        return cont.compare(leftContent, rightContent);
    }

    public boolean merge(ViewerModel sourceModel, ViewerModel targetModel) {
        System.out.println("Merge Test   ");

        return cont.merge(sourceModel, targetModel);
    }


}
