package io.sentry;

import io.sentry.util.JsonSerializationUtils;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonObjectSerializer {
    public static final String OBJECT_PLACEHOLDER = "[OBJECT]";
    public final JsonReflectionObjectSerializer jsonReflectionObjectSerializer;

    public JsonObjectSerializer(int i) {
        this.jsonReflectionObjectSerializer = new JsonReflectionObjectSerializer(i);
    }

    private void serializeCollection(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger, @NotNull Collection<?> collection) {
        objectWriter.beginArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            serialize(objectWriter, iLogger, it.next());
        }
        objectWriter.endArray();
    }

    private void serializeDate(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger, @NotNull Date date) {
        try {
            objectWriter.value(DateUtils.getTimestamp(date));
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Error when serializing Date", e3);
            objectWriter.nullValue();
        }
    }

    private void serializeMap(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger, @NotNull Map<?, ?> map) {
        objectWriter.beginObject();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                objectWriter.name((String) obj);
                serialize(objectWriter, iLogger, map.get(obj));
            }
        }
        objectWriter.endObject();
    }

    private void serializeTimeZone(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger, @NotNull TimeZone timeZone) {
        try {
            objectWriter.value(timeZone.getID());
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Error when serializing TimeZone", e3);
            objectWriter.nullValue();
        }
    }

    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger, @Nullable Object obj) {
        if (obj == null) {
            objectWriter.nullValue();
            return;
        }
        if (obj instanceof Character) {
            objectWriter.value(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            objectWriter.value((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            objectWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            objectWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            serializeDate(objectWriter, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            serializeTimeZone(objectWriter, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serialize(objectWriter, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            serializeCollection(objectWriter, iLogger, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            serializeCollection(objectWriter, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            serializeCollection(objectWriter, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            serializeMap(objectWriter, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            serializeCollection(objectWriter, iLogger, JsonSerializationUtils.atomicIntegerArrayToList((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            objectWriter.value(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            objectWriter.value(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            serializeMap(objectWriter, iLogger, JsonSerializationUtils.calendarToMap((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            objectWriter.value(obj.toString());
            return;
        }
        try {
            serialize(objectWriter, iLogger, this.jsonReflectionObjectSerializer.serialize(obj, iLogger));
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Failed serializing unknown object.", e3);
            objectWriter.value(OBJECT_PLACEHOLDER);
        }
    }
}
