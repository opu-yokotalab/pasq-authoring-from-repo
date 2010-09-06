import java.util.*;

public class TheComparator implements Comparator {

    // ソート対象のカラムの位置
    private int index = 0;

    // ソートするためのカラム位置をセット
    public void setIndex(int index) {
        this.index = index;
    }

    // String型の要素をDouble型とみなして昇順にソート
    public int compare(Object a, Object b) {
    	
        String[] arrStrA = (String[]) a;
        String[] arrStrB = (String[]) b;
        if(Double.parseDouble(dblA[index]) < Double.parseDouble(dblB[index])){
        	return (-1);
        }else if(Double.parseDouble(dblA[index]) > Double.parseDouble(dblB[index])){
        	return (1);
        }else{
        	return (0);
        }
    }

}