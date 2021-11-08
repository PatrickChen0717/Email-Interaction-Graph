package cpen221.mp2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UDWInteractionGraph {

    /* ------- Task 1 ------- */
    /* Building the Constructors */
    private String fileName;
    private ArrayList<Integer> allUsers=new ArrayList<>();
    private ArrayList[][] interactionMap;


    private ArrayList<Integer> getalluser(int[] timeFilter,List<Integer> userFilter){
        ArrayList<Integer> users=new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            for (String fileLine = reader.readLine();
                 fileLine != null;
                 fileLine = reader.readLine()) {
                String[] line = fileLine.split(" ");

                if(Integer.parseInt(String.valueOf(line[2]))<=timeFilter[1]&&Integer.parseInt(String.valueOf(line[2]))>=timeFilter[0]){
                    int sender=Integer.parseInt(String.valueOf(line[0]));
                    int receiver=Integer.parseInt(String.valueOf(line[1]));
                    if(users.contains(sender)==false&&((userFilter.contains(receiver)==true||userFilter.contains(sender)==true)||userFilter.size()==0)){
                        users.add(sender);
                        if(users.contains(receiver)==false){
                            users.add(receiver);
                        }
                    }
                    if(users.contains(receiver)==false&&((userFilter.contains(receiver)==true||userFilter.contains(sender)==true)||userFilter.size()==0)){
                        users.add(receiver);
                        if(users.contains(sender)==false){
                            users.add(sender);
                        }
                    }

                }
            }
            reader.close();
        }
        catch (IOException ioe) {
            System.out.println("Problem reading file!");
        }
        System.out.println("arraylength:"+users.size()+"    "+users);
        return users;
    }

    /**
     * Creates a new UDWInteractionGraph using an email interaction file.
     * The email interaction file will be in the resources directory.
     *
     * @param fileName the name of the file in the resources
     *                 directory containing email interactions
     */
    public UDWInteractionGraph(String fileName) {
        this.fileName=fileName;
        this.allUsers=getalluser(new int[]{0,Integer.MAX_VALUE }, Collections.emptyList());
        ArrayList[][] interactmap = new ArrayList[allUsers.size()][allUsers.size()];
        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                interactmap[i][j]=new ArrayList();
            }
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            for (String fileLine = reader.readLine();
                 fileLine != null;
                 fileLine = reader.readLine()) {
                String[] line = fileLine.split(" ");
                int sender=Integer.parseInt(String.valueOf(line[0]));
                int receiver=Integer.parseInt(String.valueOf(line[1]));
                int timestamp=Integer.parseInt(String.valueOf(line[2]));
                interactmap[allUsers.indexOf(sender)][allUsers.indexOf(receiver)].add(timestamp);
                if(allUsers.indexOf(sender)!=allUsers.indexOf(receiver)){
                    interactmap[allUsers.indexOf(receiver)][allUsers.indexOf(sender)].add(timestamp);
                }
            }
            reader.close();
        }
        catch (IOException ioe) {
            System.out.println("Problem reading file!");
        }
        this.interactionMap=interactmap;

        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                System.out.print(this.interactionMap[i][j].size()+" ");
            }
            System.out.println();
        }
    }

    /**
     * Creates a new UDWInteractionGraph from a UDWInteractionGraph object
     * and considering a time window filter.
     *
     * @param inputUDWIG a UDWInteractionGraph object
     * @param timeFilter an integer array of length 2: [t0, t1]
     *                   where t0 <= t1. The created UDWInteractionGraph
     *                   should only include those emails in the input
     *                   UDWInteractionGraph with send time t in the
     *                   t0 <= t <= t1 range.
     */
    public UDWInteractionGraph(UDWInteractionGraph inputUDWIG, int[] timeFilter) {
        this.fileName=inputUDWIG.fileName;
        this.allUsers=getalluser(timeFilter,Collections.emptyList());
        ArrayList<Integer> oldusers=inputUDWIG.allUsers;

        System.out.println("all users: "+allUsers);

        //declaration of 3D array
        ArrayList[][] interactmap = new ArrayList[allUsers.size()][allUsers.size()];
        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                interactmap[i][j]=new ArrayList();
            }
        }

        for(int i=0;i<this.allUsers.size();i++){
            for(int j=0;j<this.allUsers.size();j++){

                for(int k=0;k<inputUDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))].size();k++){
                    if((int)inputUDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))].get(k)<=timeFilter[1]&&(int)inputUDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))].get(k)>=timeFilter[0])
                    interactmap[i][j].add(inputUDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))].get(k));
                }

            }
        }
        this.interactionMap=interactmap;

        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                System.out.print(this.interactionMap[i][j].size()+" ");
            }
            System.out.println();
        }
    }

    /**
     * Creates a new UDWInteractionGraph from a UDWInteractionGraph object
     * and considering a list of User IDs.
     *
     * @param inputUDWIG a UDWInteractionGraph object
     * @param userFilter a List of User IDs. The created UDWInteractionGraph
     *                   should exclude those emails in the input
     *                   UDWInteractionGraph for which neither the sender
     *                   nor the receiver exist in userFilter.
     */
    public UDWInteractionGraph(UDWInteractionGraph inputUDWIG, List<Integer> userFilter) {
        this.fileName=inputUDWIG.fileName;
        this.allUsers=getalluser(new int[]{0,Integer.MAX_VALUE },userFilter);
        ArrayList<Integer> oldusers=inputUDWIG.allUsers;

        System.out.println("all users: "+allUsers);

        //declaration of 3D array
        ArrayList[][] interactmap = new ArrayList[allUsers.size()][allUsers.size()];
        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                interactmap[i][j]=new ArrayList();
            }
        }

        for(int i=0;i<this.allUsers.size();i++){
            for(int j=0;j<this.allUsers.size();j++){
                interactmap[i][j].addAll(inputUDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))]);
            }
        }
        this.interactionMap=interactmap;

        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                System.out.print(this.interactionMap[i][j].size()+" ");
            }
            System.out.println();
        }
    }

    /**
     * Creates a new UDWInteractionGraph from a DWInteractionGraph object.
     *
     * @param inputDWIG a DWInteractionGraph object
     */
    public UDWInteractionGraph(DWInteractionGraph inputDWIG) {
        this.fileName=inputDWIG.fileName;
        this.allUsers=inputDWIG.allUsers;

        //declaration of 3D array
        ArrayList[][] interactmap = new ArrayList[allUsers.size()][allUsers.size()];
        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<allUsers.size();j++){
                interactmap[i][j]=new ArrayList();
            }
        }

        for(int i=0;i<allUsers.size();i++){
            for(int j=i+1;j<allUsers.size();j++){
                ArrayList<Integer> temp=new ArrayList<>();

                temp.addAll(inputDWIG.interactionMap[i][j]);
                temp.addAll(inputDWIG.interactionMap[j][i]);
                interactmap[i][j].addAll(temp);
                interactmap[j][i].addAll(temp);
            }
        }

        this.interactionMap=interactmap;
    }

    /**
     * @return a Set of Integers, where every element in the set is a User ID
     * in this UDWInteractionGraph.
     */
    public Set<Integer> getUserIDs() {
        Set<Integer> UserOutput=new HashSet<>();
        for(int i=0;i<this.allUsers.size();i++){
            UserOutput.add(this.allUsers.get(i));
        }

        return UserOutput;
    }

    /**
     * @param user1 the User ID of the first user.
     * @param user2 the User ID of the second user.
     * @return the number of email interactions (send/receive) between user1 and user2
     */
    public int getEmailCount(int user1, int user2) {
        if(allUsers.contains(user1)==false||allUsers.contains(user2)==false){
            return 0;
        }
        return this.interactionMap[allUsers.indexOf(user1)][allUsers.indexOf(user2)].size();
    }

    /* ------- Task 2 ------- */

    /**
     * @param timeWindow is an int array of size 2 [t0, t1]
     *                   where t0<=t1
     * @return an int array of length 2, with the following structure:
     *  [NumberOfUsers, NumberOfEmailTransactions]
     */
    public int[] ReportActivityInTimeWindow(int[] timeWindow) {
        Set<Integer> Users=new HashSet<>();
        int EmailCounter=0;

        for(int i=0;i<allUsers.size();i++){
            for(int j=i;j<allUsers.size();j++){
                for(int k=0;k<interactionMap[i][j].size();k++){
                    if((int)interactionMap[i][j].get(k)<=timeWindow[1]&&(int)interactionMap[i][j].get(k)>=timeWindow[0]){
                        Users.add(allUsers.indexOf(i));
                        Users.add(allUsers.indexOf(j));
                        EmailCounter++;
                    }
                }
            }
        }

        return new int[]{Users.size(),EmailCounter};
    }

    /**
     * @param userID the User ID of the user for which
     *               the report will be created
     * @return an int array of length 2 with the following structure:
     *  [NumberOfEmails, UniqueUsersInteractedWith]
     * If the specified User ID does not exist in this instance of a graph,
     * returns [0, 0].
     */
    public int[] ReportOnUser(int userID) {
        int order= this.allUsers.indexOf(userID);
        int NumberOfEmails=0;
        int UniqueUsersInteractedWith=0;

        if(allUsers.contains(userID)==false){
            return new int[]{0,0};
        }

        for(int i=0;i<allUsers.size();i++){
            NumberOfEmails=NumberOfEmails+interactionMap[order][i].size();
            if(interactionMap[order][i].size()>0){
                UniqueUsersInteractedWith++;
            }
        }
        System.out.println(NumberOfEmails+" "+UniqueUsersInteractedWith);
        return new int[]{NumberOfEmails,UniqueUsersInteractedWith};
    }

    /**
     * @param N a positive number representing rank. N=1 means the most active.
     * @return the User ID for the Nth most active user
     */
    public int NthMostActiveUser(int N) {
        int[][] Ranking=new int[allUsers.size()][2];

        for(int i=0;i<allUsers.size();i++){
            int[] UserReport=ReportOnUser(allUsers.get(i));
            Ranking[i][1]=allUsers.get(i);
            Ranking[i][0]=UserReport[0];
        }

        Arrays.sort(Ranking, (b, a) -> a[0] - b[0]);

        //debug block

        System.out.println("----------");
        for(int i=0;i<allUsers.size();i++){
            for(int j=0;j<2;j++){
                System.out.print(Ranking[i][j]+" ");
            }
            System.out.println();
        }

        return Ranking[N-1][1];
    }

    /* ------- Task 3 ------- */

    /**
     * @return the number of completely disjoint graph
     *    components in the UDWInteractionGraph object.
     */
    public int NumberOfComponents() {
        ArrayList<Integer> userlist=allUsers;
        int count=0;

        ArrayList<Integer> graph=new ArrayList<>();

            for(int i=0;i<userlist.size();i++){
                if(graph.contains(userlist.get(i))==false){
                    graph.add(userlist.get(i));
                    System.out.println(graph);
                    int userid= userlist.get(i);
                    findconnection(userid, userlist, graph);
                    count++;
                    System.out.println("count="+count);
                }
            }

        return count;
    }

    public void findconnection(int userid, ArrayList userlist, ArrayList graph){
        for(int j=0;j<userlist.size();j++){
            if(interactionMap[allUsers.indexOf(userid)][allUsers.indexOf(userlist.get(j))].size()>0&& graph.contains(userlist.get(j))==false){
                graph.add(userlist.get(j));
                System.out.println(graph);
                int nextuser= (int) userlist.get(j);
                findconnection(nextuser, userlist,graph);
            }
            if(interactionMap[allUsers.indexOf(userlist.get(j))][allUsers.indexOf(userid)].size()>0&& graph.contains(userlist.get(j))==false){
                graph.add(userlist.get(j));
                System.out.println(graph);
                int nextuser= (int) userlist.get(j);
                findconnection(nextuser, userlist,graph);
            }
        }
    }
    /**
     * @param userID1 the user ID for the first user
     * @param userID2 the user ID for the second user
     * @return whether a path exists between the two users
     */
    public boolean PathExists(int userID1, int userID2) {
        int user1=allUsers.indexOf(userID1);
        int user2=allUsers.indexOf(userID2);
        System.out.println("from "+user1+"to "+user2);
        ArrayList<Integer> array=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        getpath(user1,user2, array, temp);
        if(temp.contains(true)==true){
            return true;
        }
        else{
            return false;
        }
    }
    public void getpath(int user1, int user2, ArrayList array, ArrayList temp) {
        int check=0;
        for (int i = 0; i < allUsers.size(); i++) {
            if (interactionMap[user1][i].size() > 0 ){
                check++;
            }
        }
        if(user1==user2){
            System.out.println("done: true");
            temp.add(true);
        }
        else if(check==0){
            temp.add(false);
        }
        else{
            for (int i = 0; i < allUsers.size(); i++) {
                if (interactionMap[user1][i].size() > 0 && array.contains(i) == false) {
                    System.out.println("check:" + user1 + " " + i);
                    array.add(i);
                    getpath(i, user2, array, temp);
                }
            }
            System.out.println("done: false");
        }
        temp.add(false);
    }
}
