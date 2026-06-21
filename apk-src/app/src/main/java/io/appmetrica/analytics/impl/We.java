package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class We {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23218c = "We";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f23219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23220b;

    public We(Ia ia2, String str) {
        this.f23219a = ia2;
        this.f23220b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends We> T a(String str, float f10) {
        synchronized (this) {
            this.f23219a.a(str, f10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends We> T b(String str, String str2) {
        synchronized (this) {
            this.f23219a.a(str, str2);
        }
        return this;
    }

    public final Xe c(String str) {
        return new Xe(str, this.f23220b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends We> T d(String str) {
        synchronized (this) {
            this.f23219a.remove(str);
        }
        return this;
    }

    @NonNull
    public Set<String> c() {
        return this.f23219a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends We> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f23219a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends We> T b(String str, long j10) {
        synchronized (this) {
            this.f23219a.a(str, j10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends We> T b(String str, int i) {
        synchronized (this) {
            this.f23219a.a(i, str);
        }
        return this;
    }

    public final <T extends We> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j10) {
        return this.f23219a.getLong(str, j10);
    }

    public final int a(@NonNull String str, int i) {
        return this.f23219a.getInt(str, i);
    }

    public final String a(@NonNull String str, String str2) {
        return this.f23219a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends We> T b(String str, boolean z5) {
        synchronized (this) {
            this.f23219a.a(str, z5);
        }
        return this;
    }

    public final boolean a(String str, boolean z5) {
        return this.f23219a.getBoolean(str, z5);
    }

    public final void b() {
        synchronized (this) {
            this.f23219a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f23219a.a(str);
    }
}
