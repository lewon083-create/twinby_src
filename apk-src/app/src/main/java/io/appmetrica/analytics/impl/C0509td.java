package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0509td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24784b;

    public C0509td(List list, long j10) {
        this.f24783a = list;
        this.f24784b = j10;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0054bd> list = this.f24783a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            for (C0054bd c0054bd : list) {
                c0054bd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0054bd.f23499a);
                    jSONObject.put("loaded", c0054bd.f23500b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f24784b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0509td)) {
            return false;
        }
        C0509td c0509td = (C0509td) obj;
        return Intrinsics.a(this.f24783a, c0509td.f24783a) && this.f24784b == c0509td.f24784b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24784b) + (this.f24783a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModulesStatus(modulesStatus=");
        sb2.append(this.f24783a);
        sb2.append(", lastSendTime=");
        return om1.m(sb2, this.f24784b, ')');
    }
}
