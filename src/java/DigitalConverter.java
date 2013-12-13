package java;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;
import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.google.common.collect.Iterators.*;

/**
 * Created with IntelliJ IDEA.
 * User: ry
 * Date: 13-12-12
 * Time: 下午3:05
 * To change this template use File | Settings | File Templates.
 */
public class DigitalConverter {
    public List OddReturn(ImmutableList<Integer> immutableList) {
        List<Integer> list = new ArrayList<Integer>();

        for (Integer listElement : immutableList)
        {
            if(listElement % 2 == 1)
                list.add(listElement);
        }
//        List<Integer>list = new ArrayList(filter(immutableList,new Predicate<Integer>() {
//            public boolean apply(Integer input) {
//                return input % 2 == 1;  //To change body of implemented methods use File | Settings | File Templates.
//            }
//        }))
        return list;
    }

    public List EvenMultiplyTwo(ImmutableList<Integer> immutableList) {
//        List<Integer> list = new ArrayList<Integer>(transform(immutableList,new Function<Integer, Integer>() {
//            public Integer apply(Integer input) {
//                if(input % 2 ==0)
//                    return input*2;
//                else
//                    return input;.
//            }
//        }));
        List<Integer> list = new ArrayList<Integer>();
        for (Integer listElement : immutableList)
        {
            if (listElement % 2 == 0)
            {
                list.add(listElement*2);
            }
            else
            {
                list.add(listElement);
            }
        }
        return list;
    }

    public String Find(ImmutableList<Integer> immutableList, Integer i) {
       for(Integer listElement : immutableList)
       {
           if(listElement.equals(i))
           {
               return "Hello, "+i;
           }
       }
        return "Not found";
    }
}
