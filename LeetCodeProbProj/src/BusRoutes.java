import java.util.*;
import java.util.stream.Collectors;

public class BusRoutes {

    HashMap<Integer, HashSet<Integer>> busRoutes;
    HashMap<Integer, HashSet<Integer>> stopBuses;
    int[][] routes;
    int source;
    int target;
    public BusRoutes(){
        busRoutes = new HashMap<>();
        stopBuses = new HashMap<>();
    }

    public int numBusesToDestination(int[][] routes, int source, int target){
        this.routes = routes;
        this.source = source;
        this.target = target;
        generateMaps();
        //System.out.println("busRoutes - " + busRoutes);
        //System.out.println("stopBuses - " + stopBuses);
        return sol(source);
    }

    private void generateMaps(){
        for(int bus=0; bus<routes.length; bus++){
            int[] route = routes[bus];
            HashSet<Integer> stops = new HashSet<>();
            for(int stop : route){
                stops.add(stop);
                if(!stopBuses.containsKey(stop)){
                    stopBuses.put(stop, new HashSet<>());
                }
                stopBuses.get(stop).add(bus);
            }
            busRoutes.put(bus, stops);
        }
    }

    public int sol(int curStop){
        HashSet<Integer> reachableStops = new HashSet<>();
        HashSet<Integer> busesTaken = new HashSet<>();
        reachableStops.add(curStop);
        int buses = 0;
        while(!reachableStops.isEmpty()) {
            if(reachableStops.contains(target)) return buses;
            HashSet<Integer> nextStops = new HashSet<>();
            for (int stop : reachableStops) {
                nextStops.addAll(findReachableStops(stop, busesTaken));
            }
            buses++;
            reachableStops = nextStops;
        }
        return -1;
    }

    public HashSet<Integer> findReachableStops(int curStop, HashSet<Integer> busesTaken){
        HashSet<Integer> reachableStops = new HashSet<>();
        HashSet<Integer> busesAvailable = stopBuses.get(curStop);
        for(int bus : busesAvailable){
            if(!busesTaken.contains(bus)) {
                HashSet<Integer> stopsForBus = busRoutes.get(bus);
                reachableStops.addAll(stopsForBus);
                busesTaken.add(bus);
            }
        }
        return reachableStops;
    }


}
