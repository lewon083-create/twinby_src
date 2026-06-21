package aj;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s2.b f958b;

    static {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z(f0.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        kotlin.jvm.internal.g0.f27511a.getClass();
        f957a = new dk.i[]{zVar};
        f958b = com.google.android.gms.internal.auth.m.s("FlutterSharedPreferences", null, null, 14);
    }

    public static final p2.h a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (p2.h) f958b.getValue(context, f957a[0]);
    }

    public static final boolean b(String key, Object obj, Set set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object c(Object obj, nc.e listEncoder) {
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!kotlin.text.a0.n(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
            if (!kotlin.text.a0.n(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
                return obj;
            }
            String strSubstring = str.substring(40);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (kotlin.text.a0.n(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return obj;
        }
        String listString = str.substring(40);
        Intrinsics.checkNotNullExpressionValue(listString, "substring(...)");
        listEncoder.getClass();
        Intrinsics.checkNotNullParameter(listString, "listString");
        ByteArrayInputStream input = new ByteArrayInputStream(Base64.decode(listString, 0));
        Intrinsics.checkNotNullParameter(input, "input");
        Object object = new h0(input).readObject();
        Intrinsics.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) object) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
