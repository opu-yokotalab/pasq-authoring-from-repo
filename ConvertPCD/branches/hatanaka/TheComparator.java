import java.util.*;

public class TheComparator implements Comparator {

    // �\�[�g�Ώۂ̃J�����̈ʒu
    private int index = 0;

    // �\�[�g���邽�߂̃J�����ʒu���Z�b�g
    public void setIndex(int index) {
        this.index = index;
    }

    // String�^�̗v�f��Double�^�Ƃ݂Ȃ��ď����Ƀ\�[�g
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