import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String allElements = reader.readLine();
    List<Integer> bigList = createBigList(allElements);

    ArrayList<Integer> div2list = new ArrayList<>();
    ArrayList<Integer> div3list = new ArrayList<>();
    ArrayList<Integer> otherlist = new ArrayList<>();

    //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists
    Iterator<Integer> iterator = bigList.iterator();
    while (iterator.hasNext()) {
      int value = iterator.next();
      boolean added = false;

      if (value % 2 == 0) {
        div2list.add(value);
        added = true;
      }
      if (value % 3 == 0) {
        div3list.add(value);
        added = true;
      }

      if (!added) {
        otherlist.add(value);
      }
    }

    Collections.sort(div2list);
    Collections.sort(div3list);
    Collections.sort(otherlist);

    //get result list from createListOfLists
    List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

    //call printInLine() for resultList
    printInLine(resultList);
  }
  public static List<Integer> createBigList(String str){
    String[] strarr = str.split(" ");
    List<Integer> bigList = Arrays.stream(strarr).map(a -> Integer.parseInt(a)).collect(Collectors.toList());

    return bigList;
  }

  public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list ,List<Integer> otherList){
    List<List<Integer>> resultList = new ArrayList<>();
    resultList.add(div2list);
    resultList.add(div3list);
    resultList.add(otherList);
    return resultList;
  }

  public static void printInLine(List<List<Integer>> list) {

  }
}
