package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Af implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentValues f22072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f22073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f22071c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Af> CREATOR = new C0661zf();

    public Af(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f22072a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f22071c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f22073b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap mapB = Em.b(map);
            synchronized (this) {
                this.f22072a.put("PROCESS_CFG_CLIDS", AbstractC0207hb.b(mapB));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f22072a.put("PROCESS_CFG_CUSTOM_HOSTS", ko.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f22072a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f22072a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.f22072a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.f22072a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.f22072a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void i() {
        this.f22072a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f22072a + ", mDataResultReceiver=" + this.f22073b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f22072a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f22073b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC0207hb.c(this.f22072a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final String c() {
        return this.f22072a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final String d() {
        return this.f22072a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Af(Af af2) {
        synchronized (af2) {
            this.f22072a = new ContentValues(af2.f22072a);
            this.f22073b = af2.f22073b;
        }
    }

    public final ArrayList b() {
        String asString = this.f22072a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC0207hb.b(asString);
    }

    public Af(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f22072a = contentValues == null ? new ContentValues() : contentValues;
        this.f22073b = resultReceiver;
    }
}
