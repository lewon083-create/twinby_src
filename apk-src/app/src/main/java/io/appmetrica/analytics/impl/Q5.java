package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.sentry.protocol.App;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Q5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<Q5> CREATOR = new P5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f22860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f22861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f22865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f22867h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC0128ea f22869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC0356n9 f22870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f22871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f22872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f22873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f22874p;

    public Q5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f22865f == null) {
            this.f22865f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f22865f;
    }

    public final void c(Bundle bundle) {
        this.f22871m = bundle;
    }

    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f22868j;
    }

    public final String f() {
        return this.f22862c;
    }

    @NonNull
    public final EnumC0128ea g() {
        return this.f22869k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f22866g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f22864e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f22874p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f22860a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f22863d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f22861b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f22861b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f22873o;
    }

    public final Bundle i() {
        return this.f22871m;
    }

    public final String j() {
        return this.f22867h;
    }

    public final EnumC0356n9 k() {
        return this.f22870l;
    }

    public final boolean l() {
        return this.f22860a == null;
    }

    public final boolean m() {
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f22863d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.f22866g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.f22864e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f22874p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f22860a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.f22863d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f22861b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f22861b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f22860a;
        String str2 = EnumC0078cb.a(this.f22863d).f23606b;
        String strSubstring = this.f22861b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return a0.u.o(t.z.j("[event: ", str, ", type: ", str2, ", value: "), strSubstring, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f22860a);
        bundle.putString("CounterReport.Value", this.f22861b);
        bundle.putInt("CounterReport.Type", this.f22863d);
        bundle.putInt("CounterReport.CustomType", this.f22864e);
        bundle.putInt("CounterReport.TRUNCATED", this.f22866g);
        bundle.putString("CounterReport.ProfileID", this.f22867h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f22869k.f23758a);
        Bundle bundle2 = this.f22871m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f22862c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f22865f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f22868j);
        EnumC0356n9 enumC0356n9 = this.f22870l;
        if (enumC0356n9 != null) {
            bundle.putInt("CounterReport.Source", enumC0356n9.f24428a);
        }
        Boolean bool = this.f22872n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f22873o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f22874p));
        parcel.writeBundle(bundle);
    }

    public Q5(String str, int i) {
        this("", str, i);
    }

    @NonNull
    public static Q5 e(@NonNull Q5 q5) {
        return a(q5, EnumC0078cb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f22862c = str;
    }

    public void c(String str) {
        this.f22867h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public Q5(String str, String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    public final void a(long j10) {
        this.i = j10;
    }

    public final void b(long j10) {
        this.f22868j = j10;
    }

    public final Boolean c() {
        return this.f22872n;
    }

    public Q5(String str, String str2, int i, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f22869k = EnumC0128ea.UNKNOWN;
        this.f22874p = new HashMap();
        this.f22860a = str2;
        this.f22863d = i;
        this.f22861b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.f22868j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static Q5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                Q5 q5 = (Q5) bundle.getParcelable("CounterReport.Object");
                if (q5 != null) {
                    return q5;
                }
            } catch (Throwable unused) {
                return new Q5("", 0);
            }
        }
        return new Q5("", 0);
    }

    @NonNull
    public static Q5 c(@NonNull Q5 q5) {
        return a(q5, EnumC0078cb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static Q5 d(@NonNull Q5 q5) {
        Q5 q52 = new Q5("", 0);
        q52.f22868j = q5.f22868j;
        q52.i = q5.i;
        q52.f22865f = q5.f22865f;
        q52.f22862c = q5.f22862c;
        q52.f22871m = q5.f22871m;
        q52.f22874p = q5.f22874p;
        q52.f22867h = q5.f22867h;
        return q52;
    }

    public final void a(@NonNull EnumC0128ea enumC0128ea) {
        this.f22869k = enumC0128ea;
    }

    public final void a(EnumC0356n9 enumC0356n9) {
        this.f22870l = enumC0356n9;
    }

    public final void a(Boolean bool) {
        this.f22872n = bool;
    }

    public final void a(Integer num) {
        this.f22873o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static Q5 b(@NonNull Q5 q5) {
        return a(q5, EnumC0078cb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static Q5 a(Q5 q5, EnumC0078cb enumC0078cb) {
        Q5 q5D = d(q5);
        q5D.f22863d = enumC0078cb.f23605a;
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q5) {
        return a(q5, EnumC0078cb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q5, @NonNull N9 n92) {
        Q5 q5A = a(q5, EnumC0078cb.EVENT_TYPE_START);
        q5A.setValueBytes(MessageNano.toByteArray(new C0431q9().fromModel(new C0406p9((String) n92.f22728b.a()))));
        q5A.f22868j = q5.f22868j;
        q5A.i = q5.i;
        return q5A;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q5, @NonNull Collection<PermissionState> collection, C0623y2 c0623y2, @NonNull C0095d2 c0095d2, @NonNull List<String> list) {
        String string;
        String str;
        Q5 q5D = d(q5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c0623y2 != null) {
                jSONObject.put("background_restricted", c0623y2.f25063b);
                EnumC0598x2 enumC0598x2 = c0623y2.f25062a;
                c0095d2.getClass();
                if (enumC0598x2 != null) {
                    int iOrdinal = enumC0598x2.ordinal();
                    if (iOrdinal == 0) {
                        str = "EXEMPTED";
                    } else if (iOrdinal == 1) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 2) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 3) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 4) {
                        str = "RARE";
                    } else if (iOrdinal == 5) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put(App.JsonKeys.APP_PERMISSIONS, jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5D.f22863d = 12288;
        q5D.setValue(string);
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q5, String str) {
        Q5 q5D = d(q5);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5D.f22863d = 12289;
        q5D.setValue(str);
        return q5D;
    }

    @NonNull
    public static Q5 a() {
        Q5 q5 = new Q5("", 0);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = 16384;
        return q5;
    }

    @NonNull
    public static Q5 a(@NonNull String str) {
        Q5 q5 = new Q5("", 0);
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = 12320;
        q5.f22861b = str;
        q5.f22870l = EnumC0356n9.JS;
        return q5;
    }
}
