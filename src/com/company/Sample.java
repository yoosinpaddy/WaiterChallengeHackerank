package com.company;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = null;
        try {
            File f = new File("s.txt");
            if (!f.exists()) {
                System.out.println(f.createNewFile());

            }
            bufferedWriter = new BufferedWriter(new FileWriter(f.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        BufferedWriter finalBufferedWriter = bufferedWriter;
        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

//                List<Integer> result = Result.icecreamParlor(m, arr);
//
//                finalBufferedWriter.write(
//                        result.stream()
//                                .map(Object::toString)
//                                .collect(joining(" "))
//                                + "\n"
//                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

