package com.cg.hackerrank;

import java.io.*;
import java.util.*;

enum ActionEnum {
    appliedFilter,
    feature1Button,
    feature2Button,
    feature3Button,
    proceedButton
}

interface IAnalytics {
    void registerAction(ActionEnum action);
    int getNumberOfActionRegisteredButNotSentToAnalyticsStore();
    int getTotalNumberOfLoggedActions();
    List<ActionEnum> getMostFrequentlyUsedActions();
}

interface IAnalyticsStore {
    void storeActions(Queue<ActionEnum> q);
    Queue<ActionEnum> getAllStoredActions();
}

class AnalyticsStore implements IAnalyticsStore {
    private Queue<ActionEnum> storedEventEnums = new LinkedList<>();

    @Override
    public void storeActions(Queue<ActionEnum> q) {
        while (!q.isEmpty()) {
            storedEventEnums.add(q.poll());
        }
    }

    @Override
    public Queue<ActionEnum> getAllStoredActions() {
        return new LinkedList<>(storedEventEnums); // Return a copy of the stored actions
    }
}

class Analytics implements IAnalytics {
    private IAnalyticsStore analyticsStore;
    private int K;
    private Queue<ActionEnum> actionQueue = new LinkedList<>();
    private Map<ActionEnum, Integer> actionCountMap = new HashMap<>();
    private int totalActionsLogged = 0;

    public Analytics(IAnalyticsStore analyticsStore, int K) {
        this.analyticsStore = analyticsStore;
        this.K = K;
    }

    @Override
    public void registerAction(ActionEnum action) {
        totalActionsLogged++; // Increment total actions logged
        actionQueue.add(action); // Add the action to the queue
        actionCountMap.put(action, actionCountMap.getOrDefault(action, 0) + 1); // Update action count

        // If the queue size reaches K, store the actions
        if (actionQueue.size() == K) {
            analyticsStore.storeActions(new LinkedList<>(actionQueue));
            actionQueue.clear(); // Clear the queue after storing
        }
    }

    @Override
    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
        return actionQueue.size(); // Return the number of actions in the queue
    }

    @Override
    public int getTotalNumberOfLoggedActions() {
        return totalActionsLogged; // Total actions logged so far
    }

    @Override
    public List<ActionEnum> getMostFrequentlyUsedActions() {
        int maxCount = actionCountMap.values().stream().max(Integer::compare).orElse(0);
        List<ActionEnum> mostFrequentActions = new ArrayList<>();

        for (Map.Entry<ActionEnum, Integer> entry : actionCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostFrequentActions.add(entry.getKey());
            }
        }

        Collections.sort(mostFrequentActions, Comparator.comparing(Enum::name)); // Sort alphabetically
        return mostFrequentActions;
    }
}

public class Question_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        String[] inp = br.readLine().split(" ");
        int totalNumberOfRequests = Integer.parseInt(inp[0]);
        int K = Integer.parseInt(inp[1]);

        IAnalyticsStore analyticsStore = new AnalyticsStore();
        IAnalytics analytics = new Analytics(analyticsStore, K);

        for (int queryNumber = 1; queryNumber <= totalNumberOfRequests; queryNumber++) {
            inp = br.readLine().split(" ");
            switch (inp[0]) {
                case "registerAction":
                    ActionEnum actionEnum = ActionEnum.valueOf(inp[1]);
                    analytics.registerAction(actionEnum);
                    break;
                case "getTotalNumberOfLoggedActions":
                    int totalNumberOfLoggedEvents = analytics.getTotalNumberOfLoggedActions();
                    out.println(totalNumberOfLoggedEvents);
                    break;
                case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
                    int x = analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore();
                    out.println(x);
                    break;
                case "getMostFrequentlyUsedActions":
                    List<ActionEnum> li = analytics.getMostFrequentlyUsedActions();
                    for (ActionEnum a : li) {
                        out.print(a + " ");
                    }
                    out.println(); // New line after output
                    break;
            }
        }

        Queue<ActionEnum> q = analyticsStore.getAllStoredActions();
        for (ActionEnum a : q) {
            out.print(a + " ");
        }
        out.println(); // New line after output

        out.flush();
        out.close();
    }
}

