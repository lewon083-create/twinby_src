package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0131ed implements Sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0517tl f23760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f23762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f23763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23765f;

    public C0131ed(@NotNull InterfaceC0517tl interfaceC0517tl, @NotNull String str, @NotNull SystemTimeProvider systemTimeProvider, @NotNull List<C0054bd> list) {
        this.f23760a = interfaceC0517tl;
        this.f23761b = str;
        this.f23762c = systemTimeProvider;
        this.f23763d = list;
        this.f23764e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f23765f = TimeUnit.DAYS.toMillis(1L);
    }

    @Nullable
    public final Rj a() {
        C0509td c0509td;
        C0054bd c0054bd;
        if (!this.f23763d.isEmpty()) {
            List listN = CollectionsKt.N(this.f23763d, new C0106dd());
            String strC = ((AbstractC0634yd) this.f23760a).c(this.f23764e, (String) null);
            if (strC != null) {
                try {
                    JSONObject jSONObject = new JSONObject(strC);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    IntRange intRangeE = ck.o.e(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.j(intRangeE, 10));
                    ck.g it = intRangeE.iterator();
                    while (it.f2383d) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(it.nextInt());
                        try {
                            c0054bd = new C0054bd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                        } catch (Throwable unused) {
                            c0054bd = new C0054bd("", false);
                        }
                        arrayList.add(c0054bd);
                    }
                    c0509td = new C0509td(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    c0509td = new C0509td(kotlin.collections.b0.f27475b, 0L);
                }
            } else {
                c0509td = null;
            }
            long jCurrentTimeMillis = this.f23762c.currentTimeMillis();
            if (c0509td == null || jCurrentTimeMillis - c0509td.f24784b > this.f23765f || !Intrinsics.a(listN, c0509td.f24783a)) {
                C0509td c0509td2 = new C0509td(listN, jCurrentTimeMillis);
                InterfaceC0517tl interfaceC0517tl = this.f23760a;
                AbstractC0634yd abstractC0634yd = (AbstractC0634yd) interfaceC0517tl;
                return new Rj(a0.u.o(new StringBuilder(), this.f23761b, "_status"), c0509td2.a());
            }
        }
        return null;
    }

    public /* synthetic */ C0131ed(InterfaceC0517tl interfaceC0517tl, String str, SystemTimeProvider systemTimeProvider, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0517tl, str, (i & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
