package petStore.utils;

import com.google.gson.Gson;

import java.io.*;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class utils {

    private static final Gson GSON = new Gson();
    private static final Random RANDOM = new Random();

    private utils() {
        // Private constructor to prevent instantiation
    }

    public static int generateRandomNumber(int maxNumber) {
        return RANDOM.nextInt(maxNumber);
    }

    public static void serializeToFile(Object classObject, String fileName) {
        try (FileOutputStream fileStream = new FileOutputStream(fileName);
             ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)) {
            objectStream.writeObject(classObject);
        } catch (IOException e) {
            throw new RuntimeException("Error serializing object to file: " + fileName, e);
        }
    }

    public static String getCurrentDateTimeInFormat() {
        return DateTimeFormatter
                .ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .withZone(ZoneOffset.UTC)
                .format(Instant.now());
    }

    public static Object deserializeFromFile(String fileName) {
        try (FileInputStream fileStream = new FileInputStream(fileName);
             ObjectInputStream objectStream = new ObjectInputStream(fileStream)) {
            return objectStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error deserializing object from file: " + fileName, e);
        }
    }

    public static String convertObjectToJson(Object object) {
        return GSON.toJson(object);
    }

    public static <T> T convertJsonToObject(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }
}
