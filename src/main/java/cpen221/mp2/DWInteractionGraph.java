package cpen221.mp2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class DWInteractionGraph {

    /* ------- Task 1 ------- */
    /* Building the Constructors */
    private String fileName;
    private ArrayList<Integer> allUsers=new ArrayList<>();
    private ArrayList[][] interactionMap;

    public ArrayList<Integer> getalluser(int[] timeFilter,List<Integer> userFilter){
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
                    if(users.contains(sender)==false&&(userFilter.contains(sender)==true||userFilter.size()==0)){
                        users.add(sender);
                        if(users.contains(receiver)==false){
                            users.add(receiver);
                        }
                    }
                    if(users.contains(receiver)==false&&(userFilter.contains(receiver)==true||userFilter.size()==0)){
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
     * Creates a new DWInteractionGraph using an email interaction file.
     * The email interaction file will be in the resources directory.
     *
     * @param fileName the name of the file in the resources
     *                 directory containing email interactions
     */
    public DWInteractionGraph(String fileName) {
        this.fileName=fileName;
        this.allUsers=getalluser(new int[]{0,Integer.MAX_VALUE },Collections.emptyList());
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
     * Creates a new DWInteractionGraph from a DWInteractionGraph object
     * and considering a time window filter.
     *
     * @param inputDWIG a DWInteractionGraph object
     * @param timeFilter an integer array of length 2: [t0, t1]
     *                   where t0 <= t1. The created DWInteractionGraph
     *                   should only include those emails in the input
     *                   DWInteractionGraph with send time t in the
     *                   t0 <= t <= t1 range.
     */
    public DWInteractionGraph(DWInteractionGraph inputDWIG, int[] timeFilter) {
        this.fileName=inputDWIG.fileName;
        this.allUsers=getalluser(timeFilter,Collections.emptyList());
        ArrayList<Integer> oldusers=inputDWIG.allUsers;

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
                interactmap[i][j].addAll(inputDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))]);
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
     * Creates a new DWInteractionGraph from a DWInteractionGraph object
     * and considering a list of User IDs.
     *
     * @param inputDWIG a DWInteractionGraph object
     * @param userFilter a List of User IDs. The created DWInteractionGraph
     *                   should exclude those emails in the input
     *                   DWInteractionGraph for which neither the sender
     *                   nor the receiver exist in userFilter.
     */
    public DWInteractionGraph(DWInteractionGraph inputDWIG, List<Integer> userFilter) {
        this.fileName=inputDWIG.fileName;
        this.allUsers=getalluser(new int[]{0,Integer.MAX_VALUE },userFilter);
        ArrayList<Integer> oldusers=inputDWIG.allUsers;

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
                interactmap[i][j].addAll(inputDWIG.interactionMap[oldusers.indexOf(allUsers.get(i))][oldusers.indexOf(allUsers.get(j))]);
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
     * @return a Set of Integers, where every element in the set is a User ID
     * in this DWInteractionGraph.
     */
    public Set<Integer> getUserIDs() {
        Set<Integer> UserOutput=new HashSet<>();
        for(int i=0;i<this.allUsers.size();i++){
            UserOutput.add(this.allUsers.get(i));
        }

        return UserOutput;
    }

    /**
     * @param sender the User ID of the sender in the email transaction.
     * @param receiver the User ID of the receiver in the email transaction.
     * @return the number of emails sent from the specified sender to the specified
     * receiver in this DWInteractionGraph.
     */
    public int getEmailCount(int sender, int receiver) {
        return this.interactionMap[allUsers.indexOf(sender)][allUsers.indexOf(receiver)].size();
    }

    /* ------- Task 2 ------- */

    /**
     * Given an int array, [t0, t1], reports email transaction details.
     * Suppose an email in this graph is sent at time t, then all emails
     * sent where t0 <= t <= t1 are included in this report.
     * @param timeWindow is an int array of size 2 [t0, t1] where t0<=t1.
     * @return an int array of length 3, with the following structure:
     * [NumberOfSenders, NumberOfReceivers, NumberOfEmailTransactions]
     */
    public int[] ReportActivityInTimeWindow(int[] timeWindow) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Given a User ID, reports the specified User's email transaction history.
     * @param userID the User ID of the user for which the report will be
     *               created.
     * @return an int array of length 3 with the following structure:
     * [NumberOfEmailsSent, NumberOfEmailsReceived, UniqueUsersInteractedWith]
     * If the specified User ID does not exist in this instance of a graph,
     * returns [0, 0, 0].
     */
    public int[] ReportOnUser(int userID) {
        // TODO: Implement this method
        return null;
    }

    /**
     * @param N a positive number representing rank. N=1 means the most active.
     * @param interactionType Represent the type of interaction to calculate the rank for
     *                        Can be SendOrReceive.Send or SendOrReceive.RECEIVE
     * @return the User ID for the Nth most active user in specified interaction type.
     * Sorts User IDs by their number of sent or received emails first. In the case of a
     * tie, secondarily sorts the tied User IDs in ascending order.
     */
    public int NthMostActiveUser(int N, SendOrReceive interactionType) {
        // TODO: Implement this method
        return -1;
    }

    /* ------- Task 3 ------- */

    /**
     * performs breadth first search on the DWInteractionGraph object
     * to check path between user with userID1 and user with userID2.
     * @param userID1 the user ID for the first user
     * @param userID2 the user ID for the second user
     * @return if a path exists, returns aa list of user IDs
     * in the order encountered in the search.
     * if no path exists, should return null.
     */
    public List<Integer> BFS(int userID1, int userID2) {
        // TODO: Implement this method
        return null;
    }

    /**
     * performs depth first search on the DWInteractionGraph object
     * to check path between user with userID1 and user with userID2.
     * @param userID1 the user ID for the first user
     * @param userID2 the user ID for the second user
     * @return if a path exists, returns aa list of user IDs
     * in the order encountered in the search.
     * if no path exists, should return null.
     */
    public List<Integer> DFS(int userID1, int userID2) {
        // TODO: Implement this method
        return null;
    }

    /* ------- Task 4 ------- */

    /**
     * Read the MP README file carefully to understand
     * what is required from this method.
     * @param hours
     * @return the maximum number of users that can be polluted in N hours
     */
    public int MaxBreachedUserCount(int hours) {
        // TODO: Implement this method
        return 0;
    }

}
