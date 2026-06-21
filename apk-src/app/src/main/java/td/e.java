package td;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rd.f;
import rd.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements rd.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33776a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f33777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f33778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f33779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rd.d f33780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33781f;

    public e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z5) {
        this.f33777b = new JsonWriter(bufferedWriter);
        this.f33778c = map;
        this.f33779d = map2;
        this.f33780e = aVar;
        this.f33781f = z5;
    }

    @Override // rd.e
    public final rd.e a(rd.c cVar, long j10) throws IOException {
        String str = cVar.f32294a;
        h();
        JsonWriter jsonWriter = this.f33777b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j10);
        return this;
    }

    @Override // rd.e
    public final rd.e b(rd.c cVar, int i) throws IOException {
        String str = cVar.f32294a;
        h();
        JsonWriter jsonWriter = this.f33777b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // rd.e
    public final rd.e c(rd.c cVar, Object obj) throws IOException {
        g(obj, cVar.f32294a);
        return this;
    }

    @Override // rd.g
    public final g d(String str) throws IOException {
        h();
        this.f33777b.value(str);
        return this;
    }

    @Override // rd.g
    public final g e(boolean z5) throws IOException {
        h();
        this.f33777b.value(z5);
        return this;
    }

    public final void f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f33777b;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e3) {
                        throw new rd.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            rd.d dVar = (rd.d) this.f33778c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            f fVar = (f) this.f33779d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                h();
                jsonWriter.value(strName);
                return;
            } else {
                jsonWriter.beginObject();
                this.f33780e.a(obj, this);
                jsonWriter.endObject();
                return;
            }
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j10 = jArr[i];
                h();
                jsonWriter.value(j10);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
    }

    public final void g(Object obj, String str) throws IOException {
        boolean z5 = this.f33781f;
        JsonWriter jsonWriter = this.f33777b;
        if (z5) {
            if (obj == null) {
                return;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
    }

    public final void h() {
        if (!this.f33776a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
