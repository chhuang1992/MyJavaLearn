package dataSt.week1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Request {
    public Request(int arrival_time, int process_time) {
        this.arrival_time = arrival_time;
        this.process_time = process_time;
    }

    public int arrival_time;
    public int process_time;
}

class Response {
    public Response(boolean dropped, int start_time) {
        this.dropped = dropped;
        this.start_time = start_time;
    }

    public boolean dropped;
    public int start_time;
}

class Buffer {
    public Buffer(int size) {
        this.size_ = size;
        this.finish_time_ = new ArrayList<Integer>();
    }

    public Response Process(Request request) {
        // write your code here
        return new Response(false, -1);
    }

    private int size_;
    private ArrayList<Integer> finish_time_;
}

/**
Task:
    You are given a series of incoming network packets, and your task is to simulate their processing.
Packets arrive in some order. For each packet number i, you know the time when it arrived A i and the
time it takes the processor to process it Pi (both in milliseconds). There is only one processor, and it
processes the incoming packets in the order of their arrival. If the processor started to process some
packet, it doesn¡¯t interrupt or stop until it finishes the processing of this packet, and the processing of
packet i takes exactly Pi milliseconds.
    The computer processing the packets has a network buffer of fixed size S. When packets arrive, 
they are stored in the buffer before being processed. However, if the buffer is full when a packet
arrives (there are S packets which have arrived before this packet, and the computer hasn¡¯t finished
processing any of them), it is dropped and won¡¯t be processed at all. If several packets arrive at the
same time, they are first all stored in the buffer (some of them may be dropped because of that ¡ª
those which are described later in the input). The computer processes the packets in the order of
their arrival, and it starts processing the next available packet from the buffer as soon as it finishes
processing the previous one. If at some point the computer is not busy, and there are no packets in
the buffer, the computer just waits for the next packet to arrive. Note that a packet leaves the buffer
and frees the space in the buffer as soon as the computer finishes processing it.

Input For mat. 
    The first line of the input contains the size S of the buffer and the number n of incoming
network packets. Each of the next n lines contains two numbers. i-th line contains the time of arrival
A i and the processing time Pi (both in milliseconds) of the i-th packet. It is guaranteed that the
sequence of arrival times is non-decreasing (however, it can contain the exact same times of arrival
in milliseconds ¡ª in this case the packet which is earlier in the input is considered to have arrived
earlier).
 */
class process_packages {
    private static ArrayList<Request> ReadQueries(Scanner scanner) throws IOException {
        int requests_count = scanner.nextInt();
        ArrayList<Request> requests = new ArrayList<Request>();
        for (int i = 0; i < requests_count; ++i) {
            int arrival_time = scanner.nextInt();
            int process_time = scanner.nextInt();
            requests.add(new Request(arrival_time, process_time));
        }
        return requests;
    }

    private static ArrayList<Response> ProcessRequests(ArrayList<Request> requests, Buffer buffer) {
        ArrayList<Response> responses = new ArrayList<Response>();
        for (int i = 0; i < requests.size(); ++i) {
            responses.add(buffer.Process(requests.get(i)));
        }
        return responses;
    }

    private static void PrintResponses(ArrayList<Response> responses) {
        for (int i = 0; i < responses.size(); ++i) {
            Response response = responses.get(i);
            if (response.dropped) {
                System.out.println(-1);
            } else {
                System.out.println(response.start_time);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int buffer_max_size = scanner.nextInt();
        Buffer buffer = new Buffer(buffer_max_size);

        ArrayList<Request> requests = ReadQueries(scanner);
        ArrayList<Response> responses = ProcessRequests(requests, buffer);
        PrintResponses(responses);
    }
}
